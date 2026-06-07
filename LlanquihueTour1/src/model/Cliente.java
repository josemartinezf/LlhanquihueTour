package model;

public class Cliente extends Persona {

    private String nacionalidad;
    private String tipoCliente;
    private int totalToursContratados;
    private String fechaRegistro;

    public Cliente(String rut, String nombre, String apellido, String telefono,
                   String email, Direccion direccion, String nacionalidad,
                   String tipoCliente, String fechaRegistro) {
        super(rut, nombre, apellido, telefono, email, direccion);
        this.nacionalidad = nacionalidad;
        this.tipoCliente = tipoCliente;
        this.totalToursContratados = 0;
        this.fechaRegistro = fechaRegistro;
    }

    public String getNacionalidad() { return nacionalidad; }
    public void setNacionalidad(String nacionalidad) { this.nacionalidad = nacionalidad; }

    public String getTipoCliente() { return tipoCliente; }
    public void setTipoCliente(String tipoCliente) { this.tipoCliente = tipoCliente; }

    public int getTotalToursContratados() { return totalToursContratados; }
    public void registrarNuevoTour() { this.totalToursContratados++; }

    public String getFechaRegistro() { return fechaRegistro; }
    public void setFechaRegistro(String fechaRegistro) { this.fechaRegistro = fechaRegistro; }

    @Override
    public String toString() {
        return "=== CLIENTE ===" +
                "\n  RUT              : " + getRut() +
                "\n  Nombre           : " + getNombreCompleto() +
                "\n  Teléfono         : " + getTelefono() +
                "\n  Email            : " + getEmail() +
                "\n  Dirección        : " + getDireccion() +
                "\n  Nacionalidad     : " + nacionalidad +
                "\n  Tipo de Cliente  : " + tipoCliente +
                "\n  Tours contratados: " + totalToursContratados +
                "\n  Fecha Registro   : " + fechaRegistro;
    }
}



