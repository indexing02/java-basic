package static2.ex;

public class MathArrayUtils {

    private MathArrayUtils() {
        //인스턴스 생성 방지
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static double average(int[] arr) {
        return (double) sum(arr) / arr.length;
    }

    public static int min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            min= Math.min(min, arr[i]);
        }
        return min;
    }

    public static int max(int[] arr) {
        int max = 0;
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(arr[i], arr[i]);
        }
        return max;
    }

}
