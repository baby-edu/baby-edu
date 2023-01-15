package com.hayfar.baby_education.entity;

import lombok.Data;

@Data
public class RefreshRequest {

    Long userId;
    String refreshToken;
}