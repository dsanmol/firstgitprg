public class to_find_last_occur {
    public static int lastocr(int[] arr,int key,int i){

        if(i== arr.length){
            return -1;
        }
        int isfound=lastocr(arr,key,i+1);
        if(isfound==-1 &&arr[i]==key){
            return i;
        }
        return isfound;


    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,4};
        System.out.println(lastocr(arr,4,0));

    }
}
