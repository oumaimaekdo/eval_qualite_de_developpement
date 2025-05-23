package com.example.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@SpringBootTest
class TestApplicationTests {

	// Avec JUnit

	@Test
	void contextLoads() {
	}

	Calculatrice calculatrice;

	@BeforeEach
	void init(){
		calculatrice = new Calculatrice();
	}

	@Test
	void test(){
		assertTrue(calculatrice.add(1, 1) == 2);
		assertEquals(2, calculatrice.add(1, 1));
		assertAll("calculs",
				() -> assertEquals(2, calculatrice.add(1, 1)),
				() -> assertEquals(2, calculatrice.div(4,2))
		);
	}

	@Test
	void test1(){
		Exception exception = assertThrows(Exception.class, () ->
				calculatrice.div(1,0));
		assertEquals("Div par O", exception.getMessage());
	}

	// Avec Mockito

	@Test
	void statistique(){
		Calculatrice calculatrice1 = mock(Calculatrice.class);
		when(calculatrice1.add(10, 20)).thenReturn((float)30);
		when(calculatrice1.div(30, 2)).thenReturn((float)15);
		Statistique statistique = new Statistique();
		assertEquals(statistique.moyenne(10, 20), (float)15);

	}

	@Test
	void exception(){
		Calculatrice calculatrice2 = mock(Calculatrice.class);
		when(calculatrice2.div(1,0)).thenThrow(ArithmeticException.class);
	}


}
