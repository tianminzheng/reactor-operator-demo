package com.tianyalan.reactor.demo;

import reactor.core.publisher.Flux;

public class Buffer {

	public static void main(String[] args) {
		buffer();
	}
	
	private static void buffer() {
        Flux.range(1, 100).buffer(20).subscribe(System.out::println);
        
        System.out.println("---------");
        
        Flux.range(1, 10).bufferUntil(i -> i % 2 == 0).subscribe(System.out::println);
        
        System.out.println("---------");
        
        Flux.range(1, 10).bufferWhile(i -> i % 2 == 0).subscribe(System.out::println);
    }
}
