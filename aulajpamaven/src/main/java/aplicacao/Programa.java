package aplicacao;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager manager = factory.createEntityManager();
		
		
		Pessoa p = manager.find(Pessoa.class, 2);
		
		manager.getTransaction().begin();
		manager.remove(p);
		manager.getTransaction().commit();
		
		System.out.println("Pronto");
		manager.close();
		factory.close();
		
	}

}
