import java.util.Arrays;

public class Addiction {
    public static void main(String[] args) {
        int[][] arr1 ={{1,2},{2,3}};
        int[][] arr2 ={{3,4},{5,6}};

        int[][] answer = new int[arr1.length][arr2.length];

        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                answer[i][j]=arr1[i][j]+arr2[i][j];

            }
        }
        System.out.println(Arrays.toString(answer));
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/12950