package com.kwamid.carshow484.config;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.net.SyslogOutputStream;
import com.sun.tools.javac.Main;
import org.springframework.boot.origin.SystemEnvironmentOrigin;
import org.springframework.context.annotation.Bean;

public class SecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throw Exception{

    }

    public static void main(String[] args) {
        System.out.println("rewttetter");
    }

}
