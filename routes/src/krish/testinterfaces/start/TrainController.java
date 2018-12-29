package krish.testinterfaces.start;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TrainController 
{
	Train tr1 = new Train(12021, "Shatabdi","Mumbai", "Delhi", 8, 3, 1568, 3215);
	
	@RequestMapping(value="/")
	public String displayRouteMap(Model md)
	{
		
		md.addAttribute("TrainNo", tr1.getTrainNo());
		md.addAttribute("TrainName", tr1.getTrainName());
		md.addAttribute("Origin", tr1.getOrigin());		
		md.addAttribute("Destination", tr1.getDestination());
		md.addAttribute("Stations", tr1.getStations());
		md.addAttribute("Junctions", tr1.getJunctions());
		md.addAttribute("Distance", tr1.getDistance());
		md.addAttribute("Fare", tr1.getFare());
		
		return "viewtrain";
		
		
	}
	









}
