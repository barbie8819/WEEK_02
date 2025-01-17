import java.util.Scanner;
public class PalindromeChecker {
   public static void main (String[] args){
    System.out.println("Enter the string to check "); 
Scanner input = new Scanner(System.in);
String text = input.nextLine();
       Palindrome string  = new Palindrome(text);
	   string.Display();
   }

}
class Palindrome {
private String text;
         public Palindrome(String text){
     this.text = text;
   }
    public boolean isPalindrome(){
	String s =this.text;
	for(int i=0;i<s.length();i++){
	if(s.charAt(i)!= s.charAt(s.length()-i-1)) return false;
	}
	return true;
}
public void Display(){
    if(isPalindrome())
 System.out.println("String " + this.text + " is palindrome"); 
 else 
  System.out.println("String " + this.text + " is not palindrome"); 
}
}