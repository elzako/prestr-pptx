package com.aspose.slides.internal.v4;

import com.aspose.slides.exceptions.IOException;
import com.aspose.slides.ms.System.d1;

public class s7 extends n5 {
   private String u9;
   private String h0;
   private int c8;
   private int t2;
   private com.aspose.slides.internal.f2.k5 s7;

   public s7(com.aspose.slides.internal.e5.t2 var1) {
      super(var1);
   }

   @Override
   public void n5(com.aspose.slides.internal.e5.w1 var1) {
      super.n5(var1);
      this.u9 = var1.a6(232).j_();
      this.h0 = com.aspose.slides.internal.f2.s7.n5(this.u9);
      com.aspose.slides.internal.y1.u3 var2 = this.q_();
      com.aspose.slides.internal.r4.s7 var3 = var2.a6().h0();
      com.aspose.slides.internal.r4.t2 var4 = null;

      try {
         var4 = var3.n5(this.h0, var2.n3());
      } catch (IOException var6) {
         com.aspose.slides.ms.System.t4.n5().l6(d1.n5(new String[]{"Error: can't load image ", this.h0}));
      }

      if (var4 != null) {
         this.c8 = var4.k5().u3();
         this.t2 = var4.k5().a6();
         int var5 = var4.k5().n5();
         if (var5 != 0) {
            this.s7 = com.aspose.slides.internal.h2.j5.n5((double)(-var5));
         }
      }
   }

   @Override
   public void u9() {
      super.u9();
      this.n_().n5(this);
   }

   @Override
   public void n5(com.aspose.slides.internal.w2.u9 var1, String var2, String var3) {
      if (d1.a6("http://www.w3.org/1999/XSL/Format", var2)) {
         this.k5(var1, var2, var3);
      }
   }

   public final String f0() {
      return this.u9;
   }

   @Override
   public String z1() {
      return "external-graphic";
   }

   @Override
   public int z3() {
      return 14;
   }

   @Override
   public int a5() {
      return this.c8;
   }

   @Override
   public int h2() {
      return this.t2;
   }

   @Override
   public com.aspose.slides.internal.f2.k5 v0() {
      return this.s7;
   }
}
