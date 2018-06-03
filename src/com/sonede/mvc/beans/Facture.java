package com.sonede.mvc.beans;




public class Facture {

	private Long idFacture;	
	
	private long idDistrict;
	
	private long idAbonne;
	
	private int codeBranchement;
	
	private int tournee;
	
	private int ordre;
	
	private int nouv_index;
	
	private int anc_index;
	
	private int consommation;
	
	private float fraisConso;
	
	private float totConso1;
	
	private float fraisFixesConso;
	
	private float totConso2;
	
	private float addTotConso;
	
	private int pourcentage;
	
	private float anterieurFrais;
	
	private float total_Conso;
	
	private int consoAssainissement1;
	
	private int consoAssainissement2;
	
	private float fraisAssainissement1;
	
	private float fraisAssainissement2;
	
	private float totAssai1;
	
	private float totAssai2;
	
	private float fraisFixesAssai;
	
	private float total_Assai;
	
	private float montant_total;
	
	private boolean impaye;
	
	private String datelimite ;
	
	private int annee;
	
	private Long idtrimestre;
	
	
	
	
	//*************Getters and Setters
	public Long getIdFacture() {
		return idFacture;
	}

	public void setIdFacture(Long idFacture) {
		this.idFacture = idFacture;
	}

	public long getIdDistrict() {
		return idDistrict;
	}

	public void setIdDistrict(long idDistrict) {
		this.idDistrict = idDistrict;
	}

	public long getIdAbonne() {
		return idAbonne;
	}

	public void setIdAbonne(long idAbonne) {
		this.idAbonne = idAbonne;
	}

	public int getCodeBranchement() {
		return codeBranchement;
	}

	public void setCodeBranchement(int codeBranchement) {
		this.codeBranchement = codeBranchement;
	}

	public int getTournee() {
		return tournee;
	}

	public void setTournee(int tournée) {
		this.tournee = tournée;
	}

	public int getOrdre() {
		return ordre;
	}

	public void setOrdre(int ordre) {
		this.ordre = ordre;
	}

	public int getNouv_index() {
		return nouv_index;
	}

	public void setNouv_index(int nouv_index) {
		this.nouv_index = nouv_index;
	}

	public int getAnc_index() {
		return anc_index;
	}

	public void setAnc_index(int anc_index) {
		this.anc_index = anc_index;
	}

	public int getConsommation() {
		return consommation;
	}

	public void setConsommation(int consommation) {
		this.consommation = consommation;
	}

	public float getFraisConso() {
		return fraisConso;
	}

	public void setFraisConso(float fraisConso) {
		this.fraisConso = fraisConso;
	}

	public float getTotConso1() {
		return totConso1;
	}

	public void setTotConso1(float totConso1) {
		this.totConso1 = totConso1;
	}

	public float getFraisFixesConso() {
		return fraisFixesConso;
	}

	public void setFraisFixesConso(float fraisFixesConso) {
		this.fraisFixesConso = fraisFixesConso;
	}

	public float getTotConso2() {
		return totConso2;
	}

	public void setTotConso2(float totConso2) {
		this.totConso2 = totConso2;
	}

	public float getAddTotConso() {
		return addTotConso;
	}

	public void setAddTotConso(float addTotConso) {
		this.addTotConso = addTotConso;
	}

	public int getPourcentage() {
		return pourcentage;
	}

	public void setPourcentage(int pourcentage) {
		this.pourcentage = pourcentage;
	}

	public float getAnterieurFrais() {
		return anterieurFrais;
	}

	public void setAnterieurFrais(float anterieurFrais) {
		this.anterieurFrais = anterieurFrais;
	}

	public float getTotal_Conso() {
		return total_Conso;
	}

	public void setTotal_Conso(float total_Conso) {
		this.total_Conso = total_Conso;
	}

	public int getConsoAssainissement1() {
		return consoAssainissement1;
	}

	public void setConsoAssainissement1(int consoAssainissement1) {
		this.consoAssainissement1 = consoAssainissement1;
	}

	public int getConsoAssainissement2() {
		return consoAssainissement2;
	}

	public void setConsoAssainissement2(int consoAssainissement2) {
		this.consoAssainissement2 = consoAssainissement2;
	}

	public float getFraisAssainissement1() {
		return fraisAssainissement1;
	}

	public void setFraisAssainissement1(float fraisAssainissement1) {
		this.fraisAssainissement1 = fraisAssainissement1;
	}

	public float getFraisAssainissement2() {
		return fraisAssainissement2;
	}

	public void setFraisAssainissement2(float fraisAssainissement2) {
		this.fraisAssainissement2 = fraisAssainissement2;
	}

	public float getTotAssai1() {
		return totAssai1;
	}

	public void setTotAssai1(float totAssai1) {
		this.totAssai1 = totAssai1;
	}

	public float getTotAssai2() {
		return totAssai2;
	}

	public void setTotAssai2(float totAssai2) {
		this.totAssai2 = totAssai2;
	}

	public float getFraisFixesAssai() {
		return fraisFixesAssai;
	}

	public void setFraisFixesAssai(float fraisFixesAssai) {
		this.fraisFixesAssai = fraisFixesAssai;
	}

	public float getTotal_Assai() {
		return total_Assai;
	}

	public void setTotal_Assai(float total_Assai) {
		this.total_Assai = total_Assai;
	}

	public float getMontant_total() {
		return montant_total;
	}

	public void setMontant_total(float montant_total) {
		this.montant_total = montant_total;
	}

	public boolean isImpaye() {
		return impaye;
	}

	public void setImpaye(boolean impaye) {
		this.impaye = impaye;
	}

	public String getDatelimite() {
		return datelimite;
	}

	public void setDatelimite(String datelimite) {
		this.datelimite = datelimite;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	public Long getIdtrimestre() {
		return idtrimestre;
	}

	public void setIdtrimestre(Long idtrimestre) {
		this.idtrimestre = idtrimestre;
	}
	
	
	
	//*************Constructeur par defaut
	public Facture() {
		super();
	}

	
	//*************Constructeur avec parametres	
	public Facture(long idDistrict, long idAbonne, int codeBranchement, int tournee, int ordre, int nouv_index,
			int anc_index, int consommation, float fraisConso, float totConso1, float fraisFixesConso, float totConso2,
			float addTotConso, int pourcentage, float anterieurFrais, float total_Conso, int consoAssainissement1,
			int consoAssainissement2, float fraisAssainissement1, float fraisAssainissement2, float totAssai1,
			float totAssai2, float fraisFixesAssai, float total_Assai, float montant_total, boolean impaye,
			String datelimite, int annee, Long idtrimestre) {
		super();
		this.idDistrict = idDistrict;
		this.idAbonne = idAbonne;
		this.codeBranchement = codeBranchement;
		this.tournee = tournee;
		this.ordre = ordre;
		this.nouv_index = nouv_index;
		this.anc_index = anc_index;
		this.consommation = consommation;
		this.fraisConso = fraisConso;
		this.totConso1 = totConso1;
		this.fraisFixesConso = fraisFixesConso;
		this.totConso2 = totConso2;
		this.addTotConso = addTotConso;
		this.pourcentage = pourcentage;
		this.anterieurFrais = anterieurFrais;
		this.total_Conso = total_Conso;
		this.consoAssainissement1 = consoAssainissement1;
		this.consoAssainissement2 = consoAssainissement2;
		this.fraisAssainissement1 = fraisAssainissement1;
		this.fraisAssainissement2 = fraisAssainissement2;
		this.totAssai1 = totAssai1;
		this.totAssai2 = totAssai2;
		this.fraisFixesAssai = fraisFixesAssai;
		this.total_Assai = total_Assai;
		this.montant_total = montant_total;
		this.impaye = impaye;
		this.datelimite = datelimite;
		this.annee = annee;
		this.idtrimestre = idtrimestre;
	}

	
	
	//*************La methode toString
	@Override
	public String toString() {
		return "Facture [idFacture=" + idFacture + ", idDistrict=" + idDistrict + ", idAbonne=" + idAbonne
				+ ", codeBranchement=" + codeBranchement + ", tournee=" + tournee + ", ordre=" + ordre + ", nouv_index="
				+ nouv_index + ", anc_index=" + anc_index + ", consommation=" + consommation + ", fraisConso="
				+ fraisConso + ", totConso1=" + totConso1 + ", fraisFixesConso=" + fraisFixesConso + ", totConso2="
				+ totConso2 + ", addTotConso=" + addTotConso + ", pourcentage=" + pourcentage + ", anterieurFrais="
				+ anterieurFrais + ", total_Conso=" + total_Conso + ", consoAssainissement1=" + consoAssainissement1
				+ ", consoAssainissement2=" + consoAssainissement2 + ", fraisAssainissement1=" + fraisAssainissement1
				+ ", fraisAssainissement2=" + fraisAssainissement2 + ", totAssai1=" + totAssai1 + ", totAssai2="
				+ totAssai2 + ", fraisFixesAssai=" + fraisFixesAssai + ", total_Assai=" + total_Assai
				+ ", montant_total=" + montant_total + ", impaye=" + impaye + ", datelimite=" + datelimite + ", annee="
				+ annee + ", idtrimestre=" + idtrimestre + "]";
	}
	
	
	
	
	
	
}
