package com.server.pojo;

import java.util.Arrays;

public enum Roles {

	ADMIN("ADMIN"), BASIC("BASIC");

	private String value;

	private Roles(String value) {
		this.value = value;
	}

	public static Roles fromValue(String value) {
		for (Roles role : values()) {
			if (role.value.equalsIgnoreCase(value)) {
				return role;
			}
		}
		throw new IllegalArgumentException(
				"Unknown enum type " + value + ", Allowed values are " + Arrays.toString(values()));
	}
}
