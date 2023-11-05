package practicaEDT2;

import java.util.ArrayList;
import java.util.List;

public class RegistroPacientes {
    private List<Paciente> listaPacientes;

    public RegistroPacientes() {
        listaPacientes = new ArrayList<>();
    }

    public void agregarPaciente(Paciente paciente) {
        listaPacientes.add(paciente);
    }
}
