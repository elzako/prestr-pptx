package com.aspose.slides.exceptions;

public class TargetException extends ApplicationException {
   public TargetException() {
      super("attempt to invoke an invalid target");
   }

   public TargetException(String message) {
      super(message);
   }

   public TargetException(String message, Throwable cause) {
      super(message, cause);
   }
}
