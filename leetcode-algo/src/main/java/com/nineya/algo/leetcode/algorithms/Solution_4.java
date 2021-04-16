public class Solution_4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int num = nums1.length + nums2.length;
        boolean flag = (num & 1) == 0;
        num = (num + 1) >> 1;
        int n = 0;
        int m = 0;
        for (int i = 0; i < num; i ++) {
            if (m == nums2.length){
                double t = nums1[n + num - i - 1];
                if (flag) {
                    t += nums1[n + num - i];
                    t /= 2;
                }
                return t;
            } else if (n == nums1.length){
                double t = nums2[m + num - i - 1];
                if (flag) {
                    t += nums2[m + num - i];
                    t /= 2;
                }
                return t;
            } else {
                if (i == num - 1) {
                    double t;
                    if (nums1[n] > nums2[m]) {
                        t = nums2[m];
                        m++;
                    }else {
                        t = nums1[n];
                        n++;
                    }
                    if(flag) {
                        if (n == nums1.length){
                            t+= nums2[m];
                        }else if (m == nums2.length){
                            t+= nums1[n];
                        }else{
                            t+= nums1[n] > nums2[m]?nums2[m]:nums1[n];
                        }
                        t/=2;
                    }
                    return t;
                }
                if (nums1[n] > nums2[m]) {
                    m++;
                } else {
                    n++;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Solution_4 solution = new Solution_4();
        System.out.println(solution.findMedianSortedArrays(new int[]{1,3}, new int[]{2}));
        System.out.println(solution.findMedianSortedArrays(new int[]{1,2}, new int[]{3,4}));
        System.out.println(solution.findMedianSortedArrays(new int[]{2}, new int[]{1}));
        System.out.println(solution.findMedianSortedArrays(new int[]{}, new int[]{1}));
        System.out.println(solution.findMedianSortedArrays(new int[]{2}, new int[]{}));
        System.out.println(solution.findMedianSortedArrays(new int[]{2}, new int[]{1,3,4,5}));
    }
}
