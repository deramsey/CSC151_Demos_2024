class OperatorDemo {
    int numberOne;
    int numberTwo;
    int sumSolution;
    String progTitle;

    OperatorDemo(int n1, int n2) {
        this.progTitle = new String("Simple Adder");
        this.numberOne = n1;
        this.numberTwo = n2;
        this.sumSolution = this.numberOne + this.numberTwo;
    }

    public static void main(String[] args) {
        OperatorDemo o1 = new OperatorDemo(3, 4);
        OperatorDemo o2 = new OperatorDemo(4, 8);
        // System.out.println(o1.progTitle);
        // System.out.println(o1.sumSolution);
        // System.out.printf("%.2f", 0.3 - 0.2);
        System.out.println("String 1" + " " + "String 2");
    }
}