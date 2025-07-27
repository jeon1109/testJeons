package com.example.nplus1test.testFiles.test.domain;

public class Users {
    // 사용자를 구성하는 정보
    private String user_name; // 이름
    private String password; // 비밀번호

    // 주소 api 조회 (배달에 필요)
    // 메인 + 상세 주소
    private String juso_info;
    private String juso1;
    private String juso2;

    // 휴대폰 번호 (연락처) - 배달 또는 예약
    private String phone_number = "";
    // 프로필 사진 업로드 => 파일 읽어서 업로드, 다운로드
    private String profile_name = "";
    private String profile_path = "";
    // 약관 동의 여부
    private Boolean agree_yn;
    // 사용자 상태 (탈퇴, 정상, 휴면, 밴) => 역할 ROLE?
    private String state;

    private String roles;

    // 생성자 : 객체를 생성한다 / 사용자를 만드는데 필요한 정보들!
    // 위에 사용자라는 개념이 가진 정보를 외부에서 준 정보를 맞춘다
    // 이건 필수로 받아야하는 정보!
    Users(String user, String password, Boolean agree_yn, String roles) {
        this.user_name = user;
        this.password = password;
        this.agree_yn = agree_yn;
        this.roles = roles;
    }

    // 주소를 검증하고 setter 하기
    public void setJusoInfo(String juso1, String juso2) {
        this.juso1 = juso1;
        this.juso2 = juso2;
        this.juso_info = juso1 + juso2; // 최종 주소정보
    }

    // 프로필은 선택사항이다
    public void setProfile(String profile_name, String profile_path) {
        this.profile_name = profile_name;
        this.profile_path = profile_path;
    }

    // 전화번호은 선택사항이다. 그러나 배달시에는 필수다!
    public void  setPhoneNumber(String phone_number) {
        this.phone_number = phone_number;
    }


    // 정상으로 되어야지 state 세팅하기
    public void setState(String state) {
        this.state = state;
    }

    public void changePassword(String newPassword) {
        this.password = newPassword;
    }

    public void agreeToTerms() {
        this.agree_yn = true;
    }

    public void deactivate() {
        this.state = "DEACTIVATED";
    }

    public boolean isActive() {
        return "ACTIVE".equals(this.state);
    }

}
