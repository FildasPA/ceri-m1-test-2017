package fr.univavignon.rodeo.implementation;

import fr.univavignon.rodeo.api.*;
import java.util.List;
import java.util.Map;

public class EnvironmentProvider implements IEnvironmentProvider {

	List<String> availableEnvironments;
	List<IEnvironment> environments;

	public EnvironmentProvider() {
		// Parser
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<String> getAvailableEnvironments() {
		return (List<String>) environments.keySet();
	}

	@Override
	public IEnvironment getEnvironment(String name)
	throws IllegalArgumentException {
		if (!environments.containsKey(name))
			throw new IllegalArgumentException("dds");
		return environments.get(name);
	}

}
