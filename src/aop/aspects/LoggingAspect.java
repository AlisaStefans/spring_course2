package aop.aspects;


import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Aspect;

@Component
@Aspect
@Order(1)
public class LoggingAspect {



    @Before("aop.aspects.PointCuts.allGetMethods()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetBookAdvice: Логирование попытки получить книгу или журнал");
    }


}
