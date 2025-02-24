public class StringReverse {
    public static void main(String[] args) {

        String rev = "", str = "HelloWorld";
        char ch;

        System.out.println("Original: "+str);
        for (int i = 0; i<str.length(); i++){
            ch = str.charAt(i);
            rev = ch + rev;
        }
        System.out.println("Reverse: "+rev);

        if (str.equals(rev)){
            System.out.println("Its Palindrome");
        }else {
            System.out.println("Its not Palindrome");
        }

    }
}
