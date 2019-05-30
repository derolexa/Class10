public class Main {
    public static void main(String[] args) {
        Monitor monitor=new Monitor("samsung", 2000,"AN3434", 44, 34);
        System.out.println(monitor);
        Device device=new Device("samsung", 120,"AB1234567CD");
        System.out.println(device);
        EthernetAdapter ethernetAdapter=new EthernetAdapter( "samsung", 120, "EN456", 444, "4.45.55");
        System.out.println(ethernetAdapter);
    }
}
