public class StringReverse {
    public static void main(String[] args) {
        String my_string="jaron";
        
        StringBuffer sb= new StringBuffer(my_string);
        String reverse = sb.reverse().toString();
        
        System.out.println(reverse);
    }
}
