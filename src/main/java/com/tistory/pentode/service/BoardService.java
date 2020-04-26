package com.tistory.pentode.service;

import java.util.List;

import com.tistory.pentode.vo.MemberVO;

public interface BoardService {
	List<MemberVO> selectBoardList() throws Exception;
}
