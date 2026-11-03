package com.aspose.slides.exceptions;

import com.aspose.slides.ms.System.j3;

@j3
public class DirectoryNotFoundException extends IOException {
   public DirectoryNotFoundException() {
      super("Attempted to access a path that is not on the disk.");
   }

   public DirectoryNotFoundException(String message) {
      super(message);
   }

   public DirectoryNotFoundException(String message, Throwable innerException) {
      super(message, innerException);
   }
}
