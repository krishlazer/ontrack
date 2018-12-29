package krish.testinterfaces.start;

public class Train 
{

	private int TrainNo;
	private String TrainName;
	private String Origin;
	private String Destination;
	private int Stations;
	private int Junctions;
	private int Distance;
	private int Fare;
	
	public int getTrainNo() 
	{
		return TrainNo;
	}
	public void setTrainNo(int TrainNo) 
	{
		this.TrainNo = TrainNo;
	}
	public String getTrainName() 
	{
		return TrainName;
	}
	public void setTrainName(String TrainName) 
	{
		this.TrainName = TrainName;
	}
	public String getOrigin() 
	{
		return Origin;
	}
	public void setOrigin(String Origin) 
	{
		this.Origin = Origin;
	}
	public String getDestination() 
	{
		return Destination;
	}
	public void setDestination(String Destination) 
	{
		this.Destination = Destination;
	}
	public int getStations() 
	{
		return Stations;
	}
	public void setStations(int Stations) 
	{
		this.Stations = Stations;
	}
	public int getJunctions() 
	{
		return Junctions;
	}
	public void setJunctions(int Junctions) 
	{
		this.Junctions = Junctions;
	}
	public int getDistance() 
	{
		return Distance;
	}
	public void setDistance(int Distance) 
	{
		this.Distance = Distance;
	}
	public int getFare() 
	{
		return Fare;
	}
	public void setFare(int Fare) 
	{
		this.Fare = Fare;
	}
	
	public Train(int TrainNo, String TrainName, String Origin, String Destination, int Stations, int Junctions, int Distance, int Fare) 
	{
		//super();
		this.TrainNo = TrainNo;
		this.TrainName = TrainName;
		this.Origin = Origin;
		this.Destination = Destination;
		this.Stations = Stations;
		this.Junctions = Junctions;
		this.Distance = Distance;
		this.Fare = Fare;
	}
}
