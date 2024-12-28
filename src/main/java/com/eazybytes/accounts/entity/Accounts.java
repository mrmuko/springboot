package com.eazybytes.accounts.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

/**
 * Entity use the table head from Schema for internal use
 */
@Entity
@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor
public class Accounts extends BaseEntity {

    @Column(name = "customer_id")
    private Long customerId;

    @Id
    @Column(name = "account_number") //optional because we are using same name in schema
    private Long accountNumber;

    @Column(name = "account_type") //optional because we are using same name in schema
    private String accountType;

    @Column(name = "branch_address")
    private String branchAddress;
}
