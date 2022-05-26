import java.util.Scanner;

public class StarSquare {
    public static void main(String[] args) {
        //0 준비 도구 도입
        Scanner scanner = new Scanner(System.in);

        System.out.println("한 변의 길이를 입력해 주세요(2 이상 20 미만)");
        //입력 받음
        int side_Length = scanner.nextInt();
        String star = "*";
        //입력 조건 지정
        //조건에 맞는 수만 도입 -> 조건에 맞으면 while문으로 진입
        while (!(side_Length > 2 && side_Length < 20)) {
            System.out.println("다시 입력해주세요");
            side_Length = scanner.nextInt();
        }
        //가로 변 붙여주는 for문 안쪽 작성, 변 완성후 줄바꿈 for 문: 2중 for 문
        for (int i = 0; i < side_Length; i += 1) {
            for (int j = 0; j < side_Length; j += 1) {
                System.out.print(star);
            }
        System.out.println("");
        }
    }
}
