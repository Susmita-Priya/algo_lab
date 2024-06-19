/*
Name : Susmita Rani Saha
ID : B180305047
 */
public class lcs {
	
	int lcs(char[] X, char[] Y, int m, int n)
	{
		int[][] L = new int[m + 1][n + 1];
                char[] lc=new char[m+1];
		for (int i = 0; i <=m; i++) {
			for (int j = 0; j <= n; j++) {
				if (i == 0 || j == 0)
					L[i][j] = 0;
				else if (X[i-1] == Y[j-1]) {     //bcz L array er 0,0 column already used ty 1 ghor bariye gunte hobe
					L[i][j] = L[i - 1][j - 1] + 1;
                                        lc[i-1]=X[i-1];
                                }
				else
					L[i][j] = Integer.max(L[i - 1][j], L[i][j - 1]);
			}
		}
               for(int k=0;k<=m;k++)
               {
                   if(lc[k]!=0)
                   System.out.print(lc[k]);
               }
               System.out.println();
               return L[m][n];
	}

	public static void main(String[] args)
	{
		lcs lcs = new lcs();
		String s1 = "ABCDE";
		String s2 = "FACGD";

		char[] X = s1.toCharArray();
		char[] Y = s2.toCharArray();
		int m = X.length;
		int n = Y.length;
                 
                System.out.print("String1 = "+s1+"\nString2 = "+s2+"\nLCS is = ");
		System.out.println("Length of LCS " + lcs.lcs(X, Y, m, n));
	}
}


