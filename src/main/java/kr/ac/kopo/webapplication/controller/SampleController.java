package kr.ac.kopo.webapplication.controller;


import kr.ac.kopo.webapplication.dto.SampleDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
@RequestMapping("/sample") //폴더명
public class SampleController {

    @GetMapping("/ex1")
    public void ex(){

    }

//    @GetMapping("/ex2")
//    public void exModel(Model model){
//        List< SampleDTO> list = IntStream.rangeClosed(1,20).asLongStream().mapToObj(i -> {
//            SampleDTO dto = SampleDTO.builder()  //객체생성 1~20까지
//                    .sno(i)
//                    .first("First..."+i)
//                    .last("last..."+i)
//                    .regTime(LocalDateTime.now())
//                    .build();
//            return dto;  //mapToObj 로 감
//        }).collect(Collectors.toList());
//
//        model.addAttribute("list",list);  //"list" 이름으로 list를 저장 / "list" -> html에서 이 이름으로 사용해야됨
//
//    }

    @GetMapping({"/ex2", "/ex2_1"})
    public void exModel(Model model){
        List< SampleDTO> list = IntStream.rangeClosed(1,20).asLongStream().mapToObj(i -> {
            SampleDTO dto = SampleDTO.builder()  //객체생성 1~20까지
                    .sno(i)
                    .first("First..."+i)
                    .last("last..."+i)
                    .regTime(LocalDateTime.now())
                    .build();
            return dto;  //mapToObj 로 감
        }).collect(Collectors.toList());

        model.addAttribute("list",list);  //"list" 이름으로 list를 저장 / "list" -> html에서 이 이름으로 사용해야됨

    }



}


