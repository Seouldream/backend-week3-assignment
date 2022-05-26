import java.util.Scanner;
public class PikachuGame {
    public static void main(String[] args) {
        //0 준비, 도입부
        Scanner scanner = new Scanner(System.in);
        System.out.println("피카츄: 라이츄를 만났다..\n저 자식 .... 한태 한번 당한 경험이 있으니...\n이번 리벤지 매치는 나에게 아주 중요해..\n다신 땅을 침대로 누워있을 수 없어..!!");
        //공격 시작화면
        System.out.println("피카츄의 차례, 무엇을 할까?\n1. 공격하기\n 2.상처약 섭취");

        int Option = scanner.nextInt();
        int Pikchu_HP = 50;
        int Raichu_HP = 50;

        if (Option == 1) {
            System.out.println("지우: 피카츄 몸통박치기!\n-- 공격 명중! 라이츄의 에너지가 10 감소했다. 라이츄는 조금 아파한다.\n라이츄: 앗, 라이츄 아프다.");
            System.out.println("");
            System.out.println("");
            System.out.println("라이츄: 라이쮸!!!!!!!!!\n-- 피카츄 타격!! 에너지가 15 감소했다!! --\n 피카츄: 피카앍..피카핡.." );
    }
        if (Option == 2) {
            System.out.println("피카츄: 얌얌 상처약 냠냠\n-- 상처약을 섭취하여 피카츄의 에너지가 50이 되었다. 피카츄는 회복되어 보인다.\n라이츄: 킁...");
            System.out.println("");
            System.out.println("");
            System.out.println("라이츄: 라이쮸!!!!!!!!!\n-- 피카츄 타격!! 에너지가 15 감소했다!! --\n 피카츄: 피카앍..피카핡.." );
            }
        }
}