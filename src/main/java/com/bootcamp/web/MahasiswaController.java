package com.bootcamp.web;

import java.util.ArrayList;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bootcamp.model.Mahasiswa;

@Controller
@RequestMapping("/mahasiswa")
public class MahasiswaController {

	@RequestMapping("index.html")
	public String home() {
		return "index";
	}

	@RequestMapping("mahasiswa.html")
	public String mahasiswa(Model model) {
		return "mahasiswa";
	}

	@RequestMapping("mahasiswa-reset.html")
	public String resetMahasiswa(HttpServletRequest req) {
		Collection<Mahasiswa> mahasiswaList = null;
		HttpSession session = req.getSession(true);
		if (session.getAttribute("list") != null) {
			mahasiswaList = (Collection<Mahasiswa>) session.getAttribute("list");
			mahasiswaList.clear();
		}
		return "mahasiswa";
	}

	@RequestMapping(value = "mahasiswa-save.html", method = RequestMethod.POST)
	public String mahasiswaSave(Model model, @ModelAttribute Mahasiswa mahasiswa, HttpServletRequest req) {
		Collection<Mahasiswa> mahasiswaList = null;
		HttpSession session = req.getSession(true);
		if (session.getAttribute("list") != null) {
			mahasiswaList = (Collection<Mahasiswa>) session.getAttribute("list");
		} else {
			mahasiswaList = new ArrayList<>();
			session.setAttribute("list", mahasiswaList);
		}
		mahasiswaList.add(mahasiswa);

		model.addAttribute("list", mahasiswaList);
		return "mahasiswa";
	}
}