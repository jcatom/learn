package cc.jml1024;

import cc.jml1024.service.impl.LearnAopServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Tests for {@link Startup}.
 * 
 * @author Dave Syer
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class LearnAopServiceTests {

	@Autowired
	private LearnAopServiceImpl learnAopService;

	@Test
	public void test_sayHello() throws Exception {
		learnAopService.sayHello("Evil");
	}

}
