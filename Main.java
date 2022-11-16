import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	int[] num = {13, 12, 26, 27, 40};
	String[] filmes = {"Órfã 2: A Origem", "Adão Negro", "Sorria"};
	String[] meia = {"Estudante ou professor", "mais de 60 anos", "PCA e acompanhante"};
	String[] hora = {"15:40h", "17:10h", "19:20h", "16:40h", "18:10h", "20:20h", "19:10h", "21:30h"};
	String cliente;
	int poltrona=0, pagamento, cartao=0, ingresso, filme=0, horaExi=0, horaExi1=0, horaExi2=0, meiaEnt=0;
	float meiaEnt1, preco, credito=0, totalC=0;
	
	Scanner sc = new Scanner(System.in);
	    
	    System.out.println("-------BILHETERIA--------");
	    System.out.println(" ");
	    
	    System.out.println("Digite seu nome: ");
	    cliente= sc.nextLine();
	    System.out.println("  ");
	    
	    System.out.println("Escolha uma das opções abaixo para preço do ingresso: ");
	    System.out.println("1-Dia de semana");
	    System.out.println("2-Final de semana");
	    ingresso=sc.nextInt();
	    System.out.println("  ");
	    
	    if(ingresso==1){
	        System.out.println("O ingresso inteiro será no valor de R$12,00");
	        System.out.println("  ");
	        preco=12.00F;
	    }
	    else{
	        System.out.println("O ingresso inteiro será no valor de R$15,00");
	        System.out.println("  ");
	        preco=15.00F;
	    }
	    
	    
	    
	    while(poltrona!= 13 && poltrona!=12 && poltrona!=26 && poltrona!=27 && poltrona!=40){
        System.out.println("\nEscolha uma das poltronas disponiveis: "+num[0]+", "+num[1]+", "+num[2]+", "+num[3]+", "+num[4]);
	    poltrona=sc.nextInt();
	    System.out.println("  ");
	    
	    if(poltrona!= 13 && poltrona!=12 && poltrona!=26 && poltrona!=27 && poltrona!=40){
	        System.out.println("Poltrona indisponivel");
	        System.out.println("  ");
	    }}
	    
	    System.out.println("\n---------Filmes em exibição----------");
	    System.out.println("1-"+filmes[0]+"\n2-"+filmes[1]+"\n3-"+filmes[2]);
	    System.out.println("  ");
	    System.out.println("Escolha um dos filmes em exibição acima de acordo com o numero indicado: ");
	    filme=sc.nextInt();
	    
	   switch(filme){
	       
	       case 1:
	           System.out.println("-------Horarios disponiveis---------");
	           System.out.println("1-"+hora[0]+"\n2-"+hora[1]+"\n3-"+hora[2]);
	           System.out.println("  ");
	           System.out.println("Escolha um dos horarios disponiveis: ");
	           horaExi=sc.nextInt();
	           
	           System.out.println("Qual a forma de pagamento?: ");
	           System.out.println("1-Cartão");
	           System.out.println("2-Dinheiro");
	           pagamento=sc.nextInt();
	           
	           if(pagamento==1){
	               System.out.println("\n---------Cartão escolhido--------");
	               System.out.println("  ");
	               System.out.println("Escolha uma das opções abaixo:");
	               System.out.println("1-Crédito");
	               System.out.println("2-Débito");
	               cartao=sc.nextInt();
	               
	               if(cartao==1){
	                   System.out.println("\n---------Crédito escolhido--------");
	                   credito=(preco*3)/100;
	                   totalC=credito+preco;
	                   System.out.printf("Para crédito cobramos uma taxa de 3%% no valor de : R$%.2f\n", credito);
	                   System.out.println("\nPara meia entrada escolha uma das opções: ");
	                   System.out.println("1-"+meia[0]+"\n2-"+meia[1]+"\n3-"+meia[2]);
	                   System.out.println("4-Nenhuma das anteriores");
	                   meiaEnt=sc.nextInt();
	                   System.out.println("  ");
	                   
	                   if(meiaEnt==4){
	                       System.out.println("Não elegivel para Meia Entrada");
	                    }
	                   else if(meiaEnt>=5){
	                       System.out.println("Operação invalida\n");
	               }
	                   
	               }
	               else{
	                   System.out.println("\n---------Débito escolhido--------");
	                   System.out.println("\nPara meia entrada escolha uma das opções: ");
	                   System.out.println("1-"+meia[0]+"\n2-"+meia[1]+"\n3-"+meia[2]);
	                   System.out.println("4-Nenhuma das anteriores");
	                   meiaEnt=sc.nextInt();
	                   System.out.println("  ");
	                   
	                   if(meiaEnt==4){
	                       System.out.println("Não elegivel para Meia Entrada");
	                    }
	                   else if(meiaEnt>=5){
	                       System.out.println("Operação invalida\n");
	               }
	           }}
	           else{
	               System.out.println("\n---------Dinheiro escolhido--------");
	               System.out.println("\nPara meia entrada escolha uma das opções: ");
	               System.out.println("1-"+meia[0]+"\n2-"+meia[1]+"\n3-"+meia[2]);
	               System.out.println("4-Nenhuma das anteriores");
	               meiaEnt=sc.nextInt();
	               System.out.println("  ");
	                   
	               if(meiaEnt==4){
	                       System.out.println("Não elegivel para Meia Entrada");
	                    }
	                   else if(meiaEnt>=5){
	                       System.out.println("Operação invalida\n");
	               }
	           }
	           
	       break;
	       
	       case 2:
	           System.out.println("-------Horarios disponiveis---------");
	           System.out.println("1-"+hora[3]+"\n2-"+hora[4]+"\n3-"+hora[5]);
	           System.out.println("  ");
	           System.out.println("Escolha um dos horarios disponiveis: ");
	           horaExi1=sc.nextInt();
	           
	           System.out.println("Qual a forma de pagamento?: ");
	           System.out.println("1-Cartão");
	           System.out.println("2-Dinheiro");
	           pagamento=sc.nextInt();
	           
	           if(pagamento==1){
	               System.out.println("\n---------Cartão escolhido--------");
	               System.out.println("  ");
	               System.out.println("Escolha uma das opções abaixo:");
	               System.out.println("1-Crédito");
	               System.out.println("2-Débito");
	               cartao=sc.nextInt();
	               
	               if(cartao==1){
	                   System.out.println("\n---------Crédito escolhido--------");
	                   credito=(preco*3)/100;
	                   totalC=credito+preco;
	                   System.out.printf("Para crédito cobramos uma taxa de 3%% no valor de : R$%.2f\n", credito);
	                   System.out.println("\nPara meia entrada escolha uma das opções: ");
	                   System.out.println("1-"+meia[0]+"\n2-"+meia[1]+"\n3-"+meia[2]);
	                   System.out.println("4-Nenhuma das anteriores");
	                   meiaEnt=sc.nextInt();
	                   System.out.println("  ");
	                   
	                   if(meiaEnt==4){
	                       System.out.println("Não elegivel para Meia Entrada");
	                    }
	                   else if(meiaEnt>=5){
	                       System.out.println("Operação invalida\n");
	               }
	               }
	               else{
	                   System.out.println("\n---------Débito escolhido--------");
	                   System.out.println("\nPara meia entrada escolha uma das opções: ");
	                   System.out.println("1-"+meia[0]+"\n2-"+meia[1]+"\n3-"+meia[2]);
	                   System.out.println("4-Nenhuma das anteriores");
	                   meiaEnt=sc.nextInt();
	                   System.out.println("  ");
	                   
	                   if(meiaEnt==4){
	                       System.out.println("Não elegivel para Meia Entrada");
	                    }
	                   else if(meiaEnt>=5){
	                       System.out.println("Operação invalida\n");
	               }
	           }}
	           else{
	               System.out.println("\n---------Dinheiro escolhido--------");
	               System.out.println("\nPara meia entrada escolha uma das opções: ");
	               System.out.println("1-"+meia[0]+"\n2-"+meia[1]+"\n3-"+meia[2]);
	               System.out.println("4-Nenhuma das anteriores");
	               meiaEnt=sc.nextInt();
	               System.out.println("  ");
	                   
	               if(meiaEnt==4){
	                       System.out.println("Não elegivel para Meia Entrada");
	                    }
	                   else if(meiaEnt>=5){
	                       System.out.println("Operação invalida\n");
	               }
	           }
	       
	       break;
	       
	       case 3: 
	           System.out.println("-------Horarios disponiveis---------");
	           System.out.println("1-"+hora[6]+"\n2-"+hora[7]);
	           System.out.println("  ");
	           System.out.println("Escolha um dos horarios disponiveis: ");
	           horaExi2=sc.nextInt();
	           
	           System.out.println("Qual a forma de pagamento?: ");
	           System.out.println("1-Cartão");
	           System.out.println("2-Dinheiro");
	           pagamento=sc.nextInt();
	           
	           if(pagamento==1){
	               System.out.println("\n---------Cartão escolhido--------");
	               System.out.println("  ");
	               System.out.println("Escolha uma das opções abaixo:");
	               System.out.println("1-Crédito");
	               System.out.println("2-Débito");
	               cartao=sc.nextInt();
	               
	               if(cartao==1){
	                   System.out.println("\n---------Crédito escolhido--------");
	                   credito=(preco*3)/100;
	                   totalC=credito+preco;
	                   System.out.printf("Para crédito cobramos uma taxa de 3%% no valor de : R$%.2f\n", credito);
	                   System.out.println("\nPara meia entrada escolha uma das opções: ");
	                  System.out.println("1-"+meia[0]+"\n2-"+meia[1]+"\n3-"+meia[2]);
	                   System.out.println("4-Nenhuma das anteriores");
	                   meiaEnt=sc.nextInt();
	                   System.out.println("  ");
	                   
	                   if(meiaEnt==4){
	                       System.out.println("Não elegivel para Meia Entrada");
	                    }
	                   else if(meiaEnt>=5){
	                       System.out.println("Operação invalida\n");
	               }
	               }
	               else{
	                   System.out.println("\n---------Débito escolhido--------");
	                   System.out.println("\nPara meia entrada escolha uma das opções: ");
	                   System.out.println("1-"+meia[0]+"\n2-"+meia[1]+"\n3-"+meia[2]);
	                   System.out.println("4-Nenhuma das anteriores");
	                   meiaEnt=sc.nextInt();
	                   System.out.println("  ");
	                   
	                   if(meiaEnt==4){
	                       System.out.println("Não elegivel para Meia Entrada");
	                    }
	                   else if(meiaEnt>=5){
	                       System.out.println("Operação invalida\n");
	               }
	           }}
	           else{
	               System.out.println("\n---------Dinheiro escolhido--------");
	               System.out.println("\nPara meia entrada escolha uma das opções: ");
	               System.out.println("1-"+meia[0]+"\n2-"+meia[1]+"\n3-"+meia[2]);
	               System.out.println("4-Nenhuma das anteriores");
	               meiaEnt=sc.nextInt();
	               System.out.println("  ");
	                   
	               if(meiaEnt==4){
	                       System.out.println("Não elegivel para Meia Entrada");
	                    }
	                   else if(meiaEnt>=5){
	                       System.out.println("Operação invalida\n");
	               }
	               
	           }
	           
	       break;
	       
	       default: System.out.println("Você digitou uma operação inválida. \n Procure o adm do sistema!!");
	   }
	    System.out.println("  ");
	    System.out.println("\n-----------Ingresso------------\n");
	    System.out.printf("|Nome do cliente: %s\n", cliente);
	    System.out.printf("|Poltrona: %d\n", poltrona);
	    if(filme==1){System.out.printf("|Filme: %s\n", filmes[0]);}
	    if(filme==2){System.out.printf("|Filme: %s\n", filmes[1]);}
	    if(filme==3){System.out.printf("|Filme: %s\n", filmes[2]);}
	    if(horaExi==1)System.out.printf("|Hora da exibição: %s\n", hora[0]);
	    if(horaExi==2)System.out.printf("|Hora da exibição: %s\n", hora[1]);
	    if(horaExi==3)System.out.printf("|Hora da exibição: %s\n", hora[2]);
	    if(horaExi1==1)System.out.printf("|Hora da exibição: %s\n", hora[3]);
	    if(horaExi1==2)System.out.printf("|Hora da exibição: %s\n", hora[4]);
	    if(horaExi1==3)System.out.printf("|Hora da exibição: %s\n", hora[5]);
	    if(horaExi2==1)System.out.printf("|Hora da exibição: %s\n", hora[6]);
	    if(horaExi2==2)System.out.printf("|Hora da exibição: %s\n", hora[7]);
	    if(cartao==1){
	    if(meiaEnt==4){
	        
	        System.out.printf("|Preço: R$%.2f\n", totalC);
	    }
	    else if(meiaEnt<=3){
	       meiaEnt1=(preco/2)+credito;
	       System.out.printf("|Preço: R$%.2f\n", meiaEnt1);
	               }
	    }
	    else{
	        if(meiaEnt==4){
	        System.out.printf("|Preço: R$%.2f\n", preco);
	    }
	    else if(meiaEnt<=3){
	       meiaEnt1=preco/2;
	       System.out.printf("|Preço: R$%.2f\n", meiaEnt1);
	               }
	    }
	    if(meiaEnt==4){
	        System.out.println("|  ");
	        System.out.println("\n|        Entrada Inteira");
	    }
	    else if(meiaEnt<=3){
	        System.out.println("|  ");
	        System.out.println("\n|        Meia Entrada");
	        if(meiaEnt==1)System.out.printf("|    %s\n", meia[0]);
	        if(meiaEnt==2)System.out.printf("|    %s\n", meia[1]);
	        if(meiaEnt==3)System.out.printf("|    %s\n", meia[2]);
	    }
	    
	    
	}
    
}



