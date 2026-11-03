package com.aspose.slides.internal.e4;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.q1;

public class u9$n5 extends com.aspose.slides.internal.l7.u9$n5 {
   private List<a6> n5;

   public static u9$n5 n5(com.aspose.slides.internal.l7.u3 var0, com.aspose.slides.internal.m9.c8 var1) {
      return new u9$n5(var0, var1);
   }

   protected u9$n5(com.aspose.slides.internal.l7.u3 var1, com.aspose.slides.internal.m9.c8 var2) {
      super(var1, var2);
   }

   @Override
   protected com.aspose.slides.internal.l7.l6 n5(com.aspose.slides.internal.m9.h0 var1) {
      return new u9(this.y4(), var1, null);
   }

   @Override
   protected void n3() {
      this.n5 = null;
      super.n5(false);
   }

   @Override
   public int x8() {
      if (this.n5 != null && this.n5.size() != 0) {
         boolean var1 = false;
         int var2 = 0;
         List$Enumerator var3 = this.n5.iterator();

         try {
            while (var3.hasNext()) {
               a6 var4 = (a6)var3.next();
               int var5 = var4.x8();
               var2 += q1.n5(var5);
               var1 |= var5 <= 0;
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }

         return var1 ? -var2 : var2;
      } else {
         return 0;
      }
   }

   @Override
   public boolean s7() {
      return this.n5 != null;
   }

   @Override
   public int n5(com.aspose.slides.internal.m9.c8 var1) {
      int var2 = 0;
      List$Enumerator var3 = this.n5.iterator();

      try {
         while (var3.hasNext()) {
            a6 var4 = (a6)var3.next();
            var2 += var4.n5((com.aspose.slides.internal.m9.c8)var1.l6(var2));
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return var2;
   }
}
