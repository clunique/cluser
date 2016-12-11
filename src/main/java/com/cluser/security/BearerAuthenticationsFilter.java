package com.cluser.security;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

public class BearerAuthenticationsFilter extends AbstractAuthenticationProcessingFilter {
	private static Logger logger = LoggerFactory.getLogger(BearerAuthenticationsFilter.class);
	private static final String AUTH_HEADER_NAME = "Authorization";
	private static final String AUTH_HEADER_PREFIX = "Bearer ";

	public BearerAuthenticationsFilter(AuthenticationManager authenticationManager,
			AuthenticationSuccessHandler authenticationSuccessHandler,
			AuthenticationFailureHandler authenticationFailureHandler) {
		super("/**");
		setAuthenticationManager(authenticationManager);
		setAuthenticationSuccessHandler(authenticationSuccessHandler);
		setAuthenticationFailureHandler(authenticationFailureHandler);
	}

	// 标识此Filter是否应该试图去处理一个login请求
	@Override
	protected boolean requiresAuthentication(HttpServletRequest request, HttpServletResponse response) {
		boolean requiresAuthenticationResult = super.requiresAuthentication(request, response);
		if (requiresAuthenticationResult) {
			String header = request.getHeader(AUTH_HEADER_NAME);
			if (header == null || !header.startsWith(AUTH_HEADER_PREFIX)) {
				// 当header为空或者不是Bearer时，返回false，表示不处理本次请求。
				return false;
			}
		}
		return requiresAuthenticationResult;
	}

	/*
	 * Performs actual authentication.(non-Javadoc)
	 * @see org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter#attemptAuthentication(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response)
			throws AuthenticationException, IOException, ServletException {
		String header = request.getHeader(AUTH_HEADER_NAME);
        JwtAuthenticationToken authenticationToken = new JwtAuthenticationToken(header.substring(7));
        return getAuthenticationManager().authenticate(authenticationToken);
	}

	@Override
	protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain,
			Authentication authResult) throws IOException, ServletException {
		super.successfulAuthentication(request, response, chain, authResult);
		
		// 此调用导致下一个Filter被调用
		chain.doFilter(request, response);
	}

}
