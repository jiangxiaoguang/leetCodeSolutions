class s1{
    public static void main(String[] args) {
        int[] testa = new int[]{2, 7, 11, 15};
        int[] ret = twoSum(testa, 26);
        System.out.println(ret);
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i = 0; i < nums.length - 1; i++){
           int toFind = target - nums[i];
           for (int j = i + 1; j < nums.length; j++) {
               if (nums[j] == toFind) {
                   result[0] = i;
                   result[1] = j;
               }
           }
        }
        return result;
    }
}
