public class typeconversion {
    public static void main(String[] args) {
        
        byte a=125;

        int y =a;
        //System.out.println(b);         //option+shift+down for copying same line 


        

        int x = 123;         
        //byte z=x;              //we cannot asssign int to bye directly
        byte z= (byte )x;       //inorder to assign int value to byte we need to do type casting by adding byte to the value
        System.out.println(z);

        float c =5.6f;
        int t=  (int )c;
        System.out.println(t);         //casting is explicit conversion when we specify something that is explicit
       

        // TYPE PROMOTION 
        byte h =10;
        byte j=12;

        int result = h*j;
        System.out.println(result);



    
    }
}
