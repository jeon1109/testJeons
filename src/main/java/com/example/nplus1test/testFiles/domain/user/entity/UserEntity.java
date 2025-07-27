package com.example.nplus1test.testFiles.domain.user.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "user_base")
@Getter
@Setter
public class UserEntity {
    // 서브웨이 주문자 및 vip 구분하기
    // vip 및 관리자를 구분하기 위해 시큐리티를 사용한다

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // 순번

    private String user_name; // 이름
    private String password; // 비밀번호

    // 주소 api 조회 (배달에 필요)
    // 메인 + 상세 주소

    // 휴대폰 번호 (연락처) - 배달 또는 예약
    private int phone_number;
    // 프로필 사진 업로드 => 파일 읽어서 업로드, 다운로드
    private String profile_name;
    private String profile_path;
    // 약관 동의 여부
    private Boolean agree_yn;
    // 사용자 상태 (탈퇴, 정상, 휴면, 밴) => 역할 ROLE?


}
