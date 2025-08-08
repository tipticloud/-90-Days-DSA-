public class Most1s {
    public static int Consecutive(int[] a) {
        int max = 0;
        int n = a.length;

        for (int i = 0; i < n; i++) {
            int count = 0;

            for (int j = i; j < n; j++) {
                if (a[j] == 1) {
                    count++;
                    max = Math.max(max, count);
                } else {
                    break; // streak ends
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] a = {1, 1, 0, 1, 1, 1, 0, 1, 1};
        int res = Consecutive(a);
        System.out.println(res); // Output: 3
    }
}
