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
}
