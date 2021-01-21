import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

class RADIOtest {

	@Test
	void test() {
		Radio test = Radio();
		
		int testOutput = test.EmisoraAMoFM(true);
		
		int testOutput2 = test.ProximaEstacion(true);
		
		int testOutput3 = test.EstacionAnterior(false);
		
		assertNotNull("Devuelve null?", testOutput);
		
		assertNotNull("Devuelve un valor al cambiar para próxima estación?", testOutput2);
		
		assertNotNull("Devuelve un valor al cambiar para estación anterior?", testOutput3);
		
	}

	private Radio Radio() {
		// TODO Auto-generated method stub
		return null;
	}

}
