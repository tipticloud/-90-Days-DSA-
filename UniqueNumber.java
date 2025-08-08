public class UniqueNumber {
    public static int Unique(int[] a) {
        int n = a.length;

        for (int i = 0; i < n; i++) {
            int num = a[i];
            int count = 0;

            // Count occurrences of a[i]
            for (int j = 0; j < n; j++) {
                if (a[j] == num) {
                    count++;
                }
            }

            // If count is 1, it's unique
            if (count == 1) {
                return num;
            }
        }

        return -1; // if no unique element found
    }

    public static void main(String[] args) {
        int[] a = {1, 1, 2, 3, 4, 4};

        int result = Unique(a);
        System.out.println(result); // Output: 2 (first unique)
    }
}
