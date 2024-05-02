package backjoon;

import java.io.*;

public class Baekjoon1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        String[] arr = input.split(" ");

        if(arr[0].equals("1")){
            bw.write("1\n");
        }
        if(arr[0].equals("2")){
            bw.write("1\n2\n");
        }

        for(int i=Integer.parseInt(arr[0]);i<=Integer.parseInt(arr[1]);i++){
            for(int j=2;j<i;j++){
                if(i%j==0){
                    break;
                }else if(j==i-1){
                    bw.write(i+"\n");
                }
            }
        }
        bw.flush();
    }
}
