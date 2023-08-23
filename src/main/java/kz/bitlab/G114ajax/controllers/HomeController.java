package kz.bitlab.G114ajax.controllers;

import kz.bitlab.G114ajax.repositories.AcademyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
  @Autowired
  private AcademyRepository academyRepository;

  @GetMapping("/")
  public String homePage() {
    return "home";
  }

}
