import java.util.Scanner;

public class perulangan_while {
    public static void main(String[] args) {
        
        //membuat deklarasi variabel dan scanner
        boolean running = true;
        int counter = 0;
        String jawab;
        Scanner scan = new Scanner(System.in);

        while(running){
            System.out.println("Apakah anda ingin keluar?");
            System.out.print("Jawab [ya/tidak]> ");

            //next input
            jawab = scan.nextLine();

            //cek jawabannya, kalau ya maka berhenti mengulang
            if (jawab.equalsIgnoreCase("ya")){
                running = false;
                //jika running false maka akan berhenti mengulang
                //tidak menjalankan perintah di bawahnya

                //jika running true maka akan menjalankan 
                //perintah di bawahnya
            }

            //menambah counter untuk mengetahui berapa kali (perulangan)
            counter++;
        }

        System.out.println("Anda sudah melakukan perulangan sebanyak " + counter + " kali");
    }    
}
