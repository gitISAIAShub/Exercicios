package br.com.icm;
import java.util.Scanner;


public class NotasAluno {
    public static void notas(){
        Scanner s = new Scanner(System.in);

        System.out.print("Digite sua nota1: ");
        float nota1 = s.nextFloat();

        System.out.print("Digite sua nota2: ");
        float nota2 = s.nextFloat();

        System.out.print("Digite sua nota3: ");
        float nota3 = s.nextFloat();

        System.out.print("Digite sua nota4: ");
        float nota4 = s.nextFloat();

        float notaTotal = (nota1 + nota2 + nota3 + nota4) / 4;

        if (notaTotal > 10){
            System.out.print("A media das notas não pode ultrapassar 10 ");
        }else if (notaTotal >= 7){
            System.out.print("A média da suas notas são: " + notaTotal + " Você esta APROVADO");
        }else if (notaTotal >=5){
            System.out.print("A média da suas notas são: " + notaTotal + " Você está de RECUPERAÇÂO");
        }else {
            System.out.print("A média da suas notas são: " + notaTotal + " Você foi REPROVADO");
        }
    }
}
