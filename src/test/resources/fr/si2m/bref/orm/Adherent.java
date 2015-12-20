package fr.si2m.bref.orm;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the ADHERENT database table.
 * 
 */
@Entity
@Table(name="ADHERENT")
public class Adherent implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_TECH_UR_ADHR")
	private long idTechUrAdhr;

	@Column(name="CO_NAT_ADHR")
	private String coNatAdhr;

	@Column(name="CO_SECT")
	private String coSect;

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
	@Column(name="DT_DEB_ADHR")
	private Date dtDebAdhr;

    @Temporal( TemporalType.DATE)
	@Column(name="DT_FIN_ADHR")
	private Date dtFinAdhr;

    @Temporal( TemporalType.DATE)
	@Column(name="DT_MAJ")
	private Date dtMaj;

	@Column(name="ID_FONC_ADHR")
	private String idFoncAdhr;

	@Column(name="ID_TECH_UR_ENTP_ADHR")
	private BigDecimal idTechUrEntpAdhr;

	@Column(name="TS_FONC")
	private String tsFonc;

	//bi-directional many-to-one association to PortefeuilleAdherent
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_PRTF")
	private PortefeuilleAdherent portefeuilleAdherent;

	//bi-directional many-to-one association to SignaletiqueEntreprise
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_TECH_UR_ENTP")
	private SignaletiqueEntreprise signaletiqueEntreprise;

	//bi-directional many-to-one association to PortefeuilleAdherent
	@OneToMany(mappedBy="adherent")
	private List<PortefeuilleAdherent> portefeuilleAdherents;

    public Adherent() {
    }

	public long getIdTechUrAdhr() {
		return this.idTechUrAdhr;
	}

	public void setIdTechUrAdhr(long idTechUrAdhr) {
		this.idTechUrAdhr = idTechUrAdhr;
	}

	public String getCoNatAdhr() {
		return this.coNatAdhr;
	}

	public void setCoNatAdhr(String coNatAdhr) {
		this.coNatAdhr = coNatAdhr;
	}

	public String getCoSect() {
		return this.coSect;
	}

	public void setCoSect(String coSect) {
		this.coSect = coSect;
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

	public Date getDtDebAdhr() {
		return this.dtDebAdhr;
	}

	public void setDtDebAdhr(Date dtDebAdhr) {
		this.dtDebAdhr = dtDebAdhr;
	}

	public Date getDtFinAdhr() {
		return this.dtFinAdhr;
	}

	public void setDtFinAdhr(Date dtFinAdhr) {
		this.dtFinAdhr = dtFinAdhr;
	}

	public Date getDtMaj() {
		return this.dtMaj;
	}

	public void setDtMaj(Date dtMaj) {
		this.dtMaj = dtMaj;
	}

	public String getIdFoncAdhr() {
		return this.idFoncAdhr;
	}

	public void setIdFoncAdhr(String idFoncAdhr) {
		this.idFoncAdhr = idFoncAdhr;
	}

	public BigDecimal getIdTechUrEntpAdhr() {
		return this.idTechUrEntpAdhr;
	}

	public void setIdTechUrEntpAdhr(BigDecimal idTechUrEntpAdhr) {
		this.idTechUrEntpAdhr = idTechUrEntpAdhr;
	}

	public String getTsFonc() {
		return this.tsFonc;
	}

	public void setTsFonc(String tsFonc) {
		this.tsFonc = tsFonc;
	}

	public PortefeuilleAdherent getPortefeuilleAdherent() {
		return this.portefeuilleAdherent;
	}

	public void setPortefeuilleAdherent(PortefeuilleAdherent portefeuilleAdherent) {
		this.portefeuilleAdherent = portefeuilleAdherent;
	}
	
	public SignaletiqueEntreprise getSignaletiqueEntreprise() {
		return this.signaletiqueEntreprise;
	}

	public void setSignaletiqueEntreprise(SignaletiqueEntreprise signaletiqueEntreprise) {
		this.signaletiqueEntreprise = signaletiqueEntreprise;
	}
	
	public List<PortefeuilleAdherent> getPortefeuilleAdherents() {
		return this.portefeuilleAdherents;
	}

	public void setPortefeuilleAdherents(List<PortefeuilleAdherent> portefeuilleAdherents) {
		this.portefeuilleAdherents = portefeuilleAdherents;
	}
	
}