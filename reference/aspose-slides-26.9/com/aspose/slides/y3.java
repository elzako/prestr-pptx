package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class y3 extends DomObject<Presentation> {
   private final List<n4> n5 = new List<>();

   public final n4 n5(com.aspose.slides.ms.System.o0 var1) {
      List$Enumerator var2 = this.n5.iterator();

      try {
         while (var2.hasNext()) {
            n4 var3 = (n4)var2.next();
            if (var3.n5().equals(var1.k5())) {
               return var3;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return null;
   }

   public final n4 n5(com.aspose.slides.internal.e5a.y2 var1) {
      boolean var2 = this.u9.a6().getBlobManagementOptions().getPresentationLockingBehavior() == 1;
      com.aspose.slides.internal.q7.c8 var3 = this.u9.w1().n5(var1, var2);
      return this.n5(var3);
   }

   public final n4 n5(byte[] var1) {
      n4 var2 = null;
      n4[] var3 = new n4[]{var2};
      boolean var4 = this.n5(var1, var3);
      var2 = var3[0];
      if (var4) {
         return var2;
      }

      com.aspose.slides.internal.q7.c8 var5 = this.u9.w1().n5(var1);
      return this.n5(var5);
   }

   final n4 n5(com.aspose.slides.internal.q7.c8 var1) {
      n4 var2 = new n4(var1, this);
      this.n5.addItem(var2);
      return var2;
   }

   y3(Presentation var1) {
      super(var1);
   }

   private boolean n5(byte[] var1, n4[] var2) {
      var2[0] = null;
      List$Enumerator var3 = this.n5.iterator();

      try {
         while (var3.hasNext()) {
            n4 var4 = (n4)var3.next();
            byte[] var5 = var4.l6().n5();
            if (var5.length == var1.length) {
               boolean var6 = false;
               int var7 = 0;

               while (true) {
                  if (var7 < var1.length) {
                     if ((var1[var7] & 255) == (var5[var7] & 255)) {
                        var7++;
                        continue;
                     }

                     var6 = true;
                  }

                  if (!var6) {
                     var2[0] = var4;
                     return true;
                  }
                  break;
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return false;
   }
}
