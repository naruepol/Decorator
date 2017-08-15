
public class StreamedMilk extends CondimentDecorator {
	Beverage beverage;
	
	public StreamedMilk(Beverage beverage){
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription()+ ", Streamed Milk";
	}
	
	public double cost(){
		return 0.10 + beverage.cost();
	}

}
