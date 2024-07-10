import com.pyip.edu.factory.BeanFactory;
import org.junit.Test;

/**
 * @ClassName: AnnoTest
 * @version: 1.0
 * @Author: pyipXt
 * @Description: TODO
 **/
public class AnnoTest {
    @Test
    public void testAnno(){
        Object bean = BeanFactory.getBean("transferService");
        System.out.println(bean);
    }
}
