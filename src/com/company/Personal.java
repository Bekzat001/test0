package com.company;
import java.util.*;
public class Personal extends Data implements Kit {
    Scanner scanner=new Scanner(System.in);
    @Override
    public void inform(){
        System.out.println("Please choose which pack you want:" +
                "\nbasic(enter 1)\nadvanced(enter 2)\npremium(enter 3)");
        int choose=scanner.nextInt();//define need of user
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

    public void data() {

    }

    @Override
    public void basic() {
        System.out.println("You choose basic version for inviduals:" +
                "\nIn this pack you are only given basic protection:" +
                "\nPrice:5000kzt");
        System.out.println("If you want to purchase this pack or have" +
                " questions, enter 1 if you want back then 2");
        int choose=scanner.nextInt(); //define need of user
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
                "\nwebcam,internet etc,also you can add 2 devices" +
                "\nPrice:14990kzt");
        System.out.println("If you want to purchase this pack or have " +
                "questions, enter 1 if you want back then 2");
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
        int choose;
        System.out.println("You choose basic version for inviduals:" +
                "\nIn this pack you are only given basic protection:" +
                "\nwebcam,internet etc,also you can add 4 devices" +
                "\nPrice:24990kzt");
        System.out.println("If you want to purchase this pack or have questions," +
                " enter 1 if you want back then 2");
        choose=scanner.nextInt();
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
