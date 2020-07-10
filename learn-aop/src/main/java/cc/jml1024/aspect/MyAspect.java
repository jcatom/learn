package cc.jml1024.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
//    @Pointcut(value = "@target(cc.jml1024.annotation.Run)")
//    public void anyPublicOperation() {
//    }
//
//    public void methodExcutionBefore(JoinPoint joinPoint) {
//        logger.info("Aspect print info:[{}]", JSON.toJSON(joinPoint.getArgs()));
//    }
//
//    @Around("@target(cc.jml1024.annotation.Run)")
//    public void methodExcutionAfterReturing() {
//        logger.info("Aspect print info:[{}]", "test");
//    }
}
