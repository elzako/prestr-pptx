package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class f2q extends v6g {
   private List<b2s> n5 = new List<>();
   private l5n l6;
   private g3y k5;
   private List<q8o> u3 = new List<>();

   public f2q(g3y var1, w3 var2) {
      this.l6 = (l5n)var2;
      this.k5 = var1;
      List$Enumerator var3 = var1.c8().iterator();

      try {
         while (var3.hasNext()) {
            t9z var4 = (t9z)var3.next();
            b2s var5 = new b2s(var4);
            this.n5.addItem(var5);
            this.n5(var5);
            if (!var4.c8() && var4.t9() != null && var4.t9().y4()) {
               n5k var6 = new n5k(var5);
               this.u3.addItem(var6);
               this.n5(var6);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }
   }

   @Override
   protected void n5(z5 var1) {
      double var2 = 0.0;
      List$Enumerator var4 = this.n5.iterator();

      try {
         while (var4.hasNext()) {
            b2s var5 = (b2s)var4.next();
            if (var5.e2().n5() > var2) {
               var2 = var5.e2().n5();
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      List$Enumerator var23 = this.n5.iterator();

      try {
         while (var23.hasNext()) {
            b2s var6 = (b2s)var23.next();
            if (var6.e2().n5() <= 0.0) {
               var6.l6(false);
               var6.n3(new z5(0.0F, 0.0F));
            }

            float var7 = (float)(var6.e2().n5() / var2 * var1.n5());
            float var8 = this.l6.a5() - this.l6.a5() * this.u3() / 2.0F;
            var6.n3(new z5(var7, var8));
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var23, IDisposable.class)) {
            var23.dispose();
         }
      }

      List$Enumerator var24 = this.u3.iterator();

      try {
         while (var24.hasNext()) {
            q8o var25 = (q8o)var24.next();
            var25.n3(var25.e2());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var24, IDisposable.class)) {
            var24.dispose();
         }
      }
   }

   @Override
   protected void l6(z5 var1) {
      for (int var2 = 0; var2 < this.n5.size(); var2++) {
         this.n5.get_Item(var2).a6(var1.n5() / 2.0F - this.n5.get_Item(var2).d2() / 2.0F);
         this.n5.get_Item(var2).u9(var2 * this.l6.a5() + this.l6.a5() / 2.0F - this.n5.get_Item(var2).d5() / 2.0F);
         this.n5.get_Item(var2).t1();
      }

      List$Enumerator var7 = this.u3.iterator();

      try {
         while (var7.hasNext()) {
            n5k var3 = (n5k)var7.next();
            var3.a6(var1.n5() / 2.0F - var3.d2() / 2.0F);
            var3.u9(var3.u3().o0() + var3.u3().d5() / 2.0F - var3.d5() / 2.0F);
            if (var3.d2() > var3.u3().d2()) {
               var3.n5(false);
            }

            var3.t1();
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
            var7.dispose();
         }
      }
   }

   private float u3() {
      return this.k5.u9().getGapWidth() / 100.0F;
   }
}
