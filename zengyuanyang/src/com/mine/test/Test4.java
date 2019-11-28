package com.mine.test;

import java.io.File;
import java.io.IOException;

//在电脑D盘下创建一个文件为HelloWorld.txt文件，判断他是文件还是目录，在创建一个目
//录IOTest,之后将HelloWorld.txt移动到IOTest目录下去；之后遍历IOTest这个目录下的文件

public class Test4 {

	 public static void main(String[] args) {  
         //在电脑D盘下创建一个文件为HelloWorld.txt文件  
        File file=new File("D://HelloWorld.txt");  
          
        //创建文件，返回一个布尔值  
        boolean isCreate;  
        try {  
            isCreate = file.createNewFile();  
            if (isCreate) {  
                System.out.println("创建文件成功！");  
            }else {  
                System.out.println("创建文件失败！文件已经存在");  
            }  
        } catch (IOException e) {  
            System.out.println("创建文件失败！");  
        }  
          
        // 判断他是文件还是目录，  
        if (file.isFile()) {  
            System.out.println("这是一个文件");  
        } else {  
            System.out.println("这是一个目录");  
        }  
          
        //再创建一个目录IOTest  
        File file2=new File("D://IOTest");  
        file2.mkdirs();  
          
        //HelloWorld.txt移动到IOTest目录下去?失败？》  
        if (file.renameTo(file2)) {  
            System.out.println("文件移动成功！");  
        } else {  
            System.out.println("文件移动失败");  
        }  
          
        //遍历IOTest目录下的文件  
        String[] arr=file2.list();  
        for (String string : arr) {  
            System.out.println(string);  
        }  
    }  
}  
