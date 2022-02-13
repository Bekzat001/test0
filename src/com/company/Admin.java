package com.company;

import java.sql.*;
import java.util.*;


public class Admin  {
    String connectionUrl="jdbc:postgresql://localhost:5432/Airpods.inc";
    Connection connection=null;
    ResultSet resultSet=null;
    Statement statement=null;
    Scanner scanner=new Scanner(System.in);
    private int androiddev;//initialize androiddev with private modifier
    private int iosdev;
    private int bonusforproject;
    private int admin;
    private int auditor;

    public Admin() {//empty constructor to set default values
        this.androiddev = 500000;
        this.iosdev = 800000;
        this.bonusforproject = 250000;
        this.admin = 980000;
        this.auditor = 300000;
    }

    public int getAndroiddev() {//to junior email
        return androiddev;
    }

    public void setAndroiddev(int junior) {//to set junior
        this.androiddev = androiddev;
    }

    public int getIosdev() { //to get senior
        return iosdev;
    }

    public void setIosdev(int iosdev) {//to set senior
        this.iosdev = iosdev;
    }

    public int getBonusforproject() {//to get bonusforproject
        return bonusforproject;
    }

    public void setBonusforproject(int bonusforproject) {//to set bonusforproject
        this.bonusforproject = bonusforproject;
    }

    public int getAdmin() {//to get admin
        return admin;
    }

    public void setAdmin(int admin) {//to set admin
        this.admin = admin;
    }

    public int getAuditor() {
        return auditor;
    }

    public void setAuditor(int auditor) {//to set auditor
        this.auditor = auditor;
    }


    public void delete(){//this method to remove or delete row from table
        try {
            System.out.println("Please,enter the id of project which you want to delete");
            Class.forName("org.postgresql.Driver");
            connection=DriverManager.getConnection(connectionUrl,"postgres","Airpods123");
            statement=connection.createStatement();
            resultSet=statement.executeQuery("delete from project where id="+scanner.nextInt()+";");
        }catch (Exception e){//to catch exceptions
            System.out.println(e);
        }
        System.out.println("============================================================================");
    }

    public void update(){
        try {
            System.out.println("Please enter new informations of:" +
                    "\nid\nname\nteam_members\ncost\ndate then enter" +
                    "the id of project which you want to change\nand" +
                    "in the end enter just done ");
            int id=scanner.nextInt();

            String name=scanner.next();
            String team_members=scanner.next();
            int cost=scanner.nextInt();
            String date=scanner.next();
            scanner.nextLine();
            String description=scanner.nextLine();

            Class.forName("org.postgresql.Driver");
            connection=DriverManager.getConnection(connectionUrl,"postgres","Airpods123");
            statement=connection.createStatement();
            resultSet=statement.executeQuery("update project set id="+id+",name='"+name+"', team_members='"
                    +team_members+"',cost="+cost+",date ='"+date+"',"+"description='"+description
                    +"'"+"where id="+scanner.nextInt());
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("============================================================================");
    }}


