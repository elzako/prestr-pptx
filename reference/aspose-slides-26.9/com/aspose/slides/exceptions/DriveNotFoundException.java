package com.aspose.slides.exceptions;

import com.aspose.slides.ms.System.j3;

@j3
public class DriveNotFoundException extends IOException {
   public DriveNotFoundException() {
      super("Attempted to access a drive that is not available.");
   }

   public DriveNotFoundException(String message) {
      super(message);
   }

   public DriveNotFoundException(String message, Throwable innerException) {
      super(message, innerException);
   }
}
