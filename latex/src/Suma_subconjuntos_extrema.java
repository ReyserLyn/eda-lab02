import java.util.*;

public class Suma_subconjuntos_extrema {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strIn = sc.nextLine().split(" ");

        int size = Integer.parseInt(strIn[0]);
        int objective = Integer.parseInt(strIn[strIn.length - 1]);
        int[] nums = new int[size];

        for (int i = 0; i < size; i++) {
            nums[i] = Integer.parseInt(strIn[i + 1]);
        }

        System.out.println(isPossible(nums, objective, 0, 0));
    }

    public static boolean isPossible(int[] nums, int target, int index, int sum) {
        if (index >= nums.length) {
            return sum == target;
        }

        if (nums[index] == 7) {
            if (index + 1 < nums.length && nums[index + 1] == 1) {
                return isPossible(nums, target, index + 2, sum) || isPossible(nums, target, index + 2, sum + 7);
            } else {
                return isPossible(nums, target, index + 1, sum + 7);
            }
        } else {
            return isPossible(nums, target, index + 1, sum + nums[index]) || isPossible(nums, target, index + 1, sum);
        }
    }
}
