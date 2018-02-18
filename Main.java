/*Alejandro Zerega
2/18/2018
New Lab 5 (Lab 4 document)
*/
import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner userInput = new Scanner(System.in);
        int i = 0;
        long decimal = 0;
        int number = 0;

        System.out.println("Enter a hexadecimal number:");
        String user = userInput.nextLine().toUpperCase();

        if (user.charAt(0) == '0' && (user.charAt(1)) == 'X') {
            user = user.substring(2,user.length());
        }
        while(i < user.length()){

            char letter = user.charAt(user.length() - i - 1);
            if(letter == 'A'){
                number = 10;
            } else if(letter == 'B'){
                number = 11;
            } else if(letter == 'C'){
                number = 12;
            } else if (letter == 'D'){
                number = 13;
            } else if (letter == 'E'){
                number = 14;
            } else if (letter == 'F'){
                number = 15;
            }else if(letter == '1'||letter == '2'||letter == '3'||letter == '4'||letter == '5'||
                    letter == '6'||letter == '7'||letter == '8'||letter == '9') {
                number = Character.getNumericValue(letter);

            }
            //This is where the hexadecimal number's value is converted to a decimal value.
            decimal = (long)(decimal + number*Math.pow(16,i));
            i++;
        }
        System.out.println("Your number is " + decimal + " in decimal");
    }
}