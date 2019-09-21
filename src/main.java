import java.util.ArrayList;
import java.util.List;

public class main {
	public static void main(String[] args) {
		
		List<pessoa> nomes = new ArrayList<>();
		List<String> ListaAux = new ArrayList<>();
		List<pessoa> ListaFinal = new ArrayList<>();
		
		pessoa rafael = new pessoa();
		rafael.nome = "rafael";
		rafael.idade = 19;
		
		pessoa giovana = new pessoa();
		giovana.nome = "giovana";
		giovana.idade = 19;
		
		pessoa jailson = new pessoa();
		jailson.nome = "rafael";
		jailson.idade = 35;
		
		pessoa fernanda = new pessoa();
		fernanda.nome = "rafael";
		fernanda.idade = 666;
		
		nomes.add(rafael);
		nomes.add(giovana);
		nomes.add(jailson);
		nomes.add(fernanda);
		
		System.out.println(nomes);
		
		for (pessoa nome: nomes) {
			if (ListaFinal.indexOf(nome.nome) == -1) {
				ListaAux.add(nome.nome);
				ListaFinal.add(nome);
			}
		}
		
		System.out.println(nomes);
		System.out.println(ListaAux);
		System.out.println(ListaFinal);
		
	}
}
