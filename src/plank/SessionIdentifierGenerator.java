package plank;
import java.math.BigInteger;
import java.security.SecureRandom;

public final class SessionIdentifierGenerator {
  private SecureRandom random = new SecureRandom();

  public String nextSessionId() {
    return new BigInteger(25, random).toString(32);
  }
}