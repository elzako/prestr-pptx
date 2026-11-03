package com.aspose.slides.exceptions;

public class IndexOutOfRangeException extends SystemException {
   public IndexOutOfRangeException() {
      super("Index was outside the bounds of the array.");
   }

   public IndexOutOfRangeException(String message) {
      super(message);
   }

   public IndexOutOfRangeException(String message, Throwable cause) {
      super(message, cause);
   }
}
