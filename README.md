# replit_BJtest
백준 온라인 코딩테스트 문제풀이 연습입니다.  
replit 사이트를 이용하여 코드를 작성하고, git과 연동합니다.

# 정리  
## Buffer 입출력  
+ java.io 패키지
+ [문자단위 입출력 스트림](https://harteh31.tistory.com/89)
+ **BufferedReader**
  + 띄어쓰기와 엔터 기준으로 입력값을 인식하는 Scanner와 다르게 **엔터**만 기준으로 데이터를 입력받는다
  + 입력받은 데이터는 **String**으로 고정된다
  + Reads text from a character-input stream, buffering characters so as to provide for the efficient reading of characters, arrays, and lines. The buffer size may be specified, or the default size may be used. 
  + readLine()을 사용하면 데이터를 **라인 단위**로 읽을 수 있다

> **StringTokenizer**  
> java.util.StringTokenizer  
> + 지정한 구분자로 문자열을 쪼개주는 클래스
> + 쪼개어진 열이 token 이다  

+ **InputStreamReader**
  + 바이트 스트림에서 문자 스트림으로의 다리

<details>
<summary>buffer 이용문제</summary>
<div markdown="1">

[구간 합 구하기 1](algorithm/BJ11659.java)

</div>
</details>  

---
