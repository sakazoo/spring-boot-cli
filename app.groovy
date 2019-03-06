@Grab("thymeleaf-spring5")

@Controller
class App {
 
  @RequestMapping("/")
  @ResponseBody
  def home(ModelAndView mav) {
    mav.setViewName("home")
    mav.addObject("msg","so this is unlucky revolution by 竹内電気")
  }
}