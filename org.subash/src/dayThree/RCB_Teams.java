package dayThree;

public class RCB_Teams {
	private String Name;
	private int jersyNo;
	private int age;
	
	public String getName() {
		return Name;
		
	}
	public  void setName(String Name) {
		this.Name=Name;
	}
	public int getage() {
		return age;
	}
	public void setage(int age) {
		this.age=age;
	}
	public int getjerseyNo() {
		return jersyNo;
	}
	public  void setjerseyNo(int jersyNo) {
		this.jersyNo=jersyNo;
	}
	public static void main(String[] args) {
		RCB_Teams vk=new RCB_Teams();
		vk.setName("virat");
		vk.setage(45);
		vk.setjerseyNo(18);
		System.out.println(vk.getName());
		System.out.println(vk.getage());
		System.out.println(vk.getjerseyNo());
	}

}
