package com.able.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * 定义一个切面
 *
 * @param
 * @author jipeng
 * @date 2020-09-16 18:40
 */
@Aspect
@Component
public class LogAspect {

	/**
	 * 定义一个切入点
	 */
	@Pointcut("execution(* com.able.aop.AbleCaculate.*(..))")
	public void pointCut() {
	}

	/**
	 * 通知：
	 * 把通知增强到方法上的过程叫织入
	 * @param joinPoint
	 */
	@Before("pointCut()")
	public void methodBefore(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().getName();
		System.out.println("执行目标方法" + methodName + "的《前置通知》,入参" + Arrays.asList(joinPoint.getArgs()));
	}

	@After("pointCut()")
	public void methodAfter(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().getName();
		System.out.println("执行目标方法" + methodName + "的《后置通知》,入参" + Arrays.asList(joinPoint.getArgs()));
	}

	@AfterReturning(value = "pointCut()", returning = "result")
	public void AfterReturning(JoinPoint joinPoint, Object result) throws Throwable {
		String methodName = joinPoint.getSignature().getName();
		System.out.println("执行目标方法" + methodName + "的《返回通知》,入参" + Arrays.asList(joinPoint.getArgs()));
	}

//	@Around(value = "pointCut()")
//	public void round(ProceedingJoinPoint joinPoint){
//		String methodName = joinPoint.getSignature().getName();
//		System.out.println("执行目标方法"+methodName+"的《环绕通知》,入参"+ Arrays.asList(joinPoint.getArgs()));
//	}
//

	@AfterThrowing(value = "pointCut()", throwing = "throwing")
	public void afterThrowing(Throwable throwing) {
		System.out.println("执行了<<异常通知>> ,抛出异常");

	}


}

