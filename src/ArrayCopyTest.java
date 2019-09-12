import java.util.Arrays;

public class ArrayCopyTest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] arr1 = new int[5];

        System.arraycopy(arr, 1, arr1, 1, arr.length - 2);
        System.out.println("源数组和目标数组地址是否一致:" + (arr[0] == arr[0]?"一致":"不一致"));

        System.out.println("复制前的数组为:" + Arrays.toString(arr));
        System.out.println("复制后的数组为:" + Arrays.toString(arr1));

        //System.out.println(arr[4]); // ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
        System.out.println(arr1[4]);

        System.out.println("--------------------------------------");
        String[] name = {"A", "B", "C"};
        String[] extend = new String[5];
        extend[3] = "D";
        extend[4] = "E";

        System.out.println("复制前，extend数组为:" + Arrays.toString(extend));
        System.arraycopy(name, 0, extend, 0, name.length);
        System.out.println("复制后，extend数组为:" + Arrays.toString(extend));

        System.out.println("--------------------------------------");
        int[] ary = {1, 2, 3};
        //扩容
        ary = Arrays.copyOf(ary, ary.length + 1);
        System.out.printf("扩容后数组为:" + Arrays.toString(ary) + " " + "长度为:%d\n", ary.length);
        //缩容
        ary = Arrays.copyOf(ary, ary.length - 1);
        System.out.printf("缩容后数组为:" + Arrays.toString(ary) + " " + "长度为:%d", ary.length);

    }
}
