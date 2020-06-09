package cc.jml1024.service.impl;

import cc.jml1024.annotation.Run;
import cc.jml1024.service.LearnAopService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Run
@Service
public class LearnAopServiceImpl extends LearnAopService {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	public String sayHello(String name) {
		StringBuilder info = new StringBuilder("Hello ");
		info.append(name);
		logger.info("Info:[{}]", info.toString());
		return info.toString();
	}

}
