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
        switch(mes){
            case 1:
            case 2:
            case 3:
                //Saída
                if((mes == 3) && (dia >= 20)) {
                    System.out.println("É outono!!");    
                } else {
                    System.out.println("É verão!!"); 
                }
                break;
            case 4:
            case 5:
            case 6:
                //Saída
                if((mes == 6) && (dia >= 20)) {
                    System.out.println("É inverno!!");    
                } else {
                    System.out.println("É outono!!");
                }
                break;
            case 7:
            case 8:
            case 9:
                //Saída
                if((mes == 9) && (dia >= 22)) {
                    System.out.println("É primavera!!");    
                } else {
                    System.out.println("É inverno!!");
                }
                break;
            case 10:
            case 11:
            case 12:
                //Saída
                if((mes == 12) && (dia >= 21)) {
                    System.out.println("É primavera!!");    
                } else {
                    System.out.println("É primavera!!");
                }
                break;
            default:
                //Saída
                System.out.println("NÃO VALE NÃO É MÊS COLOCA OUTRO ESSE NÃO VALE");
        }

    }
}