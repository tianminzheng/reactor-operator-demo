package com.tianyalan.reactor.demo;

import reactor.core.publisher.Flux;

public class Reduce {

	public static void main(String[] args) {
		reduce();
	}
	
	private static void reduce() {
        Flux.range(1, 100).reduce((x, y) -> x + y).subscribe(System.out::println);
        
        Flux.range(1, 100).reduceWith(() -> 100, (x, y) -> x + y).subscribe(System.out::println);
    }
}
