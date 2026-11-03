package com.aspose.slides.exceptions;

import com.aspose.slides.ms.System.j3;

@j3
public class IOException extends SystemException {
   public IOException() {
      super("I/O error occurred.");
   }

   public IOException(String message) {
      super(message);
   }

   public IOException(String message, Throwable innerException) {
      super(message, innerException);
   }
}
