package Level1;

public class Find_kim {
    public static void main(String[] args) {
        String[] seoul = {"Jane", "Kim"};
        String answer="";

        for(int i=0;i<seoul.length;i++){
            if(seoul[i].equals("Kim")){
                answer="김서방은 "+i+"에 있다";
            }
        }
        System.out.println(answer);
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/12919