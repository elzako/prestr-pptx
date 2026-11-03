package com.aspose.slides.exceptions;

public class MethodAccessException extends MemberAccessException {
   public MethodAccessException() {
      super("Cannot access method.");
   }

   public MethodAccessException(String message) {
      super(message);
   }

   public MethodAccessException(String message, Throwable inner) {
      super(message, inner);
   }
}
