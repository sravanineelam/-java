package Method;

public class SumofDigits {
    static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10; 
            num /= 10;        
        }
        return sum;
    }

    public static void main(String[] args) {
        int number = 25;
        int digitSum = sumOfDigits(number);
        System.out.println("Sum of digits: " + digitSum);
    }
}
