package br.com.etechoracio.chuhas.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.etechoracio.chuhas.enums.TipoItemEnum;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TBL_ITEM")
public class Item {

	@Id
	@Column(name = "ID_ITEM")
	private Integer id;
	
	@Column(name = "TX_TITULO")
	private String titulo;
	
	@Column(name = "TX_DESCRICAO")
	private String descricao;
	
	@Column(name = "NR_FATOR_ADULTO")
	private Integer fatorAdulto;
	
	@Column(name = "NR_FATOR_CRIANCA")
	private Integer fatorCrianca;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "TP_ITEM")
	private TipoItemEnum tipo;
	
	@Column(name = "DT_INATIVACAO")
	private LocalDateTime dataExclusao;
	
}
