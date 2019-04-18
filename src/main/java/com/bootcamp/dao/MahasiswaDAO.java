package com.bootcamp.dao;

import java.util.Collection;

import com.bootcamp.model.Mahasiswa;

public interface MahasiswaDAO {
	public Mahasiswa findOne(String id);

	public Collection<Mahasiswa> findAll();

	public Mahasiswa update(Mahasiswa biodata);

	public void delete(Mahasiswa biodata);

	public void deleteById(String id);

	public void save(Mahasiswa biodata);
}