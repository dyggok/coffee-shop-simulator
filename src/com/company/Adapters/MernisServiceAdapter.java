package com.company.Adapters;

import com.company.Abstract.IPersonCheckService;
import com.company.Entities.Customer;
import mernisReference.TTEKPSPublicSoap;

public class MernisServiceAdapter implements IPersonCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) {
        TTEKPSPublicSoap client = new TTEKPSPublicSoap();
        try {
            if(client.TCKimlikNoDogrula(Long.valueOf(customer.getNationalityId()),customer.getFirstName().toUpperCase(),
                    customer.getLastName().toUpperCase(),customer.getDateOfBirth().getYear())){
                return true;
            }
        } catch (Exception e) {

        }
        return false;
    }
}
