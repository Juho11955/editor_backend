package com.post.dev.config;

import com.post.dev.Enums.MemberGrade;
import com.post.dev.service.signIn.SignInService;
import com.post.dev.util.JwtFilter;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig {

    private final SignInService signInService;
    private static String secretKey = "aglkajepoghdlkfhmbiosembbnsdlffvnoeaiehrapoenhjkdfbnlksdfmnalnoaweureghpruiperhwqpoieioggpdfbnjkdjvb";

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception{
        return httpSecurity
                .httpBasic().disable()
                .csrf().disable()
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                .addFilterBefore(new JwtFilter(signInService, secretKey), UsernamePasswordAuthenticationFilter.class)
                .authorizeRequests()
                .antMatchers("").authenticated()
                .antMatchers("/jwt-login/admin/**").hasAuthority(MemberGrade.ADMIN.name())
                .and().build();
    }
}
