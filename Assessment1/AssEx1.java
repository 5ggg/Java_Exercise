/* 
    Instructions - Assessed Exercise 1
    - This exercise tests the things you've learnt in week 1.
    - Add your code to this file, leaving the main method unchanged (except for task 3).
    - Add all of your methods *below* the main method, in question order.
    - Each of the tasks involves writing a single method.
    - Total number of marks is 22.
    - Read the instructions for each task *carefully*.
    - Submit a single .java file on moodle by the deadline (details on moodle).
    - Do not change the name of the Java file, but ensure you add your name and 
        matric as requested below...
    - You do not need to add any additional import lines.
    - Everything you need to do these tasks is covered in the week 1 slides.
*/

/*
    Non task-specific marks:
     - Add a comment with your name and matric here - [1 mark]
     - Clear code commenting [1 mark]
     - Use of correct Java variable naming conventions [1 mark]
*/
import java.util.Scanner;
public class AssEx1 {
    public static void main(String[] args) {
        String name = "Fred";

        /* Task 1
            Create a method called welcome that prints the word "Hello" followed by whatever
            is stored in the variable 'name'. It will be called by the line below.
        */
        welcome(name);

        /* Task 2
            Write a method called multiples that prints out all multiples of some integer m between m and
            another intger max in individual lines.
            For example multiples(3,11) should print:
            3
            6
            9
            Your method *must* use a loop
        */
        int m = 7;
        int max = 100;
        multiples(m,max);

        /* Task 3
            Write a method called check that takes an integer as an argument and
            returns a boolean value that is true if the integer is greater
            than 5 and less than 10. Call the method three times with the integers
            1, 6 and 12 respectively, printing the output each time on a new line.
        */
        // Call the method and print the output three times below...
        System.out.println(check(1));
        System.out.println(check(6));
        System.out.println(check(12));


        /* Task 4
            Write a method called calculator that prompts the user to input
            an integer, an operator ('+' or '-') and finally another integer.
            The method should then perform the calculation and print the answer using
            String.format. The result of the claculation should be padded with
            zeros to make it length 4. E.g. if the user enters:
            4
            -
            3
            The program should output:
            "Calculation: 4 - 3 = 0001"
            The inputs should be on separate lines.
            You don't need to do any error checking on the user input.
        */
        calculator();

        /* Task 5
            Write a method called table that takes two integers as arguments that correspond to
            a number of rows and a number of columns respectively.
            If either integer is <0 or >= 10, the program should print:
            "Error, rows and columns must be >0 and <10"
            and return.
            If the number of rows and columns is between >=0 and <=9 the method
            should print a table with the table co-ordinates in each position. For example, if
            the number of rows is 2 and the number of columns 4:
              (0,0)  (0,1)  (0,2)  (0,3)
              (1,0)  (1,1)  (1,2)  (1,3)
            Important:
             - You *must* only use System.out.print and *not* System.out.println...
             - Separate each co-ordinate pair with a tab ('\t')
             - You may *not* use for loops! I.e. you *must* use a do or a while loop.
        */
        table(13,5);
        table(-2,7);
        table(3,6);
    }
    public static void welcome(String name){
        System.out.println("Hello "+name);
    }
    
    
    public static void multiples(int m, int max){
        for(int i = m; i <= max; i++){
            if(i % m == 0){
                System.out.println(i);
            }
        }
    }
    
    
    public static boolean check(int m){
        boolean b = false;
        if(m > 5 && m < 10)
            b = true;
        return b;
    }
    
    
    public static void calculator(){
        Scanner sc = new Scanner(System.in);
        int a, b, d;
        String t, A, B, D;
        char c;
        a=sc.nextInt();
        t=sc.next();
        b=sc.nextInt();
        c=t.charAt(0);
        if(c == '-')
            d = a - b;
        else
            d = a + b;
        t=String.format("Calculation: %d %c %d = %04d", a, c, b, d);
        System.out.println(t);
    }
    
    
    public static void table(int n, int m){
        if(n < 0 || n >= 10 || m < 0 || m >= 10){
            System.out.println("Error, rows and columns must be >0 and <10");
            return;
        }
        int i, j;
        i=0;
        while(i < n){
            j = 0;
            while(j < m){
                System.out.print("("+i+","+j+")");
                if(j != m - 1)
                    System.out.print("\t");
                else
                    System.out.print("\n");
                j++;
            }
            i++;
        }
    }
}