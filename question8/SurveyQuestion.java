package ca.bcit.winter2021.comp2522.midterm.question8;

import java.util.Scanner;

public class SurveyQuestion {
    protected double monthlyIncome;
    protected String highestEducationDegree;
    protected String address;
    public SurveyQuestion(){
    }
    public double getMonthlyIncome() {
        return monthlyIncome;
    }
    public void setMonthlyIncome(double monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }
    public String getHighestEducationDegree() {
        return highestEducationDegree;
    }
    public void setHighestEducationDegree(String highestEducationDegree) {
        this.highestEducationDegree = highestEducationDegree;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void monthlyIncome(){
        System.out.println("What is your monthly income?");
        Scanner sc1 = new Scanner(System.in);
        double inputIncome = sc1.nextDouble();
        this.monthlyIncome = inputIncome;
    }
    public void highestEducationDegree (){
        System.out.println("What is your highest education degree?");
        Scanner sc2 = new Scanner(System.in);
        String inputDegree = sc2.nextLine();
        this.highestEducationDegree = inputDegree;
    }
    public void address(){
        System.out.println("What is your address?");
        Scanner sc3 = new Scanner(System.in);
        String inputAddress = sc3.nextLine();
        this.address = inputAddress;
    }
    @Override
    public String toString() {
        return "SurveyQuestion [monthlyIncome=" + monthlyIncome + ", highestEducationDegree=" + highestEducationDegree +
                ", address=" + address + "]";
    }
}
