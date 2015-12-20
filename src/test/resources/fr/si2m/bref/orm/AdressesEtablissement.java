package fr.si2m.bref.orm;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the ADRESSES_ETABLISSEMENT database table.
 * 
 */
@Entity
@Table(name="ADRESSES_ETABLISSEMENT")
public class AdressesEtablissement implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_TECH_AD")
	private long idTechAd;

	@Column(name="AD_LIGN_4_NON_NORM")
	private String adLign4NonNorm;

	@Column(name="CO_CMN_INSEE")
	private String coCmnInsee;

	@Column(name="CO_CP")
	private String coCp;

	@Column(name="CO_DPT_GEO")
	private String coDptGeo;

	@Column(name="CO_EXTS_AD")
	private String coExtsAd;

	@Column(name="CO_MFIN_AD")
	private String coMfinAd;

	@Column(name="CO_NORM_AD")
	private String coNormAd;

	@Column(name="CO_NPAI")
	private String coNpai;

	@Column(name="CO_ORIG_ENTI")
	private String coOrigEnti;

	@Column(name="CO_PAYS_ETHI")
	private String coPaysEthi;

	@Column(name="CO_TYPE_VOIE")
	private String coTypeVoie;

	@Column(name="CO_UTIL_CREA")
	private String coUtilCrea;

	@Column(name="CO_UTIL_FONC")
	private String coUtilFonc;

	@Column(name="CO_UTIL_MAJ")
	private String coUtilMaj;

    @Temporal( TemporalType.DATE)
	@Column(name="DT_ANNL")
	private Date dtAnnl;

    @Temporal( TemporalType.DATE)
	@Column(name="DT_CREA")
	private Date dtCrea;

    @Temporal( TemporalType.DATE)
	@Column(name="DT_DEFF_AD")
	private Date dtDeffAd;

    @Temporal( TemporalType.DATE)
	@Column(name="DT_FEFF_AD")
	private Date dtFeffAd;

    @Temporal( TemporalType.DATE)
	@Column(name="DT_MAJ")
	private Date dtMaj;

    @Temporal( TemporalType.DATE)
	@Column(name="DT_NPAI")
	private Date dtNpai;

    @Temporal( TemporalType.DATE)
	@Column(name="DT_VAL_AD")
	private Date dtValAd;

	@Column(name="ID_TECH_UR_ETAB_ADR")
	private BigDecimal idTechUrEtabAdr;

	@Column(name="LB_AD_LIGN_2")
	private String lbAdLign2;

	@Column(name="LB_CMN")
	private String lbCmn;

	@Column(name="LB_COMP_AD_ETHI")
	private String lbCompAdEthi;

	@Column(name="LB_LOCA_ETRG_ETHI")
	private String lbLocaEtrgEthi;

	@Column(name="LB_PAYS")
	private String lbPays;

	@Column(name="LB_PTS_RMIS_AD")
	private String lbPtsRmisAd;

	@Column(name="LB_VOIE_ETHI")
	private String lbVoieEthi;

	@Column(name="NO_VOIE")
	private String noVoie;

	@Column(name="TS_AD")
	private String tsAd;

	//bi-directional many-to-one association to SignaletiqueEtablissement
	@OneToMany(mappedBy="adressesEtablissement")
	private List<SignaletiqueEtablissement> signaletiqueEtablissements;

    public AdressesEtablissement() {
    }

	public long getIdTechAd() {
		return this.idTechAd;
	}

	public void setIdTechAd(long idTechAd) {
		this.idTechAd = idTechAd;
	}

	public String getAdLign4NonNorm() {
		return this.adLign4NonNorm;
	}

	public void setAdLign4NonNorm(String adLign4NonNorm) {
		this.adLign4NonNorm = adLign4NonNorm;
	}

	public String getCoCmnInsee() {
		return this.coCmnInsee;
	}

	public void setCoCmnInsee(String coCmnInsee) {
		this.coCmnInsee = coCmnInsee;
	}

	public String getCoCp() {
		return this.coCp;
	}

	public void setCoCp(String coCp) {
		this.coCp = coCp;
	}

	public String getCoDptGeo() {
		return this.coDptGeo;
	}

	public void setCoDptGeo(String coDptGeo) {
		this.coDptGeo = coDptGeo;
	}

	public String getCoExtsAd() {
		return this.coExtsAd;
	}

	public void setCoExtsAd(String coExtsAd) {
		this.coExtsAd = coExtsAd;
	}

	public String getCoMfinAd() {
		return this.coMfinAd;
	}

	public void setCoMfinAd(String coMfinAd) {
		this.coMfinAd = coMfinAd;
	}

	public String getCoNormAd() {
		return this.coNormAd;
	}

	public void setCoNormAd(String coNormAd) {
		this.coNormAd = coNormAd;
	}

	public String getCoNpai() {
		return this.coNpai;
	}

	public void setCoNpai(String coNpai) {
		this.coNpai = coNpai;
	}

	public String getCoOrigEnti() {
		return this.coOrigEnti;
	}

	public void setCoOrigEnti(String coOrigEnti) {
		this.coOrigEnti = coOrigEnti;
	}

	public String getCoPaysEthi() {
		return this.coPaysEthi;
	}

	public void setCoPaysEthi(String coPaysEthi) {
		this.coPaysEthi = coPaysEthi;
	}

	public String getCoTypeVoie() {
		return this.coTypeVoie;
	}

	public void setCoTypeVoie(String coTypeVoie) {
		this.coTypeVoie = coTypeVoie;
	}

	public String getCoUtilCrea() {
		return this.coUtilCrea;
	}

	public void setCoUtilCrea(String coUtilCrea) {
		this.coUtilCrea = coUtilCrea;
	}

	public String getCoUtilFonc() {
		return this.coUtilFonc;
	}

	public void setCoUtilFonc(String coUtilFonc) {
		this.coUtilFonc = coUtilFonc;
	}

	public String getCoUtilMaj() {
		return this.coUtilMaj;
	}

	public void setCoUtilMaj(String coUtilMaj) {
		this.coUtilMaj = coUtilMaj;
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

	public Date getDtDeffAd() {
		return this.dtDeffAd;
	}

	public void setDtDeffAd(Date dtDeffAd) {
		this.dtDeffAd = dtDeffAd;
	}

	public Date getDtFeffAd() {
		return this.dtFeffAd;
	}

	public void setDtFeffAd(Date dtFeffAd) {
		this.dtFeffAd = dtFeffAd;
	}

	public Date getDtMaj() {
		return this.dtMaj;
	}

	public void setDtMaj(Date dtMaj) {
		this.dtMaj = dtMaj;
	}

	public Date getDtNpai() {
		return this.dtNpai;
	}

	public void setDtNpai(Date dtNpai) {
		this.dtNpai = dtNpai;
	}

	public Date getDtValAd() {
		return this.dtValAd;
	}

	public void setDtValAd(Date dtValAd) {
		this.dtValAd = dtValAd;
	}

	public BigDecimal getIdTechUrEtabAdr() {
		return this.idTechUrEtabAdr;
	}

	public void setIdTechUrEtabAdr(BigDecimal idTechUrEtabAdr) {
		this.idTechUrEtabAdr = idTechUrEtabAdr;
	}

	public String getLbAdLign2() {
		return this.lbAdLign2;
	}

	public void setLbAdLign2(String lbAdLign2) {
		this.lbAdLign2 = lbAdLign2;
	}

	public String getLbCmn() {
		return this.lbCmn;
	}

	public void setLbCmn(String lbCmn) {
		this.lbCmn = lbCmn;
	}

	public String getLbCompAdEthi() {
		return this.lbCompAdEthi;
	}

	public void setLbCompAdEthi(String lbCompAdEthi) {
		this.lbCompAdEthi = lbCompAdEthi;
	}

	public String getLbLocaEtrgEthi() {
		return this.lbLocaEtrgEthi;
	}

	public void setLbLocaEtrgEthi(String lbLocaEtrgEthi) {
		this.lbLocaEtrgEthi = lbLocaEtrgEthi;
	}

	public String getLbPays() {
		return this.lbPays;
	}

	public void setLbPays(String lbPays) {
		this.lbPays = lbPays;
	}

	public String getLbPtsRmisAd() {
		return this.lbPtsRmisAd;
	}

	public void setLbPtsRmisAd(String lbPtsRmisAd) {
		this.lbPtsRmisAd = lbPtsRmisAd;
	}

	public String getLbVoieEthi() {
		return this.lbVoieEthi;
	}

	public void setLbVoieEthi(String lbVoieEthi) {
		this.lbVoieEthi = lbVoieEthi;
	}

	public String getNoVoie() {
		return this.noVoie;
	}

	public void setNoVoie(String noVoie) {
		this.noVoie = noVoie;
	}

	public String getTsAd() {
		return this.tsAd;
	}

	public void setTsAd(String tsAd) {
		this.tsAd = tsAd;
	}

	public List<SignaletiqueEtablissement> getSignaletiqueEtablissements() {
		return this.signaletiqueEtablissements;
	}

	public void setSignaletiqueEtablissements(List<SignaletiqueEtablissement> signaletiqueEtablissements) {
		this.signaletiqueEtablissements = signaletiqueEtablissements;
	}
	
}