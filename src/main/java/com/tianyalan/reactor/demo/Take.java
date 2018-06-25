package com.tianyalan.reactor.demo;

import reactor.core.publisher.Flux;

public class Take {

	public static void main(String[] args) {
		take1();
		take2();
	}
	
	private static void take1() {
        Flux.range(1, 1000).take(10).subscribe(System.out::println);
        
        Flux.range(1, 1000).takeLast(10).subscribe(System.out::println);
    }
	
	
	private static void take2() {        
        Flux.range(1, 1000).takeWhile(i -> i < 10).subscribe(System.out::println);
        
        Flux.range(1, 1000).takeUntil(i -> i == 10).subscribe(System.out::println);
    }
}


