package com.aspose.slides.internal.f1s;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.z4.t4;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.q1;

public class c8 extends s7 {
   private final com.aspose.slides.internal.w0.h0 u3;
   private final u3 a6;

   public c8(com.aspose.slides.internal.z4.c8 var1, com.aspose.slides.internal.w0.h0 var2) {
      super(var1);
      if (null == var2) {
         throw new ArgumentNullException("brush");
      }

      this.u3 = var2;
      this.a6 = this.z1();
   }

   @Override
   public void n5(t4 var1) {
      var1.n5(this);
      var1.c8();
      this.l6(var1);
      var1.t2();
      var1.l6();
      this.a6.n5(var1);
   }

   @Override
   public void l6(t4 var1) {
      super.l6(var1);
      var1.n5("/Shading");
      var1.c8();
      var1.n5("/ShadingType", 2);
      var1.k5("/ColorSpace", d1.n5(new String[]{"/", com.aspose.slides.internal.f1s.l6.l6().a6()}));
      w1[] var2 = y4.n5(this.u3);
      var1.n5("/Coords", new float[]{var2[0].l6(), var2[0].k5(), var2[1].l6(), var2[1].k5()});
      var1.n5("/Extend", new boolean[]{true, true});
      var1.k5("/Function", this.a6.t2());
      var1.t2();
      this.k5(var1);
   }

   @Override
   protected int n5() {
      return 2;
   }

   @Override
   protected com.aspose.slides.internal.w0.c8 l6() {
      return this.u3.n3();
   }

   private u3 z1() {
      e2 var1 = new e2(this.l6, new float[]{0.0F, 1.0F});
      com.aspose.slides.internal.w0.u9[] var2 = this.u3.l6();

      for (int var3 = 0; var3 < var2.length - 1; var3++) {
         com.aspose.slides.internal.w0.u9 var4 = var2[var3];
         com.aspose.slides.internal.w0.u9 var5 = var2[var3 + 1];
         if (!(q1.n5(var4.l6() - var5.l6()) < Float.MIN_VALUE)) {
            float[] var6 = this.n5(var4.n5());
            float[] var7 = this.n5(var5.n5());
            var1.z3().addItem(new n5(this.l6, new float[]{0.0F, 1.0F}, null, var6, var7, 1));
            if (var3 < var2.length - 2) {
               var1.m1().addItem(var5.l6());
            }
         }
      }

      int var8 = var1.z3().size();
      float[] var9 = new float[var8 * 2];

      for (int var10 = 0; var10 < var8; var10++) {
         var9[var10 * 2] = 0.0F;
         var9[var10 * 2 + 1] = 1.0F;
      }

      var1.l6(var9);
      return var1;
   }

   private float[] n5(com.aspose.slides.internal.p1s.n5 var1) {
      return new float[]{var1.k5() / 255.0F, var1.u3() / 255.0F, var1.a6() / 255.0F};
   }
}
