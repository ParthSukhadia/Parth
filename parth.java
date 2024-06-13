

import java.util.Scanner;
public class parth { 
    public static void main(String A[]) {
 Scanner sc = new Scanner(System.in);
System.out.println(" Enter number 1");
int num1 = sc.nextInt( );

System.out.println(" Enter number 2 ");
int num2 = sc.nextInt( );
  
System.out.println("Enter an Operator ( plus , minus , multiply , divide ):");
String operator = sc.next().trim();

int result = 0;
if  (operator.equals ("plus")){
  System.out.println(num1 + num2 );
  result = num1 + num2 ;
} else if (operator.equals("minus")){
  System.out.println(num1 - num2 );
 result = num1 - num2 ;
} else if (operator.equals("multiply")){
  System.out.println(num1 * num2 );
  result = num1 * num2 ;
}else  if( operator.equals("divide")){
  System.out.println(num1 / num2 );
 result  = num1 / num2 ;
}

System.out.println("The Result of " + num1 + " " + operator + " " + num2 + " " + " is " + result );

    }
}
