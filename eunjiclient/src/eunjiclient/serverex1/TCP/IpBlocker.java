package eunjiclient.serverex1.TCP;

import java.util.HashSet;
import java.util.Set;

public class IpBlocker {
	
	 private Set<String> blockedIps;

	    public IpBlocker() {
	        blockedIps = new HashSet<>();
	    }

	    public void addBlockedIp(String ip) {
	        blockedIps.add(ip);
	    }

	    public void removeBlockedIp(String ip) {
	        blockedIps.remove(ip);
	    }

	    public boolean isIpBlocked(String ip) {
	        return blockedIps.contains(ip);
	    }

	    
	    /*
	    public static void main(String[] args) {
		
			사용예시
			
	  IpBlocker ipBlocker = new IpBlocker();

    // 차단할 IP 주소 추가 예시
    String ipAddressToAdd = "192.168.1.100";
    ipBlocker.addBlockedIp(ipAddressToAdd);
    System.out.println(ipAddressToAdd + "가 차단되었습니다.");

    // 다른 IP 주소 추가 예시
    ipAddressToAdd = "10.0.0.1";
    ipBlocker.addBlockedIp(ipAddressToAdd);
    System.out.println(ipAddressToAdd + "가 차단되었습니다.");
		
		}
		
		*/
}

