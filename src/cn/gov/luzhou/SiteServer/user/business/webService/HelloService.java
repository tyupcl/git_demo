package cn.gov.luzhou.SiteServer.user.business.webService;

public class HelloService {
	public String sayHello() {
		return "Hello";
	}

	public String sayHelloToPerson(String name) {
		if (name == null || name.equals("")) {
			name = "nobody";
		}
		return "Hello " + name;
	}
}
