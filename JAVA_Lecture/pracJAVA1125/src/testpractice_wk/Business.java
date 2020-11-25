package testpractice_wk;

import java.util.Scanner;

public class Business {


    WirelessClass[] wc = new WirelessClass[10];
    Scanner sc = new Scanner(System.in);
    void start(){
        menuDisplay();

    }//end start

    void menuDisplay(){

        boolean flag = true;
        int choice = 0;
        while(flag){
            System.out.println("-------------------");
            System.out.println("1.�Է� 2.��� 3.����");
            System.out.println("-------------------");
            System.out.print("������? ");
            choice = sc.nextInt();

            switch(choice){
                case 1: input(); break;
                case 2: output(wc); break;
                case 3: flag = false; break;
            }//end switch
        }//end while
    }//end menuDisplay

    int i = 0;

    void input(){
        while(true) {
            System.out.print("������");
            String custName = sc.next();

            System.out.print("�����");
            String grade = sc.next();

            System.out.print("���ð���");
            int useTime = sc.nextInt();

            switch (grade) {
                case "A":
                case "a":
                    wc[i++] = new AGrade(grade, custName, 86, 10000, useTime);
                    break;
                case "B":
                case "b":
                    wc[i++] = new BGrade(grade, custName, 81, 12000, useTime);
                    break;
                case "C":
                case "c":
                    wc[i++] = new CGrade(grade, custName, 104, 15000, useTime);
                    break;
                case "D":
                case "d":
                    wc[i++] = new DGrade(grade, custName, 52, 20000, useTime);
                    break;
            }//end switch

            System.out.println("��� �Է��Ͻðڽ��ϱ�?");
            String ans = sc.next();
            if(ans.equals("n")){
                break;
            }
        }//end while
    }//end input

    void output(WirelessClass[] wc){
        System.out.println("���� ����ڵ� �ð���ܰ� �⺻��� ���ð� ���ο�� �̹��� ��ſ��");
        for(int i = 0; i < wc.length; i++){
            if(wc[i] == null){
                break;
            }
            System.out.println(wc[i].custName + "  " + wc[i].gradeCode + "  " + wc[i].timeFee + "  " + wc[i].basePrice + "  " + wc[i].useTime + "  " + wc[i].discountRate() + "  " + wc[i].communicationFee());
        }//end for
    }//end output

}
