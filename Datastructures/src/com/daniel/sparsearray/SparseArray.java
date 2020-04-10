package com.daniel.sparsearray;

public class SparseArray {

	
	public static void main(String[] args) {
		int k =11;
		//创建一个原始的二维数组11*11
		//0：表示没有棋子，1表示黑子，2表示蓝子
		int chessArr1[][] = new int[k][k];
		chessArr1[1][2] = 1;
		chessArr1[2][3] = 2;
		chessArr1[4][5] = 2;
		//输出原始的二维数组
		System.out.println("原始的二维数组~~");
		for(int j=0;j<k;j++) {
			for(int i=0;i<k;i++) {
				System.out.printf("%d\t",chessArr1[j][i]);
				if(i==k-1) {
					System.out.println("\r");
					}
				}
			}
		//将二维数组转稀疏数组的思路
		//1.先遍历二维数组 得到非0数据的个数
		int sum = 0;
		for (int q =0;q<k;q++) {
			for(int p =0;p<k;p++) {
				if(chessArr1[q][p]!=0) {
					sum ++;
				}
			}
		}
		//	创建稀疏数组
		System.out.println("\t");
		int count =0;
		int secondArr1[][] = new int[sum+1][4];
		secondArr1[0][0]= count;//初始序数
		secondArr1[0][1]= k;//二维数组总行数
		secondArr1[0][2]= k;//二维数组总列数
		secondArr1[0][3]= sum;//非0个数
		//遍历二维数组，寻找非0数值的位置
		for (int q =0;q<k;q++) {
			for(int p =0;p<k;p++) {
				if(chessArr1[q][p]!=0) {
					secondArr1[count+1][0]=count+1;//非0数序数
					secondArr1[count+1][1]=q;//非0数行数
					secondArr1[count+1][2]=p;//非0数列数
					secondArr1[count+1][3]=chessArr1[q][p];//非0数数值
					count++;//序数加一
				}
			}
		}
		
		//打印稀疏数组
		System.out.println("得到的稀疏数组为~~");
		for(int row=0;row< secondArr1.length; row++) {//稀疏数组总行数
			for(int col =0;col<secondArr1[0].length;col++) {//稀疏数组总列数
				System.out.printf("%d	",secondArr1[row][col]);
			}
			System.out.println("\t");//换行
		}
		//恢复原始的二维数组
		System.out.println("还原原始的二维数组~~");
		System.out.println("\t");
		int chessArr2[][] = new int[secondArr1[0][1]][secondArr1[0][2]];
		for(int z=1;z<secondArr1.length;z++) {
			chessArr2[secondArr1[z][1]][secondArr1[z][2]]= secondArr1[z][3];
		}
		//打印新的二维数组
		for(int j=0;j<k;j++) {
			for(int i=0;i<k;i++) {
				System.out.printf("%d\t",chessArr2[j][i]);
				if(i==k-1) {
					System.out.println("\r");
					}
				}
			}
		}
	}
	


