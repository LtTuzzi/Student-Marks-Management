import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class studentMarks{

    static Scanner scanner = new Scanner(System.in);
    private static int choice;
    

    public static void main(String[] args) {

  
        ArrayList<Integer> studMarks = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();
    

        do{
        
            System.out.println("1. Add new student marks: ");
        System.out.println("2. Display all marks");
        System.out.println("3. Calculate average");
        System.out.println("4. Show highest mark");
        System.out.println("5. Exit");

        System.out.println("What do you want to do?: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch(choice){

            case 1: 
                //System.out.println("We are adding student marks");
                addMarks(students);
                break;
            case 2:
                //System.out.println("We are displaying all marks");
                displayMarks(studMarks);
                break;
            case 3:
                //System.out.println("We are calculating average");
                calcAve(studMarks);
                break;
            case 4:
                //System.out.println("We are showing highest mark now");
                showHighMark(studMarks);
                break;
            case 5:
                System.out.println("It will be the exit soon");
            

        }
        }while(choice != 5);
        

    }

    static void addMarks(ArrayList<Student> students){

        System.out.println("Enter student name: ");
        String newStudName = scanner.nextLine();
        //scanner.nextLine();
        System.out.println("Enter the appropriate mark: ");
        int newStudMark = scanner.nextInt();

        students.add(new Student(newStudName, newStudMark));

        //students.add(newMark);
        System.out.println("The added marks: " + newStudName + ": " + newStudMark);
        System.out.println("The list of marks: " + students);

       /* System.out.println("Enter the appropriate mark: ");
        int newMark = scanner.nextInt();

        studMarks.add(newMark);
        System.out.println("The added mark: " + newMark);
        System.out.println("The list of marks: " + studMarks);
        */  
    }

    static void displayMarks(ArrayList<Integer> studMarks){
        
        System.out.println("All student marks: " + studMarks);
    }

    static void calcAve(ArrayList<Integer> studMarks){
        int sum = 0;

        
        for(int studMark : studMarks){
            sum += studMark;
        }
        double average = (double) sum / studMarks.size();

        System.out.println("Sum of all the student marks: " + sum);
        System.out.println("Average of all student marks: " +  average);
    }

    static void showHighMark(ArrayList<Integer> studMarks){
        int max = Collections.max(studMarks);

        System.out.println("The highest mark in the list is: " + max);
    }

    static class Student{
    String newStudName;
    int newStudMark;

    Student(String newStudName, int newStudMark){
        this.newStudName = newStudName;
        this.newStudMark = newStudMark;
    }

    public String toString(){
        return newStudName + ": " + newStudMark;
    }
        
}
}

