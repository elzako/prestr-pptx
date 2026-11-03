package com.aspose.slides.exceptions;

import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.p8;

public class ArgumentOutOfRangeException extends ArgumentException {
   private Object n5;

   public ArgumentOutOfRangeException() {
      super("Specified argument was out of the range of valid values.");
   }

   public ArgumentOutOfRangeException(String paramName) {
      super("Specified argument was out of the range of valid values.", paramName);
   }

   public ArgumentOutOfRangeException(String message, Throwable cause) {
      super(message, cause);
   }

   public ArgumentOutOfRangeException(String paramName, String message) {
      super(message, paramName);
   }

   public ArgumentOutOfRangeException(String paramName, Object actualValue, String message) {
      super(message, paramName);
      this.n5 = actualValue;
   }

   @Override
   public String getMessage() {
      if (this.n5 == null) {
         return super.getMessage();
      }

      String var1 = d1.n5("Actual value was {0}.", new Object[]{this.n5});
      return super.getMessage() == null ? var1 : super.getMessage() + p8.k5() + var1;
   }
}
