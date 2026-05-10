// Main.java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // =========================
        // 아기사자 정보 입력
        // =========================
        System.out.println("========== 🦁 아기사자 정보 입력 ==========");

        System.out.print(" 이름: ");
        String lionName = sc.nextLine();

        System.out.print(" 전공: ");
        String lionMajor = sc.nextLine();

        System.out.print(" 기수: ");
        int lionGeneration = Integer.parseInt(sc.nextLine());

        System.out.print(" 파트: ");
        String lionPart = sc.nextLine();

        System.out.print(" 학번: ");
        String studentId = sc.nextLine();

        // Lion 객체 생성
        Role lion = new Lion(
                lionName,
                lionMajor,
                lionGeneration,
                lionPart,
                studentId
        );

        System.out.println();


        // =========================
        // 운영진 정보 입력
        // =========================
        System.out.println("==========  운영진 정보 입력 ==========");

        System.out.print(" 이름: ");
        String staffName = sc.nextLine();

        System.out.print(" 전공: ");
        String staffMajor = sc.nextLine();

        System.out.print(" 기수: ");
        int staffGeneration = Integer.parseInt(sc.nextLine());

        System.out.print(" 파트: ");
        String staffPart = sc.nextLine();

        System.out.print(" 직책: ");
        String position = sc.nextLine();

        // Staff 객체 생성
        Role staff = new Staff(
                staffName,
                staffMajor,
                staffGeneration,
                staffPart,
                position
        );

        System.out.println();
        System.out.println("==========  결과 출력 ==========");

        // 아기사자 출력
        System.out.println(lion.getInfo());
        System.out.println(" 과제 제출 가능 여부: "
                + (lion.canSubmitAssignment() ? "가능" : " 불가능"));

        System.out.println("----------------------------------");

        // 운영진 출력
        System.out.println(staff.getInfo());
        System.out.println(" 과제 제출 가능 여부: "
                + (staff.canSubmitAssignment() ? " 가능" : " 불가능"));

        sc.close();
    }
}
