
QUESTION : Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.

# brute Force method :
time complexity  [O(n^2)] - is more in this as there is nested loop ..
space complexity - O(1)

public class ContainsDuplicate {
    public boolean hasDuplicate(int[] nums) {
        for (int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                if (nums[i]==nums[j] ){
                    return true;
                }
            }
        }
        return false;
    }
}

# sorting method :
time complexity - O(nlogn)
space complexity - O(1)or O(n)

public class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1] ){
                return true;
            }
        }
        return false;
    }
}

# Hastset method:

normally in hast set only unique values will be stored sooo the elements will be automatically removed if any duplicate value is found 

see the happens : 
Arrays.stream(nums) --- anedi - oka array loo unde numbers ni stream laaa ga testundi ==>
ex:  [1,2,3,4,2] --> 1,2,3,4,2

distinct()==> anni values unique unda leeda anedi it will check
count() < nums.length ---> if something is duplicate in the stream ... the total numbers will be counted
and that count if  its < length of array then thats says the array has duplicates 

see for the same ex; 1,2,3,4,2 = count - 5 --> removing the duplicates 1,2,3,4 and count is 4
4<5 => duplicate is present 

public class Solution {
    public boolean hasDuplicate(int[] nums) {
        return Arrays.stream(nums).distinct().count() < nums.length;
    }
}