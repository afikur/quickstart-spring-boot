package com.afikur.quickstartspringboot.model;

import lombok.Data;

@Data
public class RestResponse<T> {
    private T data;
}
