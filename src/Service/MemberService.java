package Service;

import Infra.Container;
import Repository.MemberRepository;

public class MemberService {

    private MemberRepository memberRepository;

    public MemberService(){
        this.memberRepository = Container.memberRepository;
    }

    public int saveMemeber(String loginId, String password, String name) {
        return memberRepository.saveMember(loginId, password, name);
    }


    public boolean isExistsByLoginId(String loginId) {
        return false;
    }
}
