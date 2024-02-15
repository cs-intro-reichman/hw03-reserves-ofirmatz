/** String processing exercise 1. */
public class LowerCase {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(lowerCase(str));
    }

   /**
    * Returns a string which is identical to the original string, 
    * except that all the upper-case letters are converted to lower-case letters.
    * Non-letter characters are left as is.
    */
    public static String lowerCase(String s) {
        String newStr = "";
        int i = 0;
        while(i < s.length()){
            char ch = s.charAt(i);
             if((s.charAt(i) >= 'A') && (s.charAt(i) <= 'Z')){
                ch = (char) (s.charAt(i) + 32);
                newStr = newStr + ch; 
            }else{
                newStr = newStr + ch;
            }
            i++;
        }
        return newStr;
    }
}