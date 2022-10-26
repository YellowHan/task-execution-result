import java.util.Scanner;

/*
과제 4

애너그램(Anagram) 체크 알고리즘

1. 사용자에게 문자열을 입력 받는다.
2. 입력받은 문자열을 문자타입 배열로 바꾼다.
3. 나눈 문자들의 첫 번째와 마지막부터 하나씩 가운데 문자까지 이동하면서 비교한다.
4. 3번의 결과가 참(true)이면, 애너그램(Anagram)가 맞다는 메세지를 출력하고
   거짓(false)이면, 애너그램(Anagram)가 아니라는 메시지를 출력한다.
*/

public class AnagramTest {

    public static void main(String[] args) {
        String userInput;
        boolean isAnagram;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            // 애너그램 체크 변수 초기화
            isAnagram = true;

            System.out.println("애너그램(Anagram)을 확인 할 문자열을 입력해주세요.");
            System.out.println("프로그램 종료를 원하시면 \"exit\" 를 입력해주세요.");
            System.out.print("> ");

            // 사용자에게 문자열 입력받기
            userInput = scanner.nextLine();

            // 입력받은 문자열이 "exit"이면 종료
            if(userInput.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } // if

            // 입력받은 문자열이 한 글자인 경우 재 입력받기
            if(userInput.length() < 2) {
                System.out.println("2자 이상 입력하셔야 판별이 가능합니다.\n");
                continue;
            } // if

            // 입력받은 문자열을 문자타입 배열로 변경
            char[] charArr = userInput.toCharArray();

            // 문자 비교 시작
            // 서로 반대되는 위치의 문자가 다르면 이후 검사가 필요없음
            for (int i = 0; i < charArr.length / 2; i++) {
                if (charArr[i] != charArr[(charArr.length - 1) - i]) {
                    isAnagram = false;
                    break;
                } // if
            } // for

            // isAnagram 값을 확인하여 맞는 메시지 출력
            if (isAnagram) {
                System.out.println("이 문자열은 애너그램(Anagram)입니다.\n");
            } else {
                System.out.println("이 문자열은 애너그램(Anagram)이 아닙니다.\n");
            } // if-else

        } // while

    } // main

} // end class