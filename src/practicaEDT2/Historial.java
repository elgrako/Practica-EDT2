package practicaEDT2;

import java.util.Date;

public class Historial {
    private String diagnostico;
    private String tratamiento;
    private Date fechaConsulta;
    private String medicoResponsable;
    private Paciente pacienteAsociado;
    
    
	public String getDiagnostico() {
		return diagnostico;
	}
	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}
	public String getTratamiento() {
		return tratamiento;
	}
	public void setTratamiento(String tratamiento) {
		this.tratamiento = tratamiento;
	}
	public Date getFechaConsulta() {
		return fechaConsulta;
	}
	public void setFechaConsulta(Date fechaConsulta) {
		this.fechaConsulta = fechaConsulta;
	}
	public String getMedicoResponsable() {
		return medicoResponsable;
	}
	public void setMedicoResponsable(String medicoResponsable) {
		this.medicoResponsable = medicoResponsable;
	}

    public Paciente getPacienteAsociado() {
        return pacienteAsociado;
    }

    public void setPacienteAsociado(Paciente paciente) {
        pacienteAsociado = paciente;
    }
}
