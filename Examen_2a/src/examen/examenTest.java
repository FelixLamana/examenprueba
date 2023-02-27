package examen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class examenTest {

	@Test
	void CP1() {
		assertFalse(Fecha.validarFecha(2022, 02, -50));
	}

}
