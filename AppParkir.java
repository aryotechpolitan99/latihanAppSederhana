import java.util.Scanner;

public class AppParkir {
    public static void main(String []args) {
        int lamaparkir;
        int biayaparkir=0;
        int biayaparkirnext=0;
        String tipe;
        int total;

        for (int i = 0; i < 2; i++){
            Scanner Obj=new Scanner(System.in);
            System.out.print("Masukan Plat Nomer: ");
            String plat = Obj.nextLine();
            System.out.println("1. Mobil");
            System.out.println("2. Motor");
            System.out.print("Pilih Jenis kendaraan	: ");
            int jeniskendaraan = Obj.nextInt();
            System.out.print("Jam Masuk	: ");
            int jammasuk = Obj.nextInt();
            System.out.print("Jam Keluar	: ");
            int jamkeluar = Obj.nextInt();
   
            if(jammasuk > jamkeluar){
                jamkeluar = jamkeluar+24;
            }
        
            System.out.println();
			System.out.println("Terimakasih telah melakukan transaksi dengan rincian sebagai berikut :");
            System.out.println("Plat Nomer	: " +plat);
            
            if(jeniskendaraan == 1){
                tipe ="Mobil";
                biayaparkir = 5000;
                biayaparkirnext = 3000;
				
                System.out.println("Jenis Kendaraan	: "+tipe);
            }else if(jeniskendaraan == 2){
                tipe ="Motor";
                biayaparkir = 3000;
                biayaparkirnext = 1500;
                System.out.println("Jenis Kendaraan	: "+tipe);
            }else{
                System.out.println("Jenis Kendaraan Tidak Terdaftar");
            }
 
            lamaparkir=jamkeluar - jammasuk;
            System.out.println("Lama Parkir	: "+lamaparkir+" Jam");
            if(lamaparkir == 1){
                total = biayaparkir;
                System.out.println("Total Bayar	: "+total);
				System.out.println("Semoga pelayanan kami memuaskan");
				System.out.println();
            }
            else if(lamaparkir > 1){
                total = biayaparkir+((lamaparkir-1)*biayaparkirnext);
                System.out.println("Total Bayar	: "+total);
				System.out.println("Semoga pelayanan kami memuaskan");
				System.out.println();
            }
        }
    }
}