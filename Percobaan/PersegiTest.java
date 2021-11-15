package Modul6.Percobaan;

public class PersegiTest {
    public static void main(String[] args){
        Persegi kotak = new Persegi();
        //Mengisikan pada variabel super P, L dan Set P,L
            kotak.setSuperP(5);
            kotak.setSuperL(10);
            kotak.setP(3);
            kotak.setL(13);

        // Method dari kodingan extends bentuk dipanggil disini
            kotak.getLuas();
        }
}

