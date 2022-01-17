package com.leetcode.easy;

public class DetermineColorOfChessboardSquare_1812 {

	public static void main(String[] args) {
		System.out.println("z".matches("a|b|c"));
	}
	
	public boolean squareIsWhite(String coordinates) {
		String coordArr[] = coordinates.split("");
        String x = coordArr[0];
        int y = Integer.parseInt(coordArr[1]);
        
        if(x.matches("a|c|e|g") && (y%2 != 0) || x.matches("b|d|f|h") && (y%2 == 0)){
            return false;
        }
        else{
            return true;
        }
    }

}
