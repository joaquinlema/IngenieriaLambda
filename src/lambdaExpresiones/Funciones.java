package lambdaExpresiones;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class Funciones {
	
	public static int maximo(List<Integer> lista){
		if(lista.isEmpty()) return 0;
		
		int max = lista.get(0);
		for(int elem :  lista){
			if(elem > max) max = elem;
		}
		return max;
	}
	
	public static int minimo(List<Integer> lista){
		if(lista.isEmpty()) return 0;
		
		int min = lista.get(0);
		for(int elem :  lista){
			if(elem < min) min = elem;
		}
		return min;
	}
	
	public static int operar(BiFunction<Integer,Integer, Boolean> operacion,List<Integer> lista){
		if(lista.isEmpty()) return 0;
		
		int max = lista.get(0);
		for(int elem :  lista){
			if(operacion.apply(elem,max)) max = elem;
		}
		return max;
	}
	
	public static int max(List<Integer> lista){
		return operar((elem,max)-> elem > max , lista);
	}
	
	public static int min(List<Integer> lista){
		return operar((elem,elem2)-> elem < elem2 , lista);
	}
	
	public static List<Integer> duplicar(List<Integer> lista){
		List<Integer> resul = new ArrayList<>();
		
		for(int elem : lista)
			resul.add(elem*2);
		
		return resul; 
	}
	
	public static List<Integer> dup(Function<Integer, Integer> operacion,List<Integer> lista){
		List<Integer> resul = new ArrayList<>();
		
		for(int elem : lista)
			resul.add(operacion.apply(elem));
		
		return resul; 
	}
	
	public static List<Integer> duplicElemLista(List<Integer> lista){
		return dup(elem -> elem * 2, lista);
	}
	
	public static List<Integer> sumarElemLista(List<Integer> lista){
		return dup(elem -> elem + 1, lista);
	}

	public static List<Integer> damePares(Predicate<Integer> operacion,List<Integer> lista){
		List<Integer> resul = new ArrayList<>();
		for (int elem : lista) {
			if (operacion.test(elem))
				resul.add(elem);
		}
		return resul;
	}
	
	public static List<Integer> pares(List<Integer> lista){
		return damePares(elem -> elem % 2 == 0, lista);
	}
	
	public static List<Integer> mayores(List<Integer> lista){
		return damePares(elem -> elem >= 5, lista);
	}

	public static int sumar(List<Integer> lista){
		int resultado = 0;
		
		for (Integer elem : lista) {
			resultado = resultado + elem;
		}
		
		return resultado;
	}
	
	public static int multiplicar(List<Integer> lista){
		int resultado = 1;
		
		for (Integer elem : lista) {
			resultado = resultado * elem;
		}
		
		return resultado;
	}
	
	public static int multireduce(List<Integer> lista){
		return lista.stream().reduce(1,(elem,elem2) -> elem * elem2);
	}
	
	public static int sumareduce(List<Integer> lista){
		return lista.stream().reduce(0,(elem,elem2) -> elem + elem2);
	}
	
	public static int operacionesLambda(List<Integer> lista){
		return lista.stream().map(elem -> elem + 4).filter(elem -> elem > 7).reduce(0,(elem,elem2) -> elem + elem2);
	}
}