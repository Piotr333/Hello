import org.apache.commons.lang3.StringUtils;

public class StringUtilsMod extends StringUtils {

	public static boolean isNumeric(final CharSequence cs) {
		char kropka = '.';
		if (isEmpty(cs)) {
			return false;
		}
		final int sz = cs.length();
		for (int i = 0; i < sz; i++) {
			if (!(Character.isDigit(cs.charAt(i)) || kropka == cs.charAt(i))) {
				return false;
			}
		}
		return true;
	}
}
