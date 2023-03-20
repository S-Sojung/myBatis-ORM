package shop.mtcoding.mybatissetting.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseDto<T> {
    private String msg;
    private T data;
}
