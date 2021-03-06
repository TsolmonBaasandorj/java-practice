package day_47_staticBlock;

public class TV {
	int channel=1;
	  int volumeLevel=1;
	  boolean on=false;
	  String brand="undefined";
	  public TV(){
	    System.out.println("Creating TV object using no Args- constructor");
	  }
	  public TV(String brand){
	    this.brand=brand;
	    System.out.println("Creating TV object using 1 arg - constructor");
	   }
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		
		if(isOn() && channel>0 && channel<=120) {
			this.channel = channel;
		}else {
			System.out.println("ERROR: TV is either OFF or invalid Channel");
		}
		
	}
	public int getVolumeLevel() {
		return volumeLevel;
	}
	public void setVolumeLevel(int volumeLevel) {
		if(isOn() && volumeLevel>=1 && volumeLevel<=7) {
		this.volumeLevel = volumeLevel;
		}else {
			System.out.println("ERROR: TV is either OFF or invalid Volume level");
		}
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	  
	  public void channelUp() {
	    setChannel(channel+1);
	  }
	  public void channelDown() {
		  setChannel(channel-1);
	  }
	  public void volumeUp() {
	    setVolumeLevel(volumeLevel+1);
		}
	  public void volumeDown() {
		setVolumeLevel(volumeLevel-1);
	  }
	  
	  public boolean isOn(){
	  if(on==true) {
		  return true;
	  }else {return false;}
	}
	
	
	  
	  public void turnOn() {
		  if(isOn()) {
			  System.out.println("TV is already ON");
		  }else {
		  on=true;}
	  }
	  public void turnOff() {
		  if(on==false) {
			  System.out.println("TV is already OFF");
			 }else {
		  on=false;}
	  }
	 
}
