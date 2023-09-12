/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class Complex{
    int real;
    int imag;
    Complex(int real, int imag){
        this.real=real;
        this.imag=imag;
    }
    public static Complex add(Complex x,Complex y){
        return new Complex(x.real+y.real,x.imag+y.imag);
    }
}

class Eg
{
	public static void main(String[] args) {
	    Complex x=new Complex(3,4);
	    Complex y=new Complex(2,3);
	    Complex z=Complex.add(x,y);
		System.out.println(z.real+"+"+z.imag+"i");
	}
}
