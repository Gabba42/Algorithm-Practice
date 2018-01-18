public class ReverseWords {

    String birds = "I love blue birds";

    public String reverseWordsInString(String string){
        String str[] = string.split(" ");
        String finalStr="";
        for(int i = str.length-1; i>= 0 ;i--) {
            finalStr += str[i] + " ";
        }
        return finalStr;
    }
}

//output: "birds blue love I"