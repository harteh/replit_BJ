import java.io.*;
import java.util.StringTokenizer;

class BJ11659 {
  public static void main(String[] args) throws IOException {
    BufferedReader bfrd = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer strtz = new StringTokenizer(bfrd.readLine());

    int sNo = Integer.parseInt(strtz.nextToken()); // 숫자 개수
    int qNo = Integer.parseInt(strtz.nextToken()); // 질문 개수

    long[] S = new long[sNo + 1]; // 합을 넣을 배열?

    strtz = new StringTokenizer(bfrd.readLine()); // 다시 초기화?
    for (int i = 1; i <= sNo; i++) {
      // 숫자 개수만큼 합 배열 생성
      S[i] = S[i - 1] + Integer.parseInt(strtz.nextToken());
    }

    for (int q = 0; q < qNo; q++) {
      strtz = new StringTokenizer(bfrd.readLine());
      // 질문 범위 입력
      int i = Integer.parseInt(strtz.nextToken());
      int j = Integer.parseInt(strtz.nextToken());
      // 구간 합 출력
      System.out.println(S[j] - S[i - 1]);
    }

  }
}