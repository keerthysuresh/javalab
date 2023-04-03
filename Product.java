import java.util.Scanner;
public class Product
{
	String pcode,pname;
	int price;
	Product(String pcode_get,String pname_get,int price_get)
	{
	pcode=pcode_get;
	pname=pname_get;
	price=price_get;
	}
	
	public void compare(Product P2,Product P3)
{
	if(price<=P2.price && price<=P3.price)
	System.out.println("lowest product ID is:" +pcode);
	if(P2.price<=price && P2.price<=P3.price)
	System.out.println("lowest product ID is:" +P2.pcode);
	if(P3.price<=price && P3.price<=P2.price)
	System.out.println("lowest product ID is:" +P3.pcode);
}


public static void main(String args[])
	{
		Product P1=new Product("A123","TV",2);
		Product P2=new Product("B123","RADIO",21);
		Product P3=new Product("C123","DVD",3);
		P1.compare(P2,P3);
	}
}


