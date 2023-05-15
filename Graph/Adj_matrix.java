package Graph;

import java.util.*;

public class Adj_matrix {
    static int V, E;
    static int[][] A;
    static boolean[] visit;

    static void dfs(int x){// 무조건 V만큼만 실행된다
        visit[x] = true;

        for(int y=0; y<V; y++){// V만큼 확인하게 된다
            if(A[x][y] != 1)continue;
            if(visit[y])continue;
            dfs(y);
        }
    }
    static void bfs(int start){
        Queue<Integer> que = new LinkedList();
        que.add(start);
        visit[start] =true;

        while(!que.isEmpty()){
            int x = que.poll();
            for(int y=0; y<V; y++){
                if(A[x][y] != 1)continue;
                if(visit[y])continue;
                que.add(y);
                visit[y] = true;
            }
        }
    }


    public static void main(String[] args) {
        /*
            간선의 정보 입력받기
            : 양방향(무방향)의 경우 하나의 간선의 정보를
            두번 입력해 주어야한다. ex) 1->2, 2->1
        */
        dfs(1); // 보통그래프의 한 점에서 갈 수 있는 점들을 탐색하는게 일반적이다. 탐색의 시작 정점을 적어준다.
    }
}



//TODO 격자그래프 같은 경우는 각점에서 다른 정점으로가는 케이스를 찾기 때문에 중첩반복문
//TODO 인접행렬도 다 확인 해야되네... 인접리스트가 간편한듯


