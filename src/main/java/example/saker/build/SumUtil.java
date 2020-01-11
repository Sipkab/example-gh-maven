package example.saker.build;

import org.apache.commons.lang3.mutable.MutableInt;

/**
 * Utility class for summarizing numbers.
 */
public class SumUtil {
	/**
	 * Summarizes the argument numbers in the provided {@link MutableInt}.
	 * <p>
	 * If the argument is <code>null</code>, nothing will be added to the result. Any <code>null</code> numbers in the
	 * iterable are ignored.
	 * 
	 * @param numbers
	 *            The iterable of numbers.
	 * @param result
	 *            The result to which to add the values.
	 */
	public static void sum(Iterable<? extends Number> numbers, MutableInt result) {
		if (numbers == null) {
			return;
		}
		for (Number n : numbers) {
			if (n == null) {
				continue;
			}
			result.add(n.intValue());
		}
	}
}
