import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * <p>Description: 编写prototype的bean</p>
 * <p>Date: 2018-05-16</p>
 * <p>Time: 13:02</p>
 * <p>Author sunbaota</p>
 */
@Service
@Scope("prototype")//声明scope为prototype
public class DemoPrototypeService {
}
