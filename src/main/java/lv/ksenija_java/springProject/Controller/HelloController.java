package lv.ksenija_java.springProject.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
    @GetMapping("/hi")
    public String sayHello(@RequestParam(name = "name", required = false,
            defaultValue = "User") String name, Model model){
        model.addAttribute("name", name);
        return "helloControllerPage";
    }

    @GetMapping("/selectobj")
    public String countryIndex(@RequestParam(value = "country", required = false) String country,
                               @RequestParam(value = "id", required = false) Integer id,
                               Model model){
        model.addAttribute("id", id);
        model.addAttribute("country", country);
        return "helloControllerPage";

    }

    @GetMapping("/table")
    public String Table(){
        return "Table";
    }

    @GetMapping("/addemployee")
    public String addEmployee(){
        return "addEmployee";
    }


}
