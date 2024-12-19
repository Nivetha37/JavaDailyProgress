//What is the output of the following code?

double a = 0.1;
double b = 0.2;
System.out.println(a + b == 0.3);

/*Select one of the following options:
true
false
Error
0.3

Correct Answer:  false
Explanation:
The output is false. 
  This is due to the way floating-point numbers are represented in binary. 
  Most decimal fractions cannot be represented exactly as binary fractions, leading to small rounding errors. 
  In this case, 0.1 + 0.2 is slightly larger than 0.3 when represented in binary floating-point. 
  For precise decimal calculations, it's recommended to use BigDecimal instead of double.*/
