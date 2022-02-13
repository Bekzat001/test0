package com.company;
import java.util.*;
public class Service extends Data implements Kit{//this inherits from Information and implements from Kit
    Scanner scanner=new Scanner(System.in);
    @Override
    public void inform() {//this method to know the need of users
        System.out.println("Please choose which pack you want:" +
                "\nbasic(enter 1)\nadvanced(enter 2)\npremium(enter 3)");
        int choose=scanner.nextInt();//initialize "choose" to know the need of users
        if(choose==1){
            basic();//call method basic to show basic pack
        }
        else if(choose==2){
            advanced();//as basic
        }
        else if(choose==3){
            premium();//as basic
        }
    }

    @Override
    public void data() {

    }

    @Override
    public void basic() {
        System.out.println("You choose basic version for companies:" +
                "\nIn this pack you are only given basic protection and" +
                " you can add also 10 devices:" +
                "\nPrice:29990kzt");
        System.out.println("If you want to purchase this pack or have" +
                " questions, enter 1 if you want back then 2");
        int  choose=scanner.nextInt(); //define need of user
        if(choose==1){
            super.Contacts();//I use super to use method from parent class
        }
        else if(choose==2){
            inform();//call method ,this line actually to get back
        }
        else{
            System.out.println("Failed");
        }
    }

    @Override
    public void advanced() {
        System.out.println("You choose basic version for inviduals:" +
                "\nIn this pack you are only given basic protection:" +
                "\nwebcam,internet etc,also you can add 30 devices\nPrice:49990kzt");
        System.out.println("If you want to purchase this pack or have questions," +
                " enter 1 if you want back then 2");
        int choose=scanner.nextInt();
        if(choose==1){
            super.Contacts();
        }
        else if(choose==2){
            inform();
        }
        else{
            System.out.println("Failed");
        }
    }

    @Override
    public void premium() {
        System.out.println("You choose basic version for inviduals:" +
                "\nIn this pack you are only given basic protection:" +
                "\nwebcam,internet etc,also you can add 50 devices" +
                "\nPrice:69990kzt");
        System.out.println("If you want to purchase this pack or have" +
                " questions, enter 1 if you want back then 2");
        int  choose=scanner.nextInt();
        if(choose==1){
            super.Contacts();
        }
        else if(choose==2){
            inform();
        }
        else{
            System.out.println("Failed");
        }
    }
}
