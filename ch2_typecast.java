public class ch2_typecast {
    public static void main(String args[]){
        char grade = 'B';
        //encrypt
        grade = (char)(grade + 8);
        System.out.println(grade);

        //decrypt
        grade = (char)(grade - 8);
        System.out.println(grade);

        /*A   B   C D E F G H I   J */
                                 //+8
            //-8               
    }
    
}
