class Ps_met {
    //Q.1 Print a multiplication table of number n
    /* 
    static void multb(int n){
        for(int i=1;i<=10;i++){
            
            System.out.format("%d * %d=%d\n",n,i,n * i);
                        
        }
        
        
    }
    */
    //Q.2 Print a pattern using *
    /*  
    static void pat(int w){
        for(int i=0;i<w;i++){
           for(int j=0;j<i;j++){
               System.out.print("*");
                       
           }
           System.out.println();
        }
         
    }
    */
    //Q.3 Print sum of n natural number using recursive function
    /* 
    static int nsum(int x){
        if (x==1){
            return 1;
            
        }
        return x+nsum(x-1);
    }
    */
    //Q.4 Write a function to print * pattren in opposite form as in Q.3
    /* 
    static void tap(int z){
        for(int i=0;i<z;i++){
            for(int j=i;j<z+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    */
    //Q.5 Print a fibonacci series using recursion
    //fibonacci series-0,1,1, 2, 3, 5, 8, 13, 21, 34
    /* 
    static int fab(int e){
           if (e==1){
                return 0;
            
            }
            else if(e==2){
                return 1;
            }
            else{
                return fab(e-1)+fab(e-2);
            }   
                      
        }
        */
        //Q.6 Print average of set of natural numbers given a arguments
        /* 
        static float avg(float...arr){
            float v=arr.length;
            float sum=0;
            for(float value:arr){
                sum+=value;

            }
            float k=(sum/v) ;
            return k;
        }
        */
        //Q.7 Repeat Q.4 using recursion
        /* 
        static void rept(int p){
            
            if(p>0){
                
                for(int i=0;i<p;i++){
                    System.out.print("*");
                
            }
            
            System.out.println();
            rept(p-1);

            }
            
        }
        */
        //Q.8 Repeat Q.2 using recursion
        static void rept_1(int y){
            
            if(y>0){
                rept_1(y-1);
                
                for(int i=0;i<y;i++){
                    System.out.print("*");
                
            }
            
            System.out.println();
            

            }
            
        }

    
    public static void main(String[] args) {
        //multb(2);
        //pat(4);
        // int c=nsum(3);
        // System.out.println(c);
        //tap(4);
        // int res=fab(7);
        // System.out.println(res);
        // float j=avg(1f,2f,3f,4f);
        // System.out.println(j);
        //rept(3);
        //rept_1(3);
    }
    
}
