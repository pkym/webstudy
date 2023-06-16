package com.smhrd.model;
import java.util.ArrayList;
import java.util.List;

// ibatis 패키지 안에서 가져와야함
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.smhrd.db.SqlSessionManager;

// db에 있는 데이터에 접근 도와주는 객체
public class memberDAO {
	// 1. factory 가져오기(sqlsession 을 빌려올 수 있는 공장)
	private SqlSessionFactory factory = SqlSessionManager.getFactory();
	
	public int join(memberDTO dto) {
		int cnt=0;		
		// 회원가입 기능 수행 --> DB에 데이터추가하기
		// DB에 접근 --> connection(sqlsession) 필요
		// 1. sqlsession 빌려오기 >> autocommit 하게 boolean타입으로
		SqlSession session = factory.openSession(true);
		try {
		// 2. mapper.xml 파일안에 있는 sql구문 중에 사용하고 싶은 sql구문 정해주기
		// session.insert("mapper식별자.sql구문식별자", mapper파일로 넘기고 싶은 매개변수)
		// 전체로 다 적거나 구문식별자로만 적거나 "join"
		// insert 태그를 찾고 여러개의 insert 있을 때 join 아이디로 찾자
		cnt = session.insert("com.smhrd.model.memberDAO.join", dto);
		} finally {
		// 3. sqlsession 반납하기
			session.close();
		}
		// 4. 결과값 반환하기
		return cnt;
	}
	public memberDTO login(memberDTO dto) {
		//4. 결과값 반환
		memberDTO result = null;
		//1. sqlsession 빌려오기
		SqlSession session = factory.openSession(true);		
		//2. 세션 활용해서 구문실행
		try {			
			//여러 회원 가져올 때는 selectList
			result=session.selectOne("com.smhrd.model.memberDAO.login",dto);					
		//3. 세션 반납
		}finally {
			session.close();
		}
		return result;
	}
	public int update(memberDTO dto) {
		int cnt = 0;
		SqlSession session = factory.openSession(true);
		try {
			cnt=session.update("update",dto);				
		}finally {
			session.close();
		}
		return cnt;
	}
	ArrayList<memberDTO> result = null;
	public ArrayList<memberDTO> selectAll() {
		SqlSession session = factory.openSession(true);
		try {
			// 매개변수가 필요 X
			result = (ArrayList)session.selectList("select");			
		}finally {
			session.close();
		}
		return result;	
		
		
	}

}
