package MD2_bai4_baitap1;

import MD2_bai4_baitap1.QuadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("giai phuong trinh bac 2");
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap gia tri a");
        double a = scanner.nextDouble();
        if (a==0){
            System.out.println("khong the giai phuong trinh");
            return;
        }
        System.out.println("nhap gia tri b");
        double b = scanner.nextDouble();
        System.out.println("nhap gia tri c");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        System.out.println("delta="+quadraticEquation.getdelta());
        if (quadraticEquation.getdelta()==0){
            System.out.println("phuong trinh co 1 nghiem la :"+quadraticEquation.Motnghiem());
        } else if (quadraticEquation.getdelta()<0){
            System.out.println("phuong trinh vo nghiem"+quadraticEquation.getdelta());
        } else if (quadraticEquation.getdelta()>0) {
            System.out.println("phuong trinh co 2 nghiem la: ");
            System.out.println("nghiem 1 la: "+quadraticEquation.getRoot1()+"\nnghiem 2 la:"+quadraticEquation.getRoot2());
        }
    }
}