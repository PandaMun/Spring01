package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id);//id를 찾아온다.
    Optional<Member> findByName(String name);//name을 찾아온다.
    List<Member> findAll();//지금까지 저장된 모든 리스트 반환
}
