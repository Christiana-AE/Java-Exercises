//Source code for Degree

import java.util.*;

public class DegreeGrader {
    double moduleAverage;
    double ismModuleAverage;
    double compensatableFail;
    double outrightFail;
    char classification;
    char response;
    Scanner sc = new Scanner(System.in);

    public char gradeDegree() {
        if (moduleAverage >= 70 && ismModuleAverage >= 70 && compensatableFail == 0 &&
                outrightFail == 0) {
            System.out.println("Grade is Distinction");
        } else if (moduleAverage >= 60 && ismModuleAverage >= 60 && compensatableFail <= 15 &&
                outrightFail == 0) {
            System.out.println("Grade is Merit");
        } else if (moduleAverage >= 50 && ismModuleAverage >= 50 && compensatableFail <= 30 &&
                outrightFail == 0) {
            System.out.println("Grade is Pass");
        } else if (moduleAverage <= 40 && ismModuleAverage <= 40 && compensatableFail >= 60 &&
                outrightFail >= 1) {
            System.out.println("Grade is Fail");
        }
        return classification;
    }

    public void enterModuleAverage() {
        System.out.println("Please enter all module average");
        moduleAverage = sc.nextDouble();
        while (moduleAverage < 0 || moduleAverage > 100) {
            System.out.println("Mark is invalid. Enter a mark between 0 to 100");
            moduleAverage = sc.nextDouble();
        }
    }

    public void enterIsmModuleAverage() {
        System.out.println("Please enter the ISM module average");
        ismModuleAverage = sc.nextDouble();
        while (ismModuleAverage < 0 || ismModuleAverage > 100) {
            System.out.println("Mark is invalid. Enter a mark between 0 to 100");
            ismModuleAverage = sc.nextDouble();
        }
    }

    public void entercompensatableFail() {
        System.out.println("Please enter the number of compensatable failed credits");
        compensatableFail = sc.nextDouble();
        while (compensatableFail < 0 || compensatableFail > 180) {
            System.out.println("Mark is invalid. Enter a mark between 0 to 180");
            compensatableFail = sc.nextDouble();
        }
    }

    public void enteroutrightFail() {
        System.out.println("Please enter the number of outright failed modules");
        outrightFail = sc.nextDouble();
        while (outrightFail < 0 || outrightFail > 11) {
            System.out.println("Mark is invalid. Enter a mark between 0 to 11");
            outrightFail = sc.nextDouble();
        }
    }

    public void startDegreeGrading() {
        System.out.println("*********** Degree Classification Program *********");
        System.out.println("Enter results to grade");
        enterModuleAverage();
        if (moduleAverage >= 0 || moduleAverage <= 100) {
            enterIsmModuleAverage();
        }
        if (ismModuleAverage >= 0 || ismModuleAverage <= 100) {
            entercompensatableFail();
        }
        if (compensatableFail >= 0 || compensatableFail <= 180) {
            enteroutrightFail();
        }
        if (outrightFail >= 0 || outrightFail <= 11)
            gradeDegree();
        System.out.println("Will you like to continue grading?");
        response = sc.next().charAt(0);
        if (response == 'n') {
            System.out.println("Thank you");
        } else if (response == 'y') {
            enterModuleAverage();
            enterIsmModuleAverage();
            entercompensatableFail();
            enteroutrightFail();
            gradeDegree();
        }
        sc.close();
    }}

//Source code for Test Class

    public class TestDegreeGrader {
        public static void main(String[] args) {
            DegreeGrader d1 = new DegreeGrader();
            d1.gradeDegree();
            d1.enterModuleAverage();
            d1.enterIsmModuleAverage();
            d1.entercompensatableFail();
            d1.enteroutrightFail();
            d1.startDegreeGrading();
        }
}