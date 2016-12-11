package com.cluser.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.security.web.access.intercept.FilterSecurityInterceptor;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import com.cluser.security.AccessTokenAuthenticationProvider;
import com.cluser.security.BearerAuthenticationEntryPoint;
import com.cluser.security.BearerAuthenticationsFilter;
import com.cluser.security.JwtAuthenticationFailureHandler;
import com.cluser.security.JwtAuthenticationSuccessHandler;
import com.cluser.security.RestAccessDeniedHandler;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
    	http
    		.exceptionHandling()
    			.accessDeniedHandler(restAccessDeniedHandler())
    			.authenticationEntryPoint(restAuthenticationEntryPoint())
    			.and()
            .authorizeRequests()
                .antMatchers("/**").permitAll()
                .anyRequest().authenticated()
                .and()
            .addFilterBefore(new BearerAuthenticationsFilter(authenticationManager(), authenticationSuccessHandler(), authenticationFailureHandler()), FilterSecurityInterceptor.class);
    }
    
    @Bean
    public AuthenticationSuccessHandler authenticationSuccessHandler(){
        return new JwtAuthenticationSuccessHandler();
    }
    @Bean
    public AuthenticationFailureHandler authenticationFailureHandler(){
        return new JwtAuthenticationFailureHandler();
    }
    
    @Bean
    public AuthenticationProvider authenticationProvider(){
        return new AccessTokenAuthenticationProvider();
    }
    
    @Bean
    public AccessDeniedHandler restAccessDeniedHandler(){
        AccessDeniedHandler accessDeniedHandler = new RestAccessDeniedHandler();
        return accessDeniedHandler;
    }
    @Bean
    public AuthenticationEntryPoint restAuthenticationEntryPoint(){
        AuthenticationEntryPoint authenticationEntryPoint = new BearerAuthenticationEntryPoint();
        return authenticationEntryPoint;
    }
}
