package com.aspose.slides.exceptions;

public class DivideByZeroException extends ArithmeticException {
   public DivideByZeroException() {
      super("Attempted to divide by zero.");
   }

   public DivideByZeroException(String message) {
      super(message);
   }

   public DivideByZeroException(String message, Throwable cause) {
      super(message, cause);
   }
}
