package es.mdef.propracticaslib;

public class PracticaGCImpl extends PracticaImpl implements PracticaGC {
	
	private boolean relacionInvestigacion;
	private String alumnosPropuestos;
	
	public boolean isRelacionInvestigacion() {
		return relacionInvestigacion;
	}
	public void setRelacionInvestigacion(boolean relacionInvestigacion) {
		this.relacionInvestigacion = relacionInvestigacion;
	}
	public String getAlumnosPropuestos() {
		return alumnosPropuestos;
	}
	public void setAlumnosPropuestos(String alumnosPropuestos) {
		this.alumnosPropuestos = alumnosPropuestos;
	}
}
