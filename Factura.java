package sistemacontable;

import java.util.Date;

public class Factura {
    private String folio;
    private String cliente;
    private double monto;
    private Date fecha;
    private String estatus;
    private String rfcEmisor;
    private String rfcReceptor;

    public Factura(String folio, String cliente, double monto, Date fecha, String estatus, String rfcEmisor, String rfcReceptor)
            throws IllegalArgumentException {
        if (folio == null || folio.trim().isEmpty()) {
            throw new IllegalArgumentException("El folio no puede estar vacío.");
        }
        if (monto < 0) {
            throw new IllegalArgumentException("El monto no puede ser negativo.");
        }
        this.folio = folio;
        this.cliente = cliente;
        this.monto = monto;
        this.fecha = fecha;
        this.estatus = estatus;
        this.rfcEmisor = rfcEmisor;
        this.rfcReceptor = rfcReceptor;
    }

    public String getFolio() { return folio; }
    public String getCliente() { return cliente; }
    public void setCliente(String cliente) { this.cliente = cliente; }
    public double getMonto() { return monto; }
    public void setMonto(double monto) { this.monto = monto; }
    public Date getFecha() { return fecha; }
    public void setFecha(Date fecha) { this.fecha = fecha; }
    public String getEstatus() { return estatus; }
    public void setEstatus(String estatus) { this.estatus = estatus; }
    public String getRfcEmisor() { return rfcEmisor; }
    public String getRfcReceptor() { return rfcReceptor; }

    @Override
    public String toString() {
        return "Factura{Folio=" + folio + ", Cliente=" + cliente + ", Monto=" + monto + ", Estatus=" + estatus + "}";
    }
}
