package fr.si2m.bref.orm;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the MOYEN_DE_PAIEMENT_ETABLISSEMENT database table.
 * 
 */
@Entity
@Table(name="MOYEN_DE_PAIEMENT_ETABLISSEMENT")
public class MoyenDePaiementEtablissement implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_TECH_MOY_PAI")
	private long idTechMoyPai;

	@Column(name="CO_ETAB_BANQ")
	private String coEtabBanq;

	@Column(name="CO_FORM_CPTE")
	private String coFormCpte;

	@Column(name="CO_IMMA_GUIC")
	private String coImmaGuic;

	@Column(name="CO_ORIG_ENTI")
	private String coOrigEnti;

	@Column(name="CO_PAYS_IBAN")
	private String coPaysIban;

	@Column(name="CO_UTIL_CREA")
	private String coUtilCrea;

	@Column(name="CO_UTIL_FONC")
	private String coUtilFonc;

	@Column(name="CO_UTIL_MAJ")
	private String coUtilMaj;

	@Column(name="CODE_MOTIF_FIN_MOYEN_PAIEMENT")
	private String codeMotifFinMoyenPaiement;

    @Temporal( TemporalType.DATE)
	@Column(name="DT_ANNL")
	private Date dtAnnl;

    @Temporal( TemporalType.DATE)
	@Column(name="DT_CREA")
	private Date dtCrea;

    @Temporal( TemporalType.DATE)
	@Column(name="DT_EFET_MOY_PAI")
	private Date dtEfetMoyPai;

    @Temporal( TemporalType.DATE)
	@Column(name="DT_FEFF_MOY_PAI")
	private Date dtFeffMoyPai;

    @Temporal( TemporalType.DATE)
	@Column(name="DT_MAJ")
	private Date dtMaj;

	@Column(name="ID_TECH_UR_ETAB_MOY_PAI")
	private BigDecimal idTechUrEtabMoyPai;

	@Column(name="IN_ADHS_TLRG")
	private String inAdhsTlrg;

	@Column(name="LB_CO_BIC")
	private String lbCoBic;

	@Column(name="LB_CPTE")
	private String lbCpte;

	@Column(name="LB_ETAB_BANQ")
	private String lbEtabBanq;

	@Column(name="NO_CLE_IBAN")
	private String noCleIban;

	@Column(name="NO_CLE_RIB")
	private String noCleRib;

	@Column(name="NO_CPTE_BANQ")
	private String noCpteBanq;

	@Column(name="NO_CPTE_IBAN")
	private String noCpteIban;

	@Column(name="TS_MOY_PAI")
	private String tsMoyPai;

	//bi-directional many-to-one association to SignaletiqueEtablissement
	@OneToMany(mappedBy="moyenDePaiementEtablissement")
	private List<SignaletiqueEtablissement> signaletiqueEtablissements;

    public MoyenDePaiementEtablissement() {
    }

	public long getIdTechMoyPai() {
		return this.idTechMoyPai;
	}

	public void setIdTechMoyPai(long idTechMoyPai) {
		this.idTechMoyPai = idTechMoyPai;
	}

	public String getCoEtabBanq() {
		return this.coEtabBanq;
	}

	public void setCoEtabBanq(String coEtabBanq) {
		this.coEtabBanq = coEtabBanq;
	}

	public String getCoFormCpte() {
		return this.coFormCpte;
	}

	public void setCoFormCpte(String coFormCpte) {
		this.coFormCpte = coFormCpte;
	}

	public String getCoImmaGuic() {
		return this.coImmaGuic;
	}

	public void setCoImmaGuic(String coImmaGuic) {
		this.coImmaGuic = coImmaGuic;
	}

	public String getCoOrigEnti() {
		return this.coOrigEnti;
	}

	public void setCoOrigEnti(String coOrigEnti) {
		this.coOrigEnti = coOrigEnti;
	}

	public String getCoPaysIban() {
		return this.coPaysIban;
	}

	public void setCoPaysIban(String coPaysIban) {
		this.coPaysIban = coPaysIban;
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

	public String getCodeMotifFinMoyenPaiement() {
		return this.codeMotifFinMoyenPaiement;
	}

	public void setCodeMotifFinMoyenPaiement(String codeMotifFinMoyenPaiement) {
		this.codeMotifFinMoyenPaiement = codeMotifFinMoyenPaiement;
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

	public Date getDtEfetMoyPai() {
		return this.dtEfetMoyPai;
	}

	public void setDtEfetMoyPai(Date dtEfetMoyPai) {
		this.dtEfetMoyPai = dtEfetMoyPai;
	}

	public Date getDtFeffMoyPai() {
		return this.dtFeffMoyPai;
	}

	public void setDtFeffMoyPai(Date dtFeffMoyPai) {
		this.dtFeffMoyPai = dtFeffMoyPai;
	}

	public Date getDtMaj() {
		return this.dtMaj;
	}

	public void setDtMaj(Date dtMaj) {
		this.dtMaj = dtMaj;
	}

	public BigDecimal getIdTechUrEtabMoyPai() {
		return this.idTechUrEtabMoyPai;
	}

	public void setIdTechUrEtabMoyPai(BigDecimal idTechUrEtabMoyPai) {
		this.idTechUrEtabMoyPai = idTechUrEtabMoyPai;
	}

	public String getInAdhsTlrg() {
		return this.inAdhsTlrg;
	}

	public void setInAdhsTlrg(String inAdhsTlrg) {
		this.inAdhsTlrg = inAdhsTlrg;
	}

	public String getLbCoBic() {
		return this.lbCoBic;
	}

	public void setLbCoBic(String lbCoBic) {
		this.lbCoBic = lbCoBic;
	}

	public String getLbCpte() {
		return this.lbCpte;
	}

	public void setLbCpte(String lbCpte) {
		this.lbCpte = lbCpte;
	}

	public String getLbEtabBanq() {
		return this.lbEtabBanq;
	}

	public void setLbEtabBanq(String lbEtabBanq) {
		this.lbEtabBanq = lbEtabBanq;
	}

	public String getNoCleIban() {
		return this.noCleIban;
	}

	public void setNoCleIban(String noCleIban) {
		this.noCleIban = noCleIban;
	}

	public String getNoCleRib() {
		return this.noCleRib;
	}

	public void setNoCleRib(String noCleRib) {
		this.noCleRib = noCleRib;
	}

	public String getNoCpteBanq() {
		return this.noCpteBanq;
	}

	public void setNoCpteBanq(String noCpteBanq) {
		this.noCpteBanq = noCpteBanq;
	}

	public String getNoCpteIban() {
		return this.noCpteIban;
	}

	public void setNoCpteIban(String noCpteIban) {
		this.noCpteIban = noCpteIban;
	}

	public String getTsMoyPai() {
		return this.tsMoyPai;
	}

	public void setTsMoyPai(String tsMoyPai) {
		this.tsMoyPai = tsMoyPai;
	}

	public List<SignaletiqueEtablissement> getSignaletiqueEtablissements() {
		return this.signaletiqueEtablissements;
	}

	public void setSignaletiqueEtablissements(List<SignaletiqueEtablissement> signaletiqueEtablissements) {
		this.signaletiqueEtablissements = signaletiqueEtablissements;
	}
	
}