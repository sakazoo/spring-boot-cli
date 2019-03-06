@Grab("thymeleaf-spring5")

@Controller
class App {
 
  @RequestMapping(value="/", method=RequestMethod.GET)
  @ResponseBody
  def home(ModelAndView mav) {
    mav.setViewName("home")
    mav.addObject("msg","so this is unlucky revolution by \u7af9\u5185\u96fb\u6c17")
  }

  @RequestMapping(value="/send", method=RequestMethod.POST)
  @ResponseBody
  def home(@RequestParam("text1")String str,  ModelAndView mav) {
    mav.setViewName("home")
    mav.addObject("msg","Helllo " + str + "!!")
    mav.addObject("value",str)
  }
}
