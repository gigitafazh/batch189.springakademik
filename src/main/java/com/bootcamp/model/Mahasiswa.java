package com.bootcamp.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;

@Entity
@Table(name = "mahasiswa")
public class Mahasiswa implements Serializable {
	@Id
	@Column(name = "nim", length = 10, nullable = false)
	private String nim;

	@Column(name = "nama", length = 100, nullable = false)
	private String nama;

	@Column(name = "tglLahir")
	@Temporal(TemporalType.DATE)
	@JsonFormat(pattern="yyyy-MM-dd", timezone="Asia/Jakarta")
	private Date tglLahir;

	@Column(name = "fakultas", length = 100)
	private String fakultas;

	@Column(name = "prodi", length = 100)
	private String prodi;

	@Column(name = "alamat", length = 100)
	private String alamat;

	@Column(name = "email", length = 50)
	private String email;

	@Column(name = "telp", length = 20)
	private String telp;

	public String getNim() {
		return nim;
	}

	public void setNim(String nim) {
		this.nim = nim;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public Date getTglLahir() {
		return tglLahir;
	}

	public void setTglLahir(Date tglLahir) {
		this.tglLahir = tglLahir;
	}

	public String getFakultas() {
		return fakultas;
	}

	public void setFakultas(String fakultas) {
		this.fakultas = fakultas;
	}

	public String getProdi() {
		return prodi;
	}

	public void setProdi(String prodi) {
		this.prodi = prodi;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelp() {
		return telp;
	}

	public void setTelp(String telp) {
		this.telp = telp;
	}
}