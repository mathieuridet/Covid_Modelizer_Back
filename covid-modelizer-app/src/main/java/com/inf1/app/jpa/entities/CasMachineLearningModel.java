package com.inf1.app.jpa.entities;

import java.util.Map;

public class CasMachineLearningModel extends Modelisation {

	private Map<String, Integer> coefficients;
	
	public Map<String, Integer> getCoefficients() {
		return coefficients;
	}
	public void setCoefficients(Map<String, Integer> coefficients) {
		this.coefficients = coefficients;
	}
	
	
	
}
