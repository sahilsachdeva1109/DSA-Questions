class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] smaller = nums1.length > nums2.length ? nums2 : nums1;
        int[] larger = nums1.length > nums2.length ? nums1 : nums2;

        int totalLength = nums1.length + nums2.length;

        int low = 0;
        int high = smaller.length;

        while (low <= high) {

            int part1 = (low + high) / 2;
            int part2 = (totalLength + 1) / 2 - part1;

            int l1 = (part1 == 0) ? Integer.MIN_VALUE : smaller[part1 - 1];
            int r1 = (part1 == smaller.length) ? Integer.MAX_VALUE : smaller[part1];

            int l2 = (part2 == 0) ? Integer.MIN_VALUE : larger[part2 - 1];
            int r2 = (part2 == larger.length) ? Integer.MAX_VALUE : larger[part2];

            if (l1 <= r2 && l2 <= r1) {

                if (totalLength % 2 == 0) {
                    return (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
                } else {
                    return Math.max(l1, l2);
                }

            } else if (l1 > r2) {
                high = part1 - 1;
            } else {
                low = part1 + 1;
            }
        }

        return 0.0;
    }
}