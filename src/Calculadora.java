import java.util.Scanner;

public class Calculadora {

    //Calculo ClT
    public static void CLT (double mensal,String nomeProfessor){
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe o valor do salario mensal:");
        mensal = teclado.nextDouble();


        double salarioCLT = mensal;

        
        System.out.printf("O nome do professor e %s %nO salario do professor e R$ %.2f",nomeProfessor, salarioCLT);
        teclado.close();
    }

    //Calculo Horista
    public static void Horista (double horasTrabalhadas,double valorHora,String nomeProfessor){
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe quantas horas você trabalhou:");
        horasTrabalhadas = teclado.nextDouble();

        
        
        System.out.println("Informe quanto você ganha por hora:");
        valorHora = teclado.nextDouble();


        double salarioHorista = horasTrabalhadas * valorHora;
        
       System.out.printf("O nome do professor e %s %nO salario do professor e R$ %.2f",nomeProfessor, salarioHorista);

        teclado.close();
    }
    
    //Calculo PJ
    public static void PJ (double contrato,String nomeProfessor){
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe o valor do contrato:");
        contrato = teclado.nextDouble();


        double salarioPJ = contrato;
       
        System.out.printf("O nome do professor e %s %nO salario do professor e R$ %.2f",nomeProfessor, salarioPJ);
        
        teclado.close();
    }



    //Primeira entrada
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Seja bem vindo!");
        System.out.println("Digite o seu nome:");

        String nomeProfessor = teclado.nextLine();

        System.out.println("Informe seu regime trabalhista:(1-CLT,2-Horista ou 3-PJ)?");

        int regimePagamento = teclado.nextInt();

        

        switch(regimePagamento){

            case 1: 
            CLT(regimePagamento, nomeProfessor);
            break;  

            case 2:
            Horista(regimePagamento, regimePagamento, nomeProfessor);
            break;

            case 3:
            PJ(regimePagamento, nomeProfessor);
            break;

            default:
            System.out.println("Regime de pagamento invalido. Reinicie o programa.");
            break;

        }
        
        
        teclado.close();
    }
}
