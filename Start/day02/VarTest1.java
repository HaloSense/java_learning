/*

Java中的数据类型

按数据类型分类
 
基本数据类型
	数值型
		整数类型 (byte, short, int, long)
		浮点类型 (float, double)
	字符型 (char)
	布尔型 (boolean)

引用数据类型
	类 (class)
	接口 (interface)
	数组 (array)

*/



public class VarTest1{
	public static void main(String[] args) 
	{
		
		System.out.println("Hello World!");
		
		// byte vars
		byte myByte = 10;
		System.out.println(myByte);

		// long vars
		// 声明long型变量，必须以"l"或"L"结尾

		short myShort = 255;
		System.out.println(myShort);

		int myInt = 1235;
		System.out.println(myInt);

		long myLong = 1233442445L;
		System.out.println(myLong);

		//浮点型 float 4字节 / 双精度 double 8字节

		// 浮点：表示带小数点的数值
		// 范围比long的还要大

		double myDouble = 123.4;
		System.out.println(myDouble);

		// 定义float类型要以f或F结尾

		float myFloat = 12345.5f;
		System.out.println(myFloat);

		// 通常定义浮点型变量时用double
		// 范围大、精度高、不用写f


		// 字符型char 1字符 = 2字节
		// 定义时通常使用一对引号 ''
		// 字符型变量内部只能写1个字符

		char myChar = 'q';
		System.out.println(myChar);

		// 表示方式：
		// 1. 声明一个字符
		// 2. 转义字符

		char myChar2 = '\n'; // 换行符
		char myChar3 = '\t'; // 制表符

		// 3. Unicode值表示字符型常量

		char myChar4 = '\u0043';
		System.out.println(myChar4);

		// 布尔型 boolean
		// 只能取两个值之一 true、false
		// 常用于条件判断、循环结构

		boolean myBool = true;
		System.out.println(myBool);












	}
}
