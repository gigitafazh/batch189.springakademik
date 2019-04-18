package com.bootcamp.service;

import java.util.Collection;

import com.bootcamp.model.Mahasiswa;

public interface MahasiswaService {
	public Mahasiswa findOne(String id);

	public Collection<Mahasiswa> findAll();

	public Mahasiswa update(Mahasiswa mahasiswa);

	public void delete(Mahasiswa mahasiswa);

	public void deleteById(String id);

	public void save(Mahasiswa mahasiswa);
}