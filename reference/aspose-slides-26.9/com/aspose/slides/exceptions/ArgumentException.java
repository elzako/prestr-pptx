package com.aspose.slides.exceptions;

import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.p8;

public class ArgumentException extends SystemException {
   private String n5;

   public ArgumentException() {
      super("Value does not fall within the expected range.");
   }

   public ArgumentException(String message) {
      super(message);
   }

   public ArgumentException(String message, Throwable cause) {
      super(message, cause);
   }

   public ArgumentException(String message, String paramName) {
      super(message);
      this.n5 = paramName;
   }

   public ArgumentException(String message, String paramName, Throwable cause) {
      super(message, cause);
      this.n5 = paramName;
   }

   @Override
   public String getMessage() {
      return this.n5 != null && this.n5.length() > 0 ? super.getMessage() + p8.k5() + d1.n5("Parameter name: {0}", new Object[]{this.n5}) : super.getMessage();
   }

   public String getParamName() {
      return this.n5;
   }
}
