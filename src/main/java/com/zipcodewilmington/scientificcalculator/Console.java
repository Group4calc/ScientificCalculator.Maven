package com.zipcodewilmington.scientificcalculator;


import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class Console {

    private double answer;
    private boolean onButton;
    private double firstNumber;
    private double secondNumber;
    private String switchSignFormulaHolder = "";
    private String switchSignFormulaHolderNegSecond = "";
    private boolean wrongOperator;


    public void calcRun() {

        onButton = true;
        String operator;
        Scanner Calculator = new Scanner(System.in);
        ScientificFeatures switchSignFormula = new ScientificFeatures();
        Scanner inputEsc = new Scanner(System.in);
        CoreFeatures clear = new CoreFeatures();


        while (onButton) {
            // loop wrong operator true
            wrongOperator = true;
            // print for operator choices
            System.out.println("Type the function within the ().");
            System.out.println("For addition(+), subtraction(-), division(/), or multiplication(*)");
            System.out.println("For the square(**), square-root(**/), cube(***), cube-root(***/), switch-sign(+/-) or factorial(fac)");
            System.out.println("For the inverse, sine, cosine, tan, invsine, incosine or invtangent, write as they are presented");

            System.out.println();
            // print enter number
            System.out.print("Enter first number ");
            firstNumber = Calculator.nextDouble();

            // Attempt to handle the error, but need a try/catch

            // print calculator choice
            System.out.print("Enter math operator to use for this calculation ");
            operator = Calculator.next();

            switch (operator) {
                case "+":
                    CoreFeatures additionFormula = new CoreFeatures();
                    System.out.print("Enter second number ");
                    secondNumber = Calculator.nextDouble();
                    String additionFormulaRead = String.valueOf(additionFormula.add(firstNumber, secondNumber));
                    System.out.println(additionFormulaRead);
                    break;
                case "-":
                    CoreFeatures subtractionFormula = new CoreFeatures();
                    System.out.print("Enter second number ");
                    secondNumber = Calculator.nextDouble();
                    String subtractionFormulaRead = String.valueOf(subtractionFormula.subtract(firstNumber, secondNumber));
                    System.out.println(subtractionFormulaRead);
                    break;
                case "/":
                    CoreFeatures divisionFormula = new CoreFeatures();
                    System.out.print("Enter second number ");
                    secondNumber = Calculator.nextDouble();
                    String divisionFormulaRead = String.valueOf(divisionFormula.div(firstNumber, secondNumber));
                    System.out.println(divisionFormulaRead);
                    break;
                case "*":
                    CoreFeatures multiplyFormula = new CoreFeatures();
                    System.out.print("Enter second number ");
                    secondNumber = Calculator.nextDouble();
                    String multiplyFormulaRead = String.valueOf(multiplyFormula.mult(firstNumber, secondNumber));
                    System.out.println(multiplyFormulaRead);
                    break;
                case "**":
                    ScientificFeatures squareFormula = new ScientificFeatures();
                    String squareFormulaPrint = String.valueOf(squareFormula.square(firstNumber));
                    System.out.println(squareFormulaPrint);
                case "***":
                    ScientificFeatures cubeFormula = new ScientificFeatures();
                    String cubeFormulaPrint = String.valueOf(cubeFormula.cube(firstNumber));
                    System.out.println(cubeFormulaPrint);
                    break;
                case "***/":
                    ScientificFeatures cubeRtFormula = new ScientificFeatures();
                    String cubeRtFormulaPrint = String.valueOf(cubeRtFormula.cubeRoot(firstNumber));
                    System.out.println(cubeRtFormulaPrint);
                case "+/-":
                    String switchSignFomrulaRead = String.valueOf(switchSignFormula.switchSign(firstNumber));
                    System.out.println(switchSignFomrulaRead);
                    break;
                case "**/":
                    ScientificFeatures squareRootFormula = new ScientificFeatures();
                    String squareRootFormulaPrint = String.valueOf(squareRootFormula.squareRoot(firstNumber));
                    System.out.println(squareRootFormulaPrint);
                    break;
                case "inverse":
                    ScientificFeatures inverseFormula = new ScientificFeatures();
                    String inverseFormulaRead = String.valueOf(inverseFormula.inverse(firstNumber));
                    System.out.println(inverseFormulaRead);
                    break;
                case "sine":
                    ScientificFeatures sineFormula = new ScientificFeatures();
                    String sineFormulaRead = String.valueOf(sineFormula.sine(firstNumber));
                    System.out.println(sineFormulaRead);
                    break;
                case "cos":
                    ScientificFeatures cosineFormula = new ScientificFeatures();
                    String cosineFormulaRead = String.valueOf(cosineFormula.cos(firstNumber));
                    System.out.println(cosineFormulaRead);
                    break;
                case "tan":
                    ScientificFeatures tanFormula = new ScientificFeatures();
                    String tanFormulaRead = String.valueOf(tanFormula.tan(firstNumber));
                    System.out.println(tanFormulaRead);
                    break;
                case "invsine":
                    ScientificFeatures arcSine = new ScientificFeatures();
                    System.out.print("Enter second number ");
                    secondNumber = Calculator.nextDouble();
                    String arcSineRead = String.valueOf(arcSine.inverseSine(firstNumber, secondNumber));
                    System.out.println(arcSineRead);
                    break;
                case "invcosine":
                    ScientificFeatures arcCosine = new ScientificFeatures();
                    System.out.print("Enter second number ");
                    secondNumber = Calculator.nextDouble();
                    String arcCosineRead = String.valueOf(arcCosine.inverseCosine(firstNumber, secondNumber));
                    System.out.println(arcCosineRead);
                    break;
                case "invtangent":
                    ScientificFeatures arcTan = new ScientificFeatures();
                    System.out.print("Enter second number ");
                    secondNumber = Calculator.nextDouble();
                    String arcTanFormula = String.valueOf(arcTan.inverseTangent(firstNumber, secondNumber));
                    System.out.println(arcTanFormula);
                    break;
                case "fac":
                    ScientificFeatures factorialFormula = new ScientificFeatures();
                    String factorialFormulaRead = String.valueOf(factorialFormula.factorial(firstNumber));
                    System.out.println(factorialFormulaRead);
                    break;
                default:
                    System.out.println("Incorrect operator");
                    do {
                        System.out.println("Do you want to exit? \nPlease enter Y or press N to clear the display");
                        String inputEscRead = inputEsc.next();
                        if (inputEscRead.equalsIgnoreCase("Y")) {
                            onButton = false;
                        } else if (inputEscRead.equalsIgnoreCase("N")) {
                            clear.clear();
                            wrongOperator = false;
                        } else {
                            System.out.println("Please enter the correct letter");
                        }
                        break;
                    } while (!wrongOperator);
            }
            System.out.println("Do you want to exit? \n Please enter Y or press N to clear the display");
            String inputEscRead = inputEsc.next();
            if (inputEscRead.equalsIgnoreCase("Y")) {
                onButton = false;
            } else if (inputEscRead.equalsIgnoreCase("N")) {
                System.out.println("\033[H\033[2J");
                System.out.flush();
            } else {
                System.out.println("Please enter the correct letter");
            }
        }

    }

}


//
//    public static void print(String output, Object... args) {
//        System.out.printf(output, args);
//    }
//
//
//    public static void println(String output, Object... args) {
//        print(output + "\n", args);
//    }
//
//    public static String getStringInput(String prompt) {
//        Scanner scanner = new Scanner(System.in);
//        println(prompt);
//        String userInput = scanner.nextLine();
//        return userInput;
//    }
//
//    public static Integer getIntegerInput(String prompt) {
//        return null;
//    }
//
//    public static Double getDoubleInput(String prompt) {
//        return null;
//    }
//}
