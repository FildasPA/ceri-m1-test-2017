package fr.univavignon.rodeo.implementation;

import fr.univavignon.rodeo.api.*;
import java.util.List;

public class EnvironmentProvider implements IEnvironmentProvider {

	private List<String> availableEnvironments;
	private List<IEnvironment> environments;

	public EnvironmentProvider() {
		// Parser
	}

	@Override
	public List<String> getAvailableEnvironments() {
		return availableEnvironments;
	}

	@Override
	public IEnvironment getEnvironment(String name)
	throws IllegalArgumentException {
		if(name == null) {
			throw new IllegalArgumentException();
		}

		for(IEnvironment e : environments) {
			if(e.getName() == name) {
				return e;
			}
		}

		throw new IllegalArgumentException();
	}
}
