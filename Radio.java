import java.util.ArrayList;

/**
 * 
 */

/**
 * @author sarap
 *
 */
public class Radio implements RADIOinterface{

	
	private boolean EstadoAMoFM;
	
	private ArrayList<Integer> radios = new ArrayList<Integer>();
	
	
	private String Array[12] radiosFAV = new Array[];
	
	private static ArrayList<Integer> AMradios = new ArrayList<Integer>();
	private static ArrayList<Integer> FMradios = new ArrayList<Integer>();
	
	private int estacionActual;
	private int NUMestacionActual;
	
	private int posicionAM;
	private int posicionFM;


	
	public Radio() {
		
	}

	public Radio(ArrayList<Integer> radios,  String Array[] radiosFAV, boolean estadoAMoFM) {
		this.radios = radios;
		this.radiosFAV = radiosFAV;
		EstadoAMoFM = estadoAMoFM;
	}
	
	public void AMradios(){	    
	    for (int i = 0; i < AMradios.size(); i++ )
            AMradios.add((int)AMnumbers());	
	}
	
	public double AMnumbers(){
		for (int i = 530; i < 1610; i = i + 10);
             int numsAM	 = 0;
             return numsAM;
    }
	
	public void FMradios(){	    
	    for (int i = 0; i < FMradios.size(); i++ )
            FMradios.add((int) FMnumbers());	
	}
	
    public double FMnumbers(){
		for (double i = 89.7; i < 107.9; i = i + 0.2);
             int numsFM = 0;
             return numsFM;
    }

    
	@Override
	public void apagar() {
		// Por el momento no
	}
	

	@Override
	public void encender() {
		// Por el momento no
		
	}

	@Override
	public void ADDfav( int pos) {
		
	}


	@Override
	public String showFAVS() {	
		return null;
	}
	
	

	@Override
	public int ProximaEstacion(boolean emisoraAMbool, boolean moreVOL) {
		if(emisoraAMbool) {
			if(moreVOL){
				
				if(AMradios.get(posicionAM) + 1 > AMradios.size()) {
					return 0;
				}
				
				else {
					return AMradios.get(posicionAM) +1;
				}
			}
			
			else {
				if(AMradios.get(posicionAM) -1 < 0) {
					return AMradios.size();
			}
				else {
					return (AMradios.get(posicionAM) - 1); 
					}
			}
		}
		else {
			if(moreVOL) {
				if(FMradios.get(posicionFM) + 1 > FMradios.size()) {
					return 0;
					}
				else {
					return FMradios.get(posicionFM) + 1;
					}
				}
			else {
				if(FMradios.get(posicionFM) -1 < 0) {
					return FMradios.size();
					}
				else {
					return FMradios.size() - 1; 
					}
				}
			}		
		}
	

	@Override
	public int EstacionAnterior(boolean emisoraAMbool, boolean moreVOL) {
		if(emisoraAMbool) {
			if(moreVOL){
				
				if(AMradios.get(posicionAM) + 1 > AMradios.size()) {
					return 0;
				}
				
				else {
					return AMradios.get(posicionAM) +1;
				}
			}
			
			else {
				if(AMradios.get(posicionAM) -1 < 0) {
					return AMradios.size();
			}
				else {
					return (AMradios.get(posicionAM) - 1); 
					}
			}
		}
		else {
			if(moreVOL) {
				if(FMradios.get(posicionFM) + 1 > FMradios.size()) {
					return 0;
					}
				else {
					return FMradios.get(posicionFM) + 1;
					}
				}
			else {
				if(FMradios.get(posicionFM) -1 < 0) {
					return FMradios.size();
					}
				else {
					return FMradios.size() - 1; 
					}
				}
			}		
		}

	@Override
	public Integer getEstadoEmisoraAMoFM(boolean EstadoAMoFM) {
		if(EstadoAMoFM = true) {
			int emisoraAM = 0;
			emisoraAM = AMradios.get(posicionAM);
			return emisoraAM;
			}
		if (EstadoAMoFM = false) {
			int emisoraFM = 0;
			emisoraFM = FMradios.get(posicionFM);
			return emisoraFM;
			}
		return null;
		}
	
}