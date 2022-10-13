import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int pilih; //ini adalah pendeklarasian tipe data dan variabel
        Scanner inputan = new Scanner(System.in); //ini adalah pendeklarasian untuk menggunakan inputan dinamis

        System.out.println("Ini adalah program java");
        System.out.println("Masukkan pilihan anda : ");
        System.out.println("1. Perulangan for ");
        System.out.println("2. Perulangan While");
        System.out.println("3. perulangan do-while");
        System.out.println("4. Array 1 dimensi ");
        System.out.println("5. Array multidimensi");
        pilih = inputan.nextInt();
        if (pilih == 1) { //ini adalah penggunaan if else
            System.out.println("anda memilih perulangan for");
            for (int a = 1; a <= 10; a++) { //ini adalah perulangan menggunakan for
                System.out.print(a);
            }
        } else if (pilih == 2) {
            System.out.print("anda memilih perulangan while");
            int a = 1;
            while (a <= 10) { //ini adalah perulangan menggunakan while
                System.out.println(a);
                a++;
            }
        }else if(pilih==3){
            System.out.println("anda memilih perulangan do-while"); //ini adalah perulangan menggunakan do-while
            int a=11;
            do{
                System.out.println(a);
                a++;
            }while(a<=10);
            System.out.println(a);
        }else if(pilih==4){
            System.out.println("anda memilih array dimensi 1"); //ini adalah array 1 dimensi
            int A[] = {1,2,3,4,};
            System.out.print(A[1]);
            System.out.print(A[2]);
            System.out.print(A[3]);
        }else if(pilih==5){
            System.out.println("anda memilih array multidimensi"); //ini adalah array multidimensi
            int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
            int x = myNumbers[1][2];
            System.out.println(x);
        }
    }
}
