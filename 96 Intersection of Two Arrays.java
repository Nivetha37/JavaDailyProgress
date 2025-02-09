/*Given two integer arrays nums1 and nums2, return an array of their intersection.
Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.*/

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) return FindIntersect(nums1, nums2);
        return FindIntersect(nums2, nums1);
    }

    public static int[] FindIntersect(int[] nums1, int[] nums2) {
        int count = 0;
        boolean b1[] = new boolean[nums1.length];
        boolean b2[] = new boolean[nums2.length];

        for (int i = 0; i < nums2.length; i++) {
            for (int j = 0; j < nums1.length; j++) {
                if (b1[j] == false && nums1[j] == nums2[i]) {
                    b1[j] = true;
                    b2[i] = true;
                    count++;
                    break;
                }
            }
        }

        int[] res = new int[count];
        int index = 0;
        for (int k = 0; k < nums2.length; k++) {
            if (b2[k] == true) res[index++] = nums2[k];
        }
        return res;
    }
}
