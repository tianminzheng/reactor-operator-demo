package com.tianyalan.reactor.demo;

import reactor.core.publisher.Flux;

public class ZipWith {

	public static void main(String[] args) {
		zipWith();
	}

	private static void zipWith() {
		Flux.just("a", "b").zipWith(Flux.just("c", "d")).subscribe(System.out::println);

		System.out.println("---------");

		Flux.just("a", "b").zipWith(Flux.just("c", "d"), (s1, s2) -> String.format("%s-%s", s1, s2))
				.subscribe(System.out::println);
	}
}
