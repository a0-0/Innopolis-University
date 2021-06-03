package Train.With.ME;

/**
 * created by: Ahmed El said
 * 15.05.2021
 **/

public class SimpleCalculator {
    private double secondNumber;
    private double firstNumber;

    public double getFirstNumber() {
        return this.firstNumber;
    }

    public double getSecondNumber() {
        return this.secondNumber;
    }

    public void setFirstNumber(double firstNumbe) {
        this.firstNumber = firstNumbe;
    }

    public void setSecondNumber(double SecondNumber) {
        this.secondNumber = SecondNumber;
    }

    public double getAdditionResult() {
        return firstNumber + secondNumber;
    }

    public double getSubtractionResult() {
        return firstNumber - secondNumber;
    }

    public double getMultiplicationResult() {
        return firstNumber * secondNumber;
    }

    public double getDivisionResult() {
        if (firstNumber != 0 && secondNumber != 0) {
            return firstNumber / secondNumber;
        } else return 0.0;
    }
}
/**
 * Write a class with the name SimpleCalculator. The class needs two fields (instance variables) with names firstNumber and secondNumber both of type double.
 * <p>
 * Write the following methods (instance methods):
 * <p>
 * *Method named getFirstNumber without any parameters, it needs to return the value of firstNumber field.
 * *Method named getSecondNumber without any parameters, it needs to return the value of secondNumber field.
 * * *Method named setFirstNumber with one parameter of type double, it needs to set the value of the firstNumber field.
 * *Method named setSecondNumber with one parameter of type double, it needs to set the value of the secondNumber field.
 * *Method named getAdditionResult without any parameters, it needs to return the result of adding the field values of firstNumber and secondNumber.
 * *Method named getSubtractionResult without any parameters, it needs to return the result of subtracting the field values of secondNumber from the firstNumber.
 * *Method named getMultiplicationResult without any parameters, it needs to return the result of multiplying the field values of firstNumber and secondNumber.
 * *Method named getDivisionResult without any parameters it needs to return the result of dividing the field values of firstNumber by the secondNumber. In case the value of secondNumber is 0 then return 0.
 * <p>
 * TEST EXAMPLE
 * <p>
 * TEST CODE:
 * <p>
 * SimpleCalculator calculator = new SimpleCalculator();
 * calculator.setFirstNumber(5.0);
 * calculator.setSecondNumber(4);
 * System.out.println("add= " + calculator.getAdditionResult());
 * System.out.println("subtract= " + calculator.getSubtractionResult());
 * calculator.setFirstNumber(5.25);
 * calculator.setSecondNumber(0);
 * System.out.println("multiply= " + calculator.getMultiplicationResult());
 * System.out.println("divide= " + calculator.getDivisionResult());
 * <p>
 * OUTPUT
 * <p>
 * add= 9.0
 * subtract= 1.0
 * multiply= 0.0
 * divide= 0.0
 * <p>
 * TIPS:
 * <p>
 * *add= 9.0 is printed because 5.0 + 4 is 9.0
 * *subtract= 1.0 is printed because 5.0 - 4 is 1.0
 * *multiply= 0.0 is printed because 5.25 * 0 is 0.0
 * *divide= 0.0 is printed because secondNumber is set to 0
 * <p>
 * <p>
 * NOTE: All methods should be defined as public NOT public static.
 * <p>
 * NOTE: In total, you have to write 8 methods.
 * <p>
 * NOTE: Do not add the main method to the solution code.
 **/
