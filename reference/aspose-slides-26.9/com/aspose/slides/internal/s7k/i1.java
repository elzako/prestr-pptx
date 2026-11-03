package com.aspose.slides.internal.s7k;

class i1 extends d5 {
   private z1 n5;
   private s7[] l6;
   private s7[] k5;
   private s7[] u3;

   public i1(k7 var1) {
      this.n5 = com.aspose.slides.internal.v6g.k5.n5(var1, z1.class);
      this.l6 = null;
      this.k5 = null;
      this.u3 = null;
   }

   @Override
   public void n5() {
      super.n5();
      if (this.n5 == null) {
         throw new n3();
      }

      this.l6 = n5(this.n5.u9());
      this.k5 = n5(this.n5.c8());
      this.u3 = n5(this.n5.h0());
      if (this.n5.t2() != null) {
         this.n5.t2().n5();
      }
   }

   private static s7[] n5(s7[] var0) {
      if (var0 != null) {
         for (s7 var4 : var0) {
            var4.n5();
         }

         for (s7 var8 : var0) {
            if (!var8.l6()) {
               return var0;
            }
         }
      }

      return null;
   }

   @Override
   public void n5(float[] var1) {
      this.l6(var1);
      if (this.n5.u3()) {
         n5(var1, this.k5);
         if (com.aspose.slides.internal.v6g.k5.u3(this.n5.a6(), 6) == 3) {
            n5(var1, this.n5.s7());
            n5(var1, this.u3);
         }

         n5(var1, this.n5.t2());
         n5(var1, this.l6);
      } else {
         n5(var1, this.l6);
         n5(var1, this.n5.t2());
         n5(var1, this.u3);
         n5(var1, this.n5.s7());
         n5(var1, this.k5);
      }

      this.k5(var1);
   }

   @Override
   public boolean u9() {
      return this.n5.x8();
   }

   private static void n5(float[] var0, s7[] var1) {
      if (var1 != null) {
         for (int var2 = 0; var2 < var1.length; var2++) {
            var0[var2] = var1[var2].n5(var0[var2]);
         }
      }
   }

   private static void n5(float[] var0, t9 var1) {
      if (var1 != null) {
         var1.n5(var0);
      }
   }

   private static void n5(float[] var0, u9 var1) {
      if (var1 != null) {
         var1.n5(var0);
      }
   }
}
