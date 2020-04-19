class Solution {
    public int maxArea(int[] height) {
        int i =0, j = height.length - 1;
        int max = 0;
        while (i < j) {
            max = height[i] < height[j] ? Math.max(max, (j - i) * height[i ++]) : Math.max(max, (j - i) * height[j --]);
        }
        return max;
    }
}
