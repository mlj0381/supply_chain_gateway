package com.scf.erdos.client.filter;

import com.scf.erdos.client.config.GatewaySwaggerProvider;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.server.ServerWebExchange;

/**
 * @Description : 聚合swagger 文档 filter
 * @author：bao-clm
 * @date: 2019/1/12
 * @version：1.0
 */

@Component
@SuppressWarnings("all")
public class GwSwaggerHeaderFilter extends AbstractGatewayFilterFactory {
	private static final String HEADER_NAME = "X-Forwarded-Prefix";

	@Override
	public GatewayFilter apply(Object config) {
		return (exchange, chain) -> {
			ServerHttpRequest request = exchange.getRequest();
			String path = request.getURI().getPath();
			if (!StringUtils.endsWithIgnoreCase(path, GatewaySwaggerProvider.API_URI)) {
				return chain.filter(exchange);
			}
			String basePath = path.substring(0, path.lastIndexOf(GatewaySwaggerProvider.API_URI));
			ServerHttpRequest newRequest = request.mutate().header(HEADER_NAME, basePath).build();
			ServerWebExchange newExchange = exchange.mutate().request(newRequest).build();
			return chain.filter(newExchange);
		};
	}

}