package clearminds.cuentas.test;

import clearminds.cuentas.Cuenta;

public class TestCuenta {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("03476");
        cuenta1.setSaldo(675);

        Cuenta cuenta2 = new Cuenta("03476", "C", 98);

        Cuenta cuenta3 = new Cuenta("03476");
        cuenta3.setTipo("C");

        System.out.println("-......--Valores Iniciales-----.----");
        cuenta1.imprimir();
        cuenta2.imprimir();
        cuenta3.imprimir();

        cuenta1.setSaldo(444);
        cuenta3.setSaldo(567);
        cuenta2.setTipo("D");

        System.out.println("--.---Valores modificados---------");
        cuenta1.imprimir();
        cuenta2.imprimir();
        cuenta3.imprimir();

        Cuenta cuenta4 = new Cuenta("0987");
        cuenta4.setSaldo(10);

        Cuenta cuenta5 = new Cuenta("0557", "C", 10);

        Cuenta cuenta6 = new Cuenta("0666");

        cuenta4.imprimirConMiEstilo();
        cuenta5.imprimirConMiEstilo();
        cuenta6.imprimirConMiEstilo();
    }
}