package miu.edu.waa_jan24.aspect;
import miu.edu.waa_jan24.entity.Logger;
import miu.edu.waa_jan24.service.LoggerService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;


@Aspect
@Component
public class LoggerAspect {

    @Autowired
    LoggerService loggerService;
    @Pointcut("@annotation(miu.edu.waa_jan24.aspect.annotation.LogMe)")
    public void logMeAnnotation(){}

    @Pointcut("execution( * miu.edu.waa_jan24.controller.UserController.*(..))")
    public void logMe() {
    }

    @AfterReturning("logMe()")
    public void logAfterReturning(JoinPoint joinPoint) {
        Logger l = new Logger(LocalDate.now(), LocalTime.now(), "admin", joinPoint.getSignature().getName());
        loggerService.saveLogger(l);
    }

//    @AfterThrowing("logMe()")
//    public void logAfterThrowing(JoinPoint joinPoint) {
//        System.out.println("Log after throwing the method: " + joinPoint.getSignature().getName());
//    }

}
