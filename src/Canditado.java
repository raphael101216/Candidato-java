import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Canditado {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		char viajar, cnh;
		int escolaridade, pontosEscola, pontosExperie, anosExperie;
		
		
		
		System.out.println("Qual sua escolaridade?");
		System.out.println("1) Ensino Fundamental");
		System.out.println("2) Ensino Médio");
		System.out.println("3) Ensino Superior");
		System.out.println("4) Pós-graduação");
		System.out.print("Digite uma opção: ");
		escolaridade = sc.nextInt();
		
		System.out.println();
		System.out.print("Você tem quantos anos de experiência profissional?");
		anosExperie = sc.nextInt();
		System.out.print("Você tem disponibilidade para viajar (S/N)?");
		viajar = sc.next().charAt(0);
		System.out.print("Você tem habilitação de motorista (S/N)?");
		cnh = sc.next().charAt(0);
		

	}

}
