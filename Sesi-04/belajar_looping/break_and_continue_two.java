public class break_and_continue_two {
    public static void main(String[] args) {
        
        //deklarasi variabel
        int i;

        // indexing 0,1,2,3
        // karena di nilai 3 nya di break
        // maka yang tercetak > 0,1,2 > berjumlah 3
        for (i = 0; i<4; i++){
            if (i >= 3){
                break;
            }
            System.out.println("Selamat Belajar!");
            //kasih kondisi continue
            if (i >= 2){
                continue;
            }
            System.out.println("JAVA");
        }
        System.out.println();
    }    
}
