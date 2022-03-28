package days27;

import java.io.File;

/**
 * @author Yelin
 * @date 2022. 3. 28. - 오후 4:07:48
 * @subject 하위 폴더가 있는 경우는 삭제하기
 * @content 	delete() 메서드로는 불가능
 * 				del
 * 
 * 		// [문제] 삭제하고자 하는 폴더에 aaa, bbb와 같은 하위 폴더/파일이 있는 경우 delete() 메서드로 삭제 안됨
		// 		모든 하위 폴더/파일을 삭제를 한 후 -> upload 폴더도 삭제
 */
public class Ex11_03 {

	public static void main(String[] args) {
		String pathname = "C:\\upload";
		
	    File file = new File(pathname);       
	    // System.out.println( file.delete() );  //  폴더  삭제
	      
	    directoryDelete(file);  // 삭제하는 메서드 만들어서 재귀 메서드
	      
	   } // main

	   private static void directoryDelete(File file) {   
	         while(!file.delete()) {
	            File[] files = file.listFiles();
	            for (int i = 0; i < files.length; i++) {
	                if(!files[i].delete()) {
	                   directoryDelete(files[i]);
	                }else {
	                   System.out.printf("%s 삭제가 완료되었습니다.\n",files[i]);
	                } // if
	                
	            } // for
	            
	         } // method
	         
	         System.out.printf("%s 삭제가 완료되었습니다.\n",file);
	         
	      } // method
			
} // class
