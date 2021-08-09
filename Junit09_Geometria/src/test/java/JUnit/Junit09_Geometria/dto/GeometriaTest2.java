package JUnit.Junit09_Geometria.dto;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class GeometriaTest2 {
	Geometria geo = new Geometria();
	Geometria geo1 = new Geometria(4);

	@Test
	void testAreacuadrado() {
		int resultado = geo.areacuadrado(2);
		int esperado = 4;
		assertEquals(esperado, resultado);
	}

	@Test
	void testAreaCirculo() {
		double resultado = geo.areaCirculo(1);
		double esperado = 3.1415;
		double i = 0.5;
		assertEquals(esperado, resultado,i);
	}

	@Test
	void testAreatriangulo() {
		double resultado = geo.areatriangulo(2, 2);
		double esperado = 2;
		assertEquals(esperado, resultado);
	}

	@Test
	void testArearectangulo() {
		double resultado = geo.arearectangulo(2, 2);
		double esperado = 4;
		assertEquals(esperado, resultado);
	}
	

	@Test
	void testAreapentagono() {
		double resultado = geo.areapentagono(2, 2);
		double esperado = 2;
		assertEquals(esperado, resultado);
	}

	@Test
	void testArearombo() {
		double resultado = geo.arearombo(2, 2);
		double esperado = 2;
		assertEquals(esperado, resultado);
	}

	@Test
	void testArearomboide() {
		double resultado = geo.arearomboide(2, 2);
		double esperado = 4;
		assertEquals(esperado, resultado);
	}

	@Test
	void testAreatrapecio() {
		double resultado = geo.areatrapecio(2, 2, 0);
		double esperado = 0;
		assertEquals(esperado, resultado);
	}

	@Test
	void testFigura() {
		assertTrue(geo.figura(1) == "cuadrado");
		assertTrue(geo.figura(2) == "Circulo");
		assertTrue(geo.figura(3) == "Triangulo");
		assertTrue(geo.figura(4) == "Rectangulo");
		assertTrue(geo.figura(5) == "Pentagono");
		assertTrue(geo.figura(6) == "Rombo");
		assertTrue(geo.figura(7) == "Romboide");
		assertTrue(geo.figura(8) == "Trapecio");
		assertTrue(geo.figura(9) == "Default");
	}
	@Test
	void testGettersSetters() {
		geo.setArea(2);
		geo.setId(1);
		geo.setNom("Alvaro");
		assertTrue(geo.getArea()==2);
		assertTrue(geo.getId()==1);
		assertTrue(geo.getNom()=="Alvaro");
	}
}
