import java.util.Scanner;
/**
 * Write a description of class conditionals here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class loopMethodPractice
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        /** 
         * 1. Ask the user to enter a positive integer.
         *    Print all the multiples of 3 up to and including that integer.
         *    For example, if the user entered, 22, the code should print:
         *    3 6 9 12 15 18 21
         *    Choose an appropriate kind of loop as part of your solution
         */
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int count = 1;
        while(3*count<=num){
            System.out.print(3*count + " ");
            count++;
        }
        System.out.println();
        
        /**
         * 2. Write a program that asks the user to enter a positive integer.
         *    Do the following steps as long as the number is not 1
         *      - if the number is even, divide it by 2
         *      - otherwise multiply the number by 3 and add 1
         *      - print the current number
         *
         *    Choose an appropriate kind of loop as part of your solution  
         */
        System.out.println("Enter a number: ");
        num = sc.nextInt();
        System.out.println("Starting at: " + num);
        while(num!=1){
            if(num%2==0){
                num/=2;
            }
            else{
                num = num*3 + 1;
            }
            System.out.println(num);
        }
        
        
        /**
         * 3. Write a nested for loop to print the following data pattern
         *      3 4 5 $
         *      3 4 5 $
         *      3 4 5 $
         *      3 4 5 $
         */
        for(int i = 0; i<4;i++){
            for(int j = 3; j<7;j++ ){
                if(j==6){
                    System.out.println("$");
                }
                else{
                    System.out.print(j + " ");
                }
            }
        }
        
        
        /** 
         * 4. Write the method yearsToAMillion described below. Call that method
         *    from here with starting with 25000 at 7.5% interest.
         *    Print the value returned.
         */
        double prin = 25000;
        double intr = 0.075;
        
        
        /*# Challenge!  Write the method printStars described below and
         * call that method from here with the values of 3 and 6
         */
        
  
    }
    
    /**
     * name: yearsToAMillion
     * @param - start - double - the amount of money you start with
     * @param - interest - double - the interest rate
     * @return - int - the number of years it will take to grow the
     *    the starting amount of money to a million dollars.
     */
    
    public static void yearsToAMillion(double start, double interest){
        while()
    }
     
    /*# Challenge */
    /** 
     * name: printStars - prints a star pattern based on parameters
     * @param: r - number of rows of starts
     * @param: c - number of stars to have in first row - must be greater
     *             than or equal to r
     * @return: none
     * If r and c were 4 and 4 respectively, this would print
     *      * * * *
     *      * * * 
     *      * * 
     *      * 
     */
    
    }

