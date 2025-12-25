package br.dev.hygino.dto;

import java.util.Objects;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class StateRequestDto {
	@NotBlank
	@Size(min = 6, max = 60)
	private String name;

	@NotBlank
	@Size(min = 2, max = 2)
	private String abbreviation;

	public StateRequestDto() {
	}

	public StateRequestDto(String name, String abbreviation) {
		this.name = name;
		this.abbreviation = abbreviation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAbbreviation() {
		return abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	@Override
	public int hashCode() {
		return Objects.hash(abbreviation, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StateRequestDto other = (StateRequestDto) obj;
		return Objects.equals(abbreviation, other.abbreviation) && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "StateRequestDto [name=" + name + ", abbreviation=" + abbreviation + "]";
	}
}
