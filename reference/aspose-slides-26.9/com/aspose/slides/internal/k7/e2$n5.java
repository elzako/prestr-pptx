package com.aspose.slides.internal.k7;

import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;

public class e2$n5 {
   private int n5;
   private com.aspose.slides.internal.k5.u9 l6;
   private String k5;
   private static final com.aspose.slides.internal.r7c.c8 u3 = new com.aspose.slides.internal.r7c.c8("\\\\([\\n\\r\\f0-9a-fA-F]{1,6})\\s*", 0);
   private static final com.aspose.slides.internal.r7c.c8 a6 = new com.aspose.slides.internal.r7c.c8("[ ]{2,}", 0);

   e2$n5(int var1) {
      this.n5 = var1;
   }

   e2$n5(int var1, String var2) {
      this.n5 = var1;
      this.k5 = var2;
   }

   e2$n5(int var1, com.aspose.slides.internal.k5.u9 var2) {
      this(var1);
      this.l6 = var2;
   }

   public final int n5() {
      return this.n5;
   }

   public final com.aspose.slides.internal.k5.u9 l6() {
      return this.l6;
   }

   public final String k5() {
      if (3 == this.n5 || 2 == this.n5) {
         return ((com.aspose.slides.internal.k5.u3)this.l6()).l6();
      }

      if (0 == this.n5) {
         String var1 = ((com.aspose.slides.internal.k5.u3)this.l6()).l6();
         if (d1.u3(var1, '\\') != -1) {
            var1 = d1.n5(u3.n5(var1, new e2$n5$1(this)), "\\", d1.n5);
         }

         return a6.k5(var1, " ");
      } else if (4 == this.n5) {
         return this.k5;
      } else {
         return 5 == this.n5 ? this.k5 : null;
      }
   }

   private static String l6(com.aspose.slides.internal.r7c.u3 var0) {
      int var1 = 0;
      int[] var2 = new int[]{0};
      boolean var3 = a3.n5(d1.k5(var0.k5(), 1), 515, com.aspose.slides.internal.h0.h0.n5, var2);
      var1 = var2[0];
      return var3 ? d1.n5((char)var1, 1) : d1.n5;
   }

   // $VF: synthetic method
   static String n5(com.aspose.slides.internal.r7c.u3 var0) {
      return l6(var0);
   }
}
