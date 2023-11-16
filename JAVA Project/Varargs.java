class vrgs {
    
    static int bar(int x,int...arr){
        int result=x;
        for(int a:arr){
            result*=a;

        }
        
        return result;


    }
    
    public static void main(String[] args) {
        System.out.println("Hello"+bar(2,2,3,4));
    }
    
}
