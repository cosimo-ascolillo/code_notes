class CodeJava {
  
  /* Enum Utils: extract value of from string */
  private static <E extends Enum<E>> E safeValueOf(final Class<E> enumClass, final String value) {
    if (value == null || value.isBlank()) {
      return null;
    }
    try {
      return Enum.valueOf(enumClass, value.trim());
    } catch (final IllegalArgumentException e) {
      return null;
    }
  }
}
