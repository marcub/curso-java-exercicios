package entities;

public class Student {

    public String name;
    public double firstGrade;
    public double secondGrade;
    public double thirdGrade;

    public double getFinalGrade () {
        return firstGrade + secondGrade + thirdGrade;
    }

    public String studentSituation () {
        String situation;

        if (getFinalGrade() < 60) {
            situation = "FAILED" + "\nMISSING " + (String.format("%.2f",60 - getFinalGrade())) + " POINTS";
        } else {
            situation = "PASS";
        }

        return situation;
    }
}
