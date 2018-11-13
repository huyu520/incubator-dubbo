package org.apache.dubbo.test.spi.service.impl;

import org.apache.dubbo.test.spi.service.IDubboService;

/**
 * @Author:tongcao
 * @Date:2018/11/13 14:54
 * Description:
 */
public class DubboService2 implements IDubboService {
    /**
     * @param name
     */
    @Override
    public void sayHello(String name) {
        System.out.println("我是DubboService2服务实现");
    }
}
