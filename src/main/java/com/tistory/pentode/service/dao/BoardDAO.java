package com.tistory.pentode.service.dao;

import java.util.List;

import com.tistory.pentode.vo.MemberVO;

public interface BoardDAO {
	List<MemberVO> selectBoardList() throws Exception;
}
