public class ch2_expression{
    public static void main(String args[]){
        //float a = 7/4*9/2;
        /*
          7/4 = 1.75 = 1 (because of int.)
          1*9 = 9
          9/2 = 4.5 = 4 (because of int.)
          4 = 4.0 (Because of float a.)
         */

        float a = 7/4.0f *9/2.0f;
        System.out.println(a);
    }
}