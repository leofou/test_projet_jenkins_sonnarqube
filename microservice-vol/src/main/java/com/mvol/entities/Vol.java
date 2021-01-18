package com.mvol.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vol implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long   idVol;
	private String titre;
	private String description;
	private String image;
	private double prix;
	
	
	
	public Vol(String titre, String description) {
		super();
		this.titre = titre;
		this.description = description;
	}
	public Vol(String titre, String description, String image, double prix) {
		super();
		this.titre = titre;
		this.description = description;
		this.image = image;
		this.prix = prix;
	}
	public Vol() {
		super();
	}
	public long getIdVol() {
		return idVol;
	}
	public void setIdVol(long idVol) {
		this.idVol = idVol;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	@Override
	public String toString() {
		return "Vol [idVol=" + idVol + ", titre=" + titre + ", description=" + description + ", image=" + image
				+ ", prix=" + prix + "]";
	}
	
	
	
	

}
