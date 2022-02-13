package com.company;

import java.sql.*;
import java.util.Scanner;

public class Employee extends Admin {
    String connectionUrl = "jdbc:postgresql://localhost:5432/Bekzat.inc";
    Connection connection = null;
    ResultSet resultSet = null;
    Statement statement = null;
    Scanner scanner = new Scanner(System.in);

    public void read() {//method to read from table
        System.out.println("Please,enter the id of your project");
        int id = scanner.nextInt();
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(connectionUrl, "postgres", "bekzatinc");
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from project");//to execute query
            while (resultSet.next()) {
                if (resultSet.getInt("id") == id) {
                    System.out.println(resultSet.getInt("id") + " || " + resultSet.getString("name") + " || "
                            + resultSet.getString("team_members") + " || " + resultSet.getInt("cost") +" || "+
                            resultSet.getString("date")+ " || "+resultSet.getString("description"));
                }
            }
        } catch (Exception e) {//to catch exceptions
            System.out.println(e);
        }
        System.out.println("Want to do one more operation raad or create if yes enter 1 otherwise enter 2");
        int chooseforonemore = scanner.nextInt();////define need of user
        if (chooseforonemore == 1) {
            System.out.println("Ok,if you want to read one more project enter 1 if want to crate enter 2");
            int chooseforreadorcreate = scanner.nextInt();//define need of user
            if (chooseforreadorcreate == 1) {
                read();
            }
            else if (chooseforreadorcreate == 2) {
                create();
            }
            else {
                System.out.println("Failed");
            }
        }
        else if (chooseforonemore == 2) {
            System.out.println("Have a nice day");
        }
        else {
            System.out.println("Fail");
        }
        System.out.println("============================================================================");
    }

    public void create() {
        System.out.println("Enter the" +
                "\nid\nname\nteam_members\ncost" +
                "\ndate\ndescription\n " +
                "after text to check");
        System.out.println("================");

        try {
            int id=scanner.nextInt();
            String name=scanner.next();
            String team_members=scanner.next();
            int cost=scanner.nextInt();
            String date=scanner.next();
            scanner.nextLine();
            String description=scanner.nextLine();

            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(connectionUrl, "postgres", "bekzatinc");
            statement = connection.createStatement();
            resultSet = statement.executeQuery("insert into project(id,name,team_members,cost,date,description)" +
                    "values (" + id + ",'" + name + "','" + team_members + "',"
                    + cost + ",'" +date + "','"+description +"');");
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("===========================================================================");
    }
    public int salarycalculator() { //method for compute earning
        System.out.println("Please choose your position:" +
                "\nandroiddev(enter 1)\niosdev(enter 2)" +
                "\nauditor(enter 3)\nadmin(enter 4)");
        int u = scanner.nextInt();//initialize "u" to know need of users
        if (u == 1) {
            System.out.println("Have you bonus for this month if yes enter 1 otherwise enter 2");
            int j = scanner.nextInt();//initialize "j" to know need of users
            if (j == 1) {
                return getAndroiddev() + getBonusforproject();//earning with bonus
            }
            else if(j==2){
                return getAndroiddev();//earning without bonus
            }
        }
        else if (u == 2) {
            System.out.println("Have you bonus for this month if yes enter 1 otherwise enter 2");
            int s = scanner.nextInt();//initialize "s" to know the need of users
            if (s == 1) {
                return getIosdev() + getBonusforproject();//earning with bonus
            }
            else if(s==2){
                return getIosdev();//earning without bonus
            }
        }
        else if (u == 3) {
            System.out.println("Have you bonus for this month if yes enter 1 otherwise enter 2");
            int p = scanner.nextInt();//initialize "p" to know the need of users
            if (p == 1) {
                return getAuditor() + getBonusforproject();//earning with bonus
            }
            else if(p==2){
                return getAuditor();//earning without bonus
            }
        }
        else if(u==4){
            System.out.println("Have you bonus for this month if yes enter 1 otherwise enter 2");
            int a = scanner.nextInt();//initialize "a" to know the need of users
            if (a == 1) {
                return getAdmin() + getBonusforproject();//return salary with bonus
            }
            else if(a==2){
                return getAdmin();//earning without bonus
            }
        }
        return 0;
        //rerurn doesn't matter
    }
}

