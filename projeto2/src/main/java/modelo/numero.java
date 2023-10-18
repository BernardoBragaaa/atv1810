package modelo;

public class numero {
private Double a;
private Double b;
private Double c;

public Double getA() {
	return a;
}
public void setA(String a) {
	
	this.a = Double.parseDouble(a);
}


public Double getB() {
	return b;
}
public void setB(String b) {
	this.b = Double.parseDouble(b);
}


public Double getC() {
	return c;
}
public void setC(String c) {
	this.c = Double.parseDouble(c);
}

public Double soma() {
	return this.a + this.b + this.c;
}

public Double sub() {
	return this.a - this.b - this.c;
}

public Double mult() {
	return this.a * this.b * this.c;
}

public Double div() {
	return this.a / this.b / this.c;
}

}
