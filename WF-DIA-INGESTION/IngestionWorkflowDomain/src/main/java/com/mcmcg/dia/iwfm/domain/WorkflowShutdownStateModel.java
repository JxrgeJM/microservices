package com.mcmcg.dia.iwfm.domain;

import com.mcmcg.dia.iwfm.domain.BaseDomain;

/**
 * @author jaleman
 *
 */
public class WorkflowShutdownStateModel extends BaseDomain {

	private static final long serialVersionUID = 1L;

	private String id;
	private boolean shutdownState;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public boolean isShutdownState() {
		return shutdownState;
	}

	public void setShutdownState(boolean shutdownState) {
		this.shutdownState = shutdownState;
	}

}
