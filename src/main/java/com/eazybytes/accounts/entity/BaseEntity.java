package com.eazybytes.accounts.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@MappedSuperclass // indicates to JPA that this will be superclsss to all entities where this class is extended
@EntityListeners(AuditingEntityListener.class) // ALLOWS SPRING TO ADD AUDITING DETAILS
@Getter
@Setter
@ToString
public class BaseEntity {

    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime createdAt;

    @CreatedBy
    @Column(updatable = false)
    private String createdBy;

    @LastModifiedDate
    @Column(insertable = false)
    private LocalDateTime updatedAt;

    @LastModifiedBy
    @Column(insertable = false)
    private String updatedBy;

//    Column property UPDATABLE allow us to let JPA know that these field should not be updated during DML query run
//    Column property INSERTABLE allow us to let JPA know that these field should not be inserted during new record insertion

    /*
    ANNOTATIONS
    1. CreatedDate
    2. CreatedBy
    3. LastModifiedBy
    4. LastModifiedDate

    ALL THESE ANNOTATIONS HELPS SPRING TRACKS THESE VALUE FOR AN ENTITY
    */

}
