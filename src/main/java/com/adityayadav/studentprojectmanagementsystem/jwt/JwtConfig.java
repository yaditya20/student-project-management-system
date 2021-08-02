package com.adityayadav.studentprojectmanagementsystem.jwt;

import com.google.common.net.HttpHeaders;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.Configuration;

@Getter
@Setter
@NoArgsConstructor
@Configuration
public class JwtConfig {
    private final String secretKey = "Secret_Key_for_Application";
    private final String tokenPrefix = "Bearer";
    private final Integer tokenExpirationAfterDays = 1000 * 60 * 60 * 15;

    public String getAuthorizationHeader() {
        return HttpHeaders.AUTHORIZATION;
    }
}
