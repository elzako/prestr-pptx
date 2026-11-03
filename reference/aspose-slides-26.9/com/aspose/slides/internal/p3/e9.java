package com.aspose.slides.internal.p3;

import com.aspose.slides.exceptions.InvalidOperationException;

public class e9 extends a6 {
   private z6 t9;

   public e9(com.aspose.slides.internal.a0.a6 var1, com.aspose.slides.internal.t1.t2 var2) {
      super(var1, var2);
      this.t9 = new z6(var1, var2);
   }

   public final z6 d5() {
      return this.t9;
   }

   public final com.aspose.slides.internal.t1.t2 s3() {
      return (com.aspose.slides.internal.t1.t2)this.x8;
   }

   @Override
   public e9 z8() {
      return this;
   }

   public void p8() {
      this.t4();
      if (this.t2.u9()) {
         com.aspose.slides.internal.d5.k5.n5(this.s3());
      }

      com.aspose.slides.internal.a0.k7 var1 = null;
      if (this.s3().z7() != null) {
         try {
            com.aspose.slides.internal.x9.y4 var2 = this.y1().n5(this, this.s3().z7());
            var1 = (com.aspose.slides.internal.a0.k7)var2.n5((com.aspose.slides.internal.a0.l6)null);
         } catch (InvalidOperationException var6) {
         }
      }

      com.aspose.slides.internal.a0.u9 var7 = this.t2.k5();
      com.aspose.slides.internal.a0.c4 var3 = new com.aspose.slides.internal.a0.c4(var1);
      this.k5(var3);
      var3.n5(this.s3().f0());
      var3.l6(this.s3().v0());
      var7.n5(var3);
      this.n3 = this.u3(false);
      y0 var4 = new y0(this);
      int var5 = this.w1().s7().c4();
      var4.l6(var5);
      this.d2();
   }

   @Override
   public void v_() {
      if (this.x8.a0()) {
         this.s7.l6(this.x8.y1());
      }

      this.x8.e2().n5(this.y4, this.y4 - this.e2 + 1);
      this.t2.n5(this.x8, this.y4 - this.e2 + 1);
      this.s3().a3();
      String var1 = this.s3().h2();
      com.aspose.slides.internal.t1.s7 var2 = this.x8.e2().b3().u9(var1);
      if (var2 != null) {
         var2.e5();
      }
   }

   @Override
   protected x9 n5(int var1, boolean var2) {
      return this.t9.n5(var2, var1, 0);
   }

   @Override
   public x9 u3(boolean var1) {
      x9 var2 = super.u3(var1);
      if (!var1) {
         while (!com.aspose.slides.ms.System.d1.a6(this.s3().v4().i1(), var2.n5().h0(58).b3())) {
            var2 = super.u3(var1);
         }
      }

      return var2;
   }

   private void u3(int var1) {
      com.aspose.slides.internal.t1.m3 var2 = (com.aspose.slides.internal.t1.m3)this.n3.n5().h0(var1);
      if (var2 != null) {
         com.aspose.slides.internal.t1.w1 var3 = this.s3().a6(var2.b3());
         if (var3 != null) {
            f5 var4 = this.y1().n5(this, var3, var2);
            var4.y1();
         }
      }
   }

   @Override
   protected void d2() {
      this.u3(57);
      this.u3(56);
      this.u3(61);
      this.u3(59);
      super.d2();
   }

   public final int k5(int var1) {
      int var2 = var1;
      if (var1 % 2 == 0 || this.s3().b3() != 43 && this.s3().b3() != 40) {
         if (var1 % 2 == 0 && (this.s3().b3() == 99 || this.s3().b3() == 41)) {
            var2++;
         }
      } else {
         var2++;
      }

      return var2;
   }
}
