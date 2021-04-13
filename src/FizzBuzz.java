public class FizzBuzz {

    public static final String FIZZ_BUZZ = "FizzBuzz";
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";

    public static String checkFizzBuzz(int number){
        if (number % 15 == 0) return FIZZ_BUZZ;
        if (number % 3 ==0) return FIZZ;
        if (number % 5 == 0) return BUZZ;
        if (numberInclude3(number)) return FIZZ;
        if (numberInclude5(number)) return BUZZ;
        return "Number is " + number;
    }
    public static boolean numberInclude3(int number){
        String numberToString = Integer.toString(number);
        for (int i = 0; i < numberToString.length(); i++) {
            if (numberToString.charAt(i) == '3') {
                return true;
            }
        }
        return false;
    }
    public static boolean numberInclude5(int number){
        String numberToString = Integer.toString(number);
        for (int i = 0; i < numberToString.length(); i++) {
            if (numberToString.charAt(i) == '5') {
                return true;
            }
        }
        return false;
    }
}
