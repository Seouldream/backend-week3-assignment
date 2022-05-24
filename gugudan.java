public class gugudan {
    public static void main(String[] args) {
        //1. 구구단 완성
        //2 * 1 2 * 2 2 * 3 2 * 4/ 3 * 1 3 * 2 3 * 3/ 4 * 1 4 * 2 4 *3 , 2가 1씩 커지는 for 문 작성
        //2 * 1 2 * 2 2 * 3 2 * 4 / y가 1씩 커지는 for 문 작성
        //2. 돌려보기
        //3. 구구단 3단 만들기
        // \t 와 x 할당 변수 3개씩 x , x + 1 , x + 2 로 3 단 나누기
        // 중복 없애기 위해 x 증가수 3으로 변경
        // 3단 출력 끝난후 라인변경 명령어 입력
        // 10단 없애기  (x +2 ) 출력란 컨티뉴나 브레이크 혹은 조건식으로 건드리기
        // if 조건절 위치 주의 !!

        for (int x = 2; x < 10; x += 3) {
            for (int y = 1; y < 10; y += 1) {
                System.out.print(x + " * " + y + " = " + x * y);
                System.out.print("\t");
                System.out.print(x + 1 + " * " + y + " = " + (x + 1) * y);
                if (x + 2 == 10) {
                    System.out.println();
                    continue;
                }
                System.out.print("\t");
                System.out.println(x + 2 + " * " + y + " = " + (x + 2) * y);
            }
            System.out.println();
        }


    }
}

