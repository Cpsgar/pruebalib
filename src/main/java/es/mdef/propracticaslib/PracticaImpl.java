package es.mdef.propracticaslib;

import java.time.ZonedDateTime;
import java.util.List;

public class PracticaImpl implements Practica {
	
	private String estadoValidacion;
	private String uco;
	private String titulo;
	private String descripcion;
	private String objetivos;
	private boolean entornoFavorable;
	private String programadoresUnidad;
	private String formacionEspecialidad;
	private String tutorNombre;
	private int tutorTelefono;
	private String tutorEmail;
	private ZonedDateTime fechaComienzo;
	List<Alumno> alumnos;
	
	public String getEstadoValidacion() {
		return estadoValidacion;
	}
	public void setEstadoValidacion(String estadoValidacion) {
		this.estadoValidacion = estadoValidacion;
	}
	public String getUco() {
		return uco;
	}
	public void setUco(String uco) {
		this.uco = uco;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getObjetivos() {
		return objetivos;
	}
	public void setObjetivos(String objetivos) {
		this.objetivos = objetivos;
	}
	public boolean isEntornoFavorable() {
		return entornoFavorable;
	}
	public void setEntornoFavorable(boolean entornoFavorable) {
		this.entornoFavorable = entornoFavorable;
	}
	public String getProgramadoresUnidad() {
		return programadoresUnidad;
	}
	public void setProgramadoresUnidad(String programadoresUnidad) {
		this.programadoresUnidad = programadoresUnidad;
	}
	public String getFormacionEspecialidad() {
		return formacionEspecialidad;
	}
	public void setFormacionEspecialidad(String formacionEspecialidad) {
		this.formacionEspecialidad = formacionEspecialidad;
	}
	public String getTutorNombre() {
		return tutorNombre;
	}
	public void setTutorNombre(String tutorNombre) {
		this.tutorNombre = tutorNombre;
	}
	public int getTutorTelefono() {
		return tutorTelefono;
	}
	public void setTutorTelefono(int tutorTelefono) {
		this.tutorTelefono = tutorTelefono;
	}
	public String getTutorEmail() {
		return tutorEmail;
	}
	public void setTutorEmail(String tutorEmail) {
		this.tutorEmail = tutorEmail;
	}
	public ZonedDateTime getFechaComienzo() {
		return fechaComienzo;
	}
	public void setFechaComienzo(ZonedDateTime fechaComienzo) {
		this.fechaComienzo = fechaComienzo;
	}
	public List<Alumno> getAlumnos() {
		return alumnos;
	}
	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}
	public Integer getAlumnosAsignados() {
		if (getAlumnos() != null) {
			return  getAlumnos().size();
		}else {
			return 0;
		}
	}
	
}
