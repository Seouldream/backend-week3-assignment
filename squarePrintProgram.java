//0. 스캐너준비
//1. 문구 출력 및 변 길이 입력
//2. 변길이가 조건 밖이면 "다시 입력 " 출력 및 반복 되도록 식작성 -> 입력한 값이 주어진 범위가 아닌 동안 은
//3. 주어진 변길이만큼 가로 세로 반복 문구 입력 공식작성  -> 입력 받은 변의 갯수만 큼
//4. 첫 for 문  변의 세로 길이만 큼 반복해서 라인을 바꿔준다.
//5. 두번째 for문 변의 가로길이만 큼 붙여서 별을 반복해준다

import java.util.Scanner;

public class squarePrintProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("한 변의 길이를 입력해 주세요(2 이상 20 미만)");
        int length = scanner.nextInt();

        while (!(length >= 2 & length < 20)) {   // 변의길이가 2이상 20미만이 아닌 동안은 밑을 반복해라
            System.out.println("다시 입력해주세요");
            length = scanner.nextInt();
            continue;
        }

        String star = "*";

        //length 가 2일때 가로로 별 **개 2줄  3일때 가로 별 3개 세로 3줄
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(star);
            }
            System.out.println();
        }
    }
}
