package Modul6.Percobaan;

public class Persegi extends Bentuk{

        protected int p, l; // variabel this p di kelas ini

        //Merupakan luas
        public void setSuperP(int p) { // variabel this p di kelas bentuk
            super.p = p;
        }

        public void setSuperL(int l) { // variabel this p di kelas bentuk
            super.l = l;
        }

        // Merupakan Luas yang di isi
        public void setL(int l) {
            this.l = l;
        } // variabel this p di kelas ini

        public void setP(int p) {
            this.p = p;
        } // variabel this p di kelas ini

        // Method yang nantinya akan dipanggil di kodingan main
        public void getLuas(){
            System.out.println("Luas super = "+ (super.l * super.p));
            System.out.println("Luas  = "+ (this.l * this.p));
        }
}
