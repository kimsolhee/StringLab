package com.stringLab.core.validator;

import utils.RegexUtils;

public class DefaultStringValidator implements StringValidator {

	@Override
	public boolean isEmail(String input) {
		return input != null && RegexUtils.matches(RegexUtils.EMAIL_PATTERN, input);
	}

	@Override
	public boolean isUrl(String input) {
		return input != null && RegexUtils.matches(RegexUtils.URL_PATTERN, input);
	}

	@Override
	public boolean isBlank(String input) {
		return input == null || input.trim().isEmpty();
	}

}
