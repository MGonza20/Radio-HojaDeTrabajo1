import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author sarap
 *
 */
public class RADIOmain {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		Radio rad = new Radio();
		Scanner keys = new Scanner(System.in);
		
		System.out.println("---------------  RADIO  ---------------");
		System.out.println("");
		System.out.println("Seleccione opciones del menú");
		System.out.println("");
		System.out.println("");
		boolean ctrl = true;
		
		do {
			System.out.println("1. Encender. ");
			System.out.println("2. Cambiar de FM a AM. ");
			System.out.println("3. Cambiar de AM a FM. ");
			System.out.println("4. Siguiente emisora. ");
			System.out.println("5. Emisora anterior.");
			System.out.println("6. Guardar emisora ");
			System.out.println("7. Seleccionar emisora guardada ");
			System.out.println("8. Apagar radio ");
			System.out.println("");
                        
        ArrayList<Integer> AMradios= new ArrayList<Integer>();
		ArrayList<Double> FMradios = new ArrayList<Double>();
		
		boolean EstadoAMoFM = false;

			int option = keys.nextInt();
			switch(option) {
			
			case 1:
				System.out.println(rad.encender());
				break;
				
			case 2:
				EstadoAMoFM = false;
				System.out.println("\n" + rad.EmisoraAMoFM(EstadoAMoFM) + " AM");
				break;
				
			case 3:
				EstadoAMoFM = true;
				System.out.println("\n" + rad.EmisoraAMoFM(EstadoAMoFM) + " FM");
				break;
				
			case 4:
				System.out.println("\nCambió la emisora a: " + rad.ProximaEstacion(EstadoAMoFM) + "\n");
				break;
			
			case 5:
				System.out.println("\nCambió la emisora a: " + rad.EstacionAnterior(EstadoAMoFM) + "\n");
				break;
			
			case 6:
				System.out.println("En que número de botón desea guardar la emisora?\n");
				int posi = keys.nextInt();
				rad.ADDfav(posi, EstadoAMoFM);
				System.out.println("Ha guardado la emisora: " + rad.EmisoraAMoFM(EstadoAMoFM) + ", en el botón " + posi + ".\n");
				break;
				
			case 7: 
				System.out.println("Emisoras guardadas: \n");
				rad.showFAVS();
				
				System.out.println("Selecione la emisora que quiera seleccionar");
				int posi1 = keys.nextInt();
				System.out.println(rad.getFav(posi1));
				
				break;
				
			case 8:
				System.out.println("\nApagando...");
				ctrl = rad.apagar();
				break;
			}
			
			
		}
		
		
		while(ctrl);
		
		
	}
		
}
		

		
