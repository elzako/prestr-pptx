package com.aspose.slides.exceptions;

import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.p8;

public class BadImageFormatException extends SystemException {
   private String n5;

   public BadImageFormatException() {
      super("Value does not fall within the expected range");
   }

   public BadImageFormatException(String message) {
      super(message);
   }

   public BadImageFormatException(String message, Throwable cause) {
      super(message, cause);
   }

   public BadImageFormatException(String message, String fileName) {
      super(message);
      this.n5 = fileName;
   }

   public BadImageFormatException(String message, String fileName, Throwable cause) {
      super(message, cause);
      this.n5 = fileName;
   }

   @Override
   public String getMessage() {
      return this.n5 != null && this.n5.length() > 0 ? super.getMessage() + p8.k5() + d1.n5("File name: {0}", new Object[]{this.n5}) : super.getMessage();
   }

   public String getFileName() {
      return this.n5;
   }
}
