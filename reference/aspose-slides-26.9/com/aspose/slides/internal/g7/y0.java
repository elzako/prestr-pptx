package com.aspose.slides.internal.g7;

public class y0 extends b4 {
   private v0 k5;
   private long u3;
   private Object a6 = new Object();

   public y0(v0 var1) {
      this.k5 = var1;
   }

   @Override
   public double n5() {
      return this.l6().l6();
   }

   @Override
   public z9 l6() {
      return this.k5.k5().n5().t4;
   }

   @Override
   public v2 k5() {
      return this.k5.k5().n5().e2 != null ? this.k5.k5().n5().e2 : a3.t9;
   }

   public final v2 n5(r9 var1) {
      int var2;
      if (com.aspose.slides.internal.v6g.k5.l6(var1, k2.class)) {
         var2 = ((k2)var1).n5();
      } else {
         var2 = this.k5.l6(((k3)var1).n5());
      }

      y8 var3 = this.k5.k5();
      if (this.k5.l6() != null && this.k5.l6().length != 0) {
         byte var4 = this.k5.n5().l6().n5(var2);
         if ((var4 & 255) < this.k5.l6().length) {
            var3 = this.k5.l6()[var4 & 0xFF];
         }
      }

      if (var3 != this.k5.k5() && var3.n5().e2 != null) {
         return this.k5.k5().n5().e2 != null ? var3.n5().e2.n5(this.k5.k5().n5().e2) : var3.n5().e2;
      } else {
         return this.k5.k5().n5().e2 != null ? this.k5.k5().n5().e2 : a3.t9;
      }
   }

   @Override
   public long u3() {
      if (this.u3 == 0L) {
         synchronized (this.a6) {
            if (this.u3 == 0L) {
               this.u3 = com.aspose.slides.internal.v6g.k5.a6(1.0 / this.k5().n5(), 14);
            }
         }
      }

      return this.u3;
   }

   @Override
   public double l6(r9 var1) {
      double var2 = super.l6(var1);
      if (var2 == 0.0) {
         k6 var4 = this.k5.n5(var1);
         if (var4 != null) {
            return var4.t2();
         }
      }

      return var2;
   }

   @Override
   public int k5(r9 var1) {
      k2 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, k2.class);
      return var2 != null ? com.aspose.slides.ms.System.a3.n5(var2.n5()) : var1.hashCode();
   }
}
