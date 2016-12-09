package com.practice;

import java.util.Collections;
import java.util.NoSuchElementException;
import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class P02Test {
	@Test(expected = NoSuchElementException.class)
	public void when_list_is_null_should_throw_exception() throws Exception {
		P02.secondLast(Collections.emptyList());
	}

	@Test(expected = NoSuchElementException.class)
	public void when_count_of_list_is_only_one_should_throw_exception() throws Exception {
		P02.secondLast(asList(1));
	}
}
