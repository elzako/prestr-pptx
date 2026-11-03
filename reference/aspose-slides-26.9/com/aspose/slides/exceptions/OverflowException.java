package com.aspose.slides.exceptions;

public class OverflowException extends ArithmeticException {
   public OverflowException() {
      super("Arithmetic operation resulted in an overflow.");
   }

   public OverflowException(String message) {
      super(message);
   }

   public OverflowException(String message, Throwable cause) {
      super(message, cause);
   }
}
