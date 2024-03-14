class VolCyl {
    final double OUR_PI = 3.14159;
    double ans;

    VolCyl(double r, double h) {
        this.ans = ((r * r) * this.OUR_PI) * h;
    }

    public static void main(String[] args) {
        VolCyl c1 = new VolCyl(3, 7);
        System.out.println(c1.ans);
    }
}
