class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        for(int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        for(int i = 0; i < nums2.length; i++) {
            if(set.contains(nums2[i])) {
                result.add(nums2[i]);
            }
        }

        int ans[] = new int[result.size()];
        int i = 0;
        for(int num : result) {
            ans[i++] = num;
        }

        return ans;
    }
}

//! Hareesh Approach
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
     Set<Integer> set1 =new HashSet<>();
     Set<Integer> resultSet1 = new HashSet<>();

     for(int num:nums1){
        set1.add(num);
     }
     for(int num:nums2){
        if(set1.contains(num)){
            resultSet1.add(num);
        }
     }
     int resArray[] =new int [resultSet1.size()];
     int index=0;
     for(int SetElement: resultSet1){
        resArray[index++] =SetElement;
     }
    return resArray;
    }
}