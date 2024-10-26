package pe.com.cibertec.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "tb_habitacion") // Cambiado el nombre de la tabla
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class HabitacionEntity { // Cambiado el nombre de la clase

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "habitacion_id", nullable = false)
    private Integer habitacionId; // ID de la habitación

    @Column(name = "numero", nullable = false, unique = true) // Número de habitación
    private String numero;

    @Column(name = "tipo", nullable = false) // Tipo de habitación (simple, doble, suite, etc.)
    private String tipo;

    @Column(name = "precio", nullable = false) // Precio por noche
    private Double precio;

    @Column(name = "capacidad", nullable = false) // Capacidad máxima de la habitación
    private Integer capacidad;

    @Column(name = "descripcion") // Descripción opcional de la habitación
    private String descripcion;

    @Column(name = "url_imagen") // URL de la imagen de la habitación
    private String urlImagen;

}
