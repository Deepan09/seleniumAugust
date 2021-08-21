package Mobile;

public class ExecutionMobile extends SmartPhone {

	public static void main(String[] args) {
		
BasicMobile objBasic = new BasicMobile();
objBasic.makeCall();
objBasic.sendMsg();
objBasic.saveContact();
System.out.println(".........accessed basicmobile class...........");


AndroidPhone objAndr = new AndroidPhone();
objAndr.takeVideo();
objAndr.makeCall();
objAndr.sendMsg();
objAndr.saveContact();
System.out.println("......method overriding used for take video............");
System.out.println("......accessed Androidclass class............");

SmartPhone objSmart = new SmartPhone();
objSmart.connectWatsapp();
objSmart.takeVideo();
objSmart.makeCall();
objSmart.sendMsg();
objSmart.saveContact();
System.out.println("......accessed Smartoho class............");

	}
	

}
