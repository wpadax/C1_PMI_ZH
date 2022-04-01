import java.util.*;
//2.feladat
public class Grades {
    Scanner szam = new Scanner(System.in);

    private String subject;
    private int grade;

    public Grades(String subject, int grade) {
        this.subject = subject;
        this.grade = grade;
    }

    public void addSubject(){

        System.out.println("Mi a tárgy neve?");
        String x = szam.nextLine();
        subject = subject + x;
        while(x != "") {
            System.out.println("Mi a következő tárgy neve?");
            x = szam.nextLine();
            subject = subject + x;

        }
    }
    public void dropSubject(){
        System.out.println("Milyen tárgyat szeretne leadni?");
        String y = szam.nextLine();
        subject.split(",");
        if(y.equals(subject)){
            subject = "0";
        }


    }
    public void getGrades(){
        System.out.println(subject + " ");
        System.out.println(grade + " ");

    }
}
