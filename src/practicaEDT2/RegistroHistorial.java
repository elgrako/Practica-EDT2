package practicaEDT2;

import java.util.ArrayList;
import java.util.List;

public class RegistroHistorial {
    private List<Historial> listaHistorial;

    public RegistroHistorial() {
        listaHistorial = new ArrayList<>();
    }

    public void agregarHistoriaClinica(Historial historial, Paciente paciente) {
        historial.setPacienteAsociado(paciente);
        listaHistorial.add(historial);
    }
}

