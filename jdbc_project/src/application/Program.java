package application;

import db.DB;
import db.DbException;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;
        ResultSet resultTable = null;

        PreparedStatement preparedStatement = null;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        try {

            //Recuperação de dados de database
            connection = DB.getConnection();
            statement = connection.createStatement();
            resultTable = statement.executeQuery("select * from department");

            while (resultTable.next()) {
                System.out.println(resultTable.getInt("Id") + ", " + resultTable.getString("Name"));
            }

            //Inserção de dados em database com retorno do Id do dado inserido
            preparedStatement = connection.prepareStatement(
                    "INSERT INTO seller "
                    + "(Name, Email, BirthDate, BaseSalary, DepartmentId) "
                    + "VALUES "
                    + "(?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);

            preparedStatement.setString(1, "Marcus Cezar");
            preparedStatement.setString(2, "marcuscezar02@gmail.com");
            preparedStatement.setDate(3, new Date(dateFormat.parse("02/12/1998").getTime()));
            preparedStatement.setDouble(4, 4000.0);
            preparedStatement.setInt(5, 4);

            int rowsAffected = preparedStatement.executeUpdate();

            System.out.println("Added data: ");
            if(rowsAffected > 0) {
                ResultSet resultTableRowsAffected = preparedStatement.getGeneratedKeys();
                while (resultTableRowsAffected.next()) {
                    int id = resultTableRowsAffected.getInt(1);
                    System.out.println("Done! Id = " + id);
                }
            }
            else {
                System.out.println("No rows affected!");
            }

            //Atualização de dados em database
            preparedStatement = connection.prepareStatement(
                    "UPDATE seller "
                    + "SET BaseSalary = BaseSalary + ? "
                    + "WHERE "
                    + "(DepartmentId = ?)", Statement.RETURN_GENERATED_KEYS);

            preparedStatement.setDouble(1, 400.0);
            preparedStatement.setInt(2, 4);

            rowsAffected = preparedStatement.executeUpdate();

            System.out.println("Updated data: ");
            System.out.println("Rows affected = " + rowsAffected);

            //Exclusão de dados da database
            preparedStatement = connection.prepareStatement(
                    "DELETE FROM seller "
                        + "WHERE "
                        + "Id = ?");

            preparedStatement.setInt(1, 11);

            rowsAffected = preparedStatement.executeUpdate();

            System.out.println("Deleted data: ");
            System.out.println("Rows affected = " + rowsAffected);

            //Transações dentro da database

            connection.setAutoCommit(false);

            int rowsAffected1 = statement.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1");
            int rowsAffected2 = statement.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2");

            connection.commit();

        }
        catch (SQLException | ParseException e) {
            try {
                connection.rollback();
                throw new DbException("Transaction rolled back! Caused by: " + e.getMessage());
            } catch (SQLException ex) {
                throw new DbException("Error trying to rollback! Caused by: " + ex.getMessage());
            }
        }
        finally {
            DB.closeResultSet(resultTable);
            DB.closeStatement(statement);
            DB.closeStatement(preparedStatement);
            DB.closeConnection();
        }
    }
}
