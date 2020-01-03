package com.jike.algorithm.job;

import com.sun.deploy.util.ArrayUtil;
import org.apache.commons.lang3.ArrayUtils;

/***************************************
 * author:      zhangguoqing-phq
 * createDate:  2020/1/3 16:52
 * description: 数组去重 在原数组数组上操作，不适用额外的空间（数组）
 ****************************************/
public class J1RemoveDuplicates {

    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        int k = removeDuplicates(arr);
        System.out.println("去重的个数："+k);
        for(int i= 0; i<k;i++){
            System.out.print(arr[i]+",");
        }

    }

    /**
     * 去重后的结果保存在原数组前面
     * @param arr 待去重的数组
     * @return  返回去重后的数据的个数
     */
    public static int  removeDuplicates(int[]  arr){
        int k = arr.length;
        for(int i = 0;i< k;i++){
            int  curr = arr[i];

            for(int j=i;j < k-1;){
                int  first = arr[j+1];
                int  last = arr[k-1];

                if(curr == last){
                    k--;
                    continue;
                }
                if(curr == first){
                    arr[j+1] = last;
                    arr[k-1] = curr;
                    k--;
                }
                j++;
            }
        }
        return k;
    }
}
