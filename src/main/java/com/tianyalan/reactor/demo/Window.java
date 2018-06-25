package com.tianyalan.reactor.demo;

import reactor.core.publisher.Flux;

public class Window {

	public static void main(String[] args) {
		window();
	}
	
	private static void window() {		
		Flux.range(1, 100).window(20).toIterable().forEach(w -> {
			w.subscribe(System.out::println);
			System.out.println("-------");
		});
	}
}
