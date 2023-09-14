import java.util.*;
public class EnrollmentID{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String name=sc.nextLine();
        System.out.println("Enter your Year of Admission: ");
        int i=sc.nextInt();
        String year=String.valueOf(i);
        System.out.println("Enter your Enrollment No.: ");
        String enroll=sc1.nextLine();
        String Enroll=enroll.substring(8,12);
        String EnrollId1=(name.concat(year)).concat(Enroll);
        System.out.print(EnrollId1+"@acropolis.in");
    }
}