package com.aspose.slides.internal.g7;

abstract class t9 implements l7 {
   private t9[] a6;
   protected byte[][] n5;
   protected byte[][] l6;
   protected int k5;
   protected byte[] u3;
   private boolean u9;
   private boolean h0;
   private t9 c8;
   private boolean t2;
   private boolean s7;
   private l7 x8;
   private r2 n3;

   public t9(t9 var1, byte[] var2) {
      this.u3 = var2;
      this.a6 = new t9[0];
      this.u9 = true;
      this.s7 = false;
      this.h0 = false;
      this.t2 = false;
      this.c8 = var1;
   }

   public final t9 a6() {
      return this.c8;
   }

   public final byte[][] u9() {
      return this.l6;
   }

   public final byte[][] h0() {
      return this.n5;
   }

   public final t9[] c8() {
      return this.a6;
   }

   public final void n5(t9[] var1) {
      this.u3();
      this.a6 = var1;
      this.n5();
   }

   public final boolean t2() {
      return this.u9;
   }

   public final void n5(boolean var1) {
      this.u9 = var1;
   }

   protected final boolean s7() {
      return this.s7;
   }

   protected final void l6(boolean var1) {
      this.s7 = var1;
   }

   public final boolean x8() {
      return this.t2;
   }

   public final void k5(boolean var1) {
      this.t2 = var1;
   }

   protected final boolean n3() {
      return this.h0;
   }

   protected final void u3(boolean var1) {
      this.h0 = var1;
   }

   public final l7 y4() {
      return this.x8;
   }

   public final void n5(l7 var1) {
      this.x8 = var1;
   }

   public final r2 e2() {
      return this.n3;
   }

   public void l6(int var1, int[] var2) {
      this.k5();
      this.t9();
      this.k5 = var1;
      int var3 = var1;
      int var4 = 0;
      int var5 = 0;
      byte[] var6 = null;
      if (!this.x8() || this.n5(var1, var2) == null) {
         do {
            this.n5(var3);
            t9 var7 = null;

            for (t9 var11 : this.c8()) {
               byte[][] var12 = new byte[][]{var6};
               int[] var13 = new int[]{var4};
               boolean var14 = var11.t2() && var11.n5(var3, var12, var13);
               var6 = var12[0];
               var4 = var13[0];
               if (var14) {
                  var7 = var11;
                  int[] var15 = new int[]{var5};
                  var7.l6(var4, var15);
                  var5 = var15[0];
                  var3 = var5;
                  break;
               }
            }

            if (var7 == null || !var7.n3()) {
               var3++;
            }
         } while (this.n5(var3, var2) == null && var3 < this.u3.length - 1);
      }

      if (var2[0] == -1 && var3 >= this.u3.length - 1) {
         var2[0] = var3;
      }

      this.z_();
      this.k5();
   }

   public void k5() {
      this.l6(false);
      m9 var1 = com.aspose.slides.internal.v6g.k5.n5(this, m9.class);
      if (var1 != null) {
         var1.k5(0);
         var1.l6(Integer.MIN_VALUE);
      }
   }

   protected boolean n5(int var1, byte[][] var2, int[] var3) {
      var2[0] = null;
      var3[0] = -1;

      for (byte[] var7 : this.u9()) {
         if (z8.n5(this.u3, var1, var7)) {
            var3[0] = var1 + var7.length;
            var2[0] = var7;
            return true;
         }
      }

      return false;
   }

   protected byte[] n5(int var1, int[] var2) {
      for (byte[] var6 : this.h0()) {
         if (this.s7()) {
            var2[0] = var1;
            return new byte[0];
         }

         if (z8.n5(this.u3, var1, var6)) {
            m9 var7 = com.aspose.slides.internal.v6g.k5.n5(this, m9.class);
            if (var7 == null || var7.u3() >= var7.n5()) {
               if (!this.n3()) {
                  var2[0] = var1 + var6.length - 1;
               } else {
                  var2[0] = var1;
               }

               return var6;
            }
         }
      }

      var2[0] = -1;
      return null;
   }

   protected void t9() {
      m9 var1 = com.aspose.slides.internal.v6g.k5.n5(this, m9.class);
      if (var1 != null) {
         x6 var2 = com.aspose.slides.internal.v6g.k5.n5(this.a6(), x6.class);
         if (var2 != null && var2.l6().size() > 0) {
            Object var3 = var2.l6().pop();
            if (com.aspose.slides.internal.v6g.k5.l6(var3, Double.class)) {
               var1.l6(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.internal.v6g.k5.u3(var3, double.class), 14));
            }
         }
      }

      if (this.e2() != null) {
         this.e2().n5(this);
      }
   }

   protected void z_() {
      if (this.y4() != null) {
         this.y4().n5(this);
      }
   }

   protected void n5(int var1) {
      m9 var2 = com.aspose.slides.internal.v6g.k5.n5(this, m9.class);
      if (var2 != null) {
         var2.k5(var2.u3() + 1);
      }
   }

   private void n5() {
      for (t9 var4 : this.a6) {
         var4.n5(this);
      }
   }

   private void u3() {
      if (this.a6 != null && this.a6.length > 0) {
         for (t9 var4 : this.a6) {
            var4.n5((l7)null);
         }
      }
   }

   @Override
   public void n5(Object var1) {
   }
}
