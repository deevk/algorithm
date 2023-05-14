//PROBLEM 15651 - "N과 M (3)"
public class BackTracking1 {
     static int N, M;
     static int[] selected;

     static void rec_func(int k){
         if(k == M+1){
             /* TODO 조건에 맞는 값들을 모두 선택하였을 때 원하는 동작 작성*/

         }else{
             for(int cand = 1; cand <=N; cand++){
                 /*TODO 한 단계 한 단계 특정조건을 만족하는 것들을 선택하는 코드*/
                 selected[k] = cand;
                 rec_func(k+1);
                 selected[k] = 0;
             }
         }

     }
    public static void main(String[] args) {
        // N =
        // M =
        // selected = new int[N+1];

        rec_func(1);
    }
}
