import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] jn = {"Front_End", "Back_End", "FullStack", "Design UI"};
        String[] des = {"Memastikan konten yang ditampilkan di browser pengguna berjalan sesuai desain",
                        "Merancang atau mengembangkan software di sisi server",
                        "Bertanggung jawab dalam memperbaiki front - end dan back - end dari sebuah aplikasi",
                        "Menentukan tampilan aplikasi / situs dan menentukan suatu aplikasi dan/atau situs bisa beroperasi dengan mudah"
                        };
        int[] gj;
        gj = new int[4];
        gj[0] = 11000000;
        gj[1] = 19000000;
        gj[2] = 14000000;
        gj[3] = 16000000;

        int[] lmbr;
        lmbr = new int[4];
        for(int i=0;i<4;i++){
            lmbr[i] = 5*gj[0]/1000;
        }
        Jabatan[] jns = new Jabatan[4];
        for(int i=0;i<4; i++){
            jns[i] = new Jabatan(jn[i],gj[i],des[i],lmbr[i]);
        }
        System.out.println("\t[---------------------------------------------------------------]");
        System.out.println("\t[                    DAFTAR JABATAN                             ]");
        System.out.println("\t[---------------------------------------------------------------]");
        System.out.println("\t[      Kategori     |          Gaji         |    Lemburan/Jam   ]");
        System.out.println("\t[---------------------------------------------------------------]");
        for(int i=0;i<4; i++){
            System.out.println("\t[\t"+jns[i].jenis+"\t\t|\tRp. "+jns[i].gaji+"\t\t|\tRp. "+jns[i].lemburan+"\t\t]");
        }
        System.out.println("\t[---------------------------------------------------------------]");
        String[] nm = {"Fukada","Siskae","Ricard","Albert"};
        String[] np = {"123","345","678","987"};
        int[] per;
        per = new int[4];
        System.out.println("\t[---------------------------------------------------------------]");
        System.out.println("\t[                 Izin Karyawan dalam 1 bulan                   ]");
        System.out.println("\t[---------------------------------------------------------------]");
        for(int i=0;i<4;i++){
            System.out.print("\t[ "+nm[i]+" : ");
            per[i] = in.nextInt();
        }
        System.out.println("\t[---------------------------------------------------------------]");
        int[] ovt;
        ovt = new int[4];
        System.out.println("\t[---------------------------------------------------------------]");
        System.out.println("\t[        Total Jam Lembur Karyawan selama satu bulan            ]");
        System.out.println("\t[---------------------------------------------------------------]");
        for(int i=0;i<4;i++){
            System.out.print("\t[ "+nm[i]+"\t: ");
            ovt[i] = in.nextInt();
        }
        System.out.println("\t[---------------------------------------------------------------]");
        int[] sal;
        sal = new int[4];
        for(int i=0;i<4;i++){
            sal[i]=gj[i]+(ovt[i]*lmbr[i])-(per[i]*(gj[i]/30));
        }
        System.out.println("\t[-------------------------------------------------------------------------------------------]");
        System.out.println("\t[                                  Gaji Semua Karyawan                                      ]");
        System.out.println("\t[-------------------------------------------------------------------------------------------]");
        System.out.println("\t[               |           |                            Detail Gaji                        ]");
        System.out.println("\t[     Nama      |    NIP    |---------------------------------------------------------------]");
        System.out.println("\t[               |           |    Bulanan    |    (-)Libur   |(+)  Lembur    |    Total      ]");
        System.out.println("\t[-------------------------------------------------------------------------------------------]");
        for(int i=0;i<4;i++){
            System.out.println("\t[\t"+nm[i]+"\t\t|\t"+np[i]+"\t\t|Rp. "+gj[i]+"\t| Rp. "+(per[i]*(gj[i]/30))+"\t| Rp. "+(ovt[i]*lmbr[i])+"\t| Rp. "+sal[i]+"\t]");
        }
        System.out.println("\t[-------------------------------------------------------------------------------------------]");


//
    }
}