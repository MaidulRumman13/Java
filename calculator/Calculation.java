
package Maidul2.calculator;

public class Calculation {
    int result;
	//Method for addition
	public int add(int num1, int num2){
		result = num1+num2;
		return result;
	}
	//Method for subtraction
	public int substract(int num1, int num2){
		result = num1-num2;
		return result;
	}
	//Method for multiplication
	public int multiply(int num1, int num2){
		result = num1*num2;
		return result;
	}
	//Method for division
	public int divide(int num1, int num2){
		
                try
                {
                    result = num1/num2;
                    
                }
                catch(Exception e)
                {
                    System.out.println("Division by Zero. "+e);
                }
                return result;
	}
}
