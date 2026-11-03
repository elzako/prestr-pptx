package com.aspose.slides.exceptions;

import com.aspose.slides.internal.n3c.n5;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j3;

@j3
public class InvalidPrinterException extends SystemException {
   public InvalidPrinterException(n5 settings) {
      super(n5(settings));
   }

   public InvalidPrinterException(String message) {
      super(d1.n5(message, new Object[]{}));
   }

   private static String n5(n5 var0) {
      return var0.n5() != null && !d1.a6(var0.n5(), d1.n5)
         ? d1.n5("Tried to access printer '{0}' with invalid settings.", new Object[]{var0.n5()})
         : "No Printers Installed";
   }
}
