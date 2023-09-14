import java.util.Scanner;
class parr {
    public static void main(String[] args) {
        //Q.1 Array of 5 floats and Sum
        /*
        float[] a={2.1f,3.6f,5.9f,6.3f,9.2f};
        float ms=0;
        for(float ele:a){
            ms=ms+ele;
            
            
            

        }
        System.out.print("The Sum is:");
        System.out.println(ms);
        */
        /* 
        Scanner b=new Scanner(System.in);
        int[] marks={10,20,30,40,50};
        System.out.println("Enter Which Number to be searched");
        int a= b.nextInt();
        
        boolean isinarray=false;
        for(float ele:marks) {
            if(ele==a){
                isinarray=true;
                break;

            }
        

            
        }
        if(isinarray){
            System.out.println("Present");
            
        }
        else {
            System.out.println("Not pesent");
        }
        */
        //Q.3 Check if array is sorted
        int[] arr={1,2,3,4,5,6,7,8,9};
        boolean issorted=true;
        for(int i=0;i<arr.length-1;i++) {
            if (arr[i]>arr[i+1]){
                issorted=false;
                break;
            }


        }
        if(issorted){
            System.out.println("Array is sorted");

        }
        else{
            System.out.println("Array is not sorted");
        }

    }
    
    
}
