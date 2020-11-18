package com.naver;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Test {

	public void me5() {
		// me3() 내용
		InputStream in = null;
		OutputStream out = null;

		try {
			in = new FileInputStream("C:" + File.separator + "test.jpg");
			out = new FileOutputStream(
					"." + File.separator + "src" + File.separator + "upload" + File.separator + "test_copy5.jpg");

			byte[] arr = new byte[1024];
			while (true) {
				int length = in.read(arr);
				if (length == -1) {
					break;
				}
				out.write(arr, 0, length);
			}

			System.out.println("end");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (in != null) {
					in.close();
				}
				if (out != null) {
					out.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	public void me4() {
		// me2() 내용을 똑같이 적어 보세요.
		InputStream in = null;
		BufferedInputStream bis = null;

		OutputStream out = null;
		BufferedOutputStream bos = null;

		try {
			System.out.println();
			in = new FileInputStream("C:" + File.separator + "test.jpg");
			bis = new BufferedInputStream(in);
			out = new FileOutputStream("C:" + File.separator + "test_copy2.jpg");
			bos = new BufferedOutputStream(out);
			byte[] arr = new byte[1024];

			while (true) {
				int length = bis.read(arr);

				if (length == -1) {
					break;
				}

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

	public void me3() {
		// me1()에 입력한 코드를 똑같이 넣으세요.
		InputStream in = null;
		OutputStream out = null;

		try {
			in = new FileInputStream("C:" + File.separator + "test.jpg");
			out = new FileOutputStream("C:" + File.separator + "test_copy.jpg");

			byte[] arr = new byte[1024];
			while (true) {
				int length = in.read(arr);
				if (length == -1) {
					break;
				}
				out.write(arr, 0, length);
			}

			System.out.println("file copy end");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (in != null) {
					in.close();
				}
				if (out != null) {
					out.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

	public void me2() {
		InputStream in = null;
		BufferedInputStream bis = null;
		OutputStream out = null;
		BufferedOutputStream bos = null;

		try {
			in = new FileInputStream("C:" + File.separator + "test.jpg");
			out = new FileOutputStream("C:" + File.separator + "test_copy.jpg");
			bis = new BufferedInputStream(in);
			bos = new BufferedOutputStream(out);

			int what;

			while ((what = bis.read()) != -1) {
				bos.write(what);
			}

			System.out.println("file copy end");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (in != null) {
					in.close();
				}
				if (out != null) {
					out.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	public void me1() {
		// byte stream에서 입력과 관련된 최상위 부모클래스는 InputStream
		// byte stream에서 출력과 관련된 최상위 부모클래스는 OutputStream
		// InputStream, OutputStream 추상클래스입니다.
		// 객체 만들면 안됩니다...
		// I/O 객체는 반드시 개발자가 메모리를 해제시켜야 합니다.

		// 1. stream을 선언만 합니다.
		// 2. try~catch~finally 구조를 만듦
		// 3. finally 안에 try~catch
		// 4. finally 안에 있는 try에 close()호출, catch에 예외처리를 해줌
		// 5. 원래 catch에 예외처리 해줌.
		// 6. 원래 try를 코딩함.

		InputStream in = null;
		OutputStream out = null;

		try {
			in = new FileInputStream("C:" + File.separator + "test.jpg");
			out = new FileOutputStream("C:" + File.separator + "test_copy.jpg");
			// +File.separator+ 파일구분좌 호환코드

			// 파일 처음부터 끝까지 데이터를 1바이트씩 읽어 옴.
			// 몇 번의 반복문을 사용해야 하나?
			// 모르니까 for가 아니라 while문을 사용함.

			// read()로부터 넘겨받은 값이 -1이 아니면 반복, -1이면 벗어남
			while (true) {
				int what = in.read();
				if (what == -1) {
					break;
				}
				out.write(what);
			}

			System.out.println("file copy end");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (in != null) {
					in.close();
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
