package br.com.msansone.test.phoneSpringBootService.business;

import br.com.msansone.test.phoneSpringBootService.enums.PhoneType;

public class CountryBusiness {

    public String findCountry(String phone) {
        if (phone.matches(PhoneType.Cameroon.toString())) {return PhoneType.Cameroon.name();}
        if (phone.matches(PhoneType.Ethiopia.toString())) {return PhoneType.Ethiopia.name();}
        if (phone.matches(PhoneType.Morocco.toString())) {return PhoneType.Morocco.name();}
        if (phone.matches(PhoneType.Mozambique.toString())) {return PhoneType.Mozambique.name();}
        if (phone.matches(PhoneType.Uganda.toString())) {return PhoneType.Uganda.name();}
        return "";
    }

}
