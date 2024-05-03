package examples;

public class MoveZeros {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,0,5,0,6,0,0,9,10};
        int index= 0;
        for(int i=0; i< nums.length; i++){
            if(nums[i]!=0){
                nums[index] = nums[i];
                index++;
            }
        }

        for(int i = index; i< nums.length; i++){
            nums[i] = 0;
        }
        for(int i=0; i< nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
