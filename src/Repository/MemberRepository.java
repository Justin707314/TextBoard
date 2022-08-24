package Repository;

import Data.Member;

import java.util.ArrayList;
import java.util.List;

import static Infra.Container.memberRepository;

public class MemberRepository {

    private int memberId = 0;
    private List<Member> store = new ArrayList<>();

    public int saveMember(String loginId, String password, String name){

        memberId += 1;
        Member member = new Member(memberId, loginId, password, name);
        store.add(member);

        return memberId;
    }

    public Member getMemberByLoginId(String loginId) {

        for(Member member : store){
            if(member.getLoginId().equals(loginId)){
                return member;
            }
        }
        return null;
    }

    public boolean isExistByLoginId(String loginId){
        return getMemberByLoginId(loginId) != null;
    }

    public boolean isExistsByLoginId(String loginId){
        return memberRepository.isExistsByLoginId(loginId);

    }


}
