import java.util.Scanner;

public class EstacoesAno {

    public static void main(String[] args) {
        //Declaração de variáveis
        int mes, dia;

        //Criação e instância do objeto de entrada
        Scanner entrada = new Scanner(System.in);

        //Apresentação
        System.out.println("\n\t\t\t -- Estação do Ano --\n");

        //Entradas 
        System.out.print("Informe o dia: ");
        dia = entrada.nextInt();
        System.out.print("Informe o mês: ");
        mes = entrada.nextInt();
        
        //Processamento
        if ((mes == 1) || (mes == 2) || (mes == 3)){
            //Saída
            if((mes == 3) && (dia >= 20)) {
                System.out.println("É outono!!");    
            } else {
                System.out.println("É verão!!"); 
            }

        } else if((mes == 4) || (mes == 5) || (mes == 6)){
            //Saída
            if((mes == 6) && (dia >= 20)) {
                System.out.println("É inverno!!");    
            } else {
                System.out.println("É outono!!");
            }

        } else if ((mes == 7) || (mes == 8) || (mes == 9)){
            //Saída
            if((mes == 9) && (dia >= 22)) {
                System.out.println("É primavera!!");    
            } else {
                System.out.println("É inverno!!");
            }

        } else if((mes == 10) || (mes == 11) || (mes == 12)){
            //Saída
            if((mes == 12) && (dia >= 21)) {
                System.out.println("É primavera!!");    
            } else {
                System.out.println("É primavera!!");
            }

        } else {
            System.out.println("NÃO VALE NÃO É MÊS COLOCA OUTRO ESSE NÃO VALE");
        }

    }
}