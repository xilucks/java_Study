package study.hello_algo_repeat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int ans = 0;
        for(int i = 1; i<= N; i++){
            for(int j = i; j<=N; j++){
                int k = N-i-j;
                if(j<= k && k <i+j){
                    ans ++;
                }
            }
        }
        System.out.println(ans);
    }
}
