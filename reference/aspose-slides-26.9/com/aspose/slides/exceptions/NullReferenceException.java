package com.aspose.slides.exceptions;

public class NullReferenceException extends NullPointerException {
   public NullReferenceException() {
      super("Object reference not set to an instance of an object.");
   }

   public NullReferenceException(String message) {
      super(message);
   }

   public NullReferenceException(String message, Throwable cause) {
      super(message);
      super.initCause(cause);
   }

   public Throwable getInnerException() {
      return this.getCause();
   }
}
