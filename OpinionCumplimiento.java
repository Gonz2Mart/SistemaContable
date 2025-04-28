package sistemacontable;

import java.util.Date;

public class OpinionCumplimiento {
    private String rfc;
    private Date fechaEmision;
    private String resultado;

    public OpinionCumplimiento(String rfc, Date fechaEmision, String resultado) throws IllegalArgumentException {
        if (rfc == null || rfc.trim().isEmpty()) {
            throw new IllegalArgumentException("El RFC no puede estar vacío.");
        }
        if (!resultado.equals("Positiva") && !resultado.equals("Negativa")) {
            throw new IllegalArgumentException("El resultado debe ser 'Positiva' o 'Negativa'.");
        }
        this.rfc = rfc;
        this.fechaEmision = fechaEmision;
        this.resultado = resultado;
    }

    public String getRfc() { return rfc; }
    public Date getFechaEmision() { return fechaEmision; }
    public void setFechaEmision(Date fechaEmision) { this.fechaEmision = fechaEmision; }
    public String getResultado() { return resultado; }
    public void setResultado(String resultado) { this.resultado = resultado; }

    @Override
    public String toString() {
        return "OpinionCumplimiento{RFC=" + rfc + ", Resultado=" + resultado + "}";
    }
}
