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
public class Area_of_practicesController {
	private Area_of_practicesRepository area_of_practicesRepository;
	@Autowired
	public Area_of_practicesController(Area_of_practicesRepository area_of_practicesRepository){
		this.area_of_practicesRepository=area_of_practicesRepository;
	}
	@PostMapping(path="/saveArea_of_practices")
    public String add(@ModelAttribute Area_of_practices  area_of_practices) {
        area_of_practicesRepository.save(area_of_practices);
        return "redirect:/select";
    }
    @RequestMapping("/displayPage/{pId}")
    public String showOne(@PathVariable Integer pId,final Model model){
       Area_of_practices area_of_practices = area_of_practicesRepository.findOne(pId);
        model.addAttribute("area_of_practice", area_of_practices);
        model.addAttribute("area_of_practices",area_of_practicesRepository.findAll());
        return "Area_of_practices";
    }
    @GetMapping("/deletePage/{pId}")
    public String delete(@PathVariable String pId) {
        Area_of_practices area_of_practices = area_of_practicesRepository.findOne(Integer.parseInt(pId));
        area_of_practicesRepository.delete(area_of_practices);
        return "redirect:/select";
    }
    @PatchMapping(path="/updateArea_of_practices")
    public String update(@RequestParam String pID, @RequestParam String Area_of_practice,@RequestParam String Description) {
       Area_of_practices area_of_practices1 = area_of_practicesRepository.findOne(Integer.parseInt(pID));
        area_of_practices1.setArea_of_practice(Area_of_practice);
        area_of_practices1.setDescription(Description);
        area_of_practicesRepository.save(area_of_practices1);
        return "redirect:/select";
    }
	
//@GetMapping(value="/area_of_practices")
//ModelAndView area_of_practices(){
//	ModelAndView modelAndView= new ModelAndView();
//	modelAndView.setViewName("Area_of_practices");
//	modelAndView.addObject("area_of_practices",new Area_of_practices());
//	return modelAndView;
//}
//
//@RequestMapping(value="/two",method=RequestMethod.POST)
//public @ResponseBody Area_of_practices save(@ModelAttribute Area_of_practices area_of_practices){
//	area_of_practicesRepository.save(area_of_practices);
//	return area_of_practices;
//}
}
