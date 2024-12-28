package com.eazybytes.accounts.dto;

import jakarta.persistence.Column;
import lombok.Data;

/**
 * DTO is what we want client to see or what information we want to pass to client
 */
@Data
public class AccountsDto {

    private String accountType;

    private String branchAddress;

    private Long AccountNumber;
}
