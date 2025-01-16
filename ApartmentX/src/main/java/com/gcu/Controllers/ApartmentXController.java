package Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping ("/ApartmentX")
public class ApartmentXController {
    @GetMapping("/homepage")
    public String homepage() {

    }
}
