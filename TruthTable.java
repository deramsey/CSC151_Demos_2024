class TruthTable {

    public static void main(String[] args) {
        TruthTable o = new TruthTable();
        o.showTruth(4, 9);
        o.showNegation(4, 9);
        // System.out.print("String A".equals("String A"));

    }

    void showTruth(int a, int b) {
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
    }

    void showNegation(int a, int b) {
        System.out.println("a == b: " + !(a == b));
        System.out.println("a != b: " + !(a != b));
        System.out.println("a > b: " + !(a > b));
        System.out.println("a < b: " + !(a < b));
        System.out.println("a >= b: " + !(a >= b));
        System.out.println("a <= b: " + !(a <= b));
    }

}
