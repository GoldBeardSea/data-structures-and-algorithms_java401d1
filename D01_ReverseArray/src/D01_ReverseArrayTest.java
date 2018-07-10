import static org.junit.jupiter.api.Assertions.*;

class D01_ReverseArrayTest {

    @org.junit.jupiter.api.Test
    public void reverseArrayTest() {

        int[] arr = {1, 2, 4, 10, 12};

        int[] arr2 = {12, 10, 4, 2, 1};
        D01_ReverseArray.reverseArray(arr);
        assertArrayEquals(arr, arr2);
    }
}