import java.util.Scanner;

public class Student{
    Scanner sc = new Scanner(System.in);
    int number=0;
    int sum=0;
    double average=0;
    Student(){}
    public int TakeMarks(){
        System.out.print("Enter your Number of subject : ");
        number=sc.nextInt();
        int[] marks=new int[number];
        System.out.println("Subject  Mark : ");

        for(int i=0;i<marks.length;i++){
                marks[i]=sc.nextInt();
                sum+=marks[i];
        }
        return sum;
    }
    public double average(){
        return (sum/number);
    }
    public char Grade(){
        if(average()>=75){
            return 'A';
        }
        else if(average()>=60 && average()<=74){
            return 'B';
        }
        else if(average()>=45 && average()<=59){
            return 'C';
        }
        return 'E';
    }
}

 class Main{
    public static void main(String[] args) {
        Student st = new Student();
        System.out.println("-----Student Grade Calculator-----\n");
        System.out.println("Total   : "+st.TakeMarks());
        System.out.println("Average : "+st.average());
        System.out.println("Grade   : "+st.Grade());
    }
 }
