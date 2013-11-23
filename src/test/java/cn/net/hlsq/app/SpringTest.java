package cn.net.hlsq.app;

import cn.net.hlsq.app.utils.BeanUtils;

public class SpringTest {
	public static void main(String[] args) {
		System.out.println(BeanUtils.getBean("baseDao"));
		System.out.println(BeanUtils.getBean("baseDao"));
		System.out.println(BeanUtils.getBean("baseDao"));
	}
}
