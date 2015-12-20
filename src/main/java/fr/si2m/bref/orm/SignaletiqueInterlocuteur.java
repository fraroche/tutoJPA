package fr.si2m.bref.orm;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the SIGNALETIQUE_INTERLOCUTEUR database table.
 * 
 */
@Entity
@Table(name="SIGNALETIQUE_INTERLOCUTEUR")
public class SignaletiqueInterlocuteur implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_TECH_INTR")
	private long idTechIntr;

	@Column(name="CO_MFIN_INTR")
	private String coMfinIntr;

	@Column(name="CO_NAT_INTR")
	private String coNatIntr;

	@Column(name="CO_ORIG_INTR")
	private String coOrigIntr;

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
	@Column(name="DT_CREA_FONC")
	private Date dtCreaFonc;

    @Temporal( TemporalType.DATE)
	@Column(name="DT_DEFF_INTR")
	private Date dtDeffIntr;

    @Temporal( TemporalType.DATE)
	@Column(name="DT_FEFF_INTR")
	private Date dtFeffIntr;

    @Temporal( TemporalType.DATE)
	@Column(name="DT_MAJ")
	private Date dtMaj;

	@Column(name="ID_FONC_INTR")
	private String idFoncIntr;

	@Column(name="ID_TECH_AD_INT")
	private BigDecimal idTechAdInt;

	@Column(name="ID_TECH_DATA_INTN")
	private BigDecimal idTechDataIntn;

	@Column(name="LB_COMP_DNOM_INTR")
	private String lbCompDnomIntr;

	@Column(name="LB_DNOM_INTR")
	private String lbDnomIntr;

	@Column(name="NO_SIREN_INTR")
	private String noSirenIntr;

	@Column(name="TS_INTR")
	private String tsIntr;

    public SignaletiqueInterlocuteur() {
    }

	public long getIdTechIntr() {
		return this.idTechIntr;
	}

	public void setIdTechIntr(long idTechIntr) {
		this.idTechIntr = idTechIntr;
	}

	public String getCoMfinIntr() {
		return this.coMfinIntr;
	}

	public void setCoMfinIntr(String coMfinIntr) {
		this.coMfinIntr = coMfinIntr;
	}

	public String getCoNatIntr() {
		return this.coNatIntr;
	}

	public void setCoNatIntr(String coNatIntr) {
		this.coNatIntr = coNatIntr;
	}

	public String getCoOrigIntr() {
		return this.coOrigIntr;
	}

	public void setCoOrigIntr(String coOrigIntr) {
		this.coOrigIntr = coOrigIntr;
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

	public Date getDtCreaFonc() {
		return this.dtCreaFonc;
	}

	public void setDtCreaFonc(Date dtCreaFonc) {
		this.dtCreaFonc = dtCreaFonc;
	}

	public Date getDtDeffIntr() {
		return this.dtDeffIntr;
	}

	public void setDtDeffIntr(Date dtDeffIntr) {
		this.dtDeffIntr = dtDeffIntr;
	}

	public Date getDtFeffIntr() {
		return this.dtFeffIntr;
	}

	public void setDtFeffIntr(Date dtFeffIntr) {
		this.dtFeffIntr = dtFeffIntr;
	}

	public Date getDtMaj() {
		return this.dtMaj;
	}

	public void setDtMaj(Date dtMaj) {
		this.dtMaj = dtMaj;
	}

	public String getIdFoncIntr() {
		return this.idFoncIntr;
	}

	public void setIdFoncIntr(String idFoncIntr) {
		this.idFoncIntr = idFoncIntr;
	}

	public BigDecimal getIdTechAdInt() {
		return this.idTechAdInt;
	}

	public void setIdTechAdInt(BigDecimal idTechAdInt) {
		this.idTechAdInt = idTechAdInt;
	}

	public BigDecimal getIdTechDataIntn() {
		return this.idTechDataIntn;
	}

	public void setIdTechDataIntn(BigDecimal idTechDataIntn) {
		this.idTechDataIntn = idTechDataIntn;
	}

	public String getLbCompDnomIntr() {
		return this.lbCompDnomIntr;
	}

	public void setLbCompDnomIntr(String lbCompDnomIntr) {
		this.lbCompDnomIntr = lbCompDnomIntr;
	}

	public String getLbDnomIntr() {
		return this.lbDnomIntr;
	}

	public void setLbDnomIntr(String lbDnomIntr) {
		this.lbDnomIntr = lbDnomIntr;
	}

	public String getNoSirenIntr() {
		return this.noSirenIntr;
	}

	public void setNoSirenIntr(String noSirenIntr) {
		this.noSirenIntr = noSirenIntr;
	}

	public String getTsIntr() {
		return this.tsIntr;
	}

	public void setTsIntr(String tsIntr) {
		this.tsIntr = tsIntr;
	}

}