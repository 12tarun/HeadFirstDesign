import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int twoSums(int[] nums, int target) {
        Arrays.sort(nums);

        int start = 0;
        int end = nums.length - 1;
        int ans = 0;
        while(start < end) {
            if(nums[start] + nums[end] == target) {
                ++ans;
                ++start;
                --end;
            }
            else if(nums[start] + nums[end] < target) {
                ++start;
            }
            else {
                --end;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter input array size: ");

        int size = scanner.nextInt();
        int[] inputArr = new int[size];

        System.out.println("Enter input array: ");
        for(int i = 0; i < inputArr.length; i++){
            inputArr[i] = scanner.nextInt();
        }

        System.out.println("Enter target value: ");
        int target = scanner.nextInt();
        scanner.close();

        int ans = twoSums(inputArr, target);

        System.out.println("Total Possible two sums =  " + ans);
    }
}



