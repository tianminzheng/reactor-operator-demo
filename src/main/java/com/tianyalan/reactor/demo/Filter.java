package com.tianyalan.reactor.demo;

import reactor.core.publisher.Flux;

public class Filter {

	public static void main(String[] args) {
		filter();
	}
	
	private static void filter() {
        Flux.range(1, 10).filter(i -> i % 2 == 0).subscribe(System.out::println);
    }
}
