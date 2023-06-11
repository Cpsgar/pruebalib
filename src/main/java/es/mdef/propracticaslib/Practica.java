package es.mdef.propracticaslib;

import java.time.ZonedDateTime;
import java.util.List;

public interface Practica {
	
	String getEstadoValidacion();
	String getUco();
	String getTitulo();
	String getDescripcion();
	String getObjetivos();
	boolean isEntornoFavorable();
	String getProgramadoresUnidad();
	String getFormacionEspecialidad();
	String getTutorNombre();
	int getTutorTelefono();
	String getTutorEmail();
	ZonedDateTime getFechaComienzo();
	List<Alumno> getAlumnos();
	Integer getAlumnosAsignados();
}
