package com.drathveloper.pocgrpcclient.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record CreatedUserDto(Long id, String username) {
}
