import java.util.*;

//solution with time-complexity O(n log n + m log m + min(m, n))
class Solution {
    public static int[] intersection(int[] nums1, int[] nums2) {
        // Sort both arrays
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        // Initialize pointers for both arrays and a list to store the intersection
        int ptr1 = 0, ptr2 = 0;
        List<Integer> intersection = new ArrayList<>();

        // Iterate until one of the pointers reaches the end of its respective array
        while (ptr1 < nums1.length && ptr2 < nums2.length) {
            int num1 = nums1[ptr1];
            int num2 = nums2[ptr2];

            // If both elements are equal, add to the intersection list and move both pointers
            if (num1 == num2) {
                intersection.add(num1);
                // Move both pointers to avoid duplicates
                while (ptr1 < nums1.length && nums1[ptr1] == num1) ptr1++;
                while (ptr2 < nums2.length && nums2[ptr2] == num2) ptr2++;
            }
            // If element in nums1 is smaller, move ptr1 else move ptr2
            else if (num1 < num2) {
                ptr1++;
            } else {
                ptr2++;
            }
        }

        // Convert intersection list to array
        int[] result = new int[intersection.size()];
        for (int i = 0; i < intersection.size(); i++) {
            result[i] = intersection.get(i);
        }

        return result;
    }
}
