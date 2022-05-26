import java.util.Scanner;

public class StarTriangle {
    public static void main(String[] args) {
        //도구 도입 및 입력 받기
        Scanner scanner = new Scanner(System.in);

        System.out.println("삼각형의 높이를 입력해 주세요(2 이상 20 미만)");

        int height_Length = scanner.nextInt();

        //범위 외 조건 while 문 진입 -> 재입력 실행 반복
        while (!(2 <= height_Length && height_Length < 20)) {
            System.out.println("다시 입력해 주세요");

            height_Length = scanner.nextInt();
        }
        String star = "*";
        String blank = " ";


        //  *의 홀수 만큼 더해지는 변 공식을 for 반복문을 통해 만들기 1 , 3, 5 => *  *** *****
        for (int i = 1; i <= height_Length; i += 1) {  //height 3 입력시 3 ()* 줄바꿈
            System.out.print(blank.repeat(height_Length- i)); // 어찌어찌해서 만들긴 만들엇는데 맘에도 안들고 구상속에서 나오기보단 실험속에서 나옴

            System.out.print(star.repeat(2 * i - 1));
            System.out.println("");
        }
    }
}

