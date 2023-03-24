package com.as.funcallback;

@FunctionalInterface
public interface CompletionCallback {
	void complete(String taskName);

}
