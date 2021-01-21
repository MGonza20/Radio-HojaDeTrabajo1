import java.util.ArrayList;

/**
 * 
 */

/**
 * @author sarap
 *
 */
public class Radio implements RADIOinterface{
	
	private ArrayList<Integer> AMradios = new ArrayList<Integer>();
	private ArrayList<Integer> FMradios = new ArrayList<Integer>();
	
	private int[] radiosFAV = new int[12];
	
	private int posicionAM = 0;
	private int posicionFM = 0;

	
	public ArrayList<Integer> getAMradios() {
		return AMradios;
	}

	public void setAMradios(ArrayList<Integer> aMradios) {
		AMradios = aMradios;
	}

	public ArrayList<Integer> getFMradios() {
		return FMradios;
	}

	public void setFMradios(ArrayList<Integer> fMradios) {
		FMradios = fMradios;
	}

	public int[] getRadiosFAV() {
		return radiosFAV;
	}

	public void setRadiosFAV(int[] radiosFAV) {
		this.radiosFAV = radiosFAV;
	}

	public int getPosicionAM() {
		return posicionAM;
	}

	public void setPosicionAM(int posicionAM) {
		this.posicionAM = posicionAM;
	}

	public int getPosicionFM() {
		return posicionFM;
	}

	public void setPosicionFM(int posicionFM) {
		this.posicionFM = posicionFM;
	}

	public Radio() {
		
	}

	public Radio(int[] radiosFAV, int posicionAM, int posicionFM) {
		super();
		this.radiosFAV = radiosFAV;
		this.posicionAM = posicionAM;
		this.posicionFM = posicionFM;
	}
	
	public void AMradios(){	    
	    for (Integer i = 0; i < AMradios.size(); i++ ) {
            AMnumbers();	
	    }
	}
	
	
	public void AMnumbers(){
		for (Integer i = 530; i < 1610; i = i + 10) {
			 AMradios.add(i);
		}
    }
	
	public void FMradios(){	    
	    for (double i = 0; i < FMradios.size(); i++ ) {
            FMnumbers();	
	    }
	}
	
    public void FMnumbers(){
		for (double i = 89.7; i < 107.9; i = i + 0.2) {
		FMradios.add((int) i);
		}
    }

    
	@Override
	public boolean apagar() {
		return false;
	}
	

	@Override
	public String encender() {
		String actualEMI;
			actualEMI = ("\nEn estos momentos suena la emisora: " + this.EmisoraAMoFM(true) + " AM \n");
		return actualEMI;
		
	}

	
	public void ADDfav(int pos, boolean AMFM) {
		int emi = this.EmisoraAMoFM(AMFM);
		radiosFAV[pos] = emi;  	
	}

	
	public String showFAVS() {
		for (int i=0; i < radiosFAV.length ; i++) {		
		
			System.out.println(i + ". " + i++);
	}
		return ("Aun no se ha guardado ninguna radio");
}
	
	
	
	public String getFav(int pos) {
		if (pos > 0) {
			int seleccion = radiosFAV[pos];
			return ("Has seleccionado la emisora: " + seleccion); 
		}
		else {
		return ("No se aceptan números negativos");
	}
	}
	

	
	public int ProximaEstacion(boolean emisoraAMbool) {
		
		int POS = 0;
                
		if(emisoraAMbool) {				
				if(posicionAM + 1 > AMradios.size()) {
					POS = AMradios.get(0);
					return POS;
				}
				else {
					POS = AMradios.get(posicionAM +1);
					posicionAM = posicionAM + 1;
					return POS;
				}
		}
				
		else {
				if(posicionFM + 1 > FMradios.size()) {
					System.out.println("FM +1 pero 0");

					POS = FMradios.get(0);
					return POS;
					}
				else {
					POS = FMradios.get(posicionFM + 1);
					posicionFM = posicionFM + 1;
					return POS;
					}
		}
		}
	

	public int EstacionAnterior(boolean emisoraAMbool) {

		int POS = 0;
		
		if(emisoraAMbool) {				
				if(posicionAM -1 < 0) {
					POS = AMradios.size();
					return POS;
				}
				else {
					POS = AMradios.get(posicionAM - 1);
					return POS;
				}
		}
				
		else {
				if(posicionFM -1 < 0) {
					POS = FMradios.size();
					return POS;
					}
				else {
					POS = FMradios.get(posicionFM - 1);
					return POS;
					}
		}
		}
	

	public Integer EmisoraAMoFM(boolean EstadoAMoFM) {
		int emisora = 0;
		if(EstadoAMoFM == true) {
			//int emisoraAM = 0;
			AMnumbers();
            FMnumbers();
			//System.out.println(AMradios.size());
			emisora = AMradios.get(posicionAM);
			return emisora;
			}
		if (EstadoAMoFM == false) {
			//int emisoraFM = 0;
			FMnumbers();
			
			emisora = FMradios.get(posicionFM);
			//return System.out.println(emisora);
			}
		return emisora;
		}
	
}