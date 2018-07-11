import java.util.Arrays;

public class Array_Shift {
    public static void main(String[] args) {
        int[] aa = {2,4,6,8};
        int[] shifted = shiftedArray(aa, 5);
        System.out.println(Arrays.toString(aa));
        System.out.println(Arrays.toString(shifted));
    }

    public static int[] shiftedArray(int[] aa, int num) {
        int[] result = new int[aa.length + 1];
        for (int i = 0; i < aa.length / 2 + 1; i++) {
            result[i] = aa[i];

        }
        if (result.length % 2 == 0) {
            result[(int) Math.ceil(aa.length / 2) + 1] = num;
            for (int i = (int) Math.ceil(aa.length / 2) + 2; i < result.length; i++)
                result[i] = aa[i - 1];

        } else {
            result[(int) Math.ceil(aa.length / 2)] = num;
            for (int i = (int) Math.ceil(aa.length / 2) + 1; i < result.length; i++)
                result[i] = aa[i - 1];

        }

        return result;
    }
}
