package pack;

/*
클래스명이 같아도 다른 패키지에 속하면 구분 가능
pack.a.User는 import, pack.b.User는 전체 경로 작성
둘 다 import 불가능
주로 자주 사용하는 클래스를 import
*/

// 패키지는 계층 구조를 이루더라도 모두 다른 패키지로 취급
// a, a.b, a.c 패키지가 있을 때 총 패키지는 3개이며 모두 따로 import 해야 함

import pack.a.User;

public class PackageMain3 {
    User userA = new User();
    pack.b.User userB = new pack.b.User();
}
