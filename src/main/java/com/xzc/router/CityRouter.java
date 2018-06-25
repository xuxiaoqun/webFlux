package com.xzc.router;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.xzc.handler.CityHandler;

/**
 * 城市路由类
 * @author xzc
 *
 */
@Configuration
public class CityRouter {
	
	@Autowired
	private CityHandler cityHandler;
	
	@Bean
	public RouterFunction<ServerResponse> routeCity(){
		 return RouterFunctions.route(RequestPredicates.GET("/hello2"), cityHandler::helloCity);
		 
	}

}
