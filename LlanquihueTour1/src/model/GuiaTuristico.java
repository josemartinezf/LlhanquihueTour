package model;

public class GuiaTuristico extends Empleado {

    private String especialidad;
    private String[] idiomas;
    private String numeroLicencia;
    private boolean disponible;

    public GuiaTuristico(String rut, String nombre, String apellido, String telefono,
                         String email, Direccion direccion, double salarioBase,
                         String fechaIngreso, String especialidad,
                         String[] idiomas, String numeroLicencia) {
        super(rut, nombre, apellido, telefono, email, direccion,
                "Guía Turístico", salarioBase, fechaIngreso, "Operaciones");
        this.especialidad = especialidad;
        this.idiomas = idiomas;
        this.numeroLicencia = numeroLicencia;
        this.disponible = true;
    }

    public String getEspecialidad() { return especialidad; }
    public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }

    public String[] getIdiomas() { return idiomas; }
    public void setIdiomas(String[] idiomas) { this.idiomas = idiomas; }

    public String getNumeroLicencia() { return numeroLicencia; }
    public void setNumeroLicencia(String numeroLicencia) { this.numeroLicencia = numeroLicencia; }

    public boolean isDisponible() { return disponible; }
    public void setDisponible(boolean disponible) { this.disponible = disponible; }

    private String idiomasToString() {
        if (idiomas == null || idiomas.length == 0) return "No especificado";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < idiomas.length; i++) {
            sb.append(idiomas[i]);
            if (i < idiomas.length - 1) sb.append(", ");
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return "=== GUÍA TURÍSTICO ===" +
                "\n  RUT            : " + getRut() +
                "\n  Nombre         : " + getNombreCompleto() +
                "\n  Teléfono       : " + getTelefono() +
                "\n  Email          : " + getEmail() +
                "\n  Dirección      : " + getDireccion() +
                "\n  Especialidad   : " + especialidad +
                "\n  Idiomas        : " + idiomasToString() +
                "\n  N° Licencia    : " + numeroLicencia +
                "\n  Disponible     : " + (disponible ? "Sí" : "No") +
                "\n  Salario Base   : $" + String.format("%,.0f", getSalarioBase()) +
                "\n  Fecha Ingreso  : " + getFechaIngreso();
    }
}