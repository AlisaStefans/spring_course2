package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class ExceptionsLogging {
    @Before("aop.aspects.PointCuts.allGetMethods()")
    public void beforeGetExceptionHandlingAdvice() {
        System.out.println("beforeGetExceptionHandlingAdvice: ловим исключения при попытке получить книгу");
    }
}
