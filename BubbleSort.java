/*
과제 6

배열을 이용해서 버블정렬(Bubble Sort)를 해봅니다.

- 조건 -
1. 무작위 정수 30개로 구성된 1차원 배열을 생성하세요.
2. 생성된 배열의 원소값을 "버블정렬" 알고리즘으로 오름차순 정렬결과,
   내림차순 정렬결과를 출력하시오.

— 알고리즘 —

1. 임시로 값을 저장할 변수와 오름차순 정렬 여부를 체크할 카운트 변수를 선언하고 카운트 변수는 0으로 초기화한다.
2. 무작위 추출 정수 30개가 저장될 int 배열을 선언 및 초기화 한다.
3. for 문을 사용하여 배열에 순차적으로 무작위 정수값을 저장한다.
4. 3번에서 저장한 값이 배열에 이미 존재한다면, 그 자리에 새로운 무작위 정수값을 저장한다.
5. 배열에 중복되지 않은 정수값이 다 채워질 때까지 3, 4번을 반복한다.
6. 배열에 저장된 정렬되지 않은 값을 출력한다.
7. while 문을 사용하여 오름차순 정렬 여부를 체크할 카운트 변수가 배열의 길이보다 1 작을 때까지 반복한다.
8. 현재 인덱스의 값과 다음 인덱스의 값을 비교해서 현재의 값이 더 크다면 서로의 위치를 변경한다.
9. 현재 인덱스와 다음 인덱스의 값이 오름차순으로 정렬되어 있다면, 카운트 변수를 1 증가 시킨다.
10. while의 조건이 false(count ≥ intArr.length - 1)가 될 때까지 8, 9번을 반복한다.
11. 오름차순으로 정렬된 배열의 값을 출력한다.
12. 정렬된 배열의 각 끝에서부터 한 칸씩 중앙으로 이동하며 서로의 위치를 변경한다.
13. 내림차순으로 정렬된 배열의 값을 출력한다.
 */


import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int tmp;
        int count = 0;
        int[] intArr = new int[30];


        // 랜덤 정수 비복원 추출
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = (int) (Math.random() * 100); // 0 ~ 99까지

            // 배열에 중복된 값이 있는지 확인
            for (int j = 0; j < i; j++) {
                if (intArr[i] == intArr[j]) {
                    i--;
                } // if
            } // for
        } // for

        // intArr 배열의 값 확인 - 정렬 전
        System.out.println("----- 정렬 전 -----");
        System.out.println(Arrays.toString(intArr));
        System.out.println();

        // 버블 정렬 시작 - 오름차순
        while (count < intArr.length - 1) {
            count = 0;

            for (int i = 0; i < intArr.length - 1; i++) {
                if (intArr[i] < intArr[i + 1]) { // 두 정수의 값이 오름차순이라면
                    count++;
                    continue;
                } // if

                tmp = intArr[i];
                intArr[i] = intArr[i + 1];
                intArr[i + 1] = tmp;
            } // for

            // 정렬 완료 후 for 문이 한 번 더 반복되는 것을 방지
            if (count >= intArr.length - 2) {
                break;
            } // if
        } // while

        // intArr 배열의 값 확인 - 정렬 후(오름차순)
        System.out.println("----- 오름차순 정렬 -----");
        System.out.println(Arrays.toString(intArr));
        System.out.println();

        // 내림차순 정렬
        // 이미 정렬되어 있기 때문에 중앙을 기준으로 대칭되는 위치의 값만 교환
        for (int i = 0; i < intArr.length / 2; i++) {
            tmp = intArr[i];
            intArr[i] = intArr[(intArr.length - 1) - i];
            intArr[(intArr.length - 1) - i] = tmp;
        } // for

        // intArr 배열의 값 확인 - 정렬 후(내림차순)
        System.out.println("----- 내림차순 정렬 -----");
        System.out.println(Arrays.toString(intArr));
    } // main
} // end class