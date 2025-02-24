public class ReplaceSpaceInString {
    public static void main(String[] args) {
        String str = "Hello";
        char ch = '-';
        String result = "";

        for (int i=0; i<str.length(); i++){
            char currentChar = str.charAt(i);
            if(currentChar == ' '){
                result += ch;
            }
            else
                result += currentChar;
        }

    }
}
