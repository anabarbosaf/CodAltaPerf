package Lista;

public class Lista {

	public static void main(String[] args) {
		
		NoLista lista = new NoLista();
		lista.dado = 1;
		lista.prox = null;
		System.out.println("lista" + lista);
		
		NoLista novo = new NoLista();
		novo.dado = 2;
		novo.prox = null;
		System.out.println("novo" + novo);
		lista.prox = novo;
		
		NoLista novo2 = new NoLista();
		novo2.dado = 3;
		novo2.prox = lista;
		System.out.println("novo2" + novo2);
		
		System.out.println("\n APRESENTACAO DOS NOS");
		
		NoLista aux = novo2;
		while (aux != null) {
		System.out.println(aux);
		System.out.println("dado: " + aux.dado);
		System.out.println("\t prox: " + aux.prox);
		aux = aux.prox;
		}
	}

}
