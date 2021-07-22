package ca.bcit.winter2021.comp2522.midterm.question8;

import java.util.Scanner;

public class SurveyQuestionsForEmployees extends SurveyQuestion {
    private String workTitle;
    private String nameOfTheCompany;
    public SurveyQuestionsForEmployees() {
        super();
    }
    public String getWorkTitle() {
        return workTitle;
    }
    public void setWorkTitle(String workTitle) {
        this.workTitle = workTitle;
    }
    public String getNameOfTheCompany() {
        return nameOfTheCompany;
    }
    public void setNameOfTheCompany(String nameOfTheCompany) {
        this.nameOfTheCompany = nameOfTheCompany;
    }
    public void workTitle(){
        System.out.println("What is your work title?");
        Scanner sc4 = new Scanner(System.in);
        String inputTitle = sc4.nextLine();
        this.workTitle = inputTitle;
    }
    public void nameOfTheCompany(){
        System.out.println("What is the name of your company?");
        Scanner sc5 = new Scanner(System.in);
        String inputCompany = sc5.nextLine();
        this.nameOfTheCompany = inputCompany;
    }
    @Override
    public String toString() {
        return "SurveyQuestion [monthlyIncome=" + monthlyIncome + ", highestEducationDegree=" + highestEducationDegree + ", address=" + address
                + ", work title=" + workTitle + ", nameOfTheCompany=" + nameOfTheCompany+ "]";
    }
}
