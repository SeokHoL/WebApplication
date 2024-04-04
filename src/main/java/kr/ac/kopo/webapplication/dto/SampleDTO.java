package kr.ac.kopo.webapplication.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data //게터,세터 를 자동으로 해줌
@Builder(toBuilder = true)
public class SampleDTO {

    private Long sno;
    private String first;
    private String last;
    private LocalDateTime regTime;
}
