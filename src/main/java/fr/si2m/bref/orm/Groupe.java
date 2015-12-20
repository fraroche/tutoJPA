package fr.si2m.bref.orm;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the GROUPE database table.
 * 
 */
@Entity
@Table(name="GROUPE")
public class Groupe implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_TECH_GRP")
	private long idTechGrp;

	@Column(name="CO_MNEM_GRP")
	private String coMnemGrp;

	@Column(name="CO_TYPE_GRP")
	private String coTypeGrp;

	@Column(name="CO_UTIL_CREA")
	private String coUtilCrea;

	@Column(name="CO_UTIL_MAJ")
	private String coUtilMaj;

	@Column(name="CO_UTIL_MAJ_FONC")
	private String coUtilMajFonc;

    @Temporal( TemporalType.DATE)
	@Column(name="DT_ANNL")
	private Date dtAnnl;

    @Temporal( TemporalType.DATE)
	@Column(name="DT_CREA")
	private Date dtCrea;

    @Temporal( TemporalType.DATE)
	@Column(name="DT_DEB_GRP")
	private Date dtDebGrp;

    @Temporal( TemporalType.DATE)
	@Column(name="DT_FIN_GRP")
	private Date dtFinGrp;

    @Temporal( TemporalType.DATE)
	@Column(name="DT_MAJ")
	private Date dtMaj;

	@Column(name="ID_FONC_GRP")
	private String idFoncGrp;

	@Column(name="LB_NM_GRP")
	private String lbNmGrp;

	@Column(name="LB_REF_AGIRC")
	private String lbRefAgirc;

	@Column(name="TS_FONC")
	private String tsFonc;

	//bi-directional many-to-one association to LienGroupeEntreprise
	@OneToMany(mappedBy="groupe")
	private List<LienGroupeEntreprise> lienGroupeEntreprises;

    public Groupe() {
    }

	public long getIdTechGrp() {
		return this.idTechGrp;
	}

	public void setIdTechGrp(long idTechGrp) {
		this.idTechGrp = idTechGrp;
	}

	public String getCoMnemGrp() {
		return this.coMnemGrp;
	}

	public void setCoMnemGrp(String coMnemGrp) {
		this.coMnemGrp = coMnemGrp;
	}

	public String getCoTypeGrp() {
		return this.coTypeGrp;
	}

	public void setCoTypeGrp(String coTypeGrp) {
		this.coTypeGrp = coTypeGrp;
	}

	public String getCoUtilCrea() {
		return this.coUtilCrea;
	}

	public void setCoUtilCrea(String coUtilCrea) {
		this.coUtilCrea = coUtilCrea;
	}

	public String getCoUtilMaj() {
		return this.coUtilMaj;
	}

	public void setCoUtilMaj(String coUtilMaj) {
		this.coUtilMaj = coUtilMaj;
	}

	public String getCoUtilMajFonc() {
		return this.coUtilMajFonc;
	}

	public void setCoUtilMajFonc(String coUtilMajFonc) {
		this.coUtilMajFonc = coUtilMajFonc;
	}

	public Date getDtAnnl() {
		return this.dtAnnl;
	}

	public void setDtAnnl(Date dtAnnl) {
		this.dtAnnl = dtAnnl;
	}

	public Date getDtCrea() {
		return this.dtCrea;
	}

	public void setDtCrea(Date dtCrea) {
		this.dtCrea = dtCrea;
	}

	public Date getDtDebGrp() {
		return this.dtDebGrp;
	}

	public void setDtDebGrp(Date dtDebGrp) {
		this.dtDebGrp = dtDebGrp;
	}

	public Date getDtFinGrp() {
		return this.dtFinGrp;
	}

	public void setDtFinGrp(Date dtFinGrp) {
		this.dtFinGrp = dtFinGrp;
	}

	public Date getDtMaj() {
		return this.dtMaj;
	}

	public void setDtMaj(Date dtMaj) {
		this.dtMaj = dtMaj;
	}

	public String getIdFoncGrp() {
		return this.idFoncGrp;
	}

	public void setIdFoncGrp(String idFoncGrp) {
		this.idFoncGrp = idFoncGrp;
	}

	public String getLbNmGrp() {
		return this.lbNmGrp;
	}

	public void setLbNmGrp(String lbNmGrp) {
		this.lbNmGrp = lbNmGrp;
	}

	public String getLbRefAgirc() {
		return this.lbRefAgirc;
	}

	public void setLbRefAgirc(String lbRefAgirc) {
		this.lbRefAgirc = lbRefAgirc;
	}

	public String getTsFonc() {
		return this.tsFonc;
	}

	public void setTsFonc(String tsFonc) {
		this.tsFonc = tsFonc;
	}

	public List<LienGroupeEntreprise> getLienGroupeEntreprises() {
		return this.lienGroupeEntreprises;
	}

	public void setLienGroupeEntreprises(List<LienGroupeEntreprise> lienGroupeEntreprises) {
		this.lienGroupeEntreprises = lienGroupeEntreprises;
	}
	
}