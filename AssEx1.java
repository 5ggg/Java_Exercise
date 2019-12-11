/*
    Non task-specific marks:
     
1. Add a comment with your name and matric here - [1 mark]
     
           【【【      Name: Jialiang Song  (Leon)     】】】
           【【【      Student ID: 2410536s            】】】
           【【【      Subject: Software development   】】】
     
2. Clear code commenting [1 mark]
      
    1)    Sorry, Simon... 
            I forget that it is keep the code commenting clear
         or
           "clean" (because clear also has the Verb meaning...) all of the useless code commenting.
            So, I just keep the original comment. Did not delete them as well as keep my code comment clear...
       
    2)   (9th,Oct,2019 update) 
           ---I have deleted the useless original code comment 0.0
      
3. Use of correct Java variable naming conventions [1 mark]
     
       okok, No problem 0.0
     
*/

import java.util.Scanner;
public class AssEx1 {
	
    public static void main(String[] args) {
        String name = "Fred";

        // Task 1 [2 marks]
        
        welcome(name);

        //Task 2 [3 marks]
         
        int m = 7;
        int max = 100;
        multiples(m,max);

        // Task 3 [3 marks]
        // Call the method and print the output three times below...
        
        System.out.println(check(1));
        System.out.println(check(6));
        System.out.println(check(12));


        // Task 4 [6 marks]

        calculator();

        // Task 5 [5 marks]
        
        table(13,5);
        table(-2,7);
        table(3,6);
    }
    
    
    
// Task 1 - welcome
 	public static void welcome(String name){
         System.out.println("Hello "+name);
     }
 	
// Task 2 - multiples
     public static void multiples(int m, int max){
         for(int i = m; i <= max; i++){
             if(i % m == 0){
                 System.out.println(i);
             }
         }
     }
     
//Task 3 - check
     public static boolean check(int m){
         boolean b = false;
         if(m > 5 && m < 10)
             b = true;
         return b;
     }
     
//Task 4 - calculator  
//This task need input the number first, you know
     public static void calculator(){
         Scanner sc = new Scanner(System.in);
         int a, b, d;
         String t;
         char c;
         a=sc.nextInt();
         t=sc.next();
         b=sc.nextInt();
         c=t.charAt(0);
         
         //Eclipse could not understand "-" means minus, so we need to set the rolls to let the computer knows. 
         //i.e.  We can use "if".
         
         if(c == '-')
             d = a - b;
         else
             d = a + b;
         t=String.format("Calculation: %d %c %d = %04d", a, c, b, d); 
         System.out.println(t);
     }
     
// Task 5 - table
//Not too hard in fact so I didn't add the comment. The code is clear I think 0.0
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