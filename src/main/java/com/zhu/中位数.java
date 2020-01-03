package com.zhu;

import java.util.Comparator;
import java.util.PriorityQueue;

public class 中位数 {

    public class Solution {
        private PriorityQueue<Integer> maxHeap = new PriorityQueue<>(20,new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -o1.compareTo(o2);
            }
        });

        private PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        private int size = 0;
        public void Insert(Integer num) {
            if((size&1) == 0){
                minHeap.offer(num);
                maxHeap.offer(minHeap.poll());
            }else{
                maxHeap.offer(num);
                minHeap.offer(maxHeap.poll());
            }
            ++size;
        }

        public Double GetMedian() {
            if((size&1) == 1) return maxHeap.peek()*1.0;
            else return (minHeap.peek()+maxHeap.peek())/2.0;
        }


    }

    public static void main(String[] args) {
        int s = 0x80000000;
        System.out.println(s+" "+Integer.MIN_VALUE);
    }
}
