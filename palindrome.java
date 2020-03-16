public class palindrome{

    public static void main(String[] args){

        // this will eventually be an input
        // but for now I'm keeping it simple
        String sample = "kayak";

        System.out.println(isPalindrome(sample));


    } // main()

    public static String isPalindrome(String sample){
                // initializing increment vars
                int i = 0;
                int j = sample.length()-1;
        
                while (i < j){
                    if (sample.charAt(i) != sample.charAt(j)){
        
                        return "This is not a palindrome";
                    } // if i != j
                    i++;
                    j--;
                } // while i < j
        return "This is a palindrome";
    } // isPalindrome

} // palindrome