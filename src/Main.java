import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        RomanConverter roman = new RomanConverter();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input: ");
        String expression = scanner.nextLine();

        expression = expression.toUpperCase().replace(" ","");
        String[] operators = expression.split("[A-Z\\d]");
        String[] numbers = expression.split("[+/*-]");

        if(numbers.length != 2 || !operators[0].equals("")) {
            System.out.println("Invalid expression. Example of valid expression: 1 + 2; I + II");
            System.exit(0);
        }

        boolean useRoman = Check.numberValidRoman(numbers[numbers.length - 2], numbers[numbers.length - 1]);

        if(useRoman){
            numbers[numbers.length - 2] = String.valueOf(roman.convertFromRoman(numbers[numbers.length - 2]));
            numbers[numbers.length - 1] = String.valueOf(roman.convertFromRoman(numbers[numbers.length - 1]));
        }

        int num1 = Integer.parseInt(numbers[numbers.length - 2]);
        int num2 = Integer.parseInt(numbers[numbers.length - 1]);


        if(Check.numbersRange(num1, num2, useRoman)){
            if(useRoman)
                System.out.println("Output:\n" + roman.convertToRoman(calculate(num1, num2, operators[operators.length - 1])));
            else
                System.out.println("Output:\n" + calculate(num1, num2, operators[operators.length - 1]));
        }

    }

    static int calculate(int num1, int num2, String operator) {
            int result = 0;
            switch (operator) {
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    result = num1 / num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "+":
                    result = num1 + num2;
                    break;
                default:
                    System.out.println("Invalid operator. Valid operators are +, -, *, /.");
            }
            return result;
        }

    }



