/*

基本数据类型之间的运算（7种，不包含boolean类型）

1、自动类型提升
	当容量小的数据类型和容量大的数据类型做运算时，结果自动提升为容量大的数据类型。
	容量指的是能表示的数字的范围大小。
	byte、char、short < int < long < float < double

	当byte、char、short三种变量做运算的时候，结果均为int。（包括同种类型之间的运算）

*/



class VarTest2 {
	public static void main(String[] args) 
	{
		byte b1 = 3;
		int i1 = 12;
		//byte b2 = b1+ i1
		int i2 = b1 + i1;

		//****************************



	}
}
