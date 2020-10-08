package pack;
public class Test {

public static void main(String args[]) {

CPU cpu = new CPU();

HardDisk HD=new HardDisk();

cpu.setSpeed(2200);

cpu.setname("intel");

HD.setAmount(200);

HD.setType("¹ÌÌ¬");

PC pc =new PC();

pc.setCPU(cpu);

pc.setHardDisk(HD);

pc.show();

}

}