public class prg_to_find_first_occur_of_ele {
    public static int firstoc(int[] arr,int key,int i){
        if(arr[i]==key){
            return i;
        }
        return firstoc(arr,key,i+1);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,4};
        System.out.println(firstoc(arr,4,0));

    }
}
