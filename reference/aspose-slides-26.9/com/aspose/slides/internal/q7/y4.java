package com.aspose.slides.internal.q7;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.Exception;

public class y4 extends Exception {
   public y4(String var1, RuntimeException var2) {
      super(var1, var2);
      if (var2 == null) {
         throw new ArgumentNullException("exception");
      }
   }

   @Override
   public String toString() {
      return this.getInnerException() != null ? this.getInnerException().toString() : super.toString();
   }
}
