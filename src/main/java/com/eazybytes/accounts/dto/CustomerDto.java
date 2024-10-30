package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(
        name = "Customer",
        description = "Schema to hold customer and Account information"
)
public class CustomerDto {

    @Schema(
            description = "Schema to hold customer name",
            example = "Shubham Kumar"
    )
    @NotEmpty(message = "Name can't be empty or null")
    @Size(min = 5, max = 30, message = "lengh of name must be between 5 and 30")
    private String name;

    @Schema(
            description = "Schema to hold customer email",
            example = "abc@xyz.com"
    )
    @NotEmpty(message = "Email can't be empty or null")
    @Email(message = "Email should be a  valid value")
    private String email;

    @Schema(
            description = "Schema to hold customer mobile number",
            example = "9874563210"
    )
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be of 10 digits")
    private String mobileNumber;

    @Schema(
            description = "Account details of customer"
    )
    private AccountsDto accountsDto;
}
