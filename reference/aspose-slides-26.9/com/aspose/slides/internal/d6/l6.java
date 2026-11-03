package com.aspose.slides.internal.d6;

import com.aspose.slides.exceptions.ArgumentException;

public class l6 extends com.aspose.slides.internal.p4.n5 {
   @Override
   public String n5(int var1) {
      switch (Integer.valueOf(var1)) {
         case 0:
            return "Data";
         case 1:
            return "Get";
         case 2:
            return "Set";
         default:
            throw new ArgumentException();
      }
   }
}
