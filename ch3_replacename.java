public class ch3_replacename{
    public static void main(String args[]){
        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>","Om");
        System.out.println(letter);
    }
}