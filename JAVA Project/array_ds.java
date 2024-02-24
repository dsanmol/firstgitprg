public class array_ds {
    public static void update(int arr[]){
        for (int i=0;i<arr.length;i++){
            arr[i]=arr[i]+1;
        }
    }
    public static void main(String[] args) {
//        int[] marks={98,92,94};
//        update(marks);
//        for (int mark : marks) {
//            System.out.print(mark+" ");
//        }
        int[] ar={2,4,6,8,10,12,14,16,18,20};             //-->linear searching in array
//        for(int i=0;i<ar.length;i++){
//            if(ar[i]==10){
//                System.out.println(i);
//            }
//        }
//        int largest=Integer.MIN_VALUE;            //-->to find max value in a array
//        for(int t=0;t<ar.length;t++){
//            if(largest<ar[t]){
//                largest=ar[t];
//            }
//        }
//        System.out.println(largest);
        int key=16;

        int start=0,end=ar.length-1;             //--->binary search in array
        while(start<=end){
            int mid=(start+end)/2;
            if(ar[mid]==key){
                System.out.println(mid);
            }
            if(ar[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }


    }
}
