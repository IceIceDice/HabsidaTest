public class Check {

    public static boolean numberValidRoman(String num1, String num2){
        RomanConverter roman = new RomanConverter();

        if(roman.isRoman(num1) && roman.isRoman(num2)) {
            return true;
        } else if((notANumber(num1) && !roman.isRoman(num1)) || (notANumber(num2) && !roman.isRoman(num2))){
            System.out.println("Invalid expression: not a number");
            System.exit(0);
        } else if(roman.isRoman(num1) || roman.isRoman(num2)){
            System.out.println("Invalid expression: all numbers must be same type(Roman or Arabic)");
            System.exit(0);
        }

        return false;
    }

    public static boolean numbersRange(int num1, int num2, boolean... useRoman){
        if((num1 <= 0 || num1 > 10  || num2 > 10 || num2 <= 0) && useRoman[0]){
            System.out.println("Invalid Roman number(s) or range. Valid range I-X");
            return false;
        }
        else if(num1 <= 0 || num1 > 10 || num2 > 10 || num2 <= 0){
            System.out.println("Invalid number(s). Valid range 1-10");
            return false;
        }
        return true;
    }

    static boolean notANumber(String num){
        for (int i = 0; i < num.length(); i++) {
            if(!Character.isDigit(num.charAt(i)))
                return true;
        }
        return false;
    }
}
