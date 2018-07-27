public class main {
    public static void main(String[] args) {
        MaxStack testMax = new MaxStack();
        testMax.pushmax(10);
        testMax.pushmax(50);
        testMax.pushmax(25);
        testMax.pushmax(5);
        testMax.pushmax(250);
        testMax.pushmax(100);
        testMax.pushmax(400);
        System.out.println("Max Value: " + testMax.max());
        testMax.popmax();
        System.out.println("Max Value: " + testMax.max());
        testMax.popmax();
        System.out.println("Max Value: " + testMax.max());
        testMax.popmax();
        System.out.println("Max Value: " + testMax.max());
        testMax.popmax();
        System.out.println("Max Value: " + testMax.max());
        testMax.popmax();
        System.out.println("Max Value: " + testMax.max());
        testMax.popmax();
        System.out.println("Max Value: " + testMax.max());
        testMax.popmax();
        System.out.println("Max Value: " + testMax.max());



    }
}
