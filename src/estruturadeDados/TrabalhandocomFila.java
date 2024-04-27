package estruturadeDados;

import java.util.LinkedList;
import java.util.Queue;

public class TrabalhandocomFila {

	public static void main(String[] args) {
		// Trabalhando com fila 
		
		Queue<Integer> fila = new LinkedList <Integer>(); //tenho que importar o queue java util e o linkeList java util
		
		fila.add(5); // estou sempre adicionando no final da fila
		fila.add(10);
		fila.add(2);
		fila.add(6);
		fila.add(7);
		System.out.println(fila);
		
		fila.remove(10); //nesse caso eu consigo remover qualquer elemento que estiver na fila , inclusive o último , caso tenha dado algum erro eu consigo arrumar
		
		System.out.println(fila.peek());//ele vai ixibir o primeiro elemento sem remover , e para mostrar , eu preciso colocar dentro do syso, senão não aparece		System.out.println(fila);
		
		fila.poll();
		System.out.println(fila);

	}

}
