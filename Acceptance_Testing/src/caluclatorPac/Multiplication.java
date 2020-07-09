package caluclatorPac;

import fit.ColumnFixture;

public class Multiplication extends ColumnFixture{

	int num1;
	int num2;
	int result;

	public void setNum1(int num1) {

		this.num1 = num1;

	}

	public void setNum2(int num2) {

		this.num2 = num2;

	}

	public int multiply() {

		result = num1 * num2;
		return result;
	}
	

}
