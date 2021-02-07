package com.exercise.javas.controller;

import com.exercise.javas.dto.UserDTO;
import com.exercise.javas.service.MypageService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@RestController
public class MypageController {

    @Autowired
    MypageService mypageService;

    @GetMapping("/mypage")
    public ModelAndView mypage(HttpSession session) {
        return mypageService.mypage(session);
    }

    @GetMapping("/meminfomodify")
    public ModelAndView modifymeminfo(HttpSession session) {
        return mypageService.modifymeminfo(session);
    }

    @PostMapping("/meminfoupdate")
    public ModelAndView meminfoupdate(@Valid UserDTO dto,
                                      @RequestParam(value = "photo", required = false)
                                        MultipartFile photo,
                                      HttpSession session,
                                      HttpServletRequest request) {
        return mypageService.meminfoupdate(dto, photo, session, request);
    }

    @ResponseBody
    @GetMapping(value = "/myreviews", produces = "application/json; charset=UTF-8")
    public String myreviews(HttpSession session) throws JsonProcessingException {
        return mypageService.myreviews(session);
    }
}
