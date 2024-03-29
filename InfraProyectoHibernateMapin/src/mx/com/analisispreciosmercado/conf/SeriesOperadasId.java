package mx.com.analisispreciosmercado.conf;

// Generated 12-feb-2009 0:14:27 by Hibernate Tools 3.2.1.GA

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * SeriesOperadasId generated by hbm2java
 */
@Embeddable
public class SeriesOperadasId implements java.io.Serializable {

	private Date fecha;
	private String emisora;
	private String serie;

	public SeriesOperadasId() {
	}

	public SeriesOperadasId(Date fecha, String emisora, String serie) {
		this.fecha = fecha;
		this.emisora = emisora;
		this.serie = serie;
	}

	@Column(name = "fecha", nullable = false, length = 13)
	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Column(name = "emisora", nullable = false, length = 25)
	public String getEmisora() {
		return this.emisora;
	}

	public void setEmisora(String emisora) {
		this.emisora = emisora;
	}

	@Column(name = "serie", nullable = false, length = 10)
	public String getSerie() {
		return this.serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SeriesOperadasId))
			return false;
		SeriesOperadasId castOther = (SeriesOperadasId) other;

		return ((this.getFecha() == castOther.getFecha()) || (this.getFecha() != null
				&& castOther.getFecha() != null && this.getFecha().equals(
				castOther.getFecha())))
				&& ((this.getEmisora() == castOther.getEmisora()) || (this
						.getEmisora() != null
						&& castOther.getEmisora() != null && this.getEmisora()
						.equals(castOther.getEmisora())))
				&& ((this.getSerie() == castOther.getSerie()) || (this
						.getSerie() != null
						&& castOther.getSerie() != null && this.getSerie()
						.equals(castOther.getSerie())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getFecha() == null ? 0 : this.getFecha().hashCode());
		result = 37 * result
				+ (getEmisora() == null ? 0 : this.getEmisora().hashCode());
		result = 37 * result
				+ (getSerie() == null ? 0 : this.getSerie().hashCode());
		return result;
	}

}
