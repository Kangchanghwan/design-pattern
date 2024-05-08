package org.example.chapter3_decorator.io;

import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

class InputTest {

    @Test
    void test(){
        int c;

        try {
            InputStream in =
                    new LowerCaseInputStream(new BufferedInputStream(
                            new FileInputStream("/Users/gangchanghwan/Documents/practice/designPattern/src/main/resources/test.txt")));
            while ((c = in.read()) >= 0){
                System.out.print((char)c);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}