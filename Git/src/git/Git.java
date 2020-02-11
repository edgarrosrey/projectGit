//author edgarrosrey
//04-02-2020
package git;

import java.util.Scanner;


public class Git {
    //Global declarations:
    static Scanner keyboard = new Scanner(System.in);
    static String[] letters;
    public static void main(String[] args) {
       //PREGUNTAR DNI
       int dni=12345678;
       
       
      char letter= DNIletter(dni);
        System.out.println(dni+":"+letter);
        dni=keyboard.nextInt();
        
    }
    
    //function que recibe dni y devuelvo la letra
    private static char DNIletter(int dni){
    char letter=' ';
    String letters="TRWAGMYFPDXBNJZSQVHLCKE";
    int res=dni%23;
    letter=letters.charAt(res);
    return letter;
    
    }
}
