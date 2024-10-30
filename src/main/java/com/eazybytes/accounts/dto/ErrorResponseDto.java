package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Schema(
        name = "Error Response",
        description = "Schema to hold error details information"
)
@Data
@AllArgsConstructor
public class ErrorResponseDto {

    @Schema(
            description = "Invoked api path by client"
    )
    private String apiPath;

    @Schema(
            description = "error code representing the error"
    )
    private HttpStatus errorCode;

    @Schema(
            description = "error message representing the error"
    )
    private String errorMessage;

    @Schema(
            description = "time when error occured"
    )
    private LocalDateTime errorTime;
}
