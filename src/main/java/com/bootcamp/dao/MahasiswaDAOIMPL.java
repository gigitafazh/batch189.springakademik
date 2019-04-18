package com.bootcamp.dao;

import org.springframework.stereotype.Repository;

import com.bootcamp.model.Mahasiswa;

@Repository
public class MahasiswaDAOIMPL extends AbstractHibernateDAO<Mahasiswa> implements MahasiswaDAO {
	public MahasiswaDAOIMPL() {
		setClazz(Mahasiswa.class);
	}
}