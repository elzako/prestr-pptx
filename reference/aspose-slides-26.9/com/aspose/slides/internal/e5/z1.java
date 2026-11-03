package com.aspose.slides.internal.e5;

public abstract class z1 extends t9 {
   private x8 c8 = null;
   protected t2 u9;
   public x8 h0 = null;

   protected z1(t2 var1) {
      super(var1);
   }

   @Override
   public void l6(char[] var1, int var2, int var3, w1 var4, com.aspose.slides.internal.w2.u9 var5) {
      if (this.c8 == null) {
         this.c8 = new x8(this);
         this.c8.n5(var5);
         if (!this.p_()) {
            this.c8.n5(var4);
         }
      }

      this.c8.l6(var1, var2, var3, null, null);
   }

   @Override
   public void c8() {
      super.c8();
      if (!this.p_() || this.z3() == 44) {
         this.b3();
      }
   }

   protected static void n5(z1 var0, t2 var1) {
      var0.o_().k5().n5(var0, var0.u9, var1);
   }

   private void e5() {
      if (this.c8 != null) {
         x8 var1 = this.c8;
         this.c8 = null;
         if (this.z3() == 3) {
            var1.n5((com.aspose.slides.internal.v4.h0)this);
            this.h0 = var1;
         } else if (this.z3() != 44 && this.z3() != 80 && this.z3() != 7) {
            t2 var2 = this.n5;

            int var3;
            for (var3 = var2.z3(); var3 != 3 && var3 != 44 && var3 != 80 && var3 != 7 && var3 != 53; var3 = var2.z3()) {
               var2 = var2.s_();
            }

            if (var3 == 3) {
               var1.n5((com.aspose.slides.internal.v4.h0)var2);
               ((z1)var2).h0 = var1;
            } else if (var3 == 53 && var1.w1()) {
            }
         }

         this.n5(var1);
      }
   }

   private void b3() {
      if (this.u9 != null) {
         t2$n5 var1 = this.k5(this.u9);

         while (var1.l6()) {
            t2 var2 = var1.c8();
            if (var2.z3() == 10) {
               var2.u9();
            }

            var2.c8();
         }
      }

      this.u9 = null;
   }

   @Override
   public void n5(t2 var1) {
      this.e5();
      if (!this.p_()) {
         if (!com.aspose.slides.internal.v6g.k5.l6(var1, x8.class) && var1.z3() != 10) {
            n5(this, var1);
            this.b3();
         } else if (this.u9 == null) {
            this.u9 = var1;
         }
      }

      super.n5(var1);
   }

   @Override
   public void l6(t2 var1) {
      super.l6(var1);
      if (var1 == this.u9) {
         this.u9 = var1.l6 != null ? var1.l6.n5 : null;
      }
   }

   @Override
   public void r_() {
      this.e5();
      if (!this.p_() || this.z3() == 44) {
         n5(this, null);
      }
   }

   @Override
   public k5 n3() {
      return new r4(this);
   }
}
