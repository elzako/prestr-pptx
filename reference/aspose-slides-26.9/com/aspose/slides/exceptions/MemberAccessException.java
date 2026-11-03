package com.aspose.slides.exceptions;

public class MemberAccessException extends SystemException {
   public MemberAccessException() {
      super("Cannot access member.");
   }

   public MemberAccessException(String message) {
      super(message);
   }

   public MemberAccessException(String message, Throwable inner) {
      super(message, inner);
   }
}
