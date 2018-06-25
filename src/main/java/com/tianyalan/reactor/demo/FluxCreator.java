package com.tianyalan.reactor.demo;

import reactor.core.publisher.Flux;

public class FluxCreator {
    public static void main(final String[] args) {
       simple();
       generate();
       create();
    }

    private static void simple() {
		Flux.just("Hello", "World").subscribe(System.out::println);
		
		Flux.fromArray(new Integer[] {1, 2, 3}).subscribe(System.out::println);
		
		Flux.empty().subscribe(System.out::println);
		
		Flux.range(1, 10).subscribe(System.out::println);		
	}

	private static void generate() {
		Flux.generate(sink -> {
			sink.next("Hello");
			sink.complete();
		}).subscribe(System.out::println);
	}

	private static void create() {
		Flux.create(sink -> {
			for (int i = 0; i < 10; i++) {
				sink.next(i);
			}
			sink.complete();
		}).subscribe(System.out::println);
	}

}
