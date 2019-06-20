package com.wyg.leetcode;

/**
 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 */
public class 移除重复数组元素 {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        CommonUtils.printArr(arr);
        int size = removeDuplicates(arr);
        System.out.println(size);

        CommonUtils.printArr(arr);

    }
    public static int removeDuplicates(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        int initSize = nums.length;
        int duplicates = 0;
        int temp = nums[0];

        for (int i = 0; i < nums.length - 1; i++) {

            if (temp == nums[i + 1]) {
                initSize--;
                temp = nums[i + 1];
                duplicates++;
            }else {
                temp = nums[i + 1];
                nums[i + 1 - duplicates] = nums[i + 1];
            }
            CommonUtils.printArr(nums);

        }
        return initSize;
    }
}
