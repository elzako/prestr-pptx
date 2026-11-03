package com.aspose.slides.internal.c3;

import com.aspose.slides.Collections.Generic.List;

public class n5$l6 extends List<n5$n5> {
   public final boolean n5(String var1) {
      for (n5$n5 var3 : this) {
         if (com.aspose.slides.ms.System.d1.a6(var3.n5(), var1)) {
            return true;
         }
      }

      return false;
   }

   public final boolean n5(String... var1) {
      for (n5$n5 var3 : this) {
         if (com.aspose.slides.internal.w3.u9.n5(var3.n5(), var1)) {
            return true;
         }
      }

      return false;
   }

   public final String l6(String var1) {
      for (n5$n5 var3 : this) {
         if (com.aspose.slides.ms.System.d1.a6(var3.n5(), var1)) {
            return var3.l6();
         }
      }

      return null;
   }
}
