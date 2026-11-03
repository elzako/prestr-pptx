package com.aspose.slides.internal.f6;

import com.aspose.slides.internal.e1.s3;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.internal.z0k.e2;
import com.aspose.slides.internal.z4.j5;
import com.aspose.slides.internal.z4.t4;
import com.aspose.slides.ms.System.d1;

public class a6 extends l6 {
   private final boolean k5;
   private final String u3;
   private final com.aspose.slides.internal.p1s.l6 a6;
   private final com.aspose.slides.internal.p1s.n5 u9;
   private final int h0;
   private final String c8;
   private u9 t2;
   private static final char[] s7 = new char[]{'\n', '\r'};

   public a6(j5 var1, s3 var2) {
      super(var1, var2);
      this.k5 = var2.n5();
      this.u3 = var2.k5();
      this.a6 = var2.s7();
      this.u9 = var2.n3();
      this.h0 = var2.l6();
      this.c8 = var2.a6();
      this.t9();
   }

   @Override
   protected int n5() {
      return 1;
   }

   @Override
   protected int l6() {
      int var1 = 0;
      var1 |= (this.k5 ? 1 : 0) << 25;
      return var1 | super.l6();
   }

   @Override
   protected void l6(t4 var1) {
      if (this.h0 != 0) {
         var1.n5("/MaxLen", this.h0);
      }

      if (this.k5) {
         if (this.u3.length() != 0) {
            var1.u3("/RV", this.u3);
            var1.u3("/DS", "font: 12pt Arial");
         }
      } else {
         var1.n5("/DA", this.n5(this.a6, this.u9), false);
         if (this.u3.length() != 0) {
            var1.u3("/DV", this.u3);
         }
      }

      var1.u3("/V", this.u9());
      var1.n5("/AP");
      var1.c8();
      var1.l6("/N");
      var1.n5(this.t2.t2());
      var1.t2();
   }

   @Override
   protected void k5(t4 var1) {
      this.t2.n5(var1);
   }

   private void t9() {
      this.t2 = new u9(this.l6);
      this.t2.n5(new y1(0.0F, 0.0F, this.u3().s7(), this.u3().k5()));
      this.t2.n5(this.z1());
   }

   private e2 z1() {
      e2 var1 = new e2();
      com.aspose.slides.internal.z4.s3 var2 = new com.aspose.slides.internal.z4.s3(var1);
      n5(var2);
      n5(var2, this.u9);
      com.aspose.slides.internal.c0.l6 var3 = this.n5(var2, this.a6);
      n5(var2, this.u3().k5() - this.a6.c8() - 1.0F);
      float var4 = 0.0F;
      String[] var5 = d1.u9(this.c8, s7);

      for (int var6 = 0; var6 < var5.length && !(var4 > this.u3().k5()); var6++) {
         if (com.aspose.slides.internal.n2d.t4.l6(var5[var6])) {
            n5(var2, 0.0F, var4);
            n5(var2, var5[var6], (com.aspose.slides.internal.c0.l6)var3);
         }

         var4 -= this.a6.c8();
      }

      l6(var2);
      return var1;
   }

   public final String u9() {
      return this.k5 ? this.c8 : this.u3;
   }
}
