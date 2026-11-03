package com.aspose.slides.ms.System;

import com.aspose.slides.exceptions.NullReferenceException;
import java.util.TimeZone;

public final class h6 {
   public static s4 n5(TimeZone var0, j5 var1) {
      if (var0 == null) {
         throw new NullReferenceException();
      }

      int var2 = var1.a6() == 1L ? 0 : var0.getOffset(var1.z3());
      return s4.a6(var2);
   }
}
