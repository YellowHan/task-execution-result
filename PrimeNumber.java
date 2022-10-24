/*
과제 2

소수를 구하는 알고리즘

1. 소수를 구할 범위를 정한다.
2. 범위 내에서 무작위 추출로 정수를 얻는다.
3. 추출된 정수가 소수가 맞는지 판단한다.
4. 소수가 맞으면 다시 2부터 반복한다.
5. 소수가 아니면 프로그램을 종료한다.

— 조건 —

정수의 범위 : 0 ~ 999
반복 횟수 : 1 ~ 20
 */
public class PrimeNumber {

    // 무작위 정수 20개를 추출하고 각 추출된 정수가 소수인지 출력하시오.
    public static void main(String[] args) {
        int randomNumber = 0; // 랜덤 수를 저장할 변수를 먼저 선언하고 0으로 초기화
        label :
        for(int i = 0 ; i < 20 ; i++) {
            randomNumber = (int)(Math.random() * 999); // 0부터 999까지의 랜덤 수 추출

            System.out.println("랜덤으로 추출한 값 : " + randomNumber);

            // 추출한 값이 소수가 맞는지 판단
            if(randomNumber < 2) { // 0, 1은 소수가 아니다.
                System.out.println(randomNumber +"은(는) 소수가 아니므로 프로그램을 종료합니다.");
                break;
            } // if

            for(int j = 2 ; j < randomNumber ; j++) {

                if(randomNumber % j == 0) {
                    System.out.println(randomNumber +"은(는) 소수가 아니므로 프로그램을 종료합니다.");
                    break label;
                } // if
            } // for

            System.out.println(randomNumber + "은(는) 소수입니다.");
        } // for

    } // main

} // end class