import java.util.ArrayList;

public interface RADIOinterface {

	void apagar();
	
	void encender();
	
	int ProximaEstacion(boolean emisoraAM, boolean moreVOL);
	
	int EstacionAnterior(boolean emisoraAM, boolean moreVOL);
	
	void ADDfav(int pos);
	
    void AMradios();
	
	void FMradios();
	
	double AMnumbers();
	
	double FMnumbers();
	
	String showFAVS();
	
	String getFav();
	
	Integer getEstadoEmisoraAMoFM(boolean EstadoAMoFM);

	
	
	
	
}
