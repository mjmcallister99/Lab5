import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner hexi = new Scanner(System.in);
        int length;
        long sum = 0;
        int varAsDec;
        int powerNum = 0;
        int convert;
        //double test;
        String input;


        System.out.print("Enter a hexadecimal number: ");

        input = hexi.nextLine();
        length = input.length();
        length = length - 1;
        input.charAt(length);

        while (length > -1) {
            char var = input.charAt(length);
            var = Character.toUpperCase(var);
            varAsDec = Character.getNumericValue(var);

            if (varAsDec <= 9) {
                sum += varAsDec * Math.pow(16, powerNum);
                //System.out.println(powerNum);
                //test = Math.pow(16, powerNum);
                //System.out.println(test);
            }

            else if ((var == '0') || (var == 'x')) {
                break;
            }

            else {
                switch (var) {
                    case 'A':
                        convert = 10;
                        sum += convert * Math.pow(16, powerNum);
                        break;
                    case 'B':
                        convert = 11;
                        sum += convert * Math.pow(16, powerNum);
                        break;
                    case 'C':
                        convert = 12;
                        sum += convert * Math.pow(16, powerNum);
                        break;
                    case 'D':
                        convert = 13;
                        sum += convert * Math.pow(16, powerNum);
                        break;
                    case 'E':
                        convert = 14;
                        sum += convert * Math.pow(16, powerNum);
                        break;
                    case 'F':
                        convert = 15;
                        sum += convert * Math.pow(16, powerNum);
                        //System.out.println(sum);  Test of Letter. Moved to long. Data type was too small.
                        break;
                    default:
                        convert = 0;
                        sum += convert * Math.pow(16, powerNum);
                        break;
                }
            }
            length--;
            powerNum++;
        }
        System.out.print("Your number is " + sum + " in decimal");
    }
}
