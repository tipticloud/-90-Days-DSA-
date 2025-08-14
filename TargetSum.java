import java.util.HashMap;

public class TargetSum {
    public static int target(int[] arr, int target) {
        HashMap<Integer, Boolean> map = new HashMap<>();

        for (int num : arr) {
            int complement = target - num;
            if (map.containsKey(complement)) {
                return 1; // Found a pair
            }
            map.put(num, true);
        }
        return 0; // No pair found
    }

    public static void main(String[] args) {
        int[] a = {2, 6, 5, 8, 11};
        int targetValue = 14;

        int result = target(a, targetValue);

        System.out.println(result); // 1 if found, 0 if not
    }
}
