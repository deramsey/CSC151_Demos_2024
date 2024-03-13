class YardConvert {
    int totalFeet;
    int totalInches;

    YardConvert(int y, int f, int i) {
        this.totalFeet = (y * 3) + f;
        this.totalInches = (this.totalFeet * 12) + i;
    }

    public static void main(String[] args) {
        YardConvert p1 = new YardConvert(3, 2, 1);
        YardConvert p2 = new YardConvert(432, 18, 9);
        System.out.print(p2.totalInches + " inches");
    }
}
