package com.prueba.totems.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.prueba.totems.validator.EnumValidate;

public class ParamsDTO {

	@JsonProperty("id")
	@NotNull
	@Max(9)@Min(1)
	private Integer id;
	@JsonProperty("tipoDocumento")
	@EnumValidate(enumClass = TypeDocumentEnum.class,ignoreCase = true)
	private String tipoDocumento;
	@Pattern(message = "debe ser con el formato yyyy-mm-dd'T'HH:MM:ss",regexp = "([10]\\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01])T(00|[0-9]|1[0-9]|2[0-3]):([0-9]|[0-5][0-9]):([0-9]|[0-5][0-9]))$")
	@JsonProperty("dateTime")
	private String dateTime;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	
	
	
}
