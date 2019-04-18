package com.bootcamp.web;

import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.model.Mahasiswa;
import com.bootcamp.service.MahasiswaService;

@RestController
@RequestMapping("/mahasiswa-rest")
public class MahasiswaRestController {

	@Autowired
	private MahasiswaService mahasiswaService;

	// get data - save data
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ResponseEntity<Collection<Mahasiswa>> listMahasiswa(HttpServletRequest req) {
		Collection<Mahasiswa> list = mahasiswaService.findAll();


		ResponseEntity<Collection<Mahasiswa>> result = new ResponseEntity<>(list, HttpStatus.OK);
		return result;
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public ResponseEntity<Mahasiswa> simpanMahasiswa(@RequestBody Mahasiswa mahasiswa, HttpServletRequest req) {
		mahasiswaService.save(mahasiswa);

		ResponseEntity<Mahasiswa> result = new ResponseEntity<>(mahasiswa, HttpStatus.OK);
		return result;
	}
	
	// get data - edit data
	@RequestMapping(value = "/{nim}", method = RequestMethod.GET)
	public ResponseEntity<Mahasiswa> dataMahasiswa(@PathVariable("nim") String nim) {
		Mahasiswa mahasiswa = mahasiswaService.findOne(nim);

		ResponseEntity<Mahasiswa> result = new ResponseEntity<>(mahasiswa, HttpStatus.OK);
		return result;
	}
	
	@RequestMapping(value = "/", method = RequestMethod.PUT)
	public ResponseEntity<Mahasiswa> ubahMahasiswa(@RequestBody Mahasiswa mahasiswa) {
		Mahasiswa mahasiswaUbah = mahasiswaService.update(mahasiswa);

		ResponseEntity<Mahasiswa> result = new ResponseEntity<>(mahasiswaUbah, HttpStatus.OK);
		return result;
	}
	
	// delete data
	@RequestMapping(value = "/{nim}", method = RequestMethod.DELETE)
	public ResponseEntity<Collection<Mahasiswa>> hapusMahasiswa(@PathVariable("nim") String nim) {
		mahasiswaService.deleteById(nim);

		ResponseEntity<Collection<Mahasiswa>> result = new ResponseEntity<>(HttpStatus.OK);
		return result;
	}
}