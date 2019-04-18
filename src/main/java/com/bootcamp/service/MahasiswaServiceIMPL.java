package com.bootcamp.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bootcamp.dao.MahasiswaDAO;
import com.bootcamp.model.Mahasiswa;

@Service
@Transactional
public class MahasiswaServiceIMPL implements MahasiswaService {
	@Autowired
	private MahasiswaDAO mahasiswaDao;

	@Override
	public Mahasiswa findOne(String id) {
		return mahasiswaDao.findOne(id);
	}

	@Override
	public void save(Mahasiswa mahasiswa) {
		mahasiswaDao.save(mahasiswa);
	}

	@Override
	public Collection<Mahasiswa> findAll() {
		return mahasiswaDao.findAll();
	}

	@Override
	public Mahasiswa update(Mahasiswa mahasiswa) {
		return mahasiswaDao.update(mahasiswa);
	}

	@Override
	public void delete(Mahasiswa mahasiswa) {
		mahasiswaDao.delete(mahasiswa);
	}

	@Override
	public void deleteById(String id) {
		mahasiswaDao.deleteById(id);
	}

}