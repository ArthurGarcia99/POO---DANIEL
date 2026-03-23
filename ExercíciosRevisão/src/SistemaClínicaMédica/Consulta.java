package SistemaClínicaMédica;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Consulta {
    private LocalDateTime data;
    private int valorconsulta;
    private Medico medico;
    private Paciente paciente;

    public Consulta() {
    }

    public Consulta(LocalDateTime data, int valorconsulta, Medico medico, Paciente paciente) {
        this.data = data;
        this.valorconsulta = valorconsulta;
        this.medico = medico;
        this.paciente = paciente;
    }

    public LocalDateTime getData() {
        return data;
    }

    public int getValorconsulta() {
        return valorconsulta;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatoBR = DateTimeFormatter.ofPattern("dd/MM/yyyy 'ás' HH'h'mm");
        return "Consulta{" +
                "data=" + this.data.format(formatoBR) +
                ", valorconsulta=" + this.valorconsulta +
                ", medico=" + this.medico +
                ", paciente=" + this.paciente +
                '}';
    }
}

