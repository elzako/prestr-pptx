package com.aspose.slides.exceptions;

public class FormatException extends SystemException {
   public FormatException() {
      super("One of the identified items was in an invalid format.");
   }

   public FormatException(String message) {
      super(message);
   }

   public FormatException(String message, Throwable cause) {
      super(message, cause);
   }
}
