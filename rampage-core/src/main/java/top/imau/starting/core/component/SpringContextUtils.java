package top.imau.starting.core.component;


import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * 获取Spring容器中的Bean和ApplicationContext
 * Created by jeff on 2019/4/10.
 */
public class SpringContextUtils implements ApplicationContextAware {

    private static ApplicationContext ctx;

    /**
     * 获取ApplicationContext
     * @return
     */
    public static ApplicationContext getSpringContext() {
        return SpringContextUtils.ctx;
    }

    /**
     * 通过名称获取bean
     * @param name
     * @return
     */
    public static <T> T getBean(String name) {
        return (T) getSpringContext().getBean(name);
    }

    /**
     * 通过类型获取bean
     * @param clazz
     * @return
     */
    public static <T> T getBean(Class<T> clazz) {
        return getSpringContext().getBean(clazz);
    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        ctx = applicationContext;
    }
}
