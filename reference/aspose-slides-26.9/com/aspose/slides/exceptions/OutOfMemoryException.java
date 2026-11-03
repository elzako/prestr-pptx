package com.aspose.slides.exceptions;

public class OutOfMemoryException extends OutOfMemoryError {
   public OutOfMemoryException() {
      super("There was not enough memory to continue the execution of the program");
   }

   public OutOfMemoryException(String message) {
      super(message);
   }

   public OutOfMemoryException(String message, Throwable cause) {
      super(message);
      super.initCause(cause);
   }

   public Throwable getInnerException() {
      return this.getCause();
   }
}
