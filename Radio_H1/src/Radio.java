import java.util.ArrayList;

/**
 * 
 */

/**
 * @author sarap
 *
 */
public class Radio {

	private ArrayList<String> radios;
	private String[] radiosFAV;
	private String EstadoAMoFM;
	
	public Radio() {
	}

	public Radio(ArrayList<String> radios, String[] radiosFAV, String estadoAMoFM) {
		this.radios = radios;
		this.radiosFAV = radiosFAV;
		EstadoAMoFM = estadoAMoFM;
	}

	public ArrayList<String> getRadios() {
		return radios;
	}

	public void setRadios(ArrayList<String> radios) {
		this.radios = radios;
	}

	public String[] getRadiosFAV() {
		return radiosFAV;
	}

	public void setRadiosFAV(String[] radiosFAV) {
		this.radiosFAV = radiosFAV;
	}

	public String getEstadoAMoFM() {
		return EstadoAMoFM;
	}

	public void setEstadoAMoFM(String estadoAMoFM) {
		EstadoAMoFM = estadoAMoFM;
	}
	
	public void Encender() {
		
	}
	
	public void Apagar() {
		
	}
	
    public void CambiarAMaFM() {
		
	}
    
    public void CambiarFMaAM() {
		
	}
    
    
    
    
	
	
}


