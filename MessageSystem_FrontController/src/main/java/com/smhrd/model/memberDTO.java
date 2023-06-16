package com.smhrd.model;

public class memberDTO {
	// 1. 필드
	// >> DTO 설계할 때는 테이블 단위로 설계
	// >> 필드명과 테이블 컬럼명을 일치시키자
	private String email;
	private String pw;
	private String tel;
	private String address;
	
	// 2. 메소드
	// >> 기본생성자, 모든 필드값 받아서 초기화 시킬 수 있는 생성자
	// >> getter, setter (alt+Shift+S)
	
	public memberDTO() {
		
	}

	public memberDTO(String email, String pw, String tel, String address) {
		super();
		this.email = email;
		this.pw = pw;
		this.tel = tel;
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
}
