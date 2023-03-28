package com.MedicalStore.medicalstore.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Item {
	@Id
	 @GeneratedValue(strategy= GenerationType.AUTO)
	private Integer medicineid;

	private String medicinename;

	private String medicinedescription;

	private String medicineurl;

	public Item(Integer medicineid, String medicinename, String medicinedescription, String medicineurl) {
		super();
		this.medicineid = medicineid;
		this.medicinename = medicinename;
		this.medicinedescription = medicinedescription;
		this.medicineurl = medicineurl;
	}

	public Item() {
		super();
	}

	public Integer getMedicineid() {
		return medicineid;
	}

	public void setMedicineid(Integer medicineid) {
		this.medicineid = medicineid;
	}

	public String getMedicinename() {
		return medicinename;
	}

	public void setMedicinename(String medicinename) {
		this.medicinename = medicinename;
	}

	public String getMedicinedescription() {
		return medicinedescription;
	}

	public void setMedicinedescription(String medicinedescription) {
		this.medicinedescription = medicinedescription;
	}

	public String getMedicineurl() {
		return medicineurl;
	}

	public void setMedicineurl(String medicineurl) {
		this.medicineurl = medicineurl;
	}

}
