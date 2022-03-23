
package Maidul2;
import Maidul2.calculator.*;
import java.io.*;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
		
                char operator;
		Scanner scan = new Scanner(System.in);
                Scanner input = new Scanner(System.in);
               
                // ask users to enter operator
                System.out.println("Choose an operator: +, -, *, or /");
                operator = input.next().charAt(0);

		System.out.println("Enter first number");
		int firstNumber = scan.nextInt();

		System.out.println("Enter second number");
		int secondNumber = scan.nextInt();
		
                //set the values in VO
		CalculatorVO calVO = new CalculatorVO();
		calVO.setFirstNumber(firstNumber); 
		calVO.setSecondNumber(secondNumber);
		
		Calculation cal = new Calculation();
		
		int addResult = cal.add(calVO.getFirstNumber(), calVO.getSecondNumber());
		System.out.println("Addition Result ="+addResult);
		
		int subResult = cal.substract(calVO.getFirstNumber(), calVO.getSecondNumber());
		System.out.println("Subtraction Result ="+subResult);
		
		int mulResult = cal.multiply(calVO.getFirstNumber(), calVO.getSecondNumber());
		System.out.println("Multiplication Result ="+mulResult);
		
		float divResult = cal.divide(calVO.getFirstNumber(), calVO.getSecondNumber());
                if(divResult>0.0){
                    		System.out.println("Division Result ="+divResult);

                }else{
                    	

                }
    }
}
