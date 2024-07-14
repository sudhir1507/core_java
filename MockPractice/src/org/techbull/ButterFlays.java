package org.techbull;

public class ButterFlays {

	public static void main(String[] args) {
		for (int i = 1; i <= 7; i++) {
            int startNum = i <= 4 ? i : 8 - i;
            for (int j = 1; j <= 8; j++) {
                if (i <= 4) {
                    if (j <= i || j > 8 - i) {
                        System.out.print(startNum);
                        if (j < 4) {
                            startNum--;
                        } else {
                            startNum++;
                        }
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if (j <= 8 - i || j > i) {
                        System.out.print(startNum);
                        if (j < 4) {
                            startNum--;
                        } else {
                            startNum++;
                        }
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }

	}

}
