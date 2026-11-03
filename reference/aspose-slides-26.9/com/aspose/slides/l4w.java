package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

abstract class l4w extends f7c {
   protected List<z2g> n5 = new List<>();

   protected l4w(p7m var1, g3y var2) {
      super(var1, var2);
   }

   protected final void a6() {
      List$Enumerator var1 = this.n5.iterator();

      try {
         while (var1.hasNext()) {
            z2g var2 = (z2g)var1.next();
            var2.u3();
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }
   }

   protected final void u9() {
      if (this.l6.size() > 0 && this.e2().u9().hasSeriesLines()) {
         for (int var1 = 0; var1 < this.l6.size() - 1; var1++) {
            if (!this.l6.get_Item(var1).e2().c8()) {
               for (int var2 = var1 + 1; var2 < this.l6.size(); var2++) {
                  if (!this.l6.get_Item(var2).e2().c8()) {
                     z2g var3 = new z2g((a2p)this.l6.get_Item(var1), (a2p)this.l6.get_Item(var2));
                     this.n5.addItem(var3);
                     this.n5(var3);
                     break;
                  }
               }
            }
         }
      }
   }

   protected final void k5(z5 var1) {
      List$Enumerator var2 = this.k5.iterator();

      try {
         while (var2.hasNext()) {
            q8o var3 = (q8o)var2.next();
            var3.n3(var3.e2());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      List$Enumerator var28 = this.u3.iterator();

      try {
         while (var28.hasNext()) {
            a6y var4 = (a6y)var28.next();
            var4.n3(var1);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var28, IDisposable.class)) {
            var28.dispose();
         }
      }

      List$Enumerator var29 = this.n5.iterator();

      try {
         while (var29.hasNext()) {
            z2g var5 = (z2g)var29.next();
            var5.n3(var1);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var29, IDisposable.class)) {
            var29.dispose();
         }
      }

      List$Enumerator var30 = this.a6.iterator();

      try {
         while (var30.hasNext()) {
            e1o var6 = (e1o)var30.next();
            var6.n3(var1);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var30, IDisposable.class)) {
            var30.dispose();
         }
      }

      this.u9(var1);
   }

   protected final void h0() {
      for (int var1 = 0; var1 < this.u3.size(); var1++) {
         a6y var2 = this.u3.get_Item(var1);
         t3h var3 = (t3h)this.k5.get_Item(var1);
         a2p var4 = (a2p)var3.u3();
         com.aspose.slides.internal.o9b.w1 var5 = var4.n5(var3).u3();
         boolean var6 = false;
         com.aspose.slides.internal.o9b.w1[] var7;
         if (!(var3.p8() > var5.l6()) && !(var3.p8() + var3.d2() < var5.l6())) {
            var6 = true;
            var7 = var3.z3();
         } else {
            var7 = var3.q0();
         }

         if (!var2.n5(var3.e5().y4(), new com.aspose.slides.internal.o9b.w1[]{var5}, var7) || var3.e5().k5(var4.e5().y4())) {
            var2.n5(false);
         } else if (var6) {
            var2.n5(var3.s7() < -1.0F);
         } else {
            float var8 = 5.0F;
            boolean var9 = var5.l6() < var3.p8() - 5.0F || var5.l6() > var3.p8() + var3.d2() + 5.0F;
            var2.n5(com.aspose.slides.ms.System.q1.n5(var3.t2()) > Float.MIN_VALUE && var9);
         }

         var2.t1();
      }
   }

   protected final float c8() {
      return this.e2().u9().getGapWidth() / 100.0F;
   }

   protected final float t2() {
      return this.e2().u9().getOverlap() / 100.0F;
   }
}
