import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;


public class Test2 {
    public static void main(String[] args) {
    	String s =" ";
        ArrayList<Character> flag = new ArrayList<Character>();
        ArrayList<Character> zhong = new ArrayList<Character>();
        for(int i = 0;i < s.length();i++){
        	flag.clear();
        	for(int k = i;k < s.length();k++) {
        		int count = 0;
        		for(int j = 0;j < flag.size();j++){
        			if(flag.get(j) == s.charAt(k)) {
        				count++;
        			}
        		}
        		if(count == 0) {
        			flag.add(s.charAt(k));
        			if(flag.size() >= zhong.size()) {
        				zhong.clear();
        				zhong.addAll(flag);
        			}
        		}else {
        			
        			if(flag.size() >= zhong.size()) {
        				zhong.clear();
        				zhong.addAll(flag);
        			}
        			break;
        		}
        	}
            
        }
        System.out.println(zhong.size());
        System.out.println(new Solution().findMedianSortedArrays(new int[] {1,3}, new int[] {2,4}));
    }
}

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    	ArrayList<Integer> set = new ArrayList<Integer>();
        for(int i = 0;i < nums1.length;i++){
            set.add(nums1[i]);
        }
        for(int i = 0;i < nums2.length;i++){
            set.add(nums2[i]);
        }
        Collections.sort(set);
        if(set.size() % 2 == 1){
            return set.get((set.size()+1)/2-1);
        }else{
        	System.out.println(set.get(set.size()/2-1));
        	System.out.println(set.get(set.size()/2));
            return (set.get(set.size()/2-1) + set.get(set.size()/2))/2.0;
        }
    }
}