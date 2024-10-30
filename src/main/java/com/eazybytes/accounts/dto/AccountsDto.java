package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Schema(
        name = "Account",
        description = "Schema to hold Account information"
)
@Data
public class AccountsDto {

    @NotEmpty(message = "Account number can't be empty or null")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be of 10 digits")
    @Schema(
            description = "Account number of EazyBank account"
    )
    private Long accountNumber;

    @Schema(
            description = "Account type of EazyBank Account",
            example = "Savings"
    )
    @NotEmpty(message = "Account type can't be empty or null")
    private String accountType;

    @Schema(
            description = "Branch address of bank"
    )
    @NotEmpty(message = "Branch address can't be empty or null")
    private String branchAddress;
}
