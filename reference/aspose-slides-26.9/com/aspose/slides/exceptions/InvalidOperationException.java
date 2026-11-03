package com.aspose.slides.exceptions;

public class InvalidOperationException extends SystemException {
   public InvalidOperationException() {
      super("Operation is not valid due to the current state of the object.");
   }

   public InvalidOperationException(String message) {
      super(message);
   }

   public InvalidOperationException(String message, Throwable cause) {
      super(message, cause);
   }
}
