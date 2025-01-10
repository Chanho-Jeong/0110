package org.example;

import org.example.save.SaveService;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //필요한 객체 준비
        //프로그램 시작
        SaveService save = new SaveService();
        Scanner scanner = new Scanner(System.in);

        //입금 1, 출금 2
        System.out.println("1.입금, 2.출금, -1:종료");

        String oper = scanner.nextLine();

        switch (oper){
            case "1":
                System.out.println("얼마를 입금?");
                int value = Integer.parseInt(scanner.nextLine());

                int current = save.in(value);
                System.out.println("현재 잔고는: " + current);

                break;
            case "2":
                break;
            case "-1":
                break;
        }


        //만일 입금이라면
        //얼마를 추가할까요?
        // save.in( )호출

        //만일 출금이라면
        //진짜 꺼낼껀가요?
        //save.out( )호출


    }
}