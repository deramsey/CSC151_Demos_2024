class ConReview {

    public static void main(String[] args) {
        ConReview ob1 = new ConReview();
        // ob1.conditionals(11);
        // ob1.grading(93);
        ob1.switchExample(2);
    }

    void conditionals(int x) {
        if (x == 12) {
            System.out.println("Twelve");
        } else if (x == 1) {
            System.out.println("One");
        } else {
            System.out.println("Other number");
        }
    }

    void grading(int a) {
        String grade = new String();

        if (a >= 90) {
            grade = "A";
        }

        else if (a >= 80) {
            grade = "B";
        }

        else if (a >= 70) {
            grade = "C";
        }

        System.out.println(grade);
    }

    void switchExample(int b) {
        switch (b) {
            case 1:
                System.out.println("Sunday");
                break;

            case 2:
                System.out.println("Monday");
                break;

            case 3:
                System.out.println("Tuesday");
                break;

            default:
                System.out.println("Invalid Entry");

        }
    }

}
