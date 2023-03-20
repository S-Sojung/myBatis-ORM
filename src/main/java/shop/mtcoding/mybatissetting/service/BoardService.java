package shop.mtcoding.mybatissetting.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import shop.mtcoding.mybatissetting.dto.BoardDetailOutDto;
import shop.mtcoding.mybatissetting.dto.BoardDetailOutDto2;
import shop.mtcoding.mybatissetting.dto.BoardJoinUserDto;
import shop.mtcoding.mybatissetting.dto.BoardJoinUserDto2;
import shop.mtcoding.mybatissetting.model.board.BoardRepository;

@RequiredArgsConstructor
@Service
public class BoardService {

    private final BoardRepository boardRepository;

    public BoardDetailOutDto2 boardDetail(Integer id) {
        BoardDetailOutDto boardDetailOutDto = boardRepository.findByIdJoinUser(id);
        // 얘를 바로 리턴하지말고 서비스에서 가공
        // 모델은 int로 그대로 두고 ... \
        System.out.println("디버그 : " + boardDetailOutDto);
        BoardDetailOutDto2 boardDetailOutDto2 = new BoardDetailOutDto2(boardDetailOutDto);
        System.out.println("디버그 : " + boardDetailOutDto2);
        return boardDetailOutDto2;
    }

    public BoardJoinUserDto boardDetail2(Integer id) {
        BoardJoinUserDto dto = boardRepository.findByIdJoinUser2(id);
        System.out.println("디버그 : " + dto);
        return dto;
    }

    public BoardJoinUserDto2 boardDetail3(Integer id) {
        BoardJoinUserDto2 dto = boardRepository.findByIdJoinUser3(id);
        System.out.println("디버그 : " + dto);
        return dto;
    }

}
