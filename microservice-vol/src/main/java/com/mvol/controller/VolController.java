package com.mvol.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mvol.entities.Vol;
import com.mvol.service.interfaces.IVolService;

@RestController
public class VolController {
	
	@Autowired
	IVolService iVolService;
	
	@GetMapping("/vols")
	public List<Vol> findAll() {
		return iVolService.findAll();
	}

	@GetMapping("/vols/{idVol}")
	public Vol findOne(@PathParam("idVol") Long id) {
		return iVolService.findOne(id);
	}

	@PostMapping("/vols")
	public Vol save(@RequestBody Vol vol) {
		return iVolService.save(vol);
	}

	@DeleteMapping("/vols/{idVol}")
	public void delete(@PathParam("idVol")Long id) {
		iVolService.delete(id);
		
	}

}
