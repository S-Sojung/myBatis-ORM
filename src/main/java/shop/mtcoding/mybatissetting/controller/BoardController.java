package shop.mtcoding.mybatissetting.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import shop.mtcoding.mybatissetting.dto.BoardDetailOutDto2;
import shop.mtcoding.mybatissetting.model.board.Board;
import shop.mtcoding.mybatissetting.model.board.BoardRepository;
import shop.mtcoding.mybatissetting.service.BoardService;

@RequiredArgsConstructor
@RestController
public class BoardController {

    private final BoardService boardService;
    private final BoardRepository boardRepository;

    @GetMapping("/boardbasic/{id}")
    public ResponseEntity<?> detailbasic(@PathVariable Integer id) {
        Board dto = boardRepository.findById(id);
        return ResponseEntity.ok().body(dto);
    }

    @GetMapping("/board/{id}")
    public ResponseEntity<?> detail(@PathVariable Integer id) {
        BoardDetailOutDto2 dto = boardService.boardDetail(id);
        return ResponseEntity.ok().body(dto);
    }

    @GetMapping("/board/v2/{id}")
    public ResponseEntity<?> detailV2(@PathVariable Integer id) {
        // BoardJoinUserDto dto =
        boardService.boardDetail2(id);
        return null;
    }

    @GetMapping("/board/v3/{id}")
    public ResponseEntity<?> detailV3(@PathVariable Integer id) {
        // BoardJoinUserDto dto =
        boardService.boardDetail2(id);
        return null;
    }
}