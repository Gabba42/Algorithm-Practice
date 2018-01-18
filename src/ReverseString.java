public class ReverseString {

    String birds = "blue birds are very pretty";

    public String reverseString(String string) {
        String[] str = string.split(" ");
        String reversedString = " ";
        for (int i = 0; i < str.length; i++) {
            String word = str[i];
            String reversedWord = " ";
            for (int j = word.length()-1; i >=0; i--) {
                reversedWord += word.charAt(j);
            }
            reversedString += reversedWord;
        }
        return reversedString;
    }
}

//output: "eulb sdrib era yrev ytterp"