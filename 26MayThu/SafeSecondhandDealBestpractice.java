import java.util.Scanner;

public class SafeSecondhandDealBestpractice {
    public static void main(String[] args) {
        //0 스캐너 준비
        Scanner scanner = new Scanner(System.in);
        //1. input (핸드폰 번호 입력 받음)
        System.out.print("핸드폰 번호: ");
        String phoneNumber = scanner.next();  //다음 공백까지 "문자열"을 입력 받음

        String maskedNumber = ""; //가려진숫자를 문자열로 받고 값을 설정해줌

        //Process
        int i = 0;
        while(i < phoneNumber.length() - 4) {  // 입력받은문자열(여기선 폰번호) 길이-4 가 i 보다 클 때동안 실행
            maskedNumber += phoneNumber.charAt(i);  //maskedNumber는 Phonenumbe에서 0자리 1자리 ... 조건만족시까지 자리수를 더해감
            i +=1;
            // 그럼 예상 결과값 입력값이 01012345678 일때,
            // i = 0  maskedNumber = 0
            // i = 1  maskedNumber = 01
            // i = 2  maskedNumber = 010
            //... 중략
            // i = 6  maskedNumber = 0101234   i 가 phoneNumber.length()-4보다 작은 마지막 경우
            //... 따라서 마지막 maskedNumber 결과값 0101234
        }
        maskedNumber += "****"; //최종 maskedNumber에 ****를 더해줌.

        //Output
        System.out.print(maskedNumber);  // 따라서 최종 결과값 0101234****


    }
}
