package com.t2;

import java.io.IOException;

import static com.homework.Main.br;

public class ReadNumber {
    public static int readNumber(int start, int end) /*throws ReadNumberException*/{
        int x=0;
        try{
            int n = Integer.parseInt(br.readLine());
            if(n<end && n>start){
                //	System.out.println(n);
                //	return n;
                x=n;
            }
            else{
                throw new ReadNumberException("Not included in the range");
            }
        }
        catch (NumberFormatException | IOException | ReadNumberException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
        return x;
    }
}
