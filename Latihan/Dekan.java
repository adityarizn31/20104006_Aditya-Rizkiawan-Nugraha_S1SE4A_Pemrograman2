package Modul7.Latihan;

public class Dekan extends Dosen{
    private String fakultas;

    Dekan(String namx, String nikx, String jurx, String kultas) {

        super(namx, nikx, jurx);
        this.fakultas = kultas;
    }

    public void tampil () {

        super.tampil();
        System.out.println("\nFakultas \t= " + fakultas);

    }
}
