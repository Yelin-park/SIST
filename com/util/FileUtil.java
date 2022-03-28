package com.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileUtil {
	   
	   // 파일 절대경로를 매개변수 넣어주면 파일명을 반환하는 메서드   Car.java
	   public static String getFileName( String path ) {
	      String fileName;
	      int idx = path.lastIndexOf("\\");  
	      fileName = path.substring(idx + 1);
	      return fileName;
	   }
	   
	   // 확장자 반환 메서드 .java  
	   public static String getExtension(String fileName) {      
	      String ext  = fileName.substring(  fileName.lastIndexOf(".")  ); // +1을 안해서 .java까지 돌려주는 중 java만 필요하면 +1하기
	      return ext;
	   }
	   // 오버라이딩....
	   public static String getExtension(File file) {      
	      String ext  = file.getName().substring(  file.getName().lastIndexOf(".")  );
	      return ext;
	   }
	   
	   // 확장자를 제외한 순수한 파일명만 반환하는 메서드   Car
	   public static String getBaseName(String fileName) {
	      int endIndex = fileName.lastIndexOf(".");
	      String baseName = fileName.substring(0, fileName.lastIndexOf(".") );
	      return baseName;
	   }
	   
	   // 삭제하는 메서드
	   private static void directoryDelete(File file) {   
		   while(!file.delete()) {
	        	 // 하위 폴더 + 파일
	            File[] files = file.listFiles();
	            for (int i = 0; i < files.length; i++) {
	                if(!files[i].delete()) {
	                	directoryDelete(files[i]);
	                }else {
	                   // System.out.printf("%s 삭제가 완료되었습니다.\n",files[i]);
	                } // if
	                
	            } // for
	            
	         } // method
	         
	        //  System.out.printf("%s 삭제가 완료되었습니다.\n",file);
	         
	      } // method

	} // class