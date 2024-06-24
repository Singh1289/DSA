package demo;

public class FingerDemo {
	public static void main(String[] args) {
		
		
		
	}
	
	public boolean matchFingerprintData(byte[] capturedData, byte[] storedData) {
	    try {
	        return match(capturedData, storedData);
	    } catch (SDKException e) {
	        e.printStackTrace();
	        return false;
	    }
	}

}
