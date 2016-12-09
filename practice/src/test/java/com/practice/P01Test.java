package com.practice;

import org.junit.Test;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.NoSuchElementException;

public class P01Test {

	@Test(expected = NoSuchElementException.class)
	public void shouldFindLastElementFromAListOfAlphabetsNull() throws Exception {
		assertThat(P01.last(null), is(equalTo(new Object())));
	}
	
	@Test
	public void shouldFindLastElementFromAListOfAlphabets() {
		assertThat(P01.last(asList("a", "b", "c", "d")), is(equalTo("d")));
	}
}
