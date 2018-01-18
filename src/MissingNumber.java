
public class MissingNumber {

    //create a method that finds the missing number in an array

    public long missingNumberInArray(int[] numbers) {
        long sum = 0;
        for(int i=0; i<numbers.length; i++) {
            sum += numbers[i];
        }
        return 55 - sum;
    }
    //need to change so that it works dynamically with any size squence


//so we know that the array is going to have a sequence of 1 to 100
//so we know that the total has to be

//how can I easily find out the total of a sequence of numbers

public static int sumOfNumbers(int n) {
    int sum = 0;
    for (int i = 0; i < n; i++) {
        sum += i;
        }
    return sum;
    }
}