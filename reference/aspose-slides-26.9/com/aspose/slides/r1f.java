package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.ObjectModel.ReadOnlyCollection;
import com.aspose.slides.ms.System.IDisposable;

class r1f extends i0 {
   float n5;
   n3y l6 = new n3y();
   private int a6;
   float k5;
   public final y9t u3;

   public final int a6() {
      return this.a6;
   }

   public final void n5(int var1) {
      this.a6 = var1;
   }

   public r1f(y9t var1, int var2) {
      this.u3 = var1;
      this.a6 = var2;
      p1e var3 = this.u3.l6.n5(this.u3.l6.n5);
      this.k5 = p1e.n5(this.u3.l6.n5);
      float var4 = this.u3.l6.n5 / 96.0F;
      this.l6 = new n3y(var3.n5() + var3.u3(), var3.l6() + var3.u3() * 0.2F);
      this.n5 = var3.u3() * 0.846F;
      if (this.u3.l6.l6() || !this.u3.k5.n5()) {
         ReadOnlyCollection var5 = new ReadOnlyCollection<>(new List<>(com.aspose.slides.ms.System.u3.n5(var1.n5)));
         if (this.n5(var5)) {
            this.n5 = 16.0F * var4;
         }
      }

      this.l6(this.u3.k5.n5());
   }

   public r1f(y9t var1) {
      this.u3 = var1;
      this.a6 = 1;
      p1e var2 = this.u3.l6.n5(this.u3.l6.n5);
      float var3 = this.u3.l6.n5 / 96.0F;
      this.l6 = new n3y(var2.n5() + var2.u3(), var2.l6() + var2.u3() * 0.2F);
      this.n5 = var2.u3() * 0.846F;
      if (this.u3.l6.l6() || !this.u3.k5.n5()) {
         ReadOnlyCollection var4 = new ReadOnlyCollection<>(new List<>(com.aspose.slides.ms.System.u3.n5(var1.n5)));
         if (this.n5(var4)) {
            this.n5 = 16.0F * var3;
         }
      }

      this.l6(this.u3.k5.n5());
   }

   private boolean n5(ReadOnlyCollection<e8s> var1) {
      IGenericEnumerator var2 = var1.iterator();

      try {
         while (var2.hasNext()) {
            e8s var3 = (e8s)var2.next();
            if (this.n5(var3.h0)) {
               return true;
            }

            if (com.aspose.slides.internal.v6g.k5.l6(var3, l4i.class)) {
               return true;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return false;
   }

   public void n5(d2k var1, boolean var2, float var3) {
      this.u3.n5(var1.u3(), this.a6, this.l6.l6(), this.n5);
      y1m var4 = this.u3.l6().n5();
      i6 var5 = new i6(var4.l6.n5, var4.l6.l6);
      b8 var6 = new b8();
      var6.l6 = var4.n5;
      var6.k5 = var5.n5;
      var6.u3 = var5.l6;
      this.n5(var6);
   }

   public void n5(e3 var1) {
      com.aspose.slides.internal.o9b.u3 var2 = this.u3.l6.l6.invoke(null);
      v1l var3 = new v1l();
      var3.l6 = var2;
      var3.n5 = var1;
      d2k var4 = this.n5().u3();
      this.u3.n5(var3.n5(), var4.u3());
   }
}
