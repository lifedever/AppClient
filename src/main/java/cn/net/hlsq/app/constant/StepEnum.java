package cn.net.hlsq.app.constant;

/**
 * 步骤枚举
 * 
 * @author gefangshuai
 * @email gefangshuai@163.com
 * @createDate 2013年11月24日 下午8:37:16
 */
public enum StepEnum {
	ONE("one", 0), // 第一步
	TWO("two", 1), // 第二步
	THREE("three", 2);// 第三步

	private String step;
	private int index;

	private StepEnum(String step, int index) {
		this.step = step;
		this.index = index;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getStep() {
		return step;
	}

	public void setStep(String step) {
		this.step = step;
	}

}
