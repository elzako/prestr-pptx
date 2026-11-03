package com.aspose.slides.exceptions;

import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.y8;

public class InvalidEnumArgumentException extends ArgumentException {
   public InvalidEnumArgumentException() {
      super("Exception of type System.ComponentModel.InvalidEnumArgumentException was thrown.");
   }

   public InvalidEnumArgumentException(String message) {
      super(message);
   }

   public InvalidEnumArgumentException(String message, Throwable cause) {
      super(message, cause);
   }

   public InvalidEnumArgumentException(String argumentName, int invalidValue, y8 enumClass) {
      super(d1.n5("The value of argument '{0}' ({1}) is invalid for Enum '{2}'.", argumentName, invalidValue, enumClass.s7()), argumentName);
   }
}
