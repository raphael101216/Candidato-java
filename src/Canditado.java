import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Canditado {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		char viajar, cnh;
		int escolaridade, pontosEscola = 0, pontosExperie = 0, anosExperie;
		
		
		
		System.out.println("Qual sua escolaridade?");
		System.out.println("1) Ensino Fundamental");
		System.out.println("2) Ensino M�dio");
		System.out.println("3) Ensino Superior");
		System.out.println("4) P�s-gradua��o");
		System.out.print("Digite uma op��o: ");
		escolaridade = sc.nextInt();
		
		System.out.println();
		System.out.print("Voc� tem quantos anos de experi�ncia profissional?");
		anosExperie = sc.nextInt();
		System.out.print("Voc� tem disponibilidade para viajar (S/N)?");
		viajar = sc.next().charAt(0);
		System.out.print("Voc� tem habilita��o de motorista (S/N)?");
		cnh = sc.next().charAt(0);
		
		if(escolaridade == 1) {
			pontosEscola =+  10;
		 
		  }
		   else if(escolaridade == 2) {
			  pontosEscola =+  20;
		  }
		   else if(escolaridade == 3) {
			  pontosEscola =+ 30;
		  }
		   else if(escolaridade == 4) {
				  pontosEscola =+  40;
		  }
		  System.out.println();
		  System.out.println("Pontos por escolaridade: " + pontosEscola);
		 
		 if(anosExperie < 0) {
			 pontosExperie =+ 0;
			 
		 }else if(anosExperie > 0 && anosExperie <= 2) {
			 pontosExperie =+ 10;
			 
		 }else if(anosExperie > 2 && anosExperie <= 5) {
			 pontosExperie =+ 20;
		 }else if (anosExperie > 5) {
			 pontosExperie =+ 40;
		 }
		  
		 if(pontosExperie == 0) {
			 System.out.println("Sem experi�ncia");
		 }
		 
		 System.out.println("Pontos por experi�ncia: " + pontosExperie);
 
	}

}
