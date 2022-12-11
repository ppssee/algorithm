import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int cnt = 0;

        LinkedList<Integer> dq = new LinkedList<>();
        for(int  i = 1; i<=N; i++)
            dq.addLast(i);

        int[] find = new int[M];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<M; i++)
            find[i] = Integer.parseInt(st.nextToken());

        for(int i = 0; i<M; i++){
            if(dq.getFirst() == find[i]){
                dq.removeFirst();
                continue;
            }

            int findIdx = dq.indexOf(find[i]);

            int backCnt = dq.size() - findIdx;
            if(findIdx < backCnt){
                while(dq.getFirst() != find[i]){
                    dq.addLast(dq.removeFirst());
                    cnt++;
                }
            }
            else{
                while(dq.getFirst() != find[i]){
                    dq.addFirst(dq.removeLast());
                    cnt++;
                }
            }

            dq.removeFirst();
        }

        System.out.println(cnt);
    }
}