package Q;

public class QMain {

    public static void main(String[] args) {

        Telephone telephone = new Telephone("최현수");


        telephone.turnOn();
        telephone.turnOff();

        telephone.kind();

        Phone phone = telephone;
        phone.kind();

    }
}
