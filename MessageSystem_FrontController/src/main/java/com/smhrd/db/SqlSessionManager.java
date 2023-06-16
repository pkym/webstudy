package com.smhrd.db;

import java.io.IOException;
import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


public class SqlSessionManager {
// mybatis-config 파일을 읽어서 sql session 을 생성하도록 도와주는 도구

	// 인스턴스 생성자(static) >> 제일 먼저 실행되는 구간
	// new로 생성할 필요 X
	// 서로다른 객체끼리 꼭 공유해야 하는 고정값을 넣어줘야 하는 구간
	// sqlSessionManager manager1 = new sqlSessionManager();
	// sqlSessionManager manager2 = new sqlSessionManager();
	// 1과 2는 다른 객체 지만 static 구간에 저장된 구간을 같이 공유
	
	public static SqlSessionFactory sqlSessionFactory;
	static { // 프로젝트시 resource 경로만 잘 수정하기
		String resource = "com/smhrd/db/mybatis-config.xml";
		InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// sqlsessionfactory 리턴해주는 메소드 (static으로 정의해야함)
	public static SqlSessionFactory getFactory() {
		return sqlSessionFactory;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
