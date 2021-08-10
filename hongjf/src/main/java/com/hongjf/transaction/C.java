package com.hongjf.transaction;

import org.aopalliance.aop.Advice;
import org.springframework.aop.Advisor;
import org.springframework.aop.ClassFilter;
import org.springframework.aop.IntroductionAdvisor;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.context.annotation.Role;
import org.springframework.stereotype.Component;

/**
 * @ClassName C
 * @Author hongjf
 * @Date 2021/7/8 下午10:20
 * @Version 1.0
 */
//@Component
@Role(AbstractBeanDefinition.ROLE_INFRASTRUCTURE)
public class C implements IntroductionAdvisor {
	@Override
	public Advice getAdvice() {
		return null;
	}

	@Override
	public boolean isPerInstance() {
		return false;
	}

	@Override
	public ClassFilter getClassFilter() {
		return null;
	}

	@Override
	public void validateInterfaces() throws IllegalArgumentException {

	}

	@Override
	public Class<?>[] getInterfaces() {
		return new Class[0];
	}
}
