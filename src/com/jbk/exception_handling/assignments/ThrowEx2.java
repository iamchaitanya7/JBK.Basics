package com.jbk.exception_handling.assignments;

import java.io.IOException;

public class ThrowEx2 {

    void mymethod (int num) throws IOException, ClassNotFoundException {
        if (num == 1)
            throw new IOException ("Exception Message1");
        else
            throw new ClassNotFoundException ("Exception Message2");
    }
}
