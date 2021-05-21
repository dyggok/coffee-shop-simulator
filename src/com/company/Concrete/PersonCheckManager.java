package com.company.Concrete;

import com.company.Abstract.IPersonCheckService;
import com.company.Entities.Customer;

public class PersonCheckManager implements IPersonCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) {
        return true;
    }
}
