package Level2_Question;
// Program to Check Palindrome String
// Problem Statement: 	Create a PalindromeChecker class with an attribute text. Add methods to:
// Check if the text is a palindrome.
// Display the result.
// Explanation: The PalindromeChecker class holds the text attribute. The methods operate on this attribute to verify its palindrome status and display the result

public class CheckPalindrome {

    private String text;
    // Constructor
    CheckPalindrome(String text){
        this.text = text;
    }

    // Check the text is palindrome
    public boolean isPalindrome(){
        int j = this.text.length()-1;
        int i = 0;
        while(i<j){
            if(this.text.charAt(i)==this.text.charAt(j)){
                i++;
                j--;
            }else{
                return false;  
            }
        }
        return true;
    }


    public static void main(String[] args) {
        
        CheckPalindrome str = new CheckPalindrome("naman");
        System.out.println(str.isPalindrome());
        

    }
}
