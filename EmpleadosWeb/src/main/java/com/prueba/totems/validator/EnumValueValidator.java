package com.prueba.totems.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EnumValueValidator  implements ConstraintValidator<EnumValidate, String>{

	private EnumValidate annotation;
	
	public void initialize(EnumValidate constraintAnnotation) {
		this.annotation = constraintAnnotation;
		
	}

	public boolean isValid(String valueForValidation, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		boolean result = false;
        
        Object[] enumValues = annotation.enumClass().getEnumConstants();
         
        if(enumValues != null)
        {
            for(Object enumValue:enumValues)
            {
                if(valueForValidation.equals(enumValue.toString()) 
                   || (this.annotation.ignoreCase() && valueForValidation.equalsIgnoreCase(enumValue.toString())))
                {
                    result = true; 
                    break;
                }
            }
        }
         
        return result;
	}

}
