package com.aspose.slides.internal.h7;

import com.aspose.slides.Collections.Generic.List;

public class e2 implements t9 {
   private final com.aspose.slides.internal.t8.l6 n5;
   private final com.aspose.slides.internal.k0.k5 l6;
   private final boolean k5;
   private final com.aspose.slides.ms.System.o5<Integer> u3 = new com.aspose.slides.ms.System.o5<>();
   private final boolean a6;

   public e2(
      com.aspose.slides.internal.t8.l6 var1, com.aspose.slides.internal.k0.k5 var2, boolean var3, com.aspose.slides.ms.System.o5<Integer> var4, boolean var5
   ) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      if (var4 != null) {
         var4.n5(this.u3);
      }

      this.a6 = var5;
   }

   @Override
   public final void n5(m1 var1, List<com.aspose.slides.internal.v2.s7> var2) {
      if (this.a6) {
         this.l6.k5();
      }

      com.aspose.slides.internal.t8.a6 var3 = this.n5.n5();
      com.aspose.slides.internal.t8.a6 var4 = this.n5.l6();
      if (this.k5 || com.aspose.slides.ms.System.o5.l6(this.u3, null)) {
         this.l6.n5(this.u3.k5(), this.k5, var3, var4);
      }
   }
}
