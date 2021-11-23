package Modul7.Percobaan;

public class Overload {
    void myOverload(A a){
        System.out.println("OVERLOAD.MyOverload (A a)");
    }

    void myOverload(B b){
        System.out.println("OVERLOAD.MyOverload (B b)");
    }

    public static void main(String[] args) {
        Overload o = new Overload();
        C c = new C();

        o.myOverload(c);
    }
}
