package com.aspose.slides.exceptions;

public class ArgumentNullException extends ArgumentException {
   public ArgumentNullException() {
      super("Value cannot be null.");
   }

   public ArgumentNullException(String paramName) {
      super("Value cannot be null.", paramName);
   }

   public ArgumentNullException(String message, Throwable cause) {
      super(message, cause);
   }

   public ArgumentNullException(String paramName, String message) {
      super(message, paramName);
   }
}
