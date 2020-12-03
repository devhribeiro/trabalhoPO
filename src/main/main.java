package main;

import java.io.*;
import java.util.*;

import heapsort.HeapSort;
import trab01.Paciente;

public class main {

	public static void main(String[] args) {
		int algoritimo = 0;
		int tipo = 0;
		Scanner ler = new Scanner(System.in);

		// Bom eu inseri o q fiz até agora de quicksort
		// Larissa

		System.out.print("Algoritimos\nHeapSort - 1\nQuickSort - 2\n");

		System.out.print("Qual Algoritimo deseja executar: ");
		algoritimo = ler.nextInt();

		if (algoritimo == 1) {
			System.out.print("Conta - 1, CPF - 2, Agencia - 3: ");
			tipo = ler.nextInt();

			HeapSort(tipo);
		}

		/////////////////////////////////////////////////////////////
		// Quicksort
		if (algoritimo == 2) {
			System.out.println("Qual arquivo a ser utilizado (/arqvs) ?)");
			System.out.print(
					"1 - 500 registros aleatorios \n2 - 1000 registros aleatorios\n3 - 5000 registros aleatorios\n4 - 10000 registros aleatorios\n5 - 50000 registros aleatorios\n");
			System.out.print(
					"6 - 500 registros ordenados \n7 - 1000 registros ordenados\n8 - 5000 registros ordenados\n9 - 10000 registros ordenados\n10 - 50000 registros ordenados\n");
			System.out.print(
					"11 - 500 registros invertidos \n12 - 1000 registros invertidos\n13 - 5000 registros invertidos\n14 - 10000 registros invertidos\n15 - 50000 registros invertidos\n");
			System.out.print("16 - Sair\n");
			System.out.print("Digite a opcao :");
	
			
		     tipo = ler.nextInt();
		     String entrada, saida;
		     switch(tipo){
		         case 1:
		        	 entrada = "arqvs/conta500alea.txt";
		        	 saida = "result/QuickAlea500.txt";
		        	 QuickSort(entrada,saida);
		             break;                     
		         case 2:
		        	 entrada = "arqvs/conta1000alea.txt";
		        	 saida = "result/QuickAlea1000.txt";
		        	 QuickSort(entrada,saida);
			         break;
		         case 3:
		        	 entrada = "arqvs/conta5000alea.txt";
		        	 saida = "result/QuickAlea5000.txt";
		        	 QuickSort(entrada,saida);
		              break;
		         case 4:
		        	 entrada = "arqvs/conta10000alea.txt";
		        	 saida = "result/QuickAlea10000.txt";
		        	 QuickSort(entrada,saida);
		        	 break;
		         case 5:
		        	 entrada = "arqvs/conta50000alea.txt";
		        	 saida = "result/QuickAlea50000.txt";
		        	 QuickSort(entrada,saida);
		        	 break;
		         case 6:
		        	 entrada = "arqvs/conta500ord.txt";
		        	 saida = "result/QuickOrd500.txt";
		        	 QuickSort(entrada,saida);
		             break;                     
		         case 7:
		        	 entrada = "arqvs/conta1000ord.txt";
		        	 saida = "result/QuickOrd1000.txt";
		        	 QuickSort(entrada,saida);
			         break;
		         case 8:
		        	 entrada = "arqvs/conta5000ord.txt";
		        	 saida = "result/QuickOrd5000.txt";
		        	 QuickSort(entrada,saida);
		              break;
		         case 9:
		        	 entrada = "arqvs/conta10000ord.txt";
		        	 saida = "result/QuickOrd10000.txt";
		        	 QuickSort(entrada,saida);
		        	 break;
		         case 10:
		        	 entrada = "arqvs/conta50000ord.txt";
		        	 saida = "result/QuickOrd50000.txt";
		        	 QuickSort(entrada,saida);
		        	 break;
		         case 11:
		        	 entrada = "arqvs/conta500inv.txt";
		        	 saida = "result/QuickInv500.txt";
		        	 QuickSort(entrada,saida);
		             break;                     
		         case 12:
		        	 entrada = "arqvs/conta1000inv.txt";
		        	 saida = "result/QuickInv1000.txt";
		        	 QuickSort(entrada,saida);
			         break;
		         case 13:
		        	 entrada = "arqvs/conta5000inv.txt";
		        	 saida = "result/QuickInv5000.txt";
		        	 QuickSort(entrada,saida);
		              break;
		         case 14:
		        	 entrada = "arqvs/conta10000inv.txt";
		        	 saida = "result/QuickInv10000.txt";
		        	 QuickSort(entrada,saida);
		        	 break;
		         case 15:
		        	 entrada = "arqvs/conta50000inv.txt";
		        	 saida = "result/QuickInv50000.txt";
		        	 QuickSort(entrada,saida);
		        	 break;
		     }
		 }while(tipo!=16);

		}
	

	public static void HeapSort(int tipo) {
		Scanner ler = new Scanner(System.in);
		String[][] lido = LerArquivos();

		long[] result = new long[lido.length];

		for (int i = 0; i < lido.length; i++) {
			result[i] = Long.parseLong(lido[i][tipo]);
			// System.out.print(Integer.parseInt(lido[i][2]) + " ");
		}

		// int[] vet = {32,84,12,43,21,11,90,22,44,45};

		System.out.print("Lista: ");

		for (long i : result) {
			System.out.print(i + " ");

		}
		System.out.println();

		HeapSort.ordem(result);

		System.out.print("Lista ordenada: ");
		for (long i : result) {
			System.out.print(i + " ");
		}

		System.out.print("\n\n\n");

		System.out.print("Deseja ver os dados ordenados: Não - 0, Sim - 1: ");
		int mostrar = ler.nextInt();

		if (mostrar == 1) {
			System.out.print("\n\n\n");
			for (int i = 0; i < lido.length; i++) {
				for (int k = 0; k < result.length; k++) {
					if (Long.parseLong(lido[k][tipo]) == result[i]) {
						System.out.println(
								lido[k][5] + " " + lido[k][4] + " " + lido[k][3] + " " + lido[k][2] + " " + lido[k][1]);
					}
				}
			}
		}

	}

	public static String[][] LerArquivos() {

		String arquivoCSV = "arqvs/conta500alea.txt";
		BufferedReader br = null;
		String linha = "";
		String csvDivisor = ";";
		int x = 0;

		try {

			File arquivoLeitura = new File(arquivoCSV);
			LineNumberReader linhaLeitura = new LineNumberReader(new FileReader(arquivoLeitura));
			linhaLeitura.skip(arquivoLeitura.length());
			int qtdLinha = linhaLeitura.getLineNumber();

			String[][] line = new String[qtdLinha][6];
			// System.out.println(qtdLinha);

			br = new BufferedReader(new FileReader(arquivoCSV));
			while ((linha = br.readLine()) != null) {

				String[] conta = linha.split(csvDivisor);

				/**
				 * System.out.println("Conta \n\nCPF: " + conta[conta.length-5] + " \nNome: " +
				 * conta[conta.length-4] + " \nAgencia: " + conta[conta.length-3] + " \nConta: "
				 * + conta[conta.length-2] + " \nSaldo: R$ " + conta[conta.length-1] + "\n");
				 **/

				for (int i = 5; 1 <= i; i--) {
					line[x][i] = conta[conta.length - i];
				}

				// System.out.println(line[x][5] + " " + line[x][4] + " " + line[x][3] + " " +
				// line[x][2] + " " + line[x][1]);

				x++;
			}

			return line;

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}

	//QuickSort
	public static void QuickSort(String entrada, String saida) {
		// listas para guardar os dados separadamente
		ArrayList<Long> cpf = new ArrayList<Long>();
		ArrayList<String> nome = new ArrayList<String>();
		ArrayList<Integer> agencia = new ArrayList<Integer>();
		ArrayList<Long> conta = new ArrayList<Long>();
		ArrayList<Double> saldo = new ArrayList<Double>();

		// Leitura do arquivo
		try {
			BufferedReader leitor = new BufferedReader(new FileReader(entrada));

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
		} catch (NumberFormatException ex) {
			System.out.println(ex);
		}

		// Ordenacao por cpf
		// Quicksort com vetor
		// Cria um vetor e passar os dados da lista para ele.

		// cpf
		Long[] c = new Long[cpf.size()];
		// nome
		String[] n = new String[cpf.size()];
		// agencia
		Integer[] ag = new Integer[cpf.size()];
		// conta
		Long[] co = new Long[cpf.size()];
		// saldo
		Double[] s = new Double[cpf.size()];

		for (int i = 0; i < cpf.size(); i++) {
			c[i] = cpf.get(i).longValue();
			n[i] = nome.get(i);
			ag[i] = agencia.get(i).intValue();
			co[i] = conta.get(i).longValue();
			s[i] = saldo.get(i).doubleValue();
		}

		// Inicia a contagem de tempo
		long tempoInicial = System.currentTimeMillis();

		// Vetores carregados passar para o quicksort
		// c,0,cpf.size,n,ag,co,s
		quick.quick.quick_sort(c, 0, cpf.size(), n, ag, co, s);

		// Os vetores c e n estao ordenados pelo valor de c(cpf)
		// Agora é só imprimir

		// Imprime no console
		// for(int i=0; i<cpf.size(); i++){
		// System.out.println(c[i] + ";" + n[i] + ";" + ag[i] + ";" + co[i] + ";" +
		// s[i]);
		// }

		// Gravacao do novo arquivo
		try {
			// Creates a FileWriter
			FileWriter file = new FileWriter(saida);

			// Creates a BufferedWriter
			BufferedWriter output = new BufferedWriter(file);

			// Writes the string to the file
			for (int i = 0; i < cpf.size(); i++) {
				output.write(c[i] + ";" + n[i] + ";" + ag[i] + ";" + co[i] + ";" + s[i] + "\n");
			}
			// Flushes data to the destination
			System.out.println("Data is send to file in /result.");

			// Closes the writer
			output.close();
		}

		catch (Exception e) {
			e.getStackTrace();
		}

		// Finaliza a contagem de tempo
		long tempoFinal = System.currentTimeMillis();
		System.out.println();
		System.out.println("Executado em = " + (tempoFinal - tempoInicial) + " ms");
	}
}
