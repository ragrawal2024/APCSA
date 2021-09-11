import java.util.Scanner;
/**
 * PasswordEnhancer.java  
 *
 * @author: Your name goes here
 * 
 * This program will strengthen any String password provided
 * by the user by using the strategy of converting every vowel 
 * to a corresponding special character.
 * The program then displays the improved password in the terminal
 * window.
 * 
 * The program enhances Strings (passwords) it receives until the
 * user inputs "-999", at which point the main() method ends.
 * 
 * 
 * You may ONLY use methods and programming structures that we have talked
 * about this year in class (no arrays, for example).
 */
public class PasswordEnhancer
{
    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
    	String pass = "";
    	String newPass;
    	String s = "bcubdcub";
    	System.out.println(s.indexOf('a'));
    	while(!pass.equals("-999")) {
    		pass = sc.nextLine();
    		newPass = enhancePassword(pass);
    		System.out.println(newPass);
    	}
    	
    }
    

    public static String enhancePassword(String oldPassword)
    {
    	while(oldPassword.indexOf('a')!=-1) {
    		int index = oldPassword.indexOf('a');
    		String first = oldPassword.substring(0, index);
    		String replace = "@";
    		String last = oldPassword.substring(index+1);
    		oldPassword = first + replace + last;
    	}
    	while(oldPassword.indexOf('e')!=-1) {
    		int index = oldPassword.indexOf('e');
    		String first = oldPassword.substring(0, index);
    		String replace = "3";
    		String last = oldPassword.substring(index+1);
    		oldPassword = first + replace + last;
    	}
    	while(oldPassword.indexOf('a')!=-1) {
    		int index = oldPassword.indexOf('a');
    		String first = oldPassword.substring(0, index);
    		String replace = "@";
    		String last = oldPassword.substring(index+1);
    		oldPassword = first + replace + last;
    	}
    	while(oldPassword.indexOf('i')!=-1) {
    		int index = oldPassword.indexOf('i');
    		String first = oldPassword.substring(0, index);
    		String replace = "!";
    		String last = oldPassword.substring(index+1);
    		oldPassword = first + replace + last;
    	}
    	while(oldPassword.indexOf('o')!=-1) {
    		int index = oldPassword.indexOf('o');
    		String first = oldPassword.substring(0, index);
    		String replace = "0";
    		String last = oldPassword.substring(index+1);
    		oldPassword = first + replace + last;
    	}
    	while(oldPassword.indexOf('u')!=-1) {
    		int index = oldPassword.indexOf('u');
    		String first = oldPassword.substring(0, index);
    		String replace = "^";
    		String last = oldPassword.substring(index+1);
    		oldPassword = first + replace + last;
    	}
    	return oldPassword;
    	
    }
    
    
}
