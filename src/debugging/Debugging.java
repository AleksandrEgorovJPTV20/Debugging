//AleksandrEgorovJPTV20
package debugging;

import java.util.Scanner;

public class Debugging {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String firstString = scan.nextLine();
        char[] charFirstString = firstString.toCharArray();
        char[] charSecondString = new char[charFirstString.length];
        for(int i = 0; i < charFirstString.length; i++){
            charSecondString[(charFirstString.length-1)-i]=charFirstString[i];
            
        }
        String secondString = new String(charSecondString);
        System.out.print("Введение строк наоборот: ");
        System.out.print(secondString);
                
    }
    
}
