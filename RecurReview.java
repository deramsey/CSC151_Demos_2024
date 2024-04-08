import java.util.Scanner;

class RecurReview {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        RecurReview ob = new RecurReview();
        System.out.print("Enter a word to reverse: ");

        if (sc.hasNextLine()) {
            String userInput = new String(sc.nextLine());
            ob.reverseStr(userInput, "", userInput.length());
        }
    }

    void reverseStr(String w, String c, int i) {
        if (i > 0) {
            c = c + w.substring(i - 1, i);
            reverseStr(w, c, i = i - 1);
        } else {
            System.out.println(c);
        }
    }
}
