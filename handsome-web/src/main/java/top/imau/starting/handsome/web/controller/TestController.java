package top.imau.starting.handsome.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.imau.starting.core.base.enums.ResultEnum;
import top.imau.starting.core.base.res.ResultEntity;
import top.imau.starting.handsome.web.BaseController;
import top.imau.starting.handsome.web.vo.TestVO;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("test")
public class TestController extends BaseController {

    @RequestMapping("getTestResult")
    public ResultEntity<List<TestVO>> getTestResult() {

        TestVO testVO = TestVO.valueOf(1L, "gaofa", 18);
        TestVO testVO2 = TestVO.valueOf(2L, "gaofujian", 29);
        ResultEntity<List<TestVO>> result = ResultEntity.createDataResult(ResultEnum.SUCCESS, Arrays.asList(testVO, testVO2));
        return result;
    }
}
