package com.sriteja.bean;

public class Mobile {

	//attribute
	//access_modifir data_type variable_name
	private String mobileName;
	private String mobileColor;
	private float mobilePrize;
	private String mobileRam;
	private String mobileProcesser;
	private String mobileCemera;
	private boolean mobileWifi;
	
	
	
	/*
	 * //parameterized constructor public Mobile(String mobileName, String
	 * mobileColor, float mobilePrize, String mobileRam, String mobileProcesser,
	 * String mobileCemera, boolean mobileWifi) { super(); this.mobileName =
	 * mobileName; this.mobileColor = mobileColor; this.mobilePrize = mobilePrize;
	 * this.mobileRam = mobileRam; this.mobileProcesser = mobileProcesser;
	 * this.mobileCemera = mobileCemera; this.mobileWifi = mobileWifi; }
	 */

	//setter and getter methods
	public String getMobileName() {
		return mobileName;
	}

	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}

	public String getMobileColor() {
		return mobileColor;
	}

	public void setMobileColor(String mobileColor) {
		this.mobileColor = mobileColor;
	}

	public float getMobilePrize() {
		return mobilePrize;
	}

	public void setMobilePrize(float mobilePrize) {
		this.mobilePrize = mobilePrize;
	}

	public String getMobileRam() {
		return mobileRam;
	}

	public void setMobileRam(String mobileRam) {
		this.mobileRam = mobileRam;
	}

	public String getMobileProcesser() {
		return mobileProcesser;
	}

	public void setMobileProcesser(String mobileProcesser) {
		this.mobileProcesser = mobileProcesser;
	}

	public String getMobileCemera() {
		return mobileCemera;
	}

	public void setMobileCemera(String mobileCemera) {
		this.mobileCemera = mobileCemera;
	}
	

	public boolean isMobileWifi() {
		return mobileWifi;
	}

	public void setMobileWifi(boolean mobileWifi) {
		this.mobileWifi = mobileWifi;
	}

	//toString() method
	@Override
	public String toString() {
		return "Mobile [mobileName=" + mobileName + ", mobileColor=" + mobileColor + ", mobilePrize=" + mobilePrize
				+ ", mobileRam=" + mobileRam + ", mobileProcesser=" + mobileProcesser + ", mobileCemera=" + mobileCemera
				+ ", mobileWifi=" + mobileWifi + "]";
	}

	
	
	
	
}
