# Baseball 프로그램


### 테이블 생성
```sql
create table stadium(
    id int primary KEY auto_increment,
    name varchar(20)  unique not null,
    createdAt TIMESTAMP
);

create table team(
    id int primary KEY auto_increment,
    name varchar(20)  unique not null,
    stadium_id int,
    createdAt TIMESTAMP
);

create table player(
    id int primary KEY auto_increment,
    playername varchar(20),
    position varchar(20) not null,
    team_id int,
    is_outer BOOLEAN,
    createdAt TIMESTAMP
);
```

### 더미데이터 추가
```sql
INSERT into stadium(name,createdAt)VALUES("사직야구장",now());
INSERT into stadium(name,createdAt)VALUES("수원KT위즈파크",now());
INSERT into stadium(name,createdAt)VALUES("인천 SSG랜더스필드",NOW());

INSERT into team(name,stadiumId,createdAt)VALUES("롯데","1",now());
INSERT into team(name,stadiumId,createdAt)VALUES("KT","2",now());
INSERT into team(name,stadiumId,createdAt)VALUES("SSG","3",NOW());


INSERT into player(name,position,team_id,is_outer,createdAt)VALUES("김유영","투수",1,0,now());
INSERT into player(name,position,team_id,is_outer,createdAt)VALUES("나원탁","투수",1,0,now());
INSERT into player(name,position,team_id,is_outer,createdAt)VALUES("이인복","투수",1,0,NOW());
INSERT into player(name,position,team_id,is_outer,createdAt)VALUES("하혜성","투수",1,0,NOW());
INSERT into player(name,position,team_id,is_outer,createdAt)VALUES("배성근","내야수",1,0,NOW());
INSERT into player(name,position,team_id,is_outer,createdAt)VALUES("이호연","내야수",1,0,NOW());
INSERT into player(name,position,team_id,is_outer,createdAt)VALUES("추재현","외야수",1,0,NOW());
INSERT into player(name,position,team_id,is_outer,createdAt)VALUES("강로한","외야수",1,0,NOW());
INSERT into player(name,position,team_id,is_outer,createdAt)VALUES("민성우","포수",1,0,NOW());

INSERT into player(name,position,team_id,is_outer,createdAt)VALUES("벤자민","투수",2,0,NOW());
INSERT into player(name,position,team_id,is_outer,createdAt)VALUES("엄상백","투수",2,0,NOW());
INSERT into player(name,position,team_id,is_outer,createdAt)VALUES("이정현","투수",2,0,NOW());
INSERT into player(name,position,team_id,is_outer,createdAt)VALUES("이채호","투수",2,0,NOW());
INSERT into player(name,position,team_id,is_outer,createdAt)VALUES("유준규","내야수",2,0,NOW());
INSERT into player(name,position,team_id,is_outer,createdAt)VALUES("권동진","내야수",2,0,NOW());
INSERT into player(name,position,team_id,is_outer,createdAt)VALUES("김태훈","외야수",2,0,NOW());
INSERT into player(name,position,team_id,is_outer,createdAt)VALUES("홍현빈","외야수",2,0,now());
INSERT into player(name,position,team_id,is_outer,createdAt)VALUES("문상인","포수",2,0,NOW());

INSERT into player(name,position,team_id,is_outer,createdAt)VALUES("박상후","투수",3,0,NOW());
INSERT into player(name,position,team_id,is_outer,createdAt)VALUES("신헌민","투수",3,0,NOW());
INSERT into player(name,position,team_id,is_outer,createdAt)VALUES("정동윤","투수",3,0,NOW());
INSERT into player(name,position,team_id,is_outer,createdAt)VALUES("조이현","투수",3,0,NOW());
INSERT into player(name,position,team_id,is_outer,createdAt)VALUES("김성현","내야수",3,0,NOW());
INSERT into player(name,position,team_id,is_outer,createdAt)VALUES("최주환","내야수",3,0,NOW());
INSERT into player(name,position,team_id,is_outer,createdAt)VALUES("최지훈","외야수",3,0,NOW());
INSERT into player(name,position,team_id,is_outer,createdAt)VALUES("한유섬","외야수",3,0,NOW());
INSERT into player(name,position,team_id,is_outer,createdAt)VALUES("이흥련","포수",3,0,NOW());

commit;
```

### Tip

#### MariaDB auto commit 해제 하기 
```sql
SHOW VARIABLES LIKE 'autocommit%';
SET autocommit = FALSE;
```
