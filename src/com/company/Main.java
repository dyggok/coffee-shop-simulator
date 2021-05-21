package com.company;

import com.company.Abstract.BaseCustomerManager;
import com.company.Adapters.MernisServiceAdapter;
import com.company.Concrete.NeroCustomerManager;
import com.company.Concrete.StarbucksCustomerManager;
import com.company.Entities.Customer;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
        baseCustomerManager.save(new Customer(1,"Duygu","Gök",
                LocalDate.of(1996,05,20),"48067173533"));
    }
}
