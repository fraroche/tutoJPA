package fr.si2m.bref.orm;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the LIEN_GROUPE_ENTREPRISE database table.
 * 
 */
@Entity
@Table(name="LIEN_GROUPE_ENTREPRISE")
public class LienGroupeEntreprise implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private LienGroupeEntreprisePK id;

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
	@Column(name="DT_DEB_CFIL")
	private Date dtDebCfil;

	@Temporal( TemporalType.DATE)
	@Column(name="DT_DRAT")
	private Date dtDrat;

	@Temporal( TemporalType.DATE)
	@Column(name="DT_FIN_CFIL")
	private Date dtFinCfil;

	@Temporal( TemporalType.DATE)
	@Column(name="DT_FRAT")
	private Date dtFrat;

	@Temporal( TemporalType.DATE)
	@Column(name="DT_MAJ")
	private Date dtMaj;

	@Column(name="IN_CFIL")
	private String inCfil;

	@Column(name="NO_SEQ_GRP")
	private BigDecimal noSeqGrp;

	@Column(name="TS_FONC")
	private String tsFonc;

	//bi-directional many-to-one association to Groupe
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_TECH_GRP", insertable=false, updatable=false)
	private Groupe groupe;

	//bi-directional many-to-one association to SignaletiqueEntreprise
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_TECH_UR_ENTP", insertable=false, updatable=false)
	private SignaletiqueEntreprise signaletiqueEntreprise;

	public LienGroupeEntreprise() {
	}

	public LienGroupeEntreprisePK getId() {
		return this.id;
	}

	public void setId(LienGroupeEntreprisePK id) {
		this.id = id;
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

	public Date getDtDebCfil() {
		return this.dtDebCfil;
	}

	public void setDtDebCfil(Date dtDebCfil) {
		this.dtDebCfil = dtDebCfil;
	}

	public Date getDtDrat() {
		return this.dtDrat;
	}

	public void setDtDrat(Date dtDrat) {
		this.dtDrat = dtDrat;
	}

	public Date getDtFinCfil() {
		return this.dtFinCfil;
	}

	public void setDtFinCfil(Date dtFinCfil) {
		this.dtFinCfil = dtFinCfil;
	}

	public Date getDtFrat() {
		return this.dtFrat;
	}

	public void setDtFrat(Date dtFrat) {
		this.dtFrat = dtFrat;
	}

	public Date getDtMaj() {
		return this.dtMaj;
	}

	public void setDtMaj(Date dtMaj) {
		this.dtMaj = dtMaj;
	}

	public String getInCfil() {
		return this.inCfil;
	}

	public void setInCfil(String inCfil) {
		this.inCfil = inCfil;
	}

	public BigDecimal getNoSeqGrp() {
		return this.noSeqGrp;
	}

	public void setNoSeqGrp(BigDecimal noSeqGrp) {
		this.noSeqGrp = noSeqGrp;
	}

	public String getTsFonc() {
		return this.tsFonc;
	}

	public void setTsFonc(String tsFonc) {
		this.tsFonc = tsFonc;
	}

	public Groupe getGroupe() {
		return this.groupe;
	}

	public void setGroupe(Groupe groupe) {
		this.groupe = groupe;
	}

	public SignaletiqueEntreprise getSignaletiqueEntreprise() {
		return this.signaletiqueEntreprise;
	}

	public void setSignaletiqueEntreprise(SignaletiqueEntreprise signaletiqueEntreprise) {
		this.signaletiqueEntreprise = signaletiqueEntreprise;
	}

}