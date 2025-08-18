package SortingSearaching;

import java.util.ArrayList;
import java.util.List;

public class Recursivedeepdrive {
	  public static void main(String[] args) {
	        int[] nums = {1, 2, 3};  // you can change input here
	        List<List<Integer>> result = new ArrayList<>();

	        // Generate subsets
	        generateSubsets(0, nums, new ArrayList<>(), result);

	        // Print result
	        System.out.println("All subsets:");
	        for (List<Integer> subset : result) {
	            System.out.println(subset);
	        }
	    }

	    // Recursive function
	    static void generateSubsets(int index, int[] nums, List<Integer> current, List<List<Integer>> result) {
	        if (index == nums.length) {
	            result.add(new ArrayList<>(current)); // Base case
	            return;
	        }

	        // Include numbs[index]
	        current.add(nums[index]);
	        generateSubsets(index + 1, nums, current, result);

	        // Backtrack and exclude numbs[index]
	        current.remove(current.size() - 1);
	        generateSubsets(index + 1, nums, current, result);
	    }
	}


