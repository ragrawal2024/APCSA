import java.util.*;
/**
 * Write a description of class Intro here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Intro
{
    public static void main(String[]args){
        System.out.println("I like pumpkin pie");
        System.out.println("pumpkin \"pi\"");

        int a = 89;
        int b = 14;
        double c = 2.0;
        String d= "APCS";
        boolean e = false;
        System.out.println(a/b);
        System.out.println(a/c);
        // a/b is an integer while a/c is a double
        System.out.println(a/(double)b);

        if(e&&a%2==0){
            System.out.println("Hello World");
        }
        if(!e||a%2==1||b%2==1){
            System.out.println("Crank it up!");
        }
        else{
            System.out.println("SHHH!");
        }
        if(c<5){
            System.out.println("itsy-bitsy");
        }
        else if(b==14){
            System.out.println("Lucky Seven");
        }
        else{
            System.out.println(d);
        }
        
    }

}
