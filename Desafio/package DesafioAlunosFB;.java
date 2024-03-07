package DesafioAlunosFB;


import java.util.Locale;
import java.util.Scanner;


public class AlunosFB {


    public static void main(String[] args) {
       
        Locale.setDefault(Locale.US);
       
        Scanner leia = new Scanner(System.in);
       
        int opcao;
        char op = ' ';
        int chamada;
        double media;
       


        String[] Codigo = {"3278", "3277", "3317", "3274", "3269", "3316", "3272", "3319", "3266", "3332", "3330", "3262", "3275", "3280", "3337", "3263", "3281", "3339", "3264", "3340", "3321", "3276", "3318", "3268", "3282", "3343", "3258"};
        String[] Numero = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27"};                            
        String[] Alunos = {"André de Castro Cruz", "André Henrique Marfin Ferreira", "Daniel P. dos Santos Silva", "Danilo Rezende da Silva", "Gabriel dos Anjos Correia da Silva", "Gabriel Marinho Guimarães", "Giovanna de Oliveira Scaglione", "Guilherme Adonario dos Santos", "Gustavo Henrique Torres e Silva", "Isabelle Cristina Dias Soares", "João Felipe Sena Nascimento", "João Pedro Mota Melára", "João Victor Alves Messias", "João Victor Bueno Ramalho", "João Vitor Rodrigues Martinez", "Jonatas Ferreira da Silva Pereira", "Júlio Henrique Scalete dos Santos", "Marcus Nunes de Campos", "Mateus Nezzi Ribeiro", "Matheus Nunes de Campos", "Moises Alves Bonfin", "Paulo Silas da Silva Santos", "Renato da Graça Silva", "Rodrigo de Andrade Montanholli", "Tiago de Lima Penaforte", "Vinícius Souza Santos", "Vitor Cruz dos Santos"};
        int[] Faltas = new int[Codigo.length];
        Double[] Nota1 = new Double[Codigo.length];
        Double[] Nota2 = new Double[Codigo.length];
       
        System.out.println("Deseja realizar uma operação? S/N ");
        op = leia.next().toUpperCase().charAt(0);
       
        if(op == 'N') {
            System.out.println("Obrigado por me usar!");
        }
        else {
            for(int y=1; y<50; y++) {
                System.out.print("-"); //LINHA DE SEPARAÇÃO
            }


            System.out.println(); //PULA LINHA
            System.out.println("CODIGO\tNUM\tNOME");
            System.out.println(); //PULA LINHA
           
            for(int i=0; i<27; i++) {
                System.out.println(Codigo[i] + "\t" + Numero[i] + "\t" + Alunos[i]);
            }
           
            for(int y=1; y<50; y++) {
                System.out.print("-"); //LINHA DE SEPARAÇÃO
            }
           
            while(op != 'N' ) {
           
                System.out.println(); //PULA LINHA
                System.out.println(); //PULA LINHA
               
                System.out.println("Informe o numero da chamada do aluno: ");
                chamada = leia.nextInt();
               
                while(chamada<1 || chamada>27){
                   
                    System.out.println("Insira um número válido: ");
                    chamada = leia.nextInt();      
                   
                }
                    System.out.println(); //PULA LINHA
                    for(int y=1; y<50; y++) {
                        System.out.print("-"); //LINHA DE SEPARAÇÃO
                    }
               
                    System.out.println(); //PULA LINHA
                    System.out.println("CODIGO\tNUM\tNOME");
                    System.out.println(Codigo[chamada-1] + "\t" + Numero[chamada-1] + "\t" + Alunos[chamada-1]);
                   
                    for(int y=1; y<50; y++) {
                        System.out.print("-"); //LINHA DE SEPARAÇÃO
                    }
                    System.out.println(); //PULA LINHA
                   
                    System.out.println(); //PULA LINHA
                    System.out.println("O que deseja fazer? ");
                    System.out.println("1- Atribuir Nota 1\t 2-Atruibuir Nota2\t 3- Adicionar Faltas");
                   
                    opcao = leia.nextInt();
                   
                    if(opcao == 1) {
                       
                        System.out.println(); //PULA LINHA
                        System.out.println("NOTA PARA A PROVA 1");
                       
                        System.out.println("Insira a nota para a prova 1: ");
                        Nota1[chamada-1] = leia.nextDouble();      
                       
                    }else if(opcao == 2){
                       
                        System.out.println(); //PULA LINHA
                        System.out.println("NOTA PARA A PROVA 2");
                       
                        System.out.println("Insira a nota para a prova 2: ");
                        Nota2[chamada-1] = leia.nextDouble();
                       
                    }else if(opcao == 3) {
                       
                        System.out.println(); //PULA LINHA
                        System.out.println("ADICIONAR FALTAS");
                       
                        System.out.println("Insira a quantidade de faltas:  ");
                        Faltas[chamada-1] = leia.nextInt();
                       
                    }


                System.out.println("Deseja realizar outra operação? S/N ");
                op = leia.next().toUpperCase().charAt(0);
            }
       
            System.out.println(); //PULA LINHA
           
            for(int y=1; y<50; y++) {
                System.out.print("-"); //LINHA DE SEPARAÇÃO
            }
           
            System.out.println(); //PULA LINHA
            System.out.println("\t\tBOLETIM"); //mostrar boletim do grupo L!NES
           
            for(int y=1; y<50; y++) {
                System.out.print("-"); //LINHA DE SEPARAÇÃO
            }
           
            System.out.println(); //PULA LINHA
            System.out.println("MEDIA\tFALTAS\tSITUACAO\tNOME");
           
            for(int j=0; j<Codigo.length; j++) {
                if(Nota1[j] != null && Nota2[j] != null) {
                   
                    media =(Nota1[j] + Nota2[j])/2;
                   
                    if(Faltas[j]>=40) {
                        System.out.printf("%.1f\t%d\tREC (F)  \t%s",media, Faltas[j], Alunos[j]);
                        System.out.println();//PULA LINHA
                    }else if(media<6) {
                        System.out.printf("%.1f\t%d\tREC (N)  \t%s",media, Faltas[j], Alunos[j]);
                        System.out.println();//PULA LINHA
                    }else if(media>6) {
                        System.out.printf("%.1f\t%d\tAPROVADO\t%s",media, Faltas[j], Alunos[j]);
                        System.out.println();//PULA LINHA
                    }          
                   
                }
            }
           
           
        }
    }
}
