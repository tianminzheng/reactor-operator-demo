package com.tianyalan.reactor.demo;

import reactor.core.publisher.Flux;

public class FlatMap {

	public static void main(String[] args) {
		flatMap();
	}
	
	private static void flatMap() {
        Flux.just(5, 10)
                .flatMap(x -> Flux.intervalMillis(x * 10, 100).take(x))
                .toStream()
                .forEach(System.out::println);
    }

}
