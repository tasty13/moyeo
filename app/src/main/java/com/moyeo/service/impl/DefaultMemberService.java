package com.moyeo.service.impl;

import com.moyeo.dao.MemberDao;
import com.moyeo.service.MemberService;
import com.moyeo.vo.Member;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class DefaultMemberService implements MemberService {

  private static final Log log = LogFactory.getLog(DefaultMemberService.class);

  private final MemberDao memberDao;


  // 회원가입
  @Override
  public void add(Member member) {
    memberDao.add(member);
  }

  // email, password를 사용해 사용자 정보 가져오기
  @Override
  public Member get(String email, String password) {
    return memberDao.findByEmailAndPassword(email, password);
  }

  // 회원번호 찾아서 , 정보보여주기, 회원삭제
  @Override
  public Member get(int no) {
    return memberDao.findBy(no);
  }

  @Override
  public List<Member> list() {
    return memberDao.findAll();
  }

  // 회원 정보 수정
  @Override
  public int update(Member member) {
    return memberDao.update(member);
  }

  // 회원 탈퇴
  @Override
  public int delete(int no) {
    return memberDao.delete(no);
  }


}
