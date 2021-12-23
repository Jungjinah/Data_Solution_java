package com.ddargiratte.dec224.main;

import java.io.InputStream;

import com.ddargiratte.dec2244.HttpClient.DdargiratteHttpClient;

public class HMain3 {
	public static void main(String[] args) {
		
		try {
			InputStream is = DdargiratteHttpClient.download("https://www.naver.com/");
			
			String result = DdargiratteHttpClient.convert(is, "UTF-8");
			System.out.println(result);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
