package controller;

import enums.Gender;
import model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/mentor")
public class MentorController {

    @RequestMapping("/mentor")
    public String mentor(Model model) {

        List<Mentor> mentorList=new ArrayList<>();
        mentorList.add(new Mentor("Mike","Smith",45, Gender.MALE));
        mentorList.add(new Mentor("Tom","Hanks",65, Gender.MALE));
        mentorList.add(new Mentor("Ammy","Bryan",55, Gender.FEMALE));

        model.addAttribute("mentors", mentorList);

        return "/student/mentor";
    }
}
