package top.imau.starting.handsome.web.vo;

import lombok.Data;

@Data
public class TestVO {

    private Long id;
    private String name;
    private Integer age;

    public static TestVO valueOf(Long id, String name, Integer age) {
        TestVO testVO = new TestVO();
        testVO.setId(id);
        testVO.setName(name);
        testVO.setAge(age);
        return testVO;
    }
}
