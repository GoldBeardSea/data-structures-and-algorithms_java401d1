import static org.junit.jupiter.api.Assertions.*;

class MaxStackTest {

    @org.junit.jupiter.api.Test
    void pushmaxOne() {
        MaxStack testMax = new MaxStack();
        testMax.pushmax(10);
        int maxValue = testMax.max();
        assertEquals(10, maxValue);
    }
    @org.junit.jupiter.api.Test
    void pushmaxTwo() {
        MaxStack testMax = new MaxStack();
        testMax.pushmax(10);
        testMax.pushmax(50);
        testMax.pushmax(25);
        testMax.pushmax(5);
        int maxValue = testMax.max();
        assertEquals(50, maxValue);

    }
    @org.junit.jupiter.api.Test
    void pushmaxThree() {
        MaxStack testMax = new MaxStack();
        testMax.pushmax(1000);
        testMax.pushmax(7);
        testMax.pushmax(7);
        testMax.pushmax(1000);
        testMax.popmax();
        testMax.pushmax(500);
        int maxValue = testMax.max();
        assertEquals(1000, maxValue);


    }

    @org.junit.jupiter.api.Test
    void popmaxOne() {
        MaxStack testMax = new MaxStack();
        testMax.pushmax(50);
        testMax.pushmax(7);
        testMax.pushmax(7);
        testMax.pushmax(100);
        testMax.pushmax(1000);
        testMax.popmax();
        testMax.popmax();
        testMax.popmax();
        int maxValue = testMax.max();
        assertEquals(50, maxValue);
    }

    @org.junit.jupiter.api.Test
    void popmaxTwo() {
        MaxStack testMax = new MaxStack();
        assertNull(testMax.popmax());
    }

    @org.junit.jupiter.api.Test
    void popmaxThree() {
        MaxStack testMax = new MaxStack();
        testMax.pushmax(7);
        testMax.pushmax(100);
        testMax.pushmax(1000);
        testMax.popmax();
        testMax.popmax();
        testMax.popmax();
        testMax.popmax();
        testMax.pushmax(1);
        int maxValue = testMax.max();
        assertEquals(1, maxValue);
        //Testing to ensure it wont



    }

    @org.junit.jupiter.api.Test
    void maxOne() {
        MaxStack testMax = new MaxStack();
        testMax.pushmax(7);
        testMax.pushmax(100);
        testMax.pushmax(1000);
        testMax.pushmax(7);
        testMax.pushmax(100);
        testMax.pushmax(1000);
        testMax.pushmax(7);
        testMax.pushmax(100);
        int maxValue = testMax.max();
        assertEquals(1000, maxValue);
    }

    @org.junit.jupiter.api.Test
    void maxTwo() {
        MaxStack testMax = new MaxStack();
        assertNull(testMax.max());

    }

    @org.junit.jupiter.api.Test
    void maxThree() {
        MaxStack testMax = new MaxStack();
        testMax.pushmax(1000);
        testMax.pushmax(1000);
        testMax.pushmax(1000);
        testMax.pushmax(1000);
        testMax.pushmax(1000);
        testMax.pushmax(1000);
        testMax.pushmax(1000);
        testMax.pushmax(1000);
        testMax.pushmax(1000);
        testMax.pushmax(1000);
        testMax.popmax();
        testMax.popmax();
        testMax.popmax();
        int maxValue = testMax.max();
        assertEquals(1000, maxValue);

    }

}