package br.com.treinaweb.adoteumpet.api.adocao.dtos;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdocaoRequest {
	
	private String email;
	private BigDecimal valor;
	private Long petid;

}
