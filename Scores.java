import java.util.Arrays;

/*
과제 5

1. 2차원 배열을 이용한 과제
2. 아래와 같은 테이블이 있다고 가정한다.

-----------------------------------
 이름 | Yoseph | Trinity | Pyramid
-----------------------------------
 생물 |  100   |   87    |   77
-----------------------------------
 역사 |   70   |   67    |   97
-----------------------------------
 사회 |   80   |   77    |   100
-----------------------------------

3. 위 테이블을 2차원배열로 데이터를 만들고 각 사람의 점수의 총합과 평균을 구하세요. (첫 번째 산출값)
4. 위 세명 중에, 총합이 가장 큰 사람은 누구인가요? (두 번째 산출값)
   위 세명 중에, 평균이 가장 작은 사람은 누구인가요? (세 번째 산출값)

 */
public class Scores {
    public static void main(String[] args) {

        // 2차원배열생성
        String[] name = { "Yoseph", "Trinity", "Pyramid" };
        int[][] scores = {
                // 생물, 역사, 사회 순
                { 100, 70, 80 }, // Yoseph[0]
                { 87, 67, 77 }, // Trinity[1]
                { 77, 97, 100 } // Pyramid[2]
        };

        // 3명의 총합과 평균을 저장할 배열 생성
        int[] sum = new int[3]; // 총합
        double[] avg = new double[3]; // 평균

        // 총합과 평균 구하기
        for(int i = 0 ; i < scores.length ; i++) {
            for(int j = 0 ; j < scores[0].length ; j++) {
                sum[i] += scores[i][j];
            } // Inner for

            avg[i] = (double) sum[i] / scores[0].length;
        } // Outer for


        // 가장 큰 총합과 가장 작은 평균 구하기
        int max = Arrays.stream(sum).max().orElse(-1);
        double min = Arrays.stream(avg).min().orElse(-1);


        // 결과 출력
        for(int i = 0 ; i < scores.length ; i++) {
            if(max == sum[i]) {
                System.out.println("총합이 가장 큰 사람은 " + name[i] + "입니다.");
            } // if

            if(min == avg[i]) {
                System.out.println("평균이 가장 작은 사람은 " + name[i] + "입니다.");
            } // if
        } // for

    } // main

} // end class