package com.cluser.security;

import java.io.Serializable;
import java.util.Collection;

import org.springframework.security.access.PermissionEvaluator;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;

public class CluserPermissionEvaluator implements PermissionEvaluator {

	private boolean hasPermission(Authentication authentication, Object permission) {
		// permission = 'user:search'
		Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
		// authorities = [admin]
		for (GrantedAuthority authority : authorities) {
			if (authority.getAuthority().equals(permission)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean hasPermission(Authentication authentication, Object targetDomainObject, Object permission) {
		if ("usercenter".equals(targetDomainObject)) {
			return this.hasPermission(authentication, permission);
		}
		return false;
	}

	@Override
	public boolean hasPermission(Authentication authentication, Serializable targetId, String targetType,
			Object permission) {
		// TODO Auto-generated method stub
		return false;
	}

}
