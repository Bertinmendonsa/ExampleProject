package form.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class QualificationsController {
	private QualificationsRepository qualificationsRepository;
	@Autowired
	public QualificationsController(QualificationsRepository qualificationsRepository){
		this.qualificationsRepository=qualificationsRepository;
	}
	
	@PostMapping(path="/saveQualification")
    public String add(@ModelAttribute Qualifications  qualifications) {
        qualificationsRepository.save(qualifications);
        return "redirect:/select";
    }
    @RequestMapping("/displayPage/{qId}")
    public String showOne(@PathVariable Integer qId,final Model model){
       Qualifications qualifications = qualificationsRepository.findOne(qId);
        model.addAttribute("qualification", qualifications);
        model.addAttribute("qualifications",qualificationsRepository.findAll());
        return "qualifications";
    }
    @GetMapping("/deletePage/{qId}")
    public String delete(@PathVariable String qId) {
        Qualifications qualifications = qualificationsRepository.findOne(Integer.parseInt(qId));
        qualificationsRepository.delete(qualifications);
        return "redirect:/select";
    }
    @PatchMapping(path="/updateQualification")
    public String update(@RequestParam String qID, @RequestParam String Qualification,@RequestParam String Description) {
       Qualifications qualifications1 = qualificationsRepository.findOne(Integer.parseInt(qID));
        qualifications1.setQualification(Qualification);
        qualifications1.setDescription(Description);
        qualificationsRepository.save(qualifications1);
        return "redirect:/select";
    }
//@GetMapping(value="/qualifications")
//ModelAndView qualifications(){
//	ModelAndView modelAndView= new ModelAndView();
//	modelAndView.setViewName("qualifications");
//	modelAndView.addObject("qualifications",new Qualifications());
//	return modelAndView;
//}
//
//@RequestMapping(value="/one",method=RequestMethod.POST)
//public @ResponseBody Qualifications save(@ModelAttribute Qualifications qualifications){
//	qualificationsRepository.save(qualifications);
//	return qualifications;
//}
}
