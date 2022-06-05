package br.com.treinaweb.adoteumpet.api.adocao.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import br.com.treinaweb.adoteumpet.api.adocao.mappers.AdocaoMapper;
import br.com.treinaweb.adoteumpet.core.repositories.AdocaoRepository;

@RestController
public class AdocaoController {

	@Autowired
	private AdocaoRepository adocaoRepository;
	
	@Autowired
	private AdocaoMapper adocaoMapper;
}
