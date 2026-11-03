package com.aspose.slides.exceptions;

public class InvalidCastException extends ClassCastException {
   public InvalidCastException() {
      super("Specified cast is not valid.");
   }

   public InvalidCastException(String message) {
      super(message);
   }

   public InvalidCastException(String message, Throwable cause) {
      super(message);
      super.initCause(cause);
   }

   public Throwable getInnerException() {
      return this.getCause();
   }
}
