package com.aspose.slides;

import com.aspose.slides.exceptions.Exception;

public class InvalidPasswordException extends Exception {
   public InvalidPasswordException() {
   }

   public InvalidPasswordException(String message) {
      super(message);
   }

   public InvalidPasswordException(String message, RuntimeException exception) {
      super(message, exception);
   }
}
