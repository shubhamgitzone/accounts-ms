package com.eazybytes.accounts.repository;

import com.eazybytes.accounts.entity.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface AccountsRepository extends JpaRepository<Accounts, Long> {

    Optional<Accounts> findByCustomerId(Long customerId);

    //we're trying to update DB, so we need to mention these 2 annotation
    // if some error happens at runtime, half done changes are reversed
    @Transactional // will tell spring to execute query in one transaction
    @Modifying // will tell spring that this call will modify the db, so pls exceute query in one go. that's why transactional is used
    void deleteByCustomerId(Long customerId);
}
