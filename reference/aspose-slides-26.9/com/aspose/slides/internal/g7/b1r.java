package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ms.System.IDisposable;

public class b1r extends d2n {
   private h3r k5;

   public b1r(d2n var1) {
      super(var1.y1(), 0L, 0L, 0L);
   }

   public final void n5(h3r var1) {
      this.k5 = var1;
   }

   @Override
   public k6 n5(int var1) {
      return this.k5.k7().l6(var1) ? this.y1().l6().h0().n5(var1) : null;
   }

   @Override
   public void n5(byte[][] var1, long[] var2, long[] var3) {
      f3c var4 = new f3c(this.y1().n5());

      try {
         var2[0] = 0L;
         IGenericEnumerator var5 = this.k5.k7().iterator();

         try {
            while (var5.hasNext()) {
               int var6 = com.aspose.slides.internal.v6g.k5.u3(var5.next(), int.class);
               long var7 = this.y2().u9().n5().n5(var6);
               long var9 = this.y2().u9().n5().n5(var6 + 1);
               var2[0] = (var2[0] & 4294967295L) + (com.aspose.slides.ms.System.q1.n5((int)var9 - (int)var7) & 4294967295L) & 4294967295L;
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
               var5.dispose();
            }
         }

         com.aspose.slides.internal.z0k.e2 var45 = new com.aspose.slides.internal.z0k.e2();

         try {
            j2p var12 = new j2p(var45, true);

            try {
               byte[] var13 = new byte[256];

               for (int var14 = 0; var14 < this.y2().u9().n5().n5(); var14++) {
                  if (this.k5.k7().l6(var14)) {
                     long var15 = this.y2().u9().n5().n5(var14);
                     long var17 = this.y2().u9().n5().n5(var14 + 1);
                     var4.n5((this.y2().h0().d2() & 4294967295L) + (var15 & 4294967295L) & 4294967295L);
                     int var19 = com.aspose.slides.ms.System.q1.n5((int)var17 - (int)var15);
                     long var20 = this.k5.l6().u9().n5().n5(var14);
                     if (var13.length < var19) {
                        var13 = new byte[var19];
                     }

                     var4.n5(var19, var13, 0);
                     var12.n5(var13, var19);
                  }
               }

               this.n5(var12, var45, var1, var2, var3);
            } finally {
               if (var12 != null) {
                  var12.dispose();
               }
            }
         } finally {
            if (var45 != null) {
               var45.dispose();
            }
         }
      } finally {
         if (var4 != null) {
            var4.dispose();
         }
      }
   }
}
