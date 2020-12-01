package heapsort;

public class HeapSort {
	
	public static void ordem(Long[] c, int ini, int tam, String[] n, Integer[] ag, Long[] co, Double[] s){
		montaHeap( c, tam, n, ag, co, s);
		
		int num=tam;
		for(int i=tam -1; i >=0; i--) {
			long c_aux = c[i];
			String n_aux = n[i];
			int ag_aux = ag[i];
			long co_aux = co[i];
			double s_aux = s[i];
			
			c[i]=c[0];
			n[i]=n[0];
			ag[i]=ag[0];
			co[i]=co[0];
			s[i]=s[0];
			
			c[0]=c_aux;
			n[0]=n_aux;
			ag[0]=ag_aux;
			co[0]=co_aux;
			s[0]=s_aux;
			heapTree(c, 0, --num, n, ag, co, s);
		}
	}
	
	public static void montaHeap(Long[] c, int tam, String[] n, Integer[] ag, Long[] co, Double[] s) {
		
		//inicia-se  com o (tamanho do vetor -1) /2, /2 porque eh ordanado
		//metade para cada lado da raiz e -1 porque um dos elementos eh a raiz
		
		for(int i=(tam-1)/2; i>=0; i--){
			heapTree( c, i, tam, n, ag, co, s);
		}
	}
	
	
	public static void heapTree(Long[] c, int i, int tam, String[] n, Integer[] ag, Long[] co, Double[] s) {
		
		int j=2*i+1;
		int k=j+1;
		
		//Compara os filhos e ordena, se filho 1(j) < filho 2(k) filho 1
		//filho 2 passa a ser filho 1.
		
		if(j<tam && k<tam) {
				
			if(c[j]<c[k]) {
				j=k;
			}
			
			//Verifica se filho 1 eh maior que a raiz,
			//se for filho 1 vira raiz e raiz vira filho 1,
			//ao final ocorre a reccusividade.
			
			if(c[j]>c[i]) {
				
				long c_aux = c[j];
				String n_aux = n[j];
				int ag_aux = ag[j];
				long co_aux = co[j];
				double s_aux = s[j];
				
				c[j]=c[i];
				n[j]=n[i];
				ag[j]=ag[i];
				co[j]=co[i];
				s[j]=s[i];
				
				c[i]=c_aux;
				n[i]=n_aux;
				ag[i]=ag_aux;
				co[i]=co_aux;
				s[i]=s_aux;
				
					heapTree(c, j, tam, n, ag, co, s);
			}
		}
	}
}
