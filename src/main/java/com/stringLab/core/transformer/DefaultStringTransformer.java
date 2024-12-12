package com.stringLab.core.transformer;

public class DefaultStringTransformer implements StringTransformer {

	@Override
	public String toUpperCase(String input) {
		return input == null ? null : input.toUpperCase();
	}

	@Override
	public String toLowerCase(String input) {
		return input == null ? null : input.toLowerCase();
	}

	@Override
	public String toCamelCase(String input) {
		if (input == null || input.isEmpty()) {
			return input;
		}
		
        String[] parts = input.split("_");
        StringBuilder result = new StringBuilder(parts[0].toLowerCase());
        for (int i = 1; i < parts.length; i++) {
            result.append(parts[i].substring(0, 1).toUpperCase())
                  .append(parts[i].substring(1).toLowerCase());
        }
        return result.toString();
	}

	@Override
	public String toSnakeCase(String input) {
		if (input == null || input.isEmpty()) {
			return input;
		}
		
        return input.replaceAll("([a-z])([A-Z])", "$1_$2").toLowerCase();
	}

}
