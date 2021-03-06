package Baekjoon.Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_12865 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int ans = 0;
        int[] w = new int[N];
        int[] v = new int[N];
        int[][]dp = new int[N+1][K+1];
        for(int i = 0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            w[i] = Integer.parseInt(st.nextToken());
            v[i] = Integer.parseInt(st.nextToken());
        }
        for(int i = 1; i<=N; i++){
            for(int j = 1; j<=K; j++){
                if(w[i-1] <= j){
                    dp[i][j] = Math.max(v[i-1]+dp[i-1][j-w[i-1]],dp[i-1][j]);
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
                ans = Math.max(ans, dp[i][j]);
            }

        }
        System.out.println(ans);
    }
}
