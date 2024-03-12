class ObjDemo {
    int numDoors;
    String color;
    String make;
    String model;
    String brand;

    ObjDemo(int n, String c, String ma, String mo) {
        this.numDoors = n;
        this.color = c;
        this.make = ma;
        this.model = mo;
        this.brand = this.make + " " + this.model;
    }

    public static void main(String[] args) {
        ObjDemo carOne = new ObjDemo(4, "red", "Honda", "Civic");
        ObjDemo carTwo = new ObjDemo(2, "black", "Ford", "Mustang");
        System.out.println(carTwo.brand);
    }

}
