package com.aspose.slides.exceptions;

import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j3;

@j3
public class CryptographicUnexpectedOperationException extends CryptographicException {
   public CryptographicUnexpectedOperationException() {
   }

   public CryptographicUnexpectedOperationException(String message) {
      super(message);
   }

   public CryptographicUnexpectedOperationException(String message, Throwable cause) {
      super(message, cause);
   }

   public CryptographicUnexpectedOperationException(String format, String insert) {
      super(d1.n5(format, new Object[]{insert}));
   }
}
