package com.aspose.slides.exceptions;

import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j3;

@j3
public class CryptographicException extends SystemException {
   public CryptographicException() {
      super("Error occurred during a cryptographic operation.");
   }

   public CryptographicException(int hr) {
   }

   public CryptographicException(String message) {
      super(message);
   }

   public CryptographicException(String message, Throwable cause) {
      super(message, cause);
   }

   public CryptographicException(String format, String insert) {
      super(d1.n5(format, new Object[]{insert}));
   }
}
