public class String_after {
    public static void main(String[] args) {
        String my_string = "ProgrammerS123";
        int n=11;
        String[] arr = my_string.split("");
        String answer="";

        for(int i=my_string.length()-1;i>=0;i--){
            answer+=arr[i];
        }
        System.out.println(answer);
    }
}
