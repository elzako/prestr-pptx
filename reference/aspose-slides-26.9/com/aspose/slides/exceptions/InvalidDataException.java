package com.aspose.slides.exceptions;

public class InvalidDataException extends SystemException {
   public InvalidDataException() {
      super("Found invalid data while decoding");
   }

   public InvalidDataException(String message) {
      super(message);
   }

   public InvalidDataException(String message, Throwable cause) {
      super(message, cause);
   }
}
