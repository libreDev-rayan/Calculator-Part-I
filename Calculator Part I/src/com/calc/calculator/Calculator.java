package com.calc.calculator;

public class Calculator {

	private double operandOne ;
	private double operandTwo ;
	private char  operation ;
	private double total;



	public double getOperandOne() {
//		System.out.println("operand one set it as " +operandOne);
		return operandOne;
	}

	public void setOperandOne(double operandOne) {
//		System.out.println("operand one set it as " +operandOne);

		this.operandOne = operandOne;
	}

	public double getOperandTwo() {
//		System.out.println("operand two set it as " +operandOne);

		return operandTwo;
	}

	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}

	public char  getOperation() {
		return operation;
	}

	public void setOperation(char  operation) {
		this.operation = operation;
	}

	public void performOperation() {
		if (operation == '+') {
			System.out.println("operation will be operand one + operand two" );

			total= operandOne+operandTwo;
		}
		else if  (operation == '-') {
			System.out.println("operation will be operand one - operand two" );

			total= operandOne+operandTwo;
		}
		else {
			System.out.println("wrong input try again please !");
		}
		
		
	}

	public double  getResults() {
		System.out.println("total = " + total);
		return total;
	
	}

}
