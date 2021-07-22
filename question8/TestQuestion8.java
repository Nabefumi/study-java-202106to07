package ca.bcit.winter2021.comp2522.midterm.question8;

public class TestQuestion8 {
    public static void main(String[] args){
        SurveyQuestionsForEmployees employees = new SurveyQuestionsForEmployees();

        System.out.println("Surveys for Employees: ");

        employees.monthlyIncome();
        employees.highestEducationDegree ();
        employees.address();
        employees.workTitle();
        employees.nameOfTheCompany();

        System.out.println(employees);

        System.out.println("======================================");

        SurveyQuestionsForManagers managers = new SurveyQuestionsForManagers();

        System.out.println("Surveys for Managers: ");
        managers.monthlyIncome();
        managers.highestEducationDegree ();
        managers.address();

        System.out.println(managers);
    }
}







