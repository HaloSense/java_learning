/*

Java�е���������

���������ͷ���
 
������������
	��ֵ��
		�������� (byte, short, int, long)
		�������� (float, double)
	�ַ��� (char)
	������ (boolean)

������������
	�� (class)
	�ӿ� (interface)
	���� (array)

*/



public class VarTest1{
	public static void main(String[] args) 
	{
		
		System.out.println("Hello World!");
		
		// byte vars
		byte myByte = 10;
		System.out.println(myByte);

		// long vars
		// ����long�ͱ�����������"l"��"L"��β

		short myShort = 255;
		System.out.println(myShort);

		int myInt = 1235;
		System.out.println(myInt);

		long myLong = 1233442445L;
		System.out.println(myLong);

		//������ float 4�ֽ� / ˫���� double 8�ֽ�

		// ���㣺��ʾ��С�������ֵ
		// ��Χ��long�Ļ�Ҫ��

		double myDouble = 123.4;
		System.out.println(myDouble);

		// ����float����Ҫ��f��F��β

		float myFloat = 12345.5f;
		System.out.println(myFloat);

		// ͨ�����帡���ͱ���ʱ��double
		// ��Χ�󡢾��ȸߡ�����дf


		// �ַ���char 1�ַ� = 2�ֽ�
		// ����ʱͨ��ʹ��һ������ ''
		// �ַ��ͱ����ڲ�ֻ��д1���ַ�

		char myChar = 'q';
		System.out.println(myChar);

		// ��ʾ��ʽ��
		// 1. ����һ���ַ�
		// 2. ת���ַ�

		char myChar2 = '\n'; // ���з�
		char myChar3 = '\t'; // �Ʊ��

		// 3. Unicodeֵ��ʾ�ַ��ͳ���

		char myChar4 = '\u0043';
		System.out.println(myChar4);

		// ������ boolean
		// ֻ��ȡ����ֵ֮һ true��false
		// �����������жϡ�ѭ���ṹ

		boolean myBool = true;
		System.out.println(myBool);












	}
}
