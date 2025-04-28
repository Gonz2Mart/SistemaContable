package sistemacontable;

public class Contribuyente {
    private String rfc;
    private String nombre;
    private String regimenFiscal;

    public Contribuyente(String rfc, String nombre, String regimenFiscal) throws IllegalArgumentException {
        if (rfc == null || rfc.trim().isEmpty()) {
            throw new IllegalArgumentException("El RFC no puede estar vacío.");
        }
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        this.rfc = rfc;
        this.nombre = nombre;
        this.regimenFiscal = regimenFiscal;
    }

    public String getRfc() { return rfc; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getRegimenFiscal() { return regimenFiscal; }
    public void setRegimenFiscal(String regimenFiscal) { this.regimenFiscal = regimenFiscal; }

    @Override
    public String toString() {
        return "Contribuyente{RFC=" + rfc + ", Nombre=" + nombre + ", Régimen=" + regimenFiscal + "}";
    }
}
