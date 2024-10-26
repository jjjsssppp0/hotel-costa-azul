package pe.com.cibertec.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "tb_usuario")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class UsuarioEntity {

    @Id
    @Column(name = "correo", nullable = false, length = 40)
    private String correo;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "celular", columnDefinition = "CHAR(9)", length = 9, nullable = false)
    private String celular;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "url_imagen")
    private String urlImagen;
    
    
    
}
