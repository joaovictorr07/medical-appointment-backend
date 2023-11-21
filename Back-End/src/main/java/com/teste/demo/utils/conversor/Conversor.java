package com.teste.demo.utils.conversor;

import com.teste.demo.dtos.CadastroDtoResponse;
import com.teste.demo.entity.CadastroEntity;

public abstract interface Conversor {

	public static CadastroDtoResponse converterCadastrotoCadastroDtoResponse(CadastroEntity cadastroEntity) {
		CadastroDtoResponse cadastroDtoResponse = new CadastroDtoResponse();
		cadastroDtoResponse.setId(cadastroEntity.getId());
		cadastroDtoResponse.setNomePaciente(cadastroEntity.getNomePaciente());
		cadastroDtoResponse.setCrmMedico(cadastroEntity.getCrmMedico());
		cadastroDtoResponse.setNomeMedico(cadastroEntity.getNomeMedico());
		cadastroDtoResponse.setDataConsulta(cadastroEntity.getDataConsulta());
		cadastroDtoResponse.setSalaConsulta(cadastroEntity.getSalaConsulta());

		return cadastroDtoResponse;
	}

}
