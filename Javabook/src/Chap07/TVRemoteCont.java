package Chap07;

public class TVRemoteCont {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TVRemoteController vol = new TVRemoteController();
		TVRemoteController channel = new TVRemoteController();
		TVRemoteController vol_max = new TVRemoteController();
		TVRemoteController channel_max = new TVRemoteController();
		for( int i=0 ;i<channel_max.channel_max;i++ ) {
			channel.channelUp();
			System.out.println("MSG: "+channel.help);
		}
		for( int i=0 ;i<channel_max.channel_max;i++ ) {
			channel.channelDn();
			System.out.println("MSG: "+channel.help);
		}

		for( int i=0 ;i<vol_max.vol_max;i++ ) {
			vol.volUp();
			System.out.println("MSG: "+vol.help);
		}
		for( int i=0 ;i<vol_max.vol_max;i++ ) {
			vol.volDn();
			System.out.println("MSG: "+vol.help);
		}
		
	}

}
