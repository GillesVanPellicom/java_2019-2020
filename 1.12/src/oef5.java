
public class oef5 {
    public static void main(String[] args) {
        int saldo = 100;
        int saldoPerc1 = saldo / 100 * 5;
        int saldoTot1 = saldo + saldoPerc1;
        int saldoPerc2 = saldoTot1 / 100 * 5;
        int saldoTot2 = saldoTot1 + saldoPerc2;
        int saldoPerc3 = saldoTot2 / 100 * 5;
        int saldoTot3 = saldoTot2 + saldoPerc3;
        System.out.println(saldoTot3);


    }
}
