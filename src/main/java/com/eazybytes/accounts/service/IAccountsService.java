package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDto;

public interface IAccountsService {

    /*
     *
     * @param customerDto - CustomerDto Object
     */
    void createAccount(CustomerDto customerDto);

    /*
     *
     * @param mobileNumber - Input mobile number
     * @return AccountDetails based on given mobile number
     */
    CustomerDto fetchAccount(String mobileNumber);

    /*
     *
     * @param customerDto - CustomerDto object
     * @return boolean indicating if the update of Accunt details is successful or not
     */
    boolean updateAccount(CustomerDto customerDto);

    /**
     *
     * @param mobileNumber - Input Mobile Number
     * @return boolean indicating if the delete of Account details is successful or not
     */
    boolean deleteAccount(String mobileNumber);
}
