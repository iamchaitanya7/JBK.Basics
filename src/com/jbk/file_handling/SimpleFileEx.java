package com.jbk.file_handling;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleFileEx {
    public static void main (String[] args) throws Exception {
        File file = new File ("D:\\A.Workspace's\\JBK\\JBK.Basics\\src\\com\\jbk\\file_handling\\targetFile.txt");
        //Basics functions on file.
        System.out.println ("Can Read: " + file.canRead ( ));
        System.out.println ("Can Write: " + file.canWrite ( ));
        System.out.println ("Name of File: " + file.getName ( ));
        System.out.println ("Path of File: " + file.getAbsolutePath ( ));

        //Converting the (lastModified) milliseconds to proper date & time format.
        long lastModifiedMillis = file.lastModified ( );
        Date lastModifiedDate = new Date (lastModifiedMillis);
        SimpleDateFormat sdf = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");
        String formattedDate = sdf.format (lastModifiedDate);

        System.out.println ("Last Modified: " + sdf.format (lastModifiedDate));
        System.out.println ("Length: " + file.length ( ));

    }
}
