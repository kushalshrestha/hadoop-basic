package org.example;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;

import java.io.*;
import java.net.URI;



public class WriteToHDFS {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello world!");
        String localSource = args[0];
        String destination = args[1];

        InputStream in = new BufferedInputStream(new FileInputStream(localSource));
        Configuration conf = new Configuration();
        System.out.println("Connecting to -- " + conf.get("fs.defaultFS"));

        //Destination file in HDFS
        FileSystem fs = FileSystem.get(URI.create(destination), conf);
        OutputStream out = fs.create(new Path(destination));

        //Copy file from local to HDFS
        IOUtils.copyBytes(in, out, 4096, true);

        System.out.println(destination + " copied to HDFS");
    }
}