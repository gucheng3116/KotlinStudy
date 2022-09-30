package com.gucheng;

public class MaxArea {

    public static int maxArea(int[] height) {
        int areaMax = 0;
        int length = height.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 1; j < length; j++) {
                int area = (j - i) * Math.min(height[i], height[j]);
                if (area > areaMax) {
                    areaMax = area;
                }
            }
        }
        return areaMax;
    }

    public static int maxArea2(int[] height) {
        int length = height.length;
        int l = 0, r = length - 1;
        int areaMax = (r - l) * Math.min(height[l], height[r]);
        while (l < r) {
            if (height[l] < height[r]) {
                l++;
                if (height[l] > height[l-1]) {
                    int area = (r - l) * Math.min(height[l], height[r]);
                    areaMax = Math.max(areaMax, area);
                }
            } else {
                r--;
                if (height[r] > height[r+1]) {
                    int area = (r - l) * Math.min(height[l], height[r]);
                    areaMax = Math.max(areaMax, area);
                }
            }
        }
        return areaMax;
    }

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println("maxArea is " + maxArea2(height));
    }
}
