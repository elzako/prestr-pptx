package com.aspose.slides.exceptions;

public class AccessViolationException extends SystemException {
   public AccessViolationException() {
      super("Attempted to read or write protected memory. This is often an indication that other memory is corrupt.");
   }

   public AccessViolationException(String message) {
      super(message);
   }

   public AccessViolationException(String message, Throwable cause) {
      super(message, cause);
   }
}
