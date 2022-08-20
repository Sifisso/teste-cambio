package com.technoplus.TesteCambio.model;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Cambio implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String result;
	 private String provider;
	 private String documentation;
	 private String terms_of_use;
	 private float time_last_update_unix;
	 private String time_last_update_utc;
	 private float time_next_update_unix;
	 private String time_next_update_utc;
	 private float time_eol_unix;
	 private String base_code;
	 Rates RatesObject;


	 // Getter Methods 

	 public String getResult() {
	  return result;
	 }

	 public String getProvider() {
	  return provider;
	 }

	 public String getDocumentation() {
	  return documentation;
	 }

	 public String getTerms_of_use() {
	  return terms_of_use;
	 }

	 public float getTime_last_update_unix() {
	  return time_last_update_unix;
	 }

	 public String getTime_last_update_utc() {
	  return time_last_update_utc;
	 }

	 public float getTime_next_update_unix() {
	  return time_next_update_unix;
	 }

	 public String getTime_next_update_utc() {
	  return time_next_update_utc;
	 }

	 public float getTime_eol_unix() {
	  return time_eol_unix;
	 }

	 public String getBase_code() {
	  return base_code;
	 }

	 public Rates getRates() {
	  return RatesObject;
	 }

	 // Setter Methods 

	 public void setResult(String result) {
	  this.result = result;
	 }

	 public void setProvider(String provider) {
	  this.provider = provider;
	 }

	 public void setDocumentation(String documentation) {
	  this.documentation = documentation;
	 }

	 public void setTerms_of_use(String terms_of_use) {
	  this.terms_of_use = terms_of_use;
	 }

	 public void setTime_last_update_unix(float time_last_update_unix) {
	  this.time_last_update_unix = time_last_update_unix;
	 }

	 public void setTime_last_update_utc(String time_last_update_utc) {
	  this.time_last_update_utc = time_last_update_utc;
	 }

	 public void setTime_next_update_unix(float time_next_update_unix) {
	  this.time_next_update_unix = time_next_update_unix;
	 }

	 public void setTime_next_update_utc(String time_next_update_utc) {
	  this.time_next_update_utc = time_next_update_utc;
	 }

	 public void setTime_eol_unix(float time_eol_unix) {
	  this.time_eol_unix = time_eol_unix;
	 }

	 public void setBase_code(String base_code) {
	  this.base_code = base_code;
	 }

	 public void setRates(Rates ratesObject) {
	  this.RatesObject = ratesObject;
	 }

	@Override
	public String toString() {
		return "Cambio [result=" + result + ", provider=" + provider + ", documentation=" + documentation
				+ ", terms_of_use=" + terms_of_use + ", time_last_update_unix=" + time_last_update_unix
				+ ", time_last_update_utc=" + time_last_update_utc + ", time_next_update_unix=" + time_next_update_unix
				+ ", time_next_update_utc=" + time_next_update_utc + ", time_eol_unix=" + time_eol_unix + ", base_code="
				+ base_code + ", RatesObject=" + RatesObject + ", getResult()=" + getResult() + ", getProvider()="
				+ getProvider() + ", getDocumentation()=" + getDocumentation() + ", getTerms_of_use()="
				+ getTerms_of_use() + ", getTime_last_update_unix()=" + getTime_last_update_unix()
				+ ", getTime_last_update_utc()=" + getTime_last_update_utc() + ", getTime_next_update_unix()="
				+ getTime_next_update_unix() + ", getTime_next_update_utc()=" + getTime_next_update_utc()
				+ ", getTime_eol_unix()=" + getTime_eol_unix() + ", getBase_code()=" + getBase_code() + ", getRates()="
				+ getRates() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	 
	 
	}
