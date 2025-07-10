
public class Desktop implements  HardWare,Software {
private void desktopModel(int model) {
	System.out.println("model no is "+ model);
this.softwareResources("desktop storage");
this.hardwareResources("desktop storage");
}

@Override
public void softwareResources(String storage) {
	System.out.println("all the software resources stored in "+storage);
	
}

@Override
public void hardwareResources(String storage) {
System.out.println("all the hardware resources stored in "+storage);
	System.out.println("");
}
public static void main(String[] args) {
	Desktop d = new Desktop();
	d.desktopModel(453);
}
}
