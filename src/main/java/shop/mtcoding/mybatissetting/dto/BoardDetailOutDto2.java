package shop.mtcoding.mybatissetting.dto;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BoardDetailOutDto2 {
    private Integer id;
    private String title;
    private String content;
    private UserDto user;
    // Entity를 그대로 응답하면 안됨. Entity에는 소중한 데이터들이 너무 많음.
    // 모델은 db 테이블이기 때문에 잘 안바뀌지만 화면은 시도 때도없이 사장님 마음대로 바뀔 수 있다...
    // DTO는 화면을 위한 데이터로. -> 모델 형태로 바꾸는건 서비스 상에서 고치면 된다.
    // 공유가 된다고 하더라도 다 따로 만들어야한다.
    private Timestamp createdAt;

    public BoardDetailOutDto2(BoardDetailOutDto board) {
        this.id = board.getId();
        this.title = board.getTitle();
        this.content = board.getContent();
        this.user = new UserDto(
                board.getUserId(),
                board.getUserUsername(),
                board.getUserPassword(),
                board.getUserEmail(),
                board.getUserCreatedAt());
        this.createdAt = board.getCreatedAt();
    }

    // 이 Dto에는 모델을 해치지 않기 때문에 내부 클래스로!! 공유?? No
    @Getter
    @Setter
    @ToString
    public class UserDto {
        private Integer id;
        private String username;
        private String password;
        private String email;
        private Timestamp createdAt;

        public UserDto(Integer id, String username, String password, String email, Timestamp createdAt) {
            this.id = id;
            this.username = username;
            this.password = password;
            this.email = email;
            this.createdAt = createdAt;
        }
    }

}
