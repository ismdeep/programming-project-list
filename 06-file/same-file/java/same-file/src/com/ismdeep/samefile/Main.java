package com.ismdeep.samefile;

import java.io.*;
import java.util.Date;

public class Main {

    public static final int BLOCK_SIZE = 4 * 1024 * 1024;

    public static long getFileSize(String file_path) {
        File file = new File(file_path);
        return file.length();
    }

    public static boolean isSameFile(String file_path_1, String file_path_2) throws IOException {
        long file_size_1 = getFileSize(file_path_1);
        long file_size_2 = getFileSize(file_path_2);

        if (file_size_1 != file_size_2) {
            return false;
        }

        File f1 = new File(file_path_1);
        File f2 = new File(file_path_2);

        FileInputStream fin1 = new FileInputStream(f1);
        FileInputStream fin2 = new FileInputStream(f2);

        byte[] buff1 = new byte[BLOCK_SIZE];
        byte[] buff2 = new byte[BLOCK_SIZE];

        while (true) {
            long readSize1 = fin1.read(buff1, 0, BLOCK_SIZE);
            long readSize2 = fin2.read(buff2, 0, BLOCK_SIZE);

            if (readSize1 == -1 || readSize2 == -1) {
                break;
            }

            for (int i = 0; i < readSize1; i++) {
                if (buff1[i] != buff2[i]) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) throws IOException {
        String file_path_1 = "/Users/ismdeep/tmp/20200703-131201-justoj.sql.gz";
        String file_path_2 = "/Users/ismdeep/tmp/20200704-131201-justoj.sql.gz";

        long startTime = (new Date()).getTime();

        System.out.println(isSameFile(file_path_1, file_path_2));

        long endTime = (new Date()).getTime();

        System.out.printf("%.3f s", (endTime - startTime) / 1000.00);
    }
}
