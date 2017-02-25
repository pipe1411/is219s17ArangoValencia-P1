package is219s17arangovalenciap1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by pipe on 2/18/17.
 */

@Controller
public class ResumeController {
    private ResumeService resumeService;

    @Autowired
    public void setResumeService(ResumeService resumeService) {
        this.resumeService = resumeService;
    }

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model ) {
        model.addAttribute("name", name);

        return "greeting";
    }

/*    @RequestMapping(value = "/index"*//*"/resumes"*//*, method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("resumes",resumeService.listAllProducts());
        return "resumes";
    }*/

/*    @RequestMapping(value = "resume/{id}")
    public String showResume(@PathVariable Integer id, Model model) {
        model.addAttribute("resume",resumeService.getResumeById(id));
        return "resumeShow";
    }*/

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String showResume(Model model) {
        model.addAttribute("resume", resumeService.getResumeById(1));
        return "resumes";
    }

}
