package fr.si2m.bref.orm;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the PORTEFEUILLE_ADHERENT database table.
 * 
 */
@Entity
@Table(name="PORTEFEUILLE_ADHERENT")
public class PortefeuilleAdherent implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_PRTF")
	private long idPrtf;

	@Column(name="CO_UTIL_CREA")
	private String coUtilCrea;

	@Column(name="CO_UTIL_MAJ")
	private String coUtilMaj;

    @Temporal( TemporalType.DATE)
	@Column(name="DT_CREA")
	private Date dtCrea;

    @Temporal( TemporalType.DATE)
	@Column(name="DT_DVAL_PRTF")
	private Date dtDvalPrtf;

    @Temporal( TemporalType.DATE)
	@Column(name="DT_FVAL_PRTF")
	private Date dtFvalPrtf;

    @Temporal( TemporalType.DATE)
	@Column(name="DT_MAJ")
	private Date dtMaj;

	@Column(name="ID_DOM_ACTV")
	private BigDecimal idDomActv;

	@Column(name="ID_EG")
	private BigDecimal idEg;

	@Column(name="ID_INT_OBJ")
	private BigDecimal idIntObj;

	@Column(name="ID_UTIL")
	private BigDecimal idUtil;

	@Column(name="LB_DOM_ACTV")
	private String lbDomActv;

	@Column(name="LB_EG")
	private String lbEg;

	@Column(name="LB_NM_UTIL")
	private String lbNmUtil;

	@Column(name="LB_PRN_UTIL")
	private String lbPrnUtil;

	@Column(name="NO_FONC_EG")
	private String noFoncEg;

	//bi-directional many-to-one association to Adherent
	@OneToMany(mappedBy="portefeuilleAdherent")
	private List<Adherent> adherents;

	//bi-directional many-to-one association to Adherent
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_TECH_UR_ADHR")
	private Adherent adherent;

    public PortefeuilleAdherent() {
    }

	public long getIdPrtf() {
		return this.idPrtf;
	}

	public void setIdPrtf(long idPrtf) {
		this.idPrtf = idPrtf;
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

	public Date getDtCrea() {
		return this.dtCrea;
	}

	public void setDtCrea(Date dtCrea) {
		this.dtCrea = dtCrea;
	}

	public Date getDtDvalPrtf() {
		return this.dtDvalPrtf;
	}

	public void setDtDvalPrtf(Date dtDvalPrtf) {
		this.dtDvalPrtf = dtDvalPrtf;
	}

	public Date getDtFvalPrtf() {
		return this.dtFvalPrtf;
	}

	public void setDtFvalPrtf(Date dtFvalPrtf) {
		this.dtFvalPrtf = dtFvalPrtf;
	}

	public Date getDtMaj() {
		return this.dtMaj;
	}

	public void setDtMaj(Date dtMaj) {
		this.dtMaj = dtMaj;
	}

	public BigDecimal getIdDomActv() {
		return this.idDomActv;
	}

	public void setIdDomActv(BigDecimal idDomActv) {
		this.idDomActv = idDomActv;
	}

	public BigDecimal getIdEg() {
		return this.idEg;
	}

	public void setIdEg(BigDecimal idEg) {
		this.idEg = idEg;
	}

	public BigDecimal getIdIntObj() {
		return this.idIntObj;
	}

	public void setIdIntObj(BigDecimal idIntObj) {
		this.idIntObj = idIntObj;
	}

	public BigDecimal getIdUtil() {
		return this.idUtil;
	}

	public void setIdUtil(BigDecimal idUtil) {
		this.idUtil = idUtil;
	}

	public String getLbDomActv() {
		return this.lbDomActv;
	}

	public void setLbDomActv(String lbDomActv) {
		this.lbDomActv = lbDomActv;
	}

	public String getLbEg() {
		return this.lbEg;
	}

	public void setLbEg(String lbEg) {
		this.lbEg = lbEg;
	}

	public String getLbNmUtil() {
		return this.lbNmUtil;
	}

	public void setLbNmUtil(String lbNmUtil) {
		this.lbNmUtil = lbNmUtil;
	}

	public String getLbPrnUtil() {
		return this.lbPrnUtil;
	}

	public void setLbPrnUtil(String lbPrnUtil) {
		this.lbPrnUtil = lbPrnUtil;
	}

	public String getNoFoncEg() {
		return this.noFoncEg;
	}

	public void setNoFoncEg(String noFoncEg) {
		this.noFoncEg = noFoncEg;
	}

	public List<Adherent> getAdherents() {
		return this.adherents;
	}

	public void setAdherents(List<Adherent> adherents) {
		this.adherents = adherents;
	}
	
	public Adherent getAdherent() {
		return this.adherent;
	}

	public void setAdherent(Adherent adherent) {
		this.adherent = adherent;
	}
	
}