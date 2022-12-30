//Source Code for Module

import java.util.*;

public class ModuleGrader{
    int mark;
    char grade;
    char response;
    Scanner sc = new Scanner(System.in);

    public char gradeModule(int mark) {
        if (mark >= 70 && mark <= 100) {
            System.out.println("Your grade is Excellent");
        } else if (mark >= 60 && mark < 70) {
            System.out.println("Your grade is Good");
        } else if (mark >= 50 && mark < 60) {
            System.out.println("Your grade is Satisfactory");
        } else if (mark >= 40 && mark < 50) {
            System.out.println("Your grade is Compensatable fail");
        } else if (mark == 0 && mark < 40) {
            System.out.println("Your grade is Outright fail");
        }
        return grade;
    }

    public void getValidModuleMark() {
        System.out.println("Enter mark");
        mark = sc.nextInt();
        while (mark < 0 || mark > 100) {
            System.out.println("Mark is invalid");
            System.out.println("Enter a mark between 0 to 100");
            mark = sc.nextInt();
        }
    }

    public void startModuleGrading() {
        System.out.println("*********** Module Grading Program ********* ");
        System.out.println("Enter module mark to grade");
        {
            getValidModuleMark();
        }
        if (mark >= 0 || mark <= 100) {
            gradeModule(mark);
        }
        System.out.println("Will you like to continue grading?");
        response = sc.next().charAt(0);
        if (response == 'n') {
            System.out.println("Thank you");
        } else if (response == 'y') {
            getValidModuleMark();
            gradeModule(mark);
        }
        sc.close();
    }}

//Source code for Test Class

    public class TestModuleGrader {
        public static void main(String[] args) {
            ModuleGrader g1 = new ModuleGrader();
            g1.gradeModule();
            g1.getValidModuleMark();
            g1.startModuleGrading();
        }
}