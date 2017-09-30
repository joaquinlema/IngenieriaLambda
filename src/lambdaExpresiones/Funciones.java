package lambdaExpresiones;

import java.util.List;
import java.util.function.BiFunction;

public class Funciones {
	
	public static int maximo(List<Integer> lista){
		int max = lista.get(0);
		for(int elem :  lista){
			if(elem > max) max = elem;
		}
		return max;
	}
	
	public static int minimo(List<Integer> lista){
		int min = lista.get(0);
		for(int elem :  lista){
			if(elem < min) min = elem;
		}
		return min;
	}
	
	public static int operar(BiFunction<Integer,Integer, Boolean> operacion,List<Integer> lista){
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
}
