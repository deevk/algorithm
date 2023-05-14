package BackTraking;

//PROBLEM 15652 - "N과 M (4)"
public class BackTracking4 {
    static int N, M;
    static int[] selected;

    static void rec_func(int k){
        if(k == M+1){
            /* TODO 조건에 맞는 값들을 모두 선택하였을 때 원하는 동작 작성*/

        }else{
            int start = selected[k-1]; // 이전 숫자포함해서 그 이상으로만 선택하는 코드(즉, 중복까지는 허락하되 오름차순)
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
        // selected = new int[M+1]; <-- M개를 선택하는 것
        // isUsed = new int[N+1];  <-- N개 중에서 선택하는 것

        rec_func(1);
    }
}
