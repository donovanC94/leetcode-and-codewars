package codewars;

public class PlayingWithDigits {

    public static void main(String[] args) {
        int n = 89;
        int p = 1;
        digPow(n, p);
    }
    // n = The main number
    // p = the power value to start with
    public static long digPow(int n, int p) {
        /* 1. Need to split n value into individual digits
            1.1. Convert int to String using String.valueOf()
            1.2. Split string into array using String.split(delimiter)
        */
        String[] nums = String.valueOf(n).split("");

        /* 2. Iterate through the array to perform the calculation
            2.1. Create a new int and use +=
         */
        int output = 0;
        for(int a = 0; a < nums.length; a++) {
            output += (int) Math.pow(Integer.parseInt(nums[a]), p);
            p++;
        }
        output /= n;

        return output % n == 0 ? -1 : output;
    }
}
