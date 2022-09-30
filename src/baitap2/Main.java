package baitap2;

public class Main {
    public static void main(String[] args) {
        //khai bao va khoi tao mang 10.000 phan tu
        int arrInt[] = new int[10000];
        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = (int) Math.random()*10000;
        }
        //bat dau dem thoi gian giai thuat slection sort thuc hien
        // thuc hien giai thuat selection sort de sap xep mang so nguyen 10000
        Stopwatch sw = new Stopwatch();
        sw.start();
        for (int i = 0; i < arrInt.length-1; i++) {
            for (int j = i+1; j <arrInt.length ; j++) {
                if (arrInt[i]>arrInt[j]){
                    int temp = arrInt[i];
                    arrInt[i]=arrInt[j];
                    arrInt[j] = temp;
                }
            }
        }
        sw.stop();
        System.out.println("thoi gian thuc hien giai thuat la");
    }
}
