package br.com.codenation;


import java.util.Arrays;

public class StatisticUtil {

	public static int average(int[] elements) {

        if(elements.length == 0) {
            throw new IllegalArgumentException("Listagem vazia!");
        }

        Arrays.sort(elements);

		int soma = 0;

//		for (int i = 0; i < elements.length; i++) {
//			soma += elements[i];
//		}

		for (int valores : elements) {
			soma += valores;
		}

		return soma / elements.length;
	}

	public static int mode(int[] elements) {

        if(elements.length == 0) {
            throw new IllegalArgumentException("Listagem vazia!");
        }

        Arrays.sort(elements);

        int valorMax = 0; //valor com mais ocorrencias
        int contMax = 0;

        for (int i = 0; i < elements.length; ++i) {
            int cont = 0;
            for (int j = 0; j < elements.length; ++j) {
                if (elements[j] == elements[i]) {
                    ++cont;
                }
            }
            if (cont > contMax) {
                contMax = cont;
                valorMax = elements[i];
            }
        }

        return valorMax;
	}

	public static int median(int[] elements) {

        if(elements.length == 0) {
            throw new IllegalArgumentException("Listagem vazia!");
        }

        Arrays.sort(elements);

        int valorCentral = elements.length / 2;

        if (elements.length%2 == 1) {
            //Se tiver numero impar de elementos localiza o valor central
            return elements[valorCentral];
        } else {
            //Se tiver numero par de elementos, calcula a media entre os 2 numeros "centrais"
            return (elements[valorCentral-1] + elements[valorCentral]) / 2;
        }
	}
}