package com.launchacademy.adaptapet.controllers;

import com.launchacademy.adaptapet.respositories.PetTypesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pets")
public class PetsController {

  @Autowired
  private PetTypesRepository petTypesRepository;

  @GetMapping
  public String getTypes(Model model) {
    return "";
  }

}
