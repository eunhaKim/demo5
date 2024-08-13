package com.spring.demo5.service;

import com.spring.demo5.dao.UserDAO;
import com.spring.demo5.domain.UserDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HomeService {

  final private UserDAO homeDAO;

  public List<UserDTO> getUserList() {
    return homeDAO.getUserList();
  }
}
