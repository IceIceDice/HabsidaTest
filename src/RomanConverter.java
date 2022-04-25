

public class RomanConverter {

    public boolean isRoman(String input){
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i) != 'I' && input.charAt(i) != 'V' && input.charAt(i) != 'X'){
                return false;
            }
        }
        return true;
    }


    public String convertToRoman(int input){

        StringBuilder convertResult = new StringBuilder();

        if(input == 0)
            convertResult.append("0");

        if(input < 0)
            convertResult.append("-");
        input = Math.abs(input);


        while (input >= 100) {
            convertResult.append("C");
            input -= 100;
        }
        while (input >= 90) {
            convertResult.append("XC");
            input -= 90;
        }
        while (input >= 50) {
            convertResult.append("L");
            input -= 50;
        }
        while (input >= 40) {
            convertResult.append("XL");
            input -= 40;
        }
        while (input >= 10) {
            convertResult.append("X");
            input -= 10;
        }
        while (input >= 9) {
            convertResult.append("IX");
            input -= 9;
        }
        while (input >= 5) {
            convertResult.append("V");
            input -= 5;
        }
        while (input >= 4) {
            convertResult.append("IV");
            input -= 4;
        }
        while (input >= 1) {
            convertResult.append("I");
            input -= 1;
        }

        return convertResult.toString();
    }

    public byte convertFromRoman(String input){

        byte convertResult = 0;
        if(isRoman(input)){

            switch(input){
                case "I":
                    convertResult = 1;
                    break;
                case "II":
                    convertResult = 2;
                    break;
                case "III":
                    convertResult = 3;
                    break;
                case "IV":
                    convertResult = 4;
                    break;
                case "V":
                    convertResult = 5;
                    break;
                case "VI":
                    convertResult = 6;
                    break;
                case "VII":
                    convertResult = 7;
                    break;
                case "VIII":
                    convertResult = 8;
                    break;
                case "IX":
                    convertResult = 9;
                    break;
                case "X":
                    convertResult = 10;
                    break;
                default:
                    convertResult = 11;
            }
        }

        return convertResult;
    }




}
