package fr.si2m.bref.orm;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the SIGNALETIQUE_ETABLISSEMENT database table.
 * 
 */
@Entity
@Table(name="SIGNALETIQUE_ETABLISSEMENT")
public class SignaletiqueEtablissement implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_TECH_UR_ETAB")
	private long idTechUrEtab;

	@Column(name="CO_ACTV_PRIN")
	private String coActvPrin;

	@Column(name="CO_CONV_COLL_APPB")
	private String coConvCollAppb;

	@Column(name="CO_CONV_COLL_APPL")
	private String coConvCollAppl;

	@Column(name="CO_MOTF_CREA_ETAB")
	private String coMotfCreaEtab;

	@Column(name="CO_MOTF_FERM_ETAB")
	private String coMotfFermEtab;

	@Column(name="CO_ORIG_ENTI")
	private String coOrigEnti;

	@Column(name="CO_SYND_PROF")
	private String coSyndProf;

	@Column(name="CO_TYID_EXT_ETAB")
	private String coTyidExtEtab;

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
	@Column(name="DT_CREA_ETAB")
	private Date dtCreaEtab;

    @Temporal( TemporalType.DATE)
	@Column(name="DT_DEFF_CONV_APPB")
	private Date dtDeffConvAppb;

    @Temporal( TemporalType.DATE)
	@Column(name="DT_DEFF_CONV_APPL")
	private Date dtDeffConvAppl;

    @Temporal( TemporalType.DATE)
	@Column(name="DT_DEFF_ENS")
	private Date dtDeffEns;

    @Temporal( TemporalType.DATE)
	@Column(name="DT_DEFF_SGSC")
	private Date dtDeffSgsc;

    @Temporal( TemporalType.DATE)
	@Column(name="DT_DEFF_SYND_PROF")
	private Date dtDeffSyndProf;

    @Temporal( TemporalType.DATE)
	@Column(name="DT_EFET_ACTV_PRIN")
	private Date dtEfetActvPrin;

    @Temporal( TemporalType.DATE)
	@Column(name="DT_EFET_ID_EXT")
	private Date dtEfetIdExt;

    @Temporal( TemporalType.DATE)
	@Column(name="DT_FEFF_CONV_APPB")
	private Date dtFeffConvAppb;

    @Temporal( TemporalType.DATE)
	@Column(name="DT_FEFF_CONV_APPL")
	private Date dtFeffConvAppl;

    @Temporal( TemporalType.DATE)
	@Column(name="DT_FEFF_ENS")
	private Date dtFeffEns;

    @Temporal( TemporalType.DATE)
	@Column(name="DT_FEFF_SGSC")
	private Date dtFeffSgsc;

    @Temporal( TemporalType.DATE)
	@Column(name="DT_FEFF_SYND_PROF")
	private Date dtFeffSyndProf;

    @Temporal( TemporalType.DATE)
	@Column(name="DT_FERM")
	private Date dtFerm;

    @Temporal( TemporalType.DATE)
	@Column(name="DT_MAJ")
	private Date dtMaj;

	@Column(name="ID_EXT_ETAB")
	private String idExtEtab;

	@Column(name="ID_FONC_ETAB")
	private String idFoncEtab;

	@Column(name="ID_TECH_UR_ENTP_ETAB")
	private BigDecimal idTechUrEntpEtab;

	@Column(name="IN_ADHR")
	private String inAdhr;

	@Column(name="IN_ELIG_MAJ_AURA")
	private String inEligMajAura;

	@Column(name="IN_SGSC")
	private String inSgsc;

	@Column(name="LB_ENS")
	private String lbEns;

	@Column(name="TS_FONC")
	private String tsFonc;

	//bi-directional many-to-one association to AdressesEtablissement
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_TECH_AD")
	private AdressesEtablissement adressesEtablissement;

	//bi-directional many-to-many association to CycleDeVieEtablissement
    @ManyToMany
	@JoinTable(
		name="RELATION_7"
		, joinColumns={
			@JoinColumn(name="ID_TECH_UR_ETAB")
			}
		, inverseJoinColumns={
			@JoinColumn(name="ID_TECH_CYVI_ETAB")
			}
		)
	private List<CycleDeVieEtablissement> cycleDeVieEtablissements;

	//bi-directional many-to-one association to MoyenDePaiementEtablissement
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_TECH_MOY_PAI")
	private MoyenDePaiementEtablissement moyenDePaiementEtablissement;

	//bi-directional many-to-one association to SignaletiqueEntreprise
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_TECH_UR_ENTP")
	private SignaletiqueEntreprise signaletiqueEntreprise;

    public SignaletiqueEtablissement() {
    }

	public long getIdTechUrEtab() {
		return this.idTechUrEtab;
	}

	public void setIdTechUrEtab(long idTechUrEtab) {
		this.idTechUrEtab = idTechUrEtab;
	}

	public String getCoActvPrin() {
		return this.coActvPrin;
	}

	public void setCoActvPrin(String coActvPrin) {
		this.coActvPrin = coActvPrin;
	}

	public String getCoConvCollAppb() {
		return this.coConvCollAppb;
	}

	public void setCoConvCollAppb(String coConvCollAppb) {
		this.coConvCollAppb = coConvCollAppb;
	}

	public String getCoConvCollAppl() {
		return this.coConvCollAppl;
	}

	public void setCoConvCollAppl(String coConvCollAppl) {
		this.coConvCollAppl = coConvCollAppl;
	}

	public String getCoMotfCreaEtab() {
		return this.coMotfCreaEtab;
	}

	public void setCoMotfCreaEtab(String coMotfCreaEtab) {
		this.coMotfCreaEtab = coMotfCreaEtab;
	}

	public String getCoMotfFermEtab() {
		return this.coMotfFermEtab;
	}

	public void setCoMotfFermEtab(String coMotfFermEtab) {
		this.coMotfFermEtab = coMotfFermEtab;
	}

	public String getCoOrigEnti() {
		return this.coOrigEnti;
	}

	public void setCoOrigEnti(String coOrigEnti) {
		this.coOrigEnti = coOrigEnti;
	}

	public String getCoSyndProf() {
		return this.coSyndProf;
	}

	public void setCoSyndProf(String coSyndProf) {
		this.coSyndProf = coSyndProf;
	}

	public String getCoTyidExtEtab() {
		return this.coTyidExtEtab;
	}

	public void setCoTyidExtEtab(String coTyidExtEtab) {
		this.coTyidExtEtab = coTyidExtEtab;
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

	public Date getDtCreaEtab() {
		return this.dtCreaEtab;
	}

	public void setDtCreaEtab(Date dtCreaEtab) {
		this.dtCreaEtab = dtCreaEtab;
	}

	public Date getDtDeffConvAppb() {
		return this.dtDeffConvAppb;
	}

	public void setDtDeffConvAppb(Date dtDeffConvAppb) {
		this.dtDeffConvAppb = dtDeffConvAppb;
	}

	public Date getDtDeffConvAppl() {
		return this.dtDeffConvAppl;
	}

	public void setDtDeffConvAppl(Date dtDeffConvAppl) {
		this.dtDeffConvAppl = dtDeffConvAppl;
	}

	public Date getDtDeffEns() {
		return this.dtDeffEns;
	}

	public void setDtDeffEns(Date dtDeffEns) {
		this.dtDeffEns = dtDeffEns;
	}

	public Date getDtDeffSgsc() {
		return this.dtDeffSgsc;
	}

	public void setDtDeffSgsc(Date dtDeffSgsc) {
		this.dtDeffSgsc = dtDeffSgsc;
	}

	public Date getDtDeffSyndProf() {
		return this.dtDeffSyndProf;
	}

	public void setDtDeffSyndProf(Date dtDeffSyndProf) {
		this.dtDeffSyndProf = dtDeffSyndProf;
	}

	public Date getDtEfetActvPrin() {
		return this.dtEfetActvPrin;
	}

	public void setDtEfetActvPrin(Date dtEfetActvPrin) {
		this.dtEfetActvPrin = dtEfetActvPrin;
	}

	public Date getDtEfetIdExt() {
		return this.dtEfetIdExt;
	}

	public void setDtEfetIdExt(Date dtEfetIdExt) {
		this.dtEfetIdExt = dtEfetIdExt;
	}

	public Date getDtFeffConvAppb() {
		return this.dtFeffConvAppb;
	}

	public void setDtFeffConvAppb(Date dtFeffConvAppb) {
		this.dtFeffConvAppb = dtFeffConvAppb;
	}

	public Date getDtFeffConvAppl() {
		return this.dtFeffConvAppl;
	}

	public void setDtFeffConvAppl(Date dtFeffConvAppl) {
		this.dtFeffConvAppl = dtFeffConvAppl;
	}

	public Date getDtFeffEns() {
		return this.dtFeffEns;
	}

	public void setDtFeffEns(Date dtFeffEns) {
		this.dtFeffEns = dtFeffEns;
	}

	public Date getDtFeffSgsc() {
		return this.dtFeffSgsc;
	}

	public void setDtFeffSgsc(Date dtFeffSgsc) {
		this.dtFeffSgsc = dtFeffSgsc;
	}

	public Date getDtFeffSyndProf() {
		return this.dtFeffSyndProf;
	}

	public void setDtFeffSyndProf(Date dtFeffSyndProf) {
		this.dtFeffSyndProf = dtFeffSyndProf;
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

	public String getIdExtEtab() {
		return this.idExtEtab;
	}

	public void setIdExtEtab(String idExtEtab) {
		this.idExtEtab = idExtEtab;
	}

	public String getIdFoncEtab() {
		return this.idFoncEtab;
	}

	public void setIdFoncEtab(String idFoncEtab) {
		this.idFoncEtab = idFoncEtab;
	}

	public BigDecimal getIdTechUrEntpEtab() {
		return this.idTechUrEntpEtab;
	}

	public void setIdTechUrEntpEtab(BigDecimal idTechUrEntpEtab) {
		this.idTechUrEntpEtab = idTechUrEntpEtab;
	}

	public String getInAdhr() {
		return this.inAdhr;
	}

	public void setInAdhr(String inAdhr) {
		this.inAdhr = inAdhr;
	}

	public String getInEligMajAura() {
		return this.inEligMajAura;
	}

	public void setInEligMajAura(String inEligMajAura) {
		this.inEligMajAura = inEligMajAura;
	}

	public String getInSgsc() {
		return this.inSgsc;
	}

	public void setInSgsc(String inSgsc) {
		this.inSgsc = inSgsc;
	}

	public String getLbEns() {
		return this.lbEns;
	}

	public void setLbEns(String lbEns) {
		this.lbEns = lbEns;
	}

	public String getTsFonc() {
		return this.tsFonc;
	}

	public void setTsFonc(String tsFonc) {
		this.tsFonc = tsFonc;
	}

	public AdressesEtablissement getAdressesEtablissement() {
		return this.adressesEtablissement;
	}

	public void setAdressesEtablissement(AdressesEtablissement adressesEtablissement) {
		this.adressesEtablissement = adressesEtablissement;
	}
	
	public List<CycleDeVieEtablissement> getCycleDeVieEtablissements() {
		return this.cycleDeVieEtablissements;
	}

	public void setCycleDeVieEtablissements(List<CycleDeVieEtablissement> cycleDeVieEtablissements) {
		this.cycleDeVieEtablissements = cycleDeVieEtablissements;
	}
	
	public MoyenDePaiementEtablissement getMoyenDePaiementEtablissement() {
		return this.moyenDePaiementEtablissement;
	}

	public void setMoyenDePaiementEtablissement(MoyenDePaiementEtablissement moyenDePaiementEtablissement) {
		this.moyenDePaiementEtablissement = moyenDePaiementEtablissement;
	}
	
	public SignaletiqueEntreprise getSignaletiqueEntreprise() {
		return this.signaletiqueEntreprise;
	}

	public void setSignaletiqueEntreprise(SignaletiqueEntreprise signaletiqueEntreprise) {
		this.signaletiqueEntreprise = signaletiqueEntreprise;
	}
	
}