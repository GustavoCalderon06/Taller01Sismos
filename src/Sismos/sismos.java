package Sismos;

import java.util.*;

public class sismos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        mostrarMenu();
        menu();
    }

    private static void opcion(int x) {
        Scanner teclado = new Scanner(System.in);
        x = teclado.nextInt();
    }

    private static void mostrarMenu() {
        System.out.println("1-Ingresar datos");
        System.out.println("2-Mostrar sismo de mayor magnitud");
        System.out.println("3-Contar sismos mayores o iguales a 5.0");
        System.out.println("4-Enviar SMS por cada sismo mayor o igual a 7.0");
        System.out.println("5-Salir (S/N)");

    }


    public static void menu() {
        switch (Validar(5)) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                salir();


                break;

        }
    }

    public static void salir() {
        int n = -1;
        do {
            menu();
            System.out.println("Quiere hacer otra operacion?\n1.-Si \n2.-No");
            n = Validar(2);
        } while (n == 1);

    }

    public static int Validar(int x) {
        int n = -1;
        do {
            Scanner teclado = new Scanner(System.in);
            try {
                n = teclado.nextInt();
            } catch (Exception e) {
                System.out.println("Error");
            }
            if (n < 0 || n > x) {
                System.out.println("ingrese un numero valido");
            }
        } while (n < 0 || n > x);
        return n;
    }

}


