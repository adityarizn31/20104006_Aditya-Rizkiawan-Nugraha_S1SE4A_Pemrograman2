package Modul3.Latihan;

public class Tabungan {
    int saldo;

    Tabungan (int saldo){
        this.saldo = saldo;
    }

    public int getSaldo (){
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void simpanUang(int jumlah){
        this.saldo = saldo + jumlah;
    }

    public boolean ambilUang(int jumlah){
        if (jumlah < this.getSaldo()) {
            this.setSaldo(getSaldo()-jumlah);
            return true;
        } else {
            return false;
        }
    }
}
