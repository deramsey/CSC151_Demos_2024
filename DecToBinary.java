import java.util.Scanner;

class DecToBinary {
    String result;

    DecToBinary() {
        result = getBinary(getNumber());
    }

    public static void main(String[] args) {
        DecToBinary m = new DecToBinary();
        System.out.println(m.result);
    }

    String getBinary(int decNum) {
        String binaryOut = new String("");
        int binaryPlace = 128;

        while (binaryPlace >= 1) {
            if (decNum - binaryPlace >= 0) {
                binaryOut += "1";
                decNum -= binaryPlace;
            } else {
                binaryOut += "0";
            }
            binaryPlace /= 2;
        }

        return binaryOut;
    }

    int getNumber() {
        Scanner in = new Scanner(System.in);
        int num;
        System.out.print("Enter number between 0 - 255: ");

        if (in.hasNextInt()) {
            num = in.nextInt();
            if (num >= 0 && num <= 255) {
                return num;
            }
        }

        System.out.println("Invalid input. Try again.");
        return getNumber();
    }

}
