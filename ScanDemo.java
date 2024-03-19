import java.util.Scanner;
import java.util.Random;

class ScanDemo {
    static Scanner sc = new Scanner(System.in);
    Random ran = new Random();

    int randNum;
    int randomSum;

    ScanDemo(int userNumber) {
        this.randNum = ran.nextInt(100);
        this.randomSum = userNumber + randNum;
    }

    public static void main(String[] args) {
        System.out.print("Enter a whole number: ");
        int userNum = sc.nextInt();

        ScanDemo ans = new ScanDemo(userNum);
        // System.out.println(ans.randomSum);
        System.out.println("Random number was " + ans.randNum);
        System.out.println("Answer: " + userNum + " + " + ans.randNum + " = " + ans.randomSum);
    }

}
