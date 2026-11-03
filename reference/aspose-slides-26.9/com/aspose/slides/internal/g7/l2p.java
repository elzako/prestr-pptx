package com.aspose.slides.internal.g7;

public class l2p extends b4 {
   private d7u k5;
   private z9 u3;
   private v2 a6;
   private Object u9 = new Object();
   private Object h0 = new Object();
   @Deprecated
   private n3c c8;

   public l2p(d7u var1) {
      this.k5 = var1;
      if (var1 != null && var1.c8() != null) {
         n3c[] var2 = var1.c8().n5(3, 1);
         if (var2 != null && var2.length > 0) {
            this.c8 = var2[0];
         }
      }
   }

   @Override
   public double l6(r9 var1) {
      k2 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, k2.class);
      if (var2 == null) {
         return super.l6(var1);
      }

      double var3 = 0.0;
      if (this.k5.s7() != null && this.k5.s7().n5().n5() == 1) {
         var3 = this.k5.s7().n5().n5(0).n5() & 65535;
      } else if (this.k5.s7() != null && var2.n5() <= this.k5.s7().n5().n5() - 1) {
         var3 = this.k5.s7().n5().n5(var2.n5()).n5() & 65535;
      } else if (this.k5.t2() != null) {
         var3 = this.k5.t2().l6() & 65535;
      }

      return var3;
   }

   @Override
   public double n5() {
      return this.k5.t2() != null ? this.k5.t2().u3() : 0.0;
   }

   @Override
   public z9 l6() {
      if (this.u3 == null) {
         synchronized (this.u9) {
            if (this.u3 == null) {
               if (this.k5.k5() != null) {
                  this.u3 = new z9(this.k5.k5().k5(), this.k5.k5().u3(), this.k5.k5().a6(), this.k5.k5().u9());
               } else {
                  this.u3 = new z9(0.0, 0.0, 0.0, 0.0);
               }
            }
         }
      }

      return this.u3;
   }

   @Override
   public v2 k5() {
      if (this.a6 == null) {
         synchronized (this.h0) {
            if (this.a6 == null) {
               this.a6 = new v2(new double[]{1.0 / (this.u3() & 4294967295L), 0.0, 0.0, 1.0 / (this.u3() & 4294967295L), 0.0, 0.0});
            }
         }
      }

      return this.a6;
   }

   @Override
   public double n5(r9 var1, r9 var2) {
      if (this.l6.size() > 0) {
         return super.n5(var1, var2);
      } else {
         return this.k5.n3() != null && this.k5.n3().n5().l6.size() > 0 ? this.k5.n3().n5().n5(var1, var2) : 0.0;
      }
   }

   @Override
   public long u3() {
      return this.k5.k5() == null ? 1000L : this.k5.k5().l6();
   }

   @Override
   public int k5(r9 var1) {
      k2 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, k2.class);
      return var2 != null ? com.aspose.slides.ms.System.a3.n5(var2.n5()) : var1.hashCode();
   }
}
