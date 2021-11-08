package assignment1;

import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Encoding {

	public static void main(String args[]){
		{
			String userName="RB88OTP";
			String password="8Thurs27";

			CharsetEncoder encoder = StandardCharsets.UTF_8.newEncoder();
			if (!encoder.canEncode(userName) || !encoder.canEncode(password)) {
				throw new IllegalArgumentException(
						"Username or password contains characters that cannot be encoded to " + StandardCharsets.UTF_8.displayName());
			}

			final String combine = userName.concat(":").concat(password);
			String encode="RlVOODg6MjFUaHVyczU2";
			System.out.println(Base64.getEncoder().encodeToString(combine.getBytes(StandardCharsets.UTF_8)));
			byte[] decodedBytes = Base64.getDecoder().decode(encode);
			String decodedString = new String(decodedBytes);
			System.out.println(decodedString);
		}
	}
}
