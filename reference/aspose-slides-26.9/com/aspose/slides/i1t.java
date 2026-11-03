package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

abstract class i1t {
   private com.aspose.slides.internal.o9b.w1 n5 = new com.aspose.slides.internal.o9b.w1();
   private final k3w l6;
   private final com.aspose.slides.internal.h6.n5 k5;

   protected i1t(k3w var1, com.aspose.slides.internal.h6.n5 var2) {
      this.l6 = var1;
      this.k5 = var2;
   }

   public final k3w n5() {
      return this.l6;
   }

   public final com.aspose.slides.internal.o9b.w1 l6() {
      return this.n5.u3();
   }

   public final com.aspose.slides.internal.h6.n5 k5() {
      return this.k5;
   }

   public final com.aspose.slides.internal.o9b.w1 n5(com.aspose.slides.internal.e1.m3 var1) {
      com.aspose.slides.internal.o9b.w1 var2 = this.l6().u3();
      com.aspose.slides.internal.e1.t2 var3 = var1 != null ? com.aspose.slides.internal.v6g.k5.n5(var1.y2(), com.aspose.slides.internal.e1.t2.class) : null;
      if (var3 == null) {
         com.aspose.slides.internal.f4.l6 var12 = this.n5().l6().l6(this.k5());
         return var12 != null ? var12.k5().u9() : var2;
      }

      List var4 = new List();
      com.aspose.slides.internal.e1.z1 var5 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.e1.z1.class);
      if (var5 != null) {
         var5.n3().n5(var2);
         if (var5.u3() != null) {
            var4.addItem(var5.u3());
         }
      } else {
         com.aspose.slides.internal.e1.k7 var6 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.e1.k7.class);
         if (var6 != null) {
            var6.n5().n5(var2);
         }
      }

      do {
         if (var3.u3() != null) {
            var4.addItem(var3.u3());
         }

         var3 = com.aspose.slides.internal.v6g.k5.n5(var3.y2(), com.aspose.slides.internal.e1.t2.class);
      } while (var3 != null);

      com.aspose.slides.internal.w0.c8 var13 = new com.aspose.slides.internal.w0.c8();
      var4.reverse();
      List$Enumerator var7 = var4.iterator();

      try {
         while (var7.hasNext()) {
            com.aspose.slides.internal.w0.c8 var8 = (com.aspose.slides.internal.w0.c8)var7.next();
            var13.n5(var8);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
            var7.dispose();
         }
      }

      return var13.n5(var2.u3());
   }
}
