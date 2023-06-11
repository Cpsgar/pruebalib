package es.mdef.propracticaslib;

public class AlumnoImpl implements Alumno {
	
	private String nombre;
	private String apellidos;
	private String dni;
	private Integer promocionDim;
	private String institucion;
	private String empleo;
	private Practica practicaAsignada;

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public Integer getPromocionDim() {
		return promocionDim;
	}
	public void setPromocionDim(Integer promocionDim) {
		this.promocionDim = promocionDim;
	}
	public String getInstitucion() {
		return institucion;
	}
	public void setInstitucion(String institucion) {
		this.institucion = institucion;
	}
	public String getEmpleo() {
		return empleo;
	}
	public void setEmpleo(String empleo) {
		this.empleo = empleo;
	}
	public Practica getPracticaAsignada() {
		return practicaAsignada;
	}
	public void setPracticaAsignada(Practica practicaAsignada) {
		this.practicaAsignada = practicaAsignada;
	}
	
}
