package com.itheima.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class MyAdvice {

    @Pointcut("execution(void com.itheima.dao.BookDao.update())")
    private void pt() {
    }

    @Around("pt()")
    public Object method(ProceedingJoinPoint pjp) throws Throwable {
        Signature signature = pjp.getSignature();

        System.out.println(signature.getDeclaringType());
        System.out.println(signature.getName());

        // 可以对 args 进行修改
        Object[] args = pjp.getArgs();
        Object ret = pjp.proceed(args);

        //Object ret = pjp.proceed();

        System.out.println(System.currentTimeMillis());

        return ret;
    }


    @AfterReturning(value = "pt()", returning = "ret")
    // JoinPoint jp, Object ret 顺序不允许改变
    public void method1(JoinPoint jp, Object ret) {
        System.out.println("AfterReturning" + ret);
    }

    @Before("pt()")
    public void method2(JoinPoint jp) {
        System.out.println("Before" + Arrays.toString(jp.getArgs()));
    }

    @AfterThrowing(value = "pt()", throwing = "e")
    public void method3(Throwable e) {
        System.out.println("AfterThrowing" + e);
    }

}
