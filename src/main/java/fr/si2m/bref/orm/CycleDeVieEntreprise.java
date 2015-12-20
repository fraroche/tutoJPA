package fr.si2m.bref.orm;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the CYCLE_DE_VIE_ENTREPRISE database table.
 * 
 */
@Entity
@Table(name="CYCLE_DE_VIE_ENTREPRISE")
public class CycleDeVieEntreprise implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_TECH_CYVI_ENTP")
	private long idTechCyviEntp;

	@Column(name="CO_CAR_CYVI")
	private String coCarCyvi;

	@Column(name="CO_CYVI_ENTP")
	private String coCyviEntp;

	@Column(name="CO_FAM_CYVI")
	private String coFamCyvi;

	@Column(name="CO_ID_EXT_ENTP")
	private String coIdExtEntp;

	@Column(name="CO_REG_1")
	private String coReg1;

	@Column(name="CO_REG_2")
	private String coReg2;

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
	@Column(name="DT_AVIS_DCLA")
	private Date dtAvisDcla;

    @Temporal( TemporalType.DATE)
	@Column(name="DT_CREA")
	private Date dtCrea;

    @Temporal( TemporalType.DATE)
	@Column(name="DT_EFET_CYVI_ENTP")
	private Date dtEfetCyviEntp;

    @Temporal( TemporalType.DATE)
	@Column(name="DT_MAJ")
	private Date dtMaj;

    @Temporal( TemporalType.DATE)
	@Column(name="DT_PUB_BOD")
	private Date dtPubBod;

	@Column(name="ID_EXT_ENTP")
	private String idExtEntp;

	@Column(name="ID_TECH_ENTP_LIE")
	private String idTechEntpLie;

	@Column(name="ID_TECH_UR_ENTP_CYVI")
	private String idTechUrEntpCyvi;

	@Column(name="LB_ACTV_CEDE")
	private String lbActvCede;

	@Column(name="LB_RS")
	private String lbRs;

	@Column(name="NB_A36_AGIRC")
	private BigDecimal nbA36Agirc;

	@Column(name="NB_A36_ARRCO")
	private BigDecimal nbA36Arrco;

	@Column(name="NB_CADR_AGIRC")
	private BigDecimal nbCadrAgirc;

	@Column(name="NB_CADR_ARRCO")
	private BigDecimal nbCadrArrco;

	@Column(name="NB_NON_CADR_ARRCO")
	private BigDecimal nbNonCadrArrco;

	@Column(name="NO_INST_1")
	private String noInst1;

	@Column(name="NO_INST_2")
	private String noInst2;

	@Column(name="TS_FONC")
	private String tsFonc;

	//bi-directional many-to-many association to SignaletiqueEntreprise
	@ManyToMany(mappedBy="cycleDeVieEntreprises")
	private List<SignaletiqueEntreprise> signaletiqueEntreprises;

    public CycleDeVieEntreprise() {
    }

	public long getIdTechCyviEntp() {
		return this.idTechCyviEntp;
	}

	public void setIdTechCyviEntp(long idTechCyviEntp) {
		this.idTechCyviEntp = idTechCyviEntp;
	}

	public String getCoCarCyvi() {
		return this.coCarCyvi;
	}

	public void setCoCarCyvi(String coCarCyvi) {
		this.coCarCyvi = coCarCyvi;
	}

	public String getCoCyviEntp() {
		return this.coCyviEntp;
	}

	public void setCoCyviEntp(String coCyviEntp) {
		this.coCyviEntp = coCyviEntp;
	}

	public String getCoFamCyvi() {
		return this.coFamCyvi;
	}

	public void setCoFamCyvi(String coFamCyvi) {
		this.coFamCyvi = coFamCyvi;
	}

	public String getCoIdExtEntp() {
		return this.coIdExtEntp;
	}

	public void setCoIdExtEntp(String coIdExtEntp) {
		this.coIdExtEntp = coIdExtEntp;
	}

	public String getCoReg1() {
		return this.coReg1;
	}

	public void setCoReg1(String coReg1) {
		this.coReg1 = coReg1;
	}

	public String getCoReg2() {
		return this.coReg2;
	}

	public void setCoReg2(String coReg2) {
		this.coReg2 = coReg2;
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

	public Date getDtAvisDcla() {
		return this.dtAvisDcla;
	}

	public void setDtAvisDcla(Date dtAvisDcla) {
		this.dtAvisDcla = dtAvisDcla;
	}

	public Date getDtCrea() {
		return this.dtCrea;
	}

	public void setDtCrea(Date dtCrea) {
		this.dtCrea = dtCrea;
	}

	public Date getDtEfetCyviEntp() {
		return this.dtEfetCyviEntp;
	}

	public void setDtEfetCyviEntp(Date dtEfetCyviEntp) {
		this.dtEfetCyviEntp = dtEfetCyviEntp;
	}

	public Date getDtMaj() {
		return this.dtMaj;
	}

	public void setDtMaj(Date dtMaj) {
		this.dtMaj = dtMaj;
	}

	public Date getDtPubBod() {
		return this.dtPubBod;
	}

	public void setDtPubBod(Date dtPubBod) {
		this.dtPubBod = dtPubBod;
	}

	public String getIdExtEntp() {
		return this.idExtEntp;
	}

	public void setIdExtEntp(String idExtEntp) {
		this.idExtEntp = idExtEntp;
	}

	public String getIdTechEntpLie() {
		return this.idTechEntpLie;
	}

	public void setIdTechEntpLie(String idTechEntpLie) {
		this.idTechEntpLie = idTechEntpLie;
	}

	public String getIdTechUrEntpCyvi() {
		return this.idTechUrEntpCyvi;
	}

	public void setIdTechUrEntpCyvi(String idTechUrEntpCyvi) {
		this.idTechUrEntpCyvi = idTechUrEntpCyvi;
	}

	public String getLbActvCede() {
		return this.lbActvCede;
	}

	public void setLbActvCede(String lbActvCede) {
		this.lbActvCede = lbActvCede;
	}

	public String getLbRs() {
		return this.lbRs;
	}

	public void setLbRs(String lbRs) {
		this.lbRs = lbRs;
	}

	public BigDecimal getNbA36Agirc() {
		return this.nbA36Agirc;
	}

	public void setNbA36Agirc(BigDecimal nbA36Agirc) {
		this.nbA36Agirc = nbA36Agirc;
	}

	public BigDecimal getNbA36Arrco() {
		return this.nbA36Arrco;
	}

	public void setNbA36Arrco(BigDecimal nbA36Arrco) {
		this.nbA36Arrco = nbA36Arrco;
	}

	public BigDecimal getNbCadrAgirc() {
		return this.nbCadrAgirc;
	}

	public void setNbCadrAgirc(BigDecimal nbCadrAgirc) {
		this.nbCadrAgirc = nbCadrAgirc;
	}

	public BigDecimal getNbCadrArrco() {
		return this.nbCadrArrco;
	}

	public void setNbCadrArrco(BigDecimal nbCadrArrco) {
		this.nbCadrArrco = nbCadrArrco;
	}

	public BigDecimal getNbNonCadrArrco() {
		return this.nbNonCadrArrco;
	}

	public void setNbNonCadrArrco(BigDecimal nbNonCadrArrco) {
		this.nbNonCadrArrco = nbNonCadrArrco;
	}

	public String getNoInst1() {
		return this.noInst1;
	}

	public void setNoInst1(String noInst1) {
		this.noInst1 = noInst1;
	}

	public String getNoInst2() {
		return this.noInst2;
	}

	public void setNoInst2(String noInst2) {
		this.noInst2 = noInst2;
	}

	public String getTsFonc() {
		return this.tsFonc;
	}

	public void setTsFonc(String tsFonc) {
		this.tsFonc = tsFonc;
	}

	public List<SignaletiqueEntreprise> getSignaletiqueEntreprises() {
		return this.signaletiqueEntreprises;
	}

	public void setSignaletiqueEntreprises(List<SignaletiqueEntreprise> signaletiqueEntreprises) {
		this.signaletiqueEntreprises = signaletiqueEntreprises;
	}
	
}