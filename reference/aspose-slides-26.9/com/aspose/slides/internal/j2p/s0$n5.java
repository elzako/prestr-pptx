package com.aspose.slides.internal.j2p;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.ms.System.IDisposable;
import java.util.Comparator;

class s0$n5 implements Comparator {
   private ArrayList n5 = null;

   public s0$n5() {
   }

   public final ArrayList n5() {
      return this.n5;
   }

   public final void n5(ArrayList var1) {
      this.n5 = var1;
   }

   @Override
   public final int compare(Object a, Object b) {
      e9 var3 = com.aspose.slides.internal.v6g.k5.n5(a, e9.class);
      e9 var4 = com.aspose.slides.internal.v6g.k5.n5(b, e9.class);
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;
      IEnumerator var8 = this.n5().iterator();

      try {
         for (; var8.hasNext(); var7++) {
            e9 var9 = (e9)var8.next();
            if (var9 == var3) {
               var5 = var7;
            }

            if (var9 == var4) {
               var6 = var7;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var8, IDisposable.class)) {
            ((IDisposable)var8).dispose();
         }
      }

      int var13 = s0.n5(var3.h0(), var5, this.n5());
      int var10 = s0.n5(var4.h0(), var6, this.n5());
      return com.aspose.slides.ms.System.a3.n5(var13, var10);
   }
}
