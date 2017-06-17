package org.fleni.cda.common.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ApplicationContextProvider implements ApplicationContextAware {

	/**
	 * 
	 */
	private static ApplicationContext ctx;

	/**
	 * @return
	 */
	public static ApplicationContext getContext() {
		return ctx;
	}

	/**
	 * @param ctx
	 */
	public static void setContext(ApplicationContext ctx) {
		ApplicationContextProvider.ctx = ctx;
	}

	/* (non-Javadoc)
	 * @see org.springframework.context.ApplicationContextAware#setApplicationContext(org.springframework.context.ApplicationContext)
	 */
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		setContext(ctx);
	}

	/**
	 * @param beanName
	 * @return
	 */
	public static <E extends Object> E getBean(Class<E> beanName) {
		return getContext().getBean(beanName);
	}

	/**
	 * @param beanName
	 * @return
	 */
	public static Object getBean(String beanName) {
		return getContext().getBean(beanName);
	}

}
