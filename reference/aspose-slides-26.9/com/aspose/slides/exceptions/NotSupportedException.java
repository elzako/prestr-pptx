package com.aspose.slides.exceptions;

public class NotSupportedException extends UnsupportedOperationException {
   public NotSupportedException() {
      super("Specified method is not supported.");
   }

   public NotSupportedException(String message) {
      super(message);
   }

   public NotSupportedException(String message, Exception innerException) {
      super(message, innerException);
   }
}
