package com.example.demo.util;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class MyFileUtils {

    public static void main(String[] args) throws Exception {
        File file = new File("d://1.txt");
        List<String> lines = new ArrayList<>();
        lines.add("\n");
        lines.add("a");
        lines.add("b");
        lines.add("c");

        Charset charset = Charset.forName("utf-8");
        writeLines(file, lines, true);
    }


    public static void writeByteArrayToFile(File file, byte[] data, boolean append) throws IOException {
        FileUtils.writeByteArrayToFile(file, data, append);
    }


    public static void writeStringToFile(File file, String data, Charset encoding, boolean append) throws IOException {
        FileUtils.writeStringToFile(file, data, encoding, append);
    }

    public static void writeLines(File file, List<String> lines, boolean append) throws IOException {
        FileUtils.writeLines(file, lines, append);
    }

}
