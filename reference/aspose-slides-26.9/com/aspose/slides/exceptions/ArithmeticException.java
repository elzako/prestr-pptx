package com.aspose.slides.exceptions;

public class ArithmeticException extends java.lang.ArithmeticException {
   public ArithmeticException() {
      super("Overflow or underflow in the arithmetic operation.");
   }

   public ArithmeticException(String message) {
      super(message);
   }

   public ArithmeticException(String message, Throwable cause) {
      super(message);
      super.initCause(cause);
   }

   public Throwable getInnerException() {
      return this.getCause();
   }
}
