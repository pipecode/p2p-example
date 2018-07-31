package co.pipecode.p2p.example.repository.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "PAYMENT")
public class Payment {

	@Id
	@SequenceGenerator(name = "payment_generator", sequenceName = "payment_sequence", allocationSize = 1)
	@GeneratedValue(generator = "payment_generator")
	@Column(name = "ID")
	private Long id;

	@Column(name = "NOMBRE")
	private String nombre;

	@Column(name = "APELLIDOS")
	private String apellidos;

	@Column(name = "TIPO_DOCUMENTO")
	private String tipo_documento;

	@Column(name = "NUMERO_DOCUMENTO")
	private String numero_documento;

	@Column(name = "REFERENCIA")
	private String referencia;

	@Column(name = "TRANSACCION")
	private String transaccion;

	@Column(name = "FECHA_TRANSACCION")
	private Date fecha_transaccion;

	@Column(name = "ESTADO")
	private String estado;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTipo_documento() {
		return tipo_documento;
	}

	public void setTipo_documento(String tipo_documento) {
		this.tipo_documento = tipo_documento;
	}

	public String getNumero_documento() {
		return numero_documento;
	}

	public void setNumero_documento(String numero_documento) {
		this.numero_documento = numero_documento;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public String getTransaccion() {
		return transaccion;
	}

	public void setTransaccion(String transaccion) {
		this.transaccion = transaccion;
	}

	public Date getFecha_transaccion() {
		return fecha_transaccion;
	}

	public void setFecha_transaccion(Date fecha_transaccion) {
		this.fecha_transaccion = fecha_transaccion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
