package fr.si2m.bref.orm;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the LIEN_GROUPE_ENTREPRISE database table.
 * 
 */
@Embeddable
public class LienGroupeEntreprisePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ID_TECH_UR_ENTP")
	private long idTechUrEntp;

	@Column(name="ID_TECH_GRP")
	private long idTechGrp;

    public LienGroupeEntreprisePK() {
    }
	public long getIdTechUrEntp() {
		return this.idTechUrEntp;
	}
	public void setIdTechUrEntp(long idTechUrEntp) {
		this.idTechUrEntp = idTechUrEntp;
	}
	public long getIdTechGrp() {
		return this.idTechGrp;
	}
	public void setIdTechGrp(long idTechGrp) {
		this.idTechGrp = idTechGrp;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof LienGroupeEntreprisePK)) {
			return false;
		}
		LienGroupeEntreprisePK castOther = (LienGroupeEntreprisePK)other;
		return 
			(this.idTechUrEntp == castOther.idTechUrEntp)
			&& (this.idTechGrp == castOther.idTechGrp);

    }
    
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.idTechUrEntp ^ (this.idTechUrEntp >>> 32)));
		hash = hash * prime + ((int) (this.idTechGrp ^ (this.idTechGrp >>> 32)));
		
		return hash;
    }
}