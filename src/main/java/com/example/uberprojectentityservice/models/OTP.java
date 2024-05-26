package com.example.uberprojectentityservice.models;

import jakarta.persistence.Entity;
import lombok.*;

import java.util.Random;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OTP extends BaseModel {

    private String code;

    private String sentToNumber;

    public static OTP make(String phoneNumber) {
        Random random = new Random();
        int code = random.nextInt(900)+100;
        return OTP.builder().sentToNumber(phoneNumber).
                code(String.valueOf(code)).build();
    }
}
