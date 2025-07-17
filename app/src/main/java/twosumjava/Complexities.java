package twosumjava;

public class Complexities {
    public static int[] OofNSquared(int[] nums, int target) throws Errors.NoSolutionException {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        throw new Errors.NoSolutionException("No two sum solution");
    }

    public static int[] OofN(int[] nums, int target) throws Errors.NoSolutionException {
        java.util.HashMap<Integer, Integer> map = new java.util.HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                int complement = target - nums[i];
                if (map.containsKey(complement)) {
                    return new int[] {map.get(complement), i};
                }
            } else {
                map.put(nums[i], i);
            }
        }

        throw new Errors.NoSolutionException("No two sum solution");
    }
}
