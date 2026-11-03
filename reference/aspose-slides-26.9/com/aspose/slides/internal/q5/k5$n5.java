package com.aspose.slides.internal.q5;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$ValueCollection$Enumerator;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.q1;

public class k5$n5 extends com.aspose.slides.internal.l7.u9$n5 {
   private int n5 = 0;
   private Dictionary<l6, n5$n5> l6;

   public static k5$n5 n5(com.aspose.slides.internal.l7.u3 var0, com.aspose.slides.internal.m9.c8 var1) {
      return new k5$n5(var0, var1);
   }

   protected k5$n5(com.aspose.slides.internal.l7.u3 var1, com.aspose.slides.internal.m9.c8 var2) {
      super(var1, var2);
   }

   @Override
   protected void n3() {
      this.l6 = null;
      super.n5(false);
   }

   @Override
   public int x8() {
      if (this.l6 != null && this.l6.size() != 0) {
         boolean var1 = false;
         int var2 = 4 + this.l6.size() * 8;
         Dictionary$ValueCollection$Enumerator var3 = this.l6.getValues().iterator();

         try {
            while (var3.hasNext()) {
               n5$n5 var4 = (n5$n5)var3.next();
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
      if (this.l6 == null) {
         return false;
      }

      Dictionary$ValueCollection$Enumerator var1 = this.l6.getValues().iterator();

      try {
         while (var1.hasNext()) {
            n5$n5 var2 = (n5$n5)var1.next();
            if (!var2.s7()) {
               return false;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }

      return true;
   }

   @Override
   public int n5(com.aspose.slides.internal.m9.c8 var1) {
      int var2 = var1.u3(0, this.e2());
      var2 += var1.u3(2, this.l6.size());
      int var3 = var2;
      var2 += this.l6.size() * 8;
      Dictionary$ValueCollection$Enumerator var4 = this.l6.getValues().iterator();

      try {
         while (var4.hasNext()) {
            n5$n5 var5 = (n5$n5)var4.next();
            var3 += var1.u3(var3, var5.t9());
            var3 += var1.u3(var3, var5.e2());
            var3 += var1.n5(var3, (long)var2);
            var2 += var5.n5((com.aspose.slides.internal.m9.c8)var1.l6(var2));
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      return var2;
   }

   @Override
   protected com.aspose.slides.internal.l7.l6 n5(com.aspose.slides.internal.m9.h0 var1) {
      return new k5(this.y4(), var1, null);
   }

   public final int e2() {
      return this.n5;
   }
}
