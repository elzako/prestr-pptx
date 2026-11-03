package com.aspose.slides.exceptions;

import com.aspose.slides.ms.System.j3;

@j3
public class PathTooLongException extends IOException {
   public PathTooLongException() {
      super(
         "The specified path, file name, or both are too long. The fully qualified file name must be less than 260 characters, and the directory name must be less than 248 characters."
      );
   }

   public PathTooLongException(String message) {
      super(message);
   }

   public PathTooLongException(String message, Throwable innerException) {
      super(message, innerException);
   }
}
