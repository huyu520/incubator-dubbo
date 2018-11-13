package org.apache.dubbo.test.spi.main;

import org.apache.dubbo.test.spi.service.IDubboService;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @Author:tongcao
 * @Date:2018/11/13 14:55
 * Description:
 */
public class ServiceMain {


    public static void main(String[] args) {
        ServiceLoader<IDubboService> loader = ServiceLoader.load(IDubboService.class);

        Iterator<IDubboService> serviceIterator = loader.iterator();
        while (serviceIterator.hasNext()) {
            IDubboService next = serviceIterator.next();
            next.sayHello("");
        }
    }
}
