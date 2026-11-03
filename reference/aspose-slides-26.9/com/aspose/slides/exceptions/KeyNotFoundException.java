package com.aspose.slides.exceptions;

import com.aspose.slides.ms.System.j3;

@j3
public class KeyNotFoundException extends SystemException {
   public KeyNotFoundException() {
      super("The given key was not present in the dictionary.");
   }

   public KeyNotFoundException(String message) {
      super(message);
   }

   public KeyNotFoundException(String message, Throwable innerException) {
      super(message, innerException);
   }
}
