package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /* Employee employee1=new Employee();
        employee1.setName("Beka");
        employee1.setPosition("CEO");
        employee1.setYearsWorking(5);

        System.out.println(employee1.getName());
        System.out.println(employee1.getPosition());
        System.out.println(employee1.getYearsWorking());*/
        /*String name="EQS";
        int age=0;
        double clirens=17.8;
        System.out.printf("My car is %s and hello \n", name);
        System.out.printf("Probeg is %.2f \n", clirens);
        System.out.print("Enter ur full name: ");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.next();        System.out.println("Hello "+name);
        int age=scanner.nextInt();         System.out.printf("U r %d y.o. ", age);
        double height=scanner.nextDouble(); System.out.printf("U r %.2f y.o. ",height);
        String name=scanner.nextLine();     System.out.printf("ur fio is %s \n",name);
*/
        Employee student1=new Employee();
        student1.setName("Beka");
        student1.setDepartment("CS");
        student1.setYear(3);
       // System.out.println(student1.getName());

        Employee student2=new Employee();
        student2.setName("Seka");
        student2.setDepartment("SE");
        student2.setYear(1);
        //System.out.println(student2.getYear());
    }
}
