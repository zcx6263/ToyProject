# ToyProject

## '코드로 배우는 스프링 웹 프로젝트' 교재 학습


### 오라클 로케일을 인식할수 없습니다 오류 해결(mac)
- 시에라(sierra) 업데이트 후 에러나는 경우
- 시스템 환경 > 언어 및 지역 > 지역에서 다른 지역으로 변경후 다시 대한민국으로 변경

### 주요 내용
- 스프링 5.x 버전 사용 / gradle 학습
- Java Configuration 사용
- Lombok 사용
- Oracle
- 스프링 시큐리티(Spring Security)

**테스트 코드 junit**

**Java Version**

## Part 1 : 시스템 개발 환경 구축

## Part 2 : 스프링 MVC 설정



**root-context.xml**
- 스프링에서 관리해야 하는 객체를 설정하는 설정파일 ( 빈 설정 파일이 동작)

**servlet-context.xml**
- 스프링 MVC의 jsp를 처리하는 설정 / 화면설정은 ViewResolver 라는 객체를 통해 이루어짐
- /WEB-INF/views 폴더 이용 ( /WEB-INF 경로는 브라우저에서 직접 접근 못하고 반드시 controller를 이용하는 모델2 방식)
- css, js 파일과 같이 정적 자원들 경로 resources라는 경로 지정 

**web.xml**
- DispatherServlet은 클라이언트 요청을 전달받은 서블릿
- 컨트롤러나 뷰와 같은 스프링mvc의 구성요소를 이용하여 클라이언트에게 서비스 제공
- /WEB-INF/web.xml 에 서블릿과 매핑 정보를 설정
- 프로젝트 구동은 web.xml 에서 시작하여 root-context 경로가 설정

## Part 3 : 기본적인 웹 게시물 관리

### 화면 처리

- 부트스트랩 ( SB Admin2 ) 사용 / https://startbootstrap.com/themes/

## Part 4 : Rest 방식과 Ajax를 이용하는 댓글 처리

## Part 5 : AOP와 트랜잭션

## Part 6 : 파일 업로드 처리

## Part 7 : Spring Web Security를 이용한 로그인 처리












