package com.controller;

import java.io.FileOutputStream;
import org.springframework.web.multipart.MultipartFile;

public class Util {
	// �޾ƿ� �����͸� ������ �̹����� �ø���.
	public static void saveFile(MultipartFile mf) {
		String dir = "C:\\spring\\RRS2\\web\\img\\";
		byte [] data;
		String imgname = mf.getOriginalFilename();
		try {
			data = mf.getBytes();
			FileOutputStream fo = 
					new FileOutputStream(dir+imgname);
			fo.write(data);
			fo.close();
		}catch(Exception e) {
			
		}
		
	}
	//comment�� ����
	public static void saveCommentFile(MultipartFile mf) {
		String dir = "C:\\spring\\RRS2\\web\\img\\comment\\";
		byte [] data;
		String imgname = mf.getOriginalFilename();
		try {
			data = mf.getBytes();
			FileOutputStream fo = 
					new FileOutputStream(dir+imgname);
			fo.write(data);
			fo.close();
		}catch(Exception e) {
			
		}
		
	}
	
}



