package com.xzc.handler;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import reactor.core.publisher.Mono;

/**
 * 城市功能处理类
 * @author xzc
 *
 */
@Component
public class CityHandler {
	
	public Mono<ServerResponse> helloCity(ServerRequest request){
		return ServerResponse.ok().contentType(MediaType.TEXT_PLAIN)
				.body(Mono.just("hello nanjin"),String.class);
		
	}
}
