package com.scf.erdos.client.dto;

import java.util.LinkedHashMap;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @Description : 路由过滤器模型
 * @author：bao-clm
 * @date: 2019/1/12
 * @version：1.0
 */
@EqualsAndHashCode
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuppressWarnings("all")
public class GatewayFilterDefinition {
    private String name;
    @Builder.Default
    private Map<String, String> args = new LinkedHashMap<>();
}
