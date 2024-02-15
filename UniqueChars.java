/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {
        String newStr = "";
        int i = 0;
        while(i < s.length()){
            char ch = s.charAt(i);      
            if(ch == ' ' || s.indexOf(ch) == i){
                newStr = newStr + ch;
            }
            i++;
        }
        return newStr;
    }
}