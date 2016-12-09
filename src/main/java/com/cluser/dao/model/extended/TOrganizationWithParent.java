package com.cluser.dao.model.extended;

import com.cluser.dao.model.generated.TOrganization;

public class TOrganizationWithParent extends TOrganization{
	private Long ancestor;
	
	private Short depth;

	public Short getDepth() {
		return depth;
	}

	public void setDepth(Short depth) {
		this.depth = depth;
	}

	public Long getAncestor() {
		return ancestor;
	}

	public void setAncestor(Long ancestor) {
		this.ancestor = ancestor;
	}
}