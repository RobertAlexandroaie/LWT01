package lwt.lab.utils;

/** Some simple time savers. Static methods. */

public class ServletUtilities {
	public static String headWithTitle(String title) {
		return ("<!DOCTYPE html>\n" + "<html>\n" + "<head><title>" + title + "</title></head>\n");
	}

	private ServletUtilities() {
	} // Uninstantiatable class
}
