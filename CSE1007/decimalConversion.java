import java.io.*; class Main {
static void decToBinary(int n)
{
int[] binaryNum = new int[32];
int i = 0; while (n > 0) {
binaryNum[i] = n % 2; n = n / 2;
i++;
}
for (int j = i - 1; j >= 0; j--) System.out.print(binaryNum[j]);
}
//decToOctal
static void decToOctal(int n)
{
int[] binaryNum = new int[100];
int i = 0; while (n > 0) {
binaryNum[i] = n % 8; n = n / 8;
i++;
}
for (int j = i - 1; j >= 0; j--) System.out.print(binaryNum[j]);
}
static void decToHex(int decimal){
int rem;
String hex="";
char hexchars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
while(decimal>0)
{
rem=decimal%16; hex=hexchars[rem]+hex; decimal=decimal/16;
} System.out.println(hex);
}
public static void main(String[] args)
{
int n = 15; decToBinary(n); System.out.print("\n"); decToOctal(n); System.out.print("\n"); decToHex(n);
} }