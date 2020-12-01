package mainheapsort;
import heapsort.HeapSort;
import java.io.*;
import java.util.ArrayList;


public class mainHeapSort {

	public static void main(String[] args) {

				//listas para guardar os dados separadamente
				ArrayList<Long> cpf = new ArrayList<Long>();
				ArrayList<String> nome = new ArrayList<String>();
				ArrayList<Integer> agencia = new ArrayList<Integer>();
				ArrayList<Long> conta = new ArrayList<Long>();
				ArrayList<Double> saldo = new ArrayList<Double>();

				//Leitura do arquivo
				try {
					BufferedReader leitor = new BufferedReader(
							new FileReader("arqvs/conta500alea.txt"));

					String linha = leitor.readLine();
					while (linha != null) {

						String guardarDados[] = linha.split(";");

						cpf.add(Long.parseLong(guardarDados[0]));			
						nome.add(guardarDados[1]);
						agencia.add(Integer.parseInt(guardarDados[2]));
						conta.add(Long.parseLong(guardarDados[3]));
						saldo.add(Double.parseDouble(guardarDados[4]));

						linha = leitor.readLine();
					}
					leitor.close();            

				} catch (FileNotFoundException ex) {
					System.out.println(ex);
				} catch (IOException ex) {
					System.out.println(ex);
				}catch (NumberFormatException ex) {
					System.out.println(ex);
				}

				//Ordenacao por cpf
				//Quicksort com vetor
				//Cria um vetor e passar os dados da lista para ele.

				//cpf
				Long[] c = new Long[cpf.size()];
				//nome
				String[] n = new String[cpf.size()];
				//agencia
				Integer[] ag = new Integer[cpf.size()];
				//conta
				Long[] co = new Long[cpf.size()];
				//saldo
				Double[] s = new Double[cpf.size()];
				
				for(int i=0; i<cpf.size(); i++){
					c[i] = cpf.get(i).longValue();
					n[i] = nome.get(i);
					ag[i] = agencia.get(i).intValue();
					co[i] = conta.get(i).longValue();
					s[i] = saldo.get(i).doubleValue();			
				}
				
				heapsort.HeapSort.ordem(c, 0, cpf.size(), n, ag, co, s);
				
				for(int i=0; i<cpf.size(); i++){
					System.out.println(c[i] + ";" + n[i] + ";" + ag[i] + ";" + co[i] + ";" + s[i]);
				}
				



	}

}
