package com.vinhdd.base.dto.out;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ApiResponse<T> {
    private boolean success;
    private String message;
    private T data;

}
