package Examples;

import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Encoding {

	public static void main(String args[]){
		{
			String userName = "FUN88";
			String password = "21Thurs56";

			CharsetEncoder encoder = StandardCharsets.UTF_8.newEncoder();
			if (!encoder.canEncode(userName) || !encoder.canEncode(password)) {
				throw new IllegalArgumentException(
						"Username or password contains characters that cannot be encoded to " + StandardCharsets.UTF_8.displayName());
			}

			final String combine = userName.concat(":").concat(password);
			System.out.println(Base64.getEncoder().encodeToString(combine.getBytes(StandardCharsets.UTF_8)));
		}
	}
}
