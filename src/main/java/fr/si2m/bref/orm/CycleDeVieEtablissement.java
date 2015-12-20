package fr.si2m.bref.orm;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the CYCLE_DE_VIE_ETABLISSEMENT database table.
 * 
 */
@Entity
@Table(name="CYCLE_DE_VIE_ETABLISSEMENT")
public class CycleDeVieEtablissement implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_TECH_CYVI_ETAB")
	private long idTechCyviEtab;

	@Column(name="CO_ID_EXT_ETAB")
	private BigDecimal coIdExtEtab;

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
	@Column(name="DT_CREA")
	private Date dtCrea;

    @Temporal( TemporalType.DATE)
	@Column(name="DT_MAJ")
	private Date dtMaj;

	@Column(name="ID_EXT_ETAB")
	private String idExtEtab;

	@Column(name="ID_TECH_CYVI_ENTP_ETAB")
	private BigDecimal idTechCyviEntpEtab;

	@Column(name="ID_TECH_ETAB_LIE")
	private BigDecimal idTechEtabLie;

	@Column(name="ID_TECH_UR_ETAB_CYVI")
	private BigDecimal idTechUrEtabCyvi;

	@Column(name="LB_ENS")
	private String lbEns;

	@Column(name="NO_INST_1")
	private String noInst1;

	@Column(name="NO_INST_2")
	private String noInst2;

	@Column(name="TS_FONC")
	private String tsFonc;

	//bi-directional many-to-many association to SignaletiqueEtablissement
	@ManyToMany(mappedBy="cycleDeVieEtablissements")
	private List<SignaletiqueEtablissement> signaletiqueEtablissements;

    public CycleDeVieEtablissement() {
    }

	public long getIdTechCyviEtab() {
		return this.idTechCyviEtab;
	}

	public void setIdTechCyviEtab(long idTechCyviEtab) {
		this.idTechCyviEtab = idTechCyviEtab;
	}

	public BigDecimal getCoIdExtEtab() {
		return this.coIdExtEtab;
	}

	public void setCoIdExtEtab(BigDecimal coIdExtEtab) {
		this.coIdExtEtab = coIdExtEtab;
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

	public Date getDtCrea() {
		return this.dtCrea;
	}

	public void setDtCrea(Date dtCrea) {
		this.dtCrea = dtCrea;
	}

	public Date getDtMaj() {
		return this.dtMaj;
	}

	public void setDtMaj(Date dtMaj) {
		this.dtMaj = dtMaj;
	}

	public String getIdExtEtab() {
		return this.idExtEtab;
	}

	public void setIdExtEtab(String idExtEtab) {
		this.idExtEtab = idExtEtab;
	}

	public BigDecimal getIdTechCyviEntpEtab() {
		return this.idTechCyviEntpEtab;
	}

	public void setIdTechCyviEntpEtab(BigDecimal idTechCyviEntpEtab) {
		this.idTechCyviEntpEtab = idTechCyviEntpEtab;
	}

	public BigDecimal getIdTechEtabLie() {
		return this.idTechEtabLie;
	}

	public void setIdTechEtabLie(BigDecimal idTechEtabLie) {
		this.idTechEtabLie = idTechEtabLie;
	}

	public BigDecimal getIdTechUrEtabCyvi() {
		return this.idTechUrEtabCyvi;
	}

	public void setIdTechUrEtabCyvi(BigDecimal idTechUrEtabCyvi) {
		this.idTechUrEtabCyvi = idTechUrEtabCyvi;
	}

	public String getLbEns() {
		return this.lbEns;
	}

	public void setLbEns(String lbEns) {
		this.lbEns = lbEns;
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

	public List<SignaletiqueEtablissement> getSignaletiqueEtablissements() {
		return this.signaletiqueEtablissements;
	}

	public void setSignaletiqueEtablissements(List<SignaletiqueEtablissement> signaletiqueEtablissements) {
		this.signaletiqueEtablissements = signaletiqueEtablissements;
	}
	
}