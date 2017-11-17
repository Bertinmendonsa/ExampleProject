package form.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class InfoController {
	private InfoRepository infoRepository;
	private QualificationsRepository qualificationsRepository;
	private Area_of_practicesRepository area_of_practicesRepository;
	
	@Autowired
	InfoController(InfoRepository infoRepository,QualificationsRepository qualificationsRepository,Area_of_practicesRepository area_of_practicesRepository){
		this.infoRepository=infoRepository;
		this.qualificationsRepository=qualificationsRepository;
		this.area_of_practicesRepository=area_of_practicesRepository;
	}
	
	 @GetMapping("/select") 
	    public String create(Model model){
		 model.addAttribute("infos", infoRepository.findAll());
	        model.addAttribute("info", new Info());
	        model.addAttribute("qualification", qualificationsRepository.findAll());
	        model.addAttribute("qualifications",new Qualifications());
	        model.addAttribute("area_of_practice", area_of_practicesRepository.findAll());
	        model.addAttribute("area_of_practices",new Area_of_practices());
	        return "info";
	    }
	 @PostMapping("/save")
	    public String add(@ModelAttribute Info info) {
	       infoRepository.save(info);
	        return "redirect:/select";
	 }
	      
	 @PatchMapping("/update")
	 public String update(@RequestParam String ID, @RequestParam Long Telephone, @RequestParam Long Mobile_number,@RequestParam String Clinic, @RequestParam Qualifications qualifications,@RequestParam Area_of_practices area_of_practices){
	            Info info1 = infoRepository.findOne(Integer.parseInt(ID));
	            info1.setTelephone(Telephone);
	            info1.setMobile_number(Mobile_number);
	            info1.setClinic(Clinic);
	            info1.setQualifications(qualifications);
	            info1.setArea_of_practices(area_of_practices);
	             infoRepository.save(info1);
	            return "redirect:/select";
	        }
	 
	 @RequestMapping("/display/{Id}") 
	  public String showOne(@PathVariable Integer Id,final Model model){
	        Info info = infoRepository.findOne(Id);
	        model.addAttribute("info", info);
	        model.addAttribute("qualifications",qualificationsRepository.findAll());
	        model.addAttribute("area_of_practices",area_of_practicesRepository.findAll());
	      return "editInfo";
	   }
	 
	  @RequestMapping("/delete/{Id}")
	    public String delete(@PathVariable String Id) {
	        Info info = infoRepository.findOne(Integer.parseInt(Id));
	        info.setDeletedRecord(true);
	        infoRepository.save(info);
	        return "redirect:/select";
	    }
//@GetMapping(value="/info")
//ModelAndView info(){
//	ModelAndView modelAndView=new ModelAndView();
//	modelAndView.setViewName("info");
//	modelAndView.addObject("info",new Info());
//	return modelAndView;
//}

//	@RequestMapping(value="/three",method=RequestMethod.POST)
//	public @ResponseBody Info save(@ModelAttribute Info info){
//		infoRepository.save(info);
//		return info;
//	}
}
