package com.scf.erdos.rabbitmq.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Merlin
 * @Title: DetailResponse
 * @ProjectName scf-erdos-platform
 * @Description: TODO
 * @date 2019/8/2617:27
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DetailResponse {

    private boolean ifSuccess;

    private String errorCode;

    private String errMsg;
}
