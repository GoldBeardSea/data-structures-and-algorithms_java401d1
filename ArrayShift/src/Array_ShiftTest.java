import static org.junit.jupiter.api.Assertions.*;

class Array_ShiftTest {

    @org.junit.jupiter.api.Test
    public void reverseArrayTest() {

        int[] aa = {4, 8, 15, 23, 42};
        int num = 16;
        int[] aa2 = {4, 8, 15, 16, 23, 42};
        int[] actual = Array_Shift.shiftedArray(aa, num);
        assertArrayEquals(aa2, actual);
    }
//    @org.junit.jupiter.api.Test
//    public void reverseArrayTest2() {
//
//        int[] aa = {2, 4, 6, 8};
//        int num = 5;
//        int[] aa2 = {2, 4, 5, 6, 8};
//        int[] actual = Array_Shift.shiftedArray(aa, num);
//        assertArrayEquals(aa2, actual);
//    }

}



