package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

@Schema(
        name = "Response",
        description = "Schema to hold response information"
)
@Data
@AllArgsConstructor
public class ResponseDto {

    @Schema(
            description = "status code of response",
            example = "xxx"
    )
    private String statusCode;

    @Schema(
            description = "status message of response",
            example = "request processed successfully"
    )
    private String statusMsg;
}
