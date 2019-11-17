package com.example.demo.controller;

import java.io.Serializable;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Lote;
import com.example.demo.services.LoteServices;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping({ "/listado" })
@Component
public class Controller<T, ID extends Serializable> {

	/** The service. */
	@Autowired
	private LoteServices<T, ID> service;

	/** The Constant logger. */
	@SuppressWarnings(value = { "unused" })
	private static final Logger logger = LoggerFactory.getLogger(Controller.class);

	/**
	 * Creates the.
	 *
	 * @param persona the persona
	 * @return the persona
	 */
	@SuppressWarnings("unchecked")
	@PostMapping
	public Lote create(@RequestBody Lote Lote) {
		return (Lote) service.add((T) Lote);
	}

	/**
	 * Find one.
	 *
	 * @param id the id
	 * @return the persona
	 */
	@GetMapping(path = { "/{id}" })
	public Lote findOne(@PathVariable("id") ID id) {
		return (Lote) service.get(id);
	}

	/**
	 * Update.
	 *
	 * @param persona the persona
	 * @return the persona
	 */
	@SuppressWarnings("unchecked")
	@PutMapping
	public Lote update(@RequestBody Lote Lote) {
		Lote.setIdPRETEX_LOTE((Lote.getIdPRETEX_LOTE()));
		return (Lote) service.update((T) Lote);
	}

	/**
	 * Delete.
	 *
	 * @param id the id
	 */
	@DeleteMapping(path = { "/{id}" })
	public void delete(@PathVariable("id") ID id) {
		service.delete(id);
	}

	/**
	 * Find all.
	 *
	 * @return the list
	 */
	@SuppressWarnings("unchecked")
	@GetMapping
	public List<Lote> findAll() {
		return (List<Lote>) service.list();
	}
	
}
