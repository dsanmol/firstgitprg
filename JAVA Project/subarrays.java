public class subarrays {
    public static void pairinarray(int[] ar) {
        int totsub = 0;
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int[] prefix=new int[ar.length];
        prefix[0]=ar[0];
        for(int y=1;y<ar.length;y++){
            prefix[y]=prefix[y-1]+ar[y];
        }
        for (int i = 0; i < ar.length; i++) {
            for (int j = i; j < ar.length; j++) {

                currsum= i==0?prefix[j]:prefix[j]-prefix[i-1];
                if(maxsum<currsum){
                    maxsum=currsum;
                }
//                for (int k = i; k <= j; k++) {
//                    System.out.print(ar[k] + "|");
//                    currsum += ar[k];
//
//                }


                //System.out.println();
            }

            totsub = ar.length * (ar.length + 1) / 2;

        }
        System.out.println(maxsum);
        System.out.println(totsub);
    }
    public static void main(String[] args) {
        int[] arr={2,4,6,8,10};
        pairinarray(arr);
    }
}
