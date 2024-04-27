package estruturadeDados;

import java.util.Stack;

public class EstruturadeDadosPilha {

	public static void main(String[] args) {
		// Trabalhando com pilha 
		
		Stack <String> nomes  = new Stack<String>();
		
		
		
nomes.push("Sara");//para incluir dado na pilha , mas posso colocar o .add tbm que dá certo
nomes.push("Paloma");
nomes.push("Vania");
nomes.push("Lucas");

System.out.println(nomes);
System.out.println(nomes.peek());//retorna o ultimo que foi colocado na lista
System.out.println(nomes.pop()); //remove o ultimo e mostra quem eu removi	
System.out.println(nomes);
nomes.remove("Paloma"); // remove o elemento que eu quero sem ser o ultimo, posso colocar o nome ou o indice
System.out.println(nomes);
	}
	

}
