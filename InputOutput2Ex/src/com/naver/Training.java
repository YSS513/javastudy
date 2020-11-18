package com.naver;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Training {
	
	public void Train() {

		InputStream in = null;
		OutputStream out = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;

		try {
			in = new FileInputStream("C:" + File.separator + "test.jpg");
			out = new FileOutputStream("C:" + File.separator + "test_copy10.jpg");
			bis = new BufferedInputStream(in);
			bos = new BufferedOutputStream(out);

			byte[] arr = new byte[2];
			int length;

			while ((length = bis.read(arr)) != -1) {
				bos.write(arr, 0, length);
			}

			System.out.println("end");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (bis != null) {
					bis.close();
				}
				if (in != null) {
					in.close();
				}
				if (bos != null) {
					bos.close();
				}
				if (out != null) {
					out.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
