# spring-cloud-config-server

spring cloud config를 이용해 설정을 따로 분리

간단한 어노테이션으로 설정을 분리가 가능하다.

지금의 상태는 서버의 설정이 변경되면 client에서 refresh endpoint를 호출해야한다.

추후에 자동으로 변경 방법과 설정정보를 refresh 검증하는 코드를 추가

client의 별도의 설정이 없다면 default라는 profile을 가져온다.

client의 bootstrap.yml에 profile을 기술하거나

client구동시 -Dspring.profiles.active= 를 설정해 구동하면 다른 설정을 가져올수있다.
