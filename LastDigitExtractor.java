public class LastDigitExtractor {
    public static int getLastDigit(int number) {
        // Take the absolute value of the number to ensure it's positive
        int absoluteNumber = Math.abs(number);
        System.out.println(absoluteNumber);
        // Extract the last digit by taking the remainder when divided by 10
        int lastDigit = absoluteNumber % 10;
        
        return lastDigit;
    }

    public static void main(String[] args) {
        // Example usage of the getLastDigit function
        int inputNumber = 243; // Replace with the number you want to extract the last digit from
        int lastDigit = getLastDigit(inputNumber);
        System.out.println("Last Digit: " + lastDigit);
    }
}
