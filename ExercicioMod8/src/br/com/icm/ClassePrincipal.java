package br.com.icm;

public class ClassePrincipal {

    public static void main(String args[]){
        calculoNotas();

    }

    private static void calculoNotas() {
        int nota1 = 10;
        int nota2 = 20;
        int nota3 = 30;
        int nota4 = 40;

        int nota5 = (nota1 + nota2 + nota3 + nota4) / 2;

        System.out.println("A media das notas e igual a:" + nota5);
    }
}
