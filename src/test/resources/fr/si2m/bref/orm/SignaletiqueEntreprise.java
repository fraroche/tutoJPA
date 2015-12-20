package fr.si2m.bref.orm;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the SIGNALETIQUE_ENTREPRISE database table.
 * 
 */
@Entity
@Table(name="SIGNALETIQUE_ENTREPRISE")
public class SignaletiqueEntreprise implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_TECH_UR_ENTP")
	private long idTechUrEntp;

	@Column(name="CO_ACTV_PRIN")
	private String coActvPrin;

	@Column(name="CO_CAT_JUR")
	private String coCatJur;

	@Column(name="CO_FORM_JUR")
	private String coFormJur;

	@Column(name="CO_MOTF_CREA_ENTP")
	private String coMotfCreaEntp;

	@Column(name="CO_ORIGINE_ENTITE")
	private String coOrigineEntite;

	@Column(name="CO_SECT_PROF")
	private String coSectProf;

	@Column(name="CO_SEXE")
	private String coSexe;

	@Column(name="CO_TYID_EXT_ENTP")
	private String coTyidExtEntp;

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
	@Column(name="DT_CREA_ENTP")
	private Date dtCreaEntp;

	@Temporal( TemporalType.DATE)
	@Column(name="DT_EFET_ACTV_PRIN")
	private Date dtEfetActvPrin;

	@Temporal( TemporalType.DATE)
	@Column(name="DT_EFET_CAT_JUR")
	private Date dtEfetCatJur;

	@Temporal( TemporalType.DATE)
	@Column(name="DT_EFET_FORM_JUR")
	private Date dtEfetFormJur;

	@Temporal( TemporalType.DATE)
	@Column(name="DT_EFET_ID_EXT")
	private Date dtEfetIdExt;

	@Temporal( TemporalType.DATE)
	@Column(name="DT_EFET_RS")
	private Date dtEfetRs;

	@Temporal( TemporalType.DATE)
	@Column(name="DT_EFET_SIGL")
	private Date dtEfetSigl;

	@Temporal( TemporalType.DATE)
	@Column(name="DT_FEFE_SIGL")
	private Date dtFefeSigl;

	@Temporal( TemporalType.DATE)
	@Column(name="DT_FERM")
	private Date dtFerm;

	@Temporal( TemporalType.DATE)
	@Column(name="DT_MAJ")
	private Date dtMaj;

	@Column(name="ID_EXT_ENTP")
	private String idExtEntp;

	@Column(name="ID_FONC_ENTP")
	private String idFoncEntp;

	@Column(name="IN_ELIG_MAJ_AURA")
	private String inEligMajAura;

	@Column(name="IN_ELIG_SOMM")
	private String inEligSomm;

	@Column(name="IN_GRAN_CPTE")
	private String inGranCpte;

	@Column(name="IN_SNSB")
	private String inSnsb;

	@Column(name="IN_SOMM")
	private String inSomm;

	@Column(name="LB_RS")
	private String lbRs;

	@Column(name="LB_RS_ABRG")
	private String lbRsAbrg;

	@Column(name="LB_SIGL")
	private String lbSigl;

	@Column(name="TS_FONC")
	private String tsFonc;

	//bi-directional many-to-one association to Adherent
	@OneToMany(mappedBy="signaletiqueEntreprise")
	private List<Adherent> adherents;

	//bi-directional many-to-one association to LienGroupeEntreprise
	@OneToMany(mappedBy="signaletiqueEntreprise")
	private List<LienGroupeEntreprise> lienGroupeEntreprises;

	//bi-directional many-to-many association to CycleDeVieEntreprise
	@ManyToMany
	@JoinTable(
			name="RELATION_5"
			, joinColumns={
					@JoinColumn(name="ID_TECH_UR_ENTP")
			}
			, inverseJoinColumns={
					@JoinColumn(name="ID_TECH_CYVI_ENTP")
			}
			)
	private List<CycleDeVieEntreprise> cycleDeVieEntreprises;

	//bi-directional many-to-one association to SignaletiqueEtablissement
	@OneToMany(mappedBy="signaletiqueEntreprise")
	private List<SignaletiqueEtablissement> signaletiqueEtablissements;

	public SignaletiqueEntreprise() {
	}

	public long getIdTechUrEntp() {
		return this.idTechUrEntp;
	}

	public void setIdTechUrEntp(long idTechUrEntp) {
		this.idTechUrEntp = idTechUrEntp;
	}

	public String getCoActvPrin() {
		return this.coActvPrin;
	}

	public void setCoActvPrin(String coActvPrin) {
		this.coActvPrin = coActvPrin;
	}

	public String getCoCatJur() {
		return this.coCatJur;
	}

	public void setCoCatJur(String coCatJur) {
		this.coCatJur = coCatJur;
	}

	public String getCoFormJur() {
		return this.coFormJur;
	}

	public void setCoFormJur(String coFormJur) {
		this.coFormJur = coFormJur;
	}

	public String getCoMotfCreaEntp() {
		return this.coMotfCreaEntp;
	}

	public void setCoMotfCreaEntp(String coMotfCreaEntp) {
		this.coMotfCreaEntp = coMotfCreaEntp;
	}

	public String getCoOrigineEntite() {
		return this.coOrigineEntite;
	}

	public void setCoOrigineEntite(String coOrigineEntite) {
		this.coOrigineEntite = coOrigineEntite;
	}

	public String getCoSectProf() {
		return this.coSectProf;
	}

	public void setCoSectProf(String coSectProf) {
		this.coSectProf = coSectProf;
	}

	public String getCoSexe() {
		return this.coSexe;
	}

	public void setCoSexe(String coSexe) {
		this.coSexe = coSexe;
	}

	public String getCoTyidExtEntp() {
		return this.coTyidExtEntp;
	}

	public void setCoTyidExtEntp(String coTyidExtEntp) {
		this.coTyidExtEntp = coTyidExtEntp;
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

	public Date getDtCreaEntp() {
		return this.dtCreaEntp;
	}

	public void setDtCreaEntp(Date dtCreaEntp) {
		this.dtCreaEntp = dtCreaEntp;
	}

	public Date getDtEfetActvPrin() {
		return this.dtEfetActvPrin;
	}

	public void setDtEfetActvPrin(Date dtEfetActvPrin) {
		this.dtEfetActvPrin = dtEfetActvPrin;
	}

	public Date getDtEfetCatJur() {
		return this.dtEfetCatJur;
	}

	public void setDtEfetCatJur(Date dtEfetCatJur) {
		this.dtEfetCatJur = dtEfetCatJur;
	}

	public Date getDtEfetFormJur() {
		return this.dtEfetFormJur;
	}

	public void setDtEfetFormJur(Date dtEfetFormJur) {
		this.dtEfetFormJur = dtEfetFormJur;
	}

	public Date getDtEfetIdExt() {
		return this.dtEfetIdExt;
	}

	public void setDtEfetIdExt(Date dtEfetIdExt) {
		this.dtEfetIdExt = dtEfetIdExt;
	}

	public Date getDtEfetRs() {
		return this.dtEfetRs;
	}

	public void setDtEfetRs(Date dtEfetRs) {
		this.dtEfetRs = dtEfetRs;
	}

	public Date getDtEfetSigl() {
		return this.dtEfetSigl;
	}

	public void setDtEfetSigl(Date dtEfetSigl) {
		this.dtEfetSigl = dtEfetSigl;
	}

	public Date getDtFefeSigl() {
		return this.dtFefeSigl;
	}

	public void setDtFefeSigl(Date dtFefeSigl) {
		this.dtFefeSigl = dtFefeSigl;
	}

	public Date getDtFerm() {
		return this.dtFerm;
	}

	public void setDtFerm(Date dtFerm) {
		this.dtFerm = dtFerm;
	}

	public Date getDtMaj() {
		return this.dtMaj;
	}

	public void setDtMaj(Date dtMaj) {
		this.dtMaj = dtMaj;
	}

	public String getIdExtEntp() {
		return this.idExtEntp;
	}

	public void setIdExtEntp(String idExtEntp) {
		this.idExtEntp = idExtEntp;
	}

	public String getIdFoncEntp() {
		return this.idFoncEntp;
	}

	public void setIdFoncEntp(String idFoncEntp) {
		this.idFoncEntp = idFoncEntp;
	}

	public String getInEligMajAura() {
		return this.inEligMajAura;
	}

	public void setInEligMajAura(String inEligMajAura) {
		this.inEligMajAura = inEligMajAura;
	}

	public String getInEligSomm() {
		return this.inEligSomm;
	}

	public void setInEligSomm(String inEligSomm) {
		this.inEligSomm = inEligSomm;
	}

	public String getInGranCpte() {
		return this.inGranCpte;
	}

	public void setInGranCpte(String inGranCpte) {
		this.inGranCpte = inGranCpte;
	}

	public String getInSnsb() {
		return this.inSnsb;
	}

	public void setInSnsb(String inSnsb) {
		this.inSnsb = inSnsb;
	}

	public String getInSomm() {
		return this.inSomm;
	}

	public void setInSomm(String inSomm) {
		this.inSomm = inSomm;
	}

	public String getLbRs() {
		return this.lbRs;
	}

	public void setLbRs(String lbRs) {
		this.lbRs = lbRs;
	}

	public String getLbRsAbrg() {
		return this.lbRsAbrg;
	}

	public void setLbRsAbrg(String lbRsAbrg) {
		this.lbRsAbrg = lbRsAbrg;
	}

	public String getLbSigl() {
		return this.lbSigl;
	}

	public void setLbSigl(String lbSigl) {
		this.lbSigl = lbSigl;
	}

	public String getTsFonc() {
		return this.tsFonc;
	}

	public void setTsFonc(String tsFonc) {
		this.tsFonc = tsFonc;
	}

	public List<Adherent> getAdherents() {
		return this.adherents;
	}

	public void setAdherents(List<Adherent> adherents) {
		this.adherents = adherents;
	}

	public List<LienGroupeEntreprise> getLienGroupeEntreprises() {
		return this.lienGroupeEntreprises;
	}

	public void setLienGroupeEntreprises(List<LienGroupeEntreprise> lienGroupeEntreprises) {
		this.lienGroupeEntreprises = lienGroupeEntreprises;
	}

	public List<CycleDeVieEntreprise> getCycleDeVieEntreprises() {
		return this.cycleDeVieEntreprises;
	}

	public void setCycleDeVieEntreprises(List<CycleDeVieEntreprise> cycleDeVieEntreprises) {
		this.cycleDeVieEntreprises = cycleDeVieEntreprises;
	}

	public List<SignaletiqueEtablissement> getSignaletiqueEtablissements() {
		return this.signaletiqueEtablissements;
	}

	public void setSignaletiqueEtablissements(List<SignaletiqueEtablissement> signaletiqueEtablissements) {
		this.signaletiqueEtablissements = signaletiqueEtablissements;
	}

}