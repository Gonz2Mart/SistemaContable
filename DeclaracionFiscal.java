package sistemacontable;

import java.util.Date;

public class DeclaracionFiscal {
    private String tipo;
    private double monto;
    private Date fecha;
    private String estatus;

    public DeclaracionFiscal(String tipo, double monto, Date fecha, String estatus) throws IllegalArgumentException {
        if (tipo == null || tipo.trim().isEmpty()) {
            throw new IllegalArgumentException("El tipo de declaración no puede estar vacío.");
        }
        if (monto < 0) {
            throw new IllegalArgumentException("El monto no puede ser negativo.");
        }
        this.tipo = tipo;
        this.monto = monto;
        this.fecha = fecha;
        this.estatus = estatus;
    }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public double getMonto() { return monto; }
    public void setMonto(double monto) { this.monto = monto; }
    public Date getFecha() { return fecha; }
    public void setFecha(Date fecha) { this.fecha = fecha; }
    public String getEstatus() { return estatus; }
    public void setEstatus(String estatus) { this.estatus = estatus; }

    @Override
    public String toString() {
        return "DeclaracionFiscal{Tipo=" + tipo + ", Monto=" + monto + ", Estatus=" + estatus + "}";
    }
}