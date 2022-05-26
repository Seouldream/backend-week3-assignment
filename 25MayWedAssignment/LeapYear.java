import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        //0 준비 스캐너 도입
        Scanner scanner = new Scanner(System.in);

        //1.입력
        System.out.print("연도: ");
        int year = scanner.nextInt();

        //1. 계산
        boolean FourOfMultiple = year % 4 ==0;
        boolean HundredOfMultiple = year % 100 ==0;
        boolean FourHundredOfMultiple = year % 400 ==0;

        boolean LeapYear = ((FourOfMultiple && !HundredOfMultiple))|| (FourHundredOfMultiple);

        System.out.println(LeapYear);

    }

}
