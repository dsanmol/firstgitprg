public class arrays {
    //1-D array
    public static void main(String[] args) {
         
        int[] marks=new int [5];
        marks[0]=98;
        marks[1]=99;
        marks[2]=86;
        marks[3]=90;
        marks[4]=89;
        System.out.println(marks[0]);
        System.out.println(marks.length);
        // using for each loop
        for(int ele:marks){
            System.out.println(ele);
       
        
        //2-D arrays
        int[][] flats=new int[2][3];
        flats[0][0]=101;
        flats[0][1]=102;
        flats[0][2]=103;
        flats[1][0]=201;
        flats[1][1]=202;
        flats[1][2]=203;
        for(int i=0;i<flats.length;i++) {
            for(int j=0;j<flats[i].length;j++) {
                System.out.print(flats[i][j]+" ");
            

        }




    }
     }
    
}
}
