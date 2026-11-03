package com.aspose.slides.exceptions;

public class AmbiguousMatchException extends SystemException {
   public AmbiguousMatchException() {
      super("Ambiguous match found.");
   }

   public AmbiguousMatchException(String message) {
      super(message);
   }

   public AmbiguousMatchException(String message, Throwable cause) {
      super(message, cause);
   }
}
