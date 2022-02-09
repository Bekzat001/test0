package com.company;

public class Employee {
   /* public String name;
    public String position;
    public int yearsWorking;

    public String getName() {
        return name;
    }
    public String getPosition() {
        return position;
    }
    public int getYearsWorking() {
        return yearsWorking;
    }
    public void setName(String n) {
        name=n;
    }
    public void setPosition(String pos) {
        position=pos;
    }
    public void setYearsWorking(int yw) {
        if (yw>0) {

        }
        yearsWorking=yw;
    }*/

    public String name;
    public String department;
    public int year;

    public Employee(){
        System.out.println("I'm tutor");
    }
    /*public Employee(){
        this
    }*/

    public void setName(String name) {
        this.name=name;
    }
    public void setDepartment(String department) {
        this.department=department;
    }
    public void setYear(int year) {
        if (year>0) {
            this.year=year;
        }
    }
    public String getName() {
        return name;
    }
    public String getDepartment() {
        return department;
    }
    public int getYear() {
        return year;
    }
}
