package AOP.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggerAspect {

/*
    @Before("execution(public String getName())")
    public void LoggerAdvice(){
        System.out.println("Advice run. Get Method called!");
    }

    @Before("execution(public String getName())")
    public void LogDEBUG(){
        System.out.println("Advice DEBUG run.");
    }
    */

    /**
     * we can call both method above in 1 time.
     * by change parameter in before() to @Pointcut method name
     */

    @Before("allGetters()")
    public void LoggerAdvice(){
        System.out.println("Advice run. Get Method called!");
    }

    @Before("allGetters()")
    public void LogDEBUG(){
        System.out.println("Advice DEBUG run.");
    }

    @Pointcut("execution( public String getName())")
    public void allGetters(){}
}
