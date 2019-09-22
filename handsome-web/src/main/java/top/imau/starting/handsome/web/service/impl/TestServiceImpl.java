package top.imau.starting.handsome.web.service.impl;

import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Service;
import top.imau.starting.handsome.web.service.TestService;

//@Service
public class TestServiceImpl implements TestService {
    @Override
    public Object getTestResult(Object req) {

        return JSON.toJSONString(req);
    }
}
