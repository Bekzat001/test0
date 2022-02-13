package com.company;
import java.util.Scanner;

public class Signin extends Employee {
    private int attempts=0;
    Scanner scanner=new Scanner(System.in);
    public void adminorworker(){//define admin or worker
        System.out.println("~Hello you are in database system of this company~ " +
                "\n *Please send 1 if you are worker \n *send 2 if you admin");
        System.out.println("==================================================");
        int a=scanner.nextInt();
        if(a==1){
            System.out.println("Hello,worker");
            worker();//call worker method
        }
        else if(a==2){
            System.out.println("Hello,admin");
            admin();//call admin method
        }
        else{
            System.out.println("Failed");
        }
    }
    public void admin(){
        String passwordad="adminbeka";//initialize admin's password
        String enteredpassad;//initialize above password
        System.out.println("Please enter admin`s password");
        System.out.println("============================");
        enteredpassad=scanner.next();
        if(passwordad.equals(enteredpassad)==true){//compare two strings
            System.out.println("Password accepted");
            System.out.println("If you want to:\nread(enter 1)\nupdate(enter 2)" +
                    "\ndelete(enter 3)\nfind out the salary(enter 4)");
            int choose=scanner.nextInt();//define need of users
            if(choose==1){
                super.read();
            }
            else if(choose==3){
                super.delete();
            }
            else if(choose==2){
                super.update();
            }
            else if(choose==4){
                System.out.println("Your salary:"+super.salarycalculator()+"KZT");
            }
            else{
                System.out.println("Failed");
            }
        }
        else{
            if(this.attempts<2){ //count of attempts
                int id=2;
                this.attempts++;//increment of attempts to count
                System.out.println("Failed,please check CapsLock or Language");
                fail(id);//call method if password is wrong
            }
            else{
                System.out.println("You lost last attempt");
            }
        }
    }
    public void worker(){
        String password="userbeka";
        String enteredpass;
        System.out.println("Please enter worker`s password");
        System.out.println("============================");
        enteredpass=scanner.next();
        if(password.equals(enteredpass)==true){
            System.out.println("Password accepted");
            System.out.println("If you want to:\nread(enter 1)\ncreate(enter 2)"+
                    "\nfind out the salary(enter 3)");
            int choose=scanner.nextInt();
            if(choose==1){
                super.read();
            }
            else if(choose==2){
                super.create();
            }
            else if(choose==3){
                System.out.println("Your salary:"+super.salarycalculator()+"KZT");
            }
            else{
                System.out.println("Failed");
            }
        }
        else{
            if(this.attempts<2){
                int id=1;
                this.attempts++;
                System.out.println("Failed,please check CapsLock or Language");
                fail(id);
            }
            else{
                System.out.println("You lost last attempt");
            }

        }
    }
    public void fail(int n){
        if(n==1){
            System.out.println("You have "+(3-this.attempts)+" attempts");
            worker();
        }
        else if(n==2){
            System.out.println("You have "+(3-this.attempts)+" attempts");
            admin();
        }
    }
}
