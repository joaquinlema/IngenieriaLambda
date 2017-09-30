package lambdaExpresiones.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import lambdaExpresiones.Funciones;

public class TestLambda {
	List<Integer> miLista = new ArrayList<>();
	
	@Before
	public void iniciar(){
		miLista.add(1);
		miLista.add(3);
		miLista.add(9);
		miLista.add(5);
	}
	
	@Test
	public void testMaximo() {
		assertEquals(Funciones.maximo(miLista),9 );
	}
	
	@Test
	public void testMax() {
		assertEquals(Funciones.max(miLista),9 );
	}
	
	@Test
	public void testMinimo() {
		assertEquals(Funciones.minimo(miLista),1 );
	}
	
	@Test
	public void testMin() {
		assertEquals(Funciones.min(miLista),1 );
	}
	
	@Test
	public void testListaVacia() {
		List<Integer> vacia = new ArrayList<>();
		
		assertEquals(Funciones.min(vacia),0 );
		assertEquals(Funciones.minimo(vacia),0 );
		assertEquals(Funciones.max(vacia),0 );
		assertEquals(Funciones.maximo(vacia),0 );
	}
	
	@Test
	public void testduplicar() {
		List<Integer> listaDup = Funciones.duplicar(miLista);
		int uno = listaDup.get(0);
		
		assertEquals(uno, 2 );
		assertEquals(listaDup.get(1).intValue(), 6 );
	}
	
	@Test
	public void testdup() {
		List<Integer> listaDup = Funciones.duplicElemLista(miLista);

		assertEquals(listaDup.get(0).intValue(), 2 );
		assertEquals(listaDup.get(1).intValue(), 6 );
	}
}
