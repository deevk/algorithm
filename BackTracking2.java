//PROBLEM 15650 - "N과 M (2)"
public class BackTracking2 {
    static int N, M;
    static int[] selected, isUsed;

    static void rec_func(int k){
        if(k == M+1){
            /* TODO 조건에 맞는 값들을 모두 선택하였을 때 원하는 동작 작성*/

        }else{
            int start = selected[k-1] + 1; // 이전에 선택한것은 선택하지 않게하는 코드
            for(int cand = 1; cand <=N; cand++){
                /*TODO 한 단계 한 단계 특정조건을 만족하는 것들을 선택하는 코드*/

                selected[k] = cand; isUsed[cand] = 1; // 뽑은것을 사용했다고 체크하는 코드
                rec_func(k+1);
                selected[k] = 0;    isUsed[cand] = 0; // 사용했던것을 스택상 하위에 있던 함수가 종료되고 다시 미사용으로 반환하는 코드
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
