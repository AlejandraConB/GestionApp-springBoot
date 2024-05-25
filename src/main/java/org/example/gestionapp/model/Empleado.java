package org.example.gestionapp.model;
import jakarta.persistence.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

@Entity//Con la anotación entity, le decimos que representa una tabla
@Table(name="empleados")//Con la anotación table, podemos específicar el nombre de esa tabla
public class Empleado {
    @Id//Indica que es la llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Indica que se va a generar de manera autoincremental
    private long empleadoId;

    @Column(name = "nombre empleado")//Permite específicar el nombre de una columna
    @Size(min = 10, max = 50)
    private String nombreEmpleado;

    @Min(1)
    @Max(0)
    private Integer aniosAntiquedad;

    @Email(message = "No se introdujo un correo válido")
    private String correoEmpleado;

    //Constructor vacío y con sus atributos
    public Empleado() {
    }

    public Empleado(long empleadoId, String nombreEmpleado, Integer aniosAntiquedad, String correoEmpleado) {
        this.empleadoId = empleadoId;
        this.nombreEmpleado = nombreEmpleado;
        this.aniosAntiquedad = aniosAntiquedad;
        this.correoEmpleado = correoEmpleado;
    }

    //Getter and Setter

    public long getEmpleadoId() {
        return empleadoId;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public Integer getAniosAntiquedad() {
        return aniosAntiquedad;
    }

    public void setAniosAntiquedad(Integer aniosAntiquedad) {
        this.aniosAntiquedad = aniosAntiquedad;
    }

    public String getCorreoEmpleado() {
        return correoEmpleado;
    }

    public void setCorreoEmpleado(String correoEmpleado) {
        this.correoEmpleado = correoEmpleado;
    }
}