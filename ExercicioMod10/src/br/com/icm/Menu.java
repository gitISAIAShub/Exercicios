package br.com.icm;
import java.util.Scanner;

public class Menu {
    public static void menuPrincipal() {
        Scanner s = new Scanner(System.in);

        int result;
        do {
            System.out.println("PROGRAMA NOTAS ALUNOS");
            System.out.println("1 - PARA VERIFICARA SUAS NOTAS");
            System.out.println("2 - PARA SAIR");
            System.out.print("=> INSIRA AQUI SUA OPÇÃO: ");
            result = s.nextInt();

        } while (result != 2 && result !=1);

        switch (result) {
            case 1:
                NotasAluno.notas();
                break;
            case 2:
                System.out.print("OBRIGADO!!!");
                break;
        }

    }
}
