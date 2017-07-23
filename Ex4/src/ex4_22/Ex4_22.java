package ex4_22;

class ComplexNumber {
	private double realPart;
	private double imaginaryPart;
	public ComplexNumber() {
		realPart = 0.0;
		imaginaryPart = 0.0;
	}
	public ComplexNumber(double r, double i) {
		realPart = r;
		imaginaryPart = i;
	}
	public double getRealPart() {
		return realPart;
	}
	public void setRealPart(double d) {
		realPart = d;
	}
	public double getImaginaryPart() {
		return imaginaryPart;
	}
	public void setImaginaryPart(double d) {
		imaginaryPart = d;
	}
	public ComplexNumber complexAdd(ComplexNumber cn) {
		this.realPart = this.realPart + cn.realPart;
		this.imaginaryPart = this.imaginaryPart + cn.imaginaryPart;
		return this;
	}
	public ComplexNumber complexAdd(double c) {
		this.realPart = this.realPart + c;
		return this;
	}
	public ComplexNumber complexMinus(ComplexNumber cn) {
		this.realPart = this.realPart - cn.realPart;
		this.imaginaryPart = this.imaginaryPart - cn.imaginaryPart;
		return this;
	}
	public ComplexNumber complexMinus(double c) {
		this.realPart = this.realPart - c;
		return this;
	}
	public ComplexNumber complexMulti(ComplexNumber cn) {
		this.realPart = this.realPart * cn.imaginaryPart - this.imaginaryPart * cn.imaginaryPart;
		this.imaginaryPart = this.realPart * cn.imaginaryPart + this.imaginaryPart * cn.realPart;
		return this;
	}
	public ComplexNumber complexMulti(double c) {
		this.realPart = this.realPart * c;
		this.imaginaryPart = this.imaginaryPart * c;
		return this;
	}
}
public class Ex4_22 {
	/**定义一个名为 ComplexNumber 类实现复数概念及其运算，它的 UML 图见课本 P92，试编写一个应用程序测试 ComplexNumber 类的使用*/
	public static void main(String[] args) {
		ComplexNumber cn1 = new ComplexNumber();
		ComplexNumber cn2 = new ComplexNumber(5, 2);
		cn1.setRealPart(3);
		cn1.setImaginaryPart(1);
		cn2.complexAdd(cn1);
		System.out.println("r:" + cn2.getRealPart() + "  i:" + cn2.getImaginaryPart());
		cn2.complexMinus(cn1);
		System.out.println("r:" + cn2.getRealPart() + "  i:" + cn2.getImaginaryPart());
		cn2.complexMulti(cn1);
		System.out.println("r:" + cn2.getRealPart() + "  i:" + cn2.getImaginaryPart());
		cn2.complexAdd(3);
		System.out.println("r:" + cn2.getRealPart() + "  i:" + cn2.getImaginaryPart());
		cn2.complexMinus(2);
		System.out.println("r:" + cn2.getRealPart() + "  i:" + cn2.getImaginaryPart());
		cn2.complexMulti(2);
		System.out.println("r:" + cn2.getRealPart() + "  i:" + cn2.getImaginaryPart());
	}
}
