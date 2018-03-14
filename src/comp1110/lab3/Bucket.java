package comp1110.lab3;

public class Bucket {
    private final double capacity;
    private double contents;

    public Bucket(double capacity) {
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getContents() {
        return contents;
    }

    public double empty() {
        double b = contents;
        contents = 0;
        return b;
    }

    public void add(double amount) {
        double a = contents + amount;
        if (a < capacity) {
            contents = contents + amount;
        } else {
            contents = capacity;
        }
    }

    public static void main(String[] args) {
        Bucket big = new Bucket(10);
        Bucket small = new Bucket(1);
        big.add(20);
        small.add(20);
        System.out.println(big.getContents());
        System.out.println(small.getContents());
        big.empty();
        System.out.println(big.getContents());
        big.add(small.getContents());
        small.empty();
        System.out.println(small.getContents());
        System.out.println(big.getContents());
    }


}
