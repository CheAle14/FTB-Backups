package com.feed_the_beast.mods.ftbbackups;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

public class PatternFilter implements FilenameFilter {
	
	public PatternFilter(Pattern pattern) {
		filter = pattern;
	}
	public PatternFilter(String pattern) {
		this(Pattern.compile(pattern));
	}
	
	private Pattern filter;

	@Override
	public boolean accept(File dir, String name) {
		return filter.matcher(name).matches();
	}

}
