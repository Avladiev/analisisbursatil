package mx.com.analisispreciosmercado.conf;

// Generated 12-feb-2009 0:14:27 by Hibernate Tools 3.2.1.GA

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ConfiguracionSplit generated by hbm2java
 */
@Entity
@Table(name = "configuracion_split", schema = "ADMIN")
public class ConfiguracionSplit implements java.io.Serializable {

	private ConfiguracionSplitId id;
	private Date fechaAplicacion;
	private Integer split;

	public ConfiguracionSplit() {
	}

	public ConfiguracionSplit(ConfiguracionSplitId id, Integer split) {
		this.id = id;
		this.split = split;
	}

	public ConfiguracionSplit(ConfiguracionSplitId id, Date fechaAplicacion,
			Integer split) {
		this.id = id;
		this.fechaAplicacion = fechaAplicacion;
		this.split = split;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "emisora", column = @Column(name = "emisora", nullable = false, length = 25)),
			@AttributeOverride(name = "serie", column = @Column(name = "serie", nullable = false, length = 10)),
			@AttributeOverride(name = "fechaAlta", column = @Column(name = "fecha_alta", nullable = false, length = 13)) })
	public ConfiguracionSplitId getId() {
		return this.id;
	}

	public void setId(ConfiguracionSplitId id) {
		this.id = id;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_aplicacion", length = 13)
	public Date getFechaAplicacion() {
		return this.fechaAplicacion;
	}

	public void setFechaAplicacion(Date fechaAplicacion) {
		this.fechaAplicacion = fechaAplicacion;
	}

	@Column(name = "split", nullable = false)
	public Integer getSplit() {
		return this.split;
	}

	public void setSplit(Integer split) {
		this.split = split;
	}

}
