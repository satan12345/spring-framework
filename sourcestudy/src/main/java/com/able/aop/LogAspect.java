package com.able.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

/** 定义一个切面
 * @param
 * @author jipeng
 * @date 2020-09-16 18:40
 */
@Aspect
public class LogAspect {

	/**
	 * 定义一个切入点
	 */
	@Pointcut("execution(* com.able.aop.AbleCaculate.*(..))")
	public void pointCut(){}

	@Before("pointCut()")
	public void methodBefore(JoinPoint joinPoint) {
		 String methodName = joinPoint.getSignature().getName();
		System.err.println("执行目标方法"+methodName+"的《前置通知》,入参"+ Arrays.asList(joinPoint.getArgs()));
	}
	@After("pointCut()")
	public void methodAfter(JoinPoint joinPoint) {
		 String methodName = joinPoint.getSignature().getName();
		System.err.println("执行目标方法"+methodName+"的《后置通知》,入参"+ Arrays.asList(joinPoint.getArgs()));
	}
	@AfterReturning(value = "pointCut()",returning = "result")
	public void AfterReturning(JoinPoint joinPoint, Object result) throws Throwable{
		 String methodName = joinPoint.getSignature().getName();
		System.err.println("执行目标方法"+methodName+"的《返回通知》,入参"+ Arrays.asList(joinPoint.getArgs()));
	}

//	@Around(value = "pointCut()")
//	public void round(ProceedingJoinPoint joinPoint){
//		String methodName = joinPoint.getSignature().getName();
//		System.err.println("执行目标方法"+methodName+"的《环绕通知》,入参"+ Arrays.asList(joinPoint.getArgs()));
//	}
//

	@AfterThrowing(value = "pointCut()",throwing = "throwing")
	public void afterThrowing(Throwable throwing) {
		System.err.println("执行了afterThrowing通知 ,抛出异常 "+throwing);

	}




}

