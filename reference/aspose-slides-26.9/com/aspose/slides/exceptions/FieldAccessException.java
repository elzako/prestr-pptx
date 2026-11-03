package com.aspose.slides.exceptions;

public class FieldAccessException extends MemberAccessException {
   public FieldAccessException() {
      super("The caller does not have permission to access this field.");
   }

   public FieldAccessException(String message) {
      super(message);
   }

   public FieldAccessException(String message, Exception inner) {
      super(message, inner);
   }
}
