class StringStuff {

    public static void main(String[] args) {
        // Main obj = new Main();
        StringStuff obj = new StringStuff();
        // obj.eachLetter("Hello World!");
        // System.out.println(obj.findLetter("Hello world!", 'o'));
        // System.out.println(obj.compareWords("Hello", "Hello"));
        // System.out.println(obj.compareWords("Apple", "Orange"));
        // System.out.println(obj.compareWords("Orange", "Apple"));
        // System.out.println(obj.compareWords("hello", "Hello"));
        // System.out.println("Hello world!".contains("e"));
        // System.out.println(" ".isEmpty());
        System.out.println("Hello world!".replace("o", "x"));

    }

    int returnLen(String x) {
        return x.length();
    }

    void eachLetter(String x) {
        for (int i = 0; i < x.length(); i++) {
            System.out.println(x.charAt(i));
        }
    }

    int findLetter(String x, char y) {
        return x.indexOf(y);
    }

    // how indexOf works
    int ourIndex(String x, char y) {
        for (int i = 0; i < x.length(); i++) {
            char z = x.charAt(i);
            if (z == y) {
                return i;
            }
        }
        return -1;
    }

    int compareWords(String a, String b) {
        return a.compareToIgnoreCase(b);
    }
}
