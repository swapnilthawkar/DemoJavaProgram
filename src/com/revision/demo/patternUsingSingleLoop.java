package com.revision.demo;

public class patternUsingSingleLoop {
	
	
	  public static void main(String[] args) {
			printPattern(7);
		}
	
    public static void printPattern(int n) {
    	int line = 0;
    	int star = 0;
    	
    	for(line=1; line<=n;) {
    		if(star < line) {
    			System.out.print("* ");
    			star++;
    			continue;
    		}
    		if(star==line) {
    			System.out.println(" ");
    			line++;
    			star=0;
    		}
    	}
    }
  

}
