package com.company.Concrete;

import com.company.Abstract.BaseCustomerManager;
import com.company.Abstract.ICustomerService;
import com.company.Abstract.IPersonCheckService;
import com.company.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
    private IPersonCheckService iPersonCheckService;

    public StarbucksCustomerManager(IPersonCheckService iPersonCheckService) {
        this.iPersonCheckService = iPersonCheckService;
    }

    @Override
    public void save(Customer customer) {
            if(iPersonCheckService.checkIfRealPerson(customer)){
                super.save(customer);
            }
            else{
                throw new RuntimeException("Not a valid person");
            }
    }
}
