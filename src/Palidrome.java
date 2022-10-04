public class Palidrome {
    public static void main(String[] args){
        for(int i=0; i<args.length;i++){
            String s = args[i];
            System.out.println(s +"  " + isPalindrome(s));
        }
    }
    public static String reverseString(String str){
        String s = "";
        for (int i=str.length()-1; i>-1;i--){
            s+=str.charAt(i);
        }
        return s;
    }
    public static boolean isPalindrome(String str){
        if (str.equals(reverseString(str))){
            return true;
        }
        else {
            return false;
        }
    }
}
