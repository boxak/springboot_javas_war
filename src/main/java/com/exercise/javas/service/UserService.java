package com.exercise.javas.service;

import com.exercise.javas.dto.UserDTO;
import com.exercise.javas.repository.UserRepository;
import com.exercise.javas.utils.JavasConstants;
import com.exercise.javas.utils.JavasUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public ModelAndView insert(UserDTO dto, MultipartFile photo, HttpServletRequest request) {
        ModelAndView mav = new ModelAndView(JavasConstants.NOTICE_RESULT);
        log.info(dto.toString());
        try {
            userRepository.save(dto);
            JavasUtils.uploadPhoto(dto.getId(), photo, request);
            mav.addObject(JavasConstants.MSG_TYPE, "joinSuccess");
        } catch (Exception e) {
            log.warn(" :::: update user info processing error! {} ::::", e.getMessage());
            mav.addObject(JavasConstants.MSG_TYPE, "joinFail");
        }
        return mav;
    }

    public ModelAndView delete(String id) {
        ModelAndView mav = new ModelAndView(JavasConstants.NOTICE_RESULT);
        try {
            userRepository.deleteById(id);
            mav.addObject(JavasConstants.MSG_TYPE, "exitSuccess");
        } catch (Exception e) {
            mav.addObject(JavasConstants.MSG_TYPE, "exitFail");
        }
        return mav;
    }

    public String hasId(String id) {
        boolean result = false;
        try {
            result = userRepository.existsById(id);
        } catch (Exception e) {
            log.warn(JavasUtils.messegingExLog(e.toString(),e.getMessage()));
        }
        return String.valueOf(result);
    }
}
