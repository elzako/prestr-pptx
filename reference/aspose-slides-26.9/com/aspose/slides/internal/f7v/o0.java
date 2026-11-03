package com.aspose.slides.internal.f7v;

import java.io.ByteArrayInputStream;

public class o0 extends p3 {
   private int t2;
   private int s7;
   private int x8;
   private int n3;
   private int y4;
   private int e2;
   private int t9;

   public o0(com.aspose.slides.internal.c5e.l6 var1) {
      super("IHDR", var1);
   }

   @Override
   public void n5(a6 var1) {
      if (var1.n5 != 13) {
         throw new com.aspose.slides.internal.c5e.e2("Bad IDHR len " + var1.n5);
      }

      ByteArrayInputStream var2 = var1.n5();
      this.t2 = com.aspose.slides.internal.c5e.h0.l6(var2);
      this.s7 = com.aspose.slides.internal.c5e.h0.l6(var2);
      this.x8 = com.aspose.slides.internal.c5e.h0.n5(var2);
      this.n3 = com.aspose.slides.internal.c5e.h0.n5(var2);
      this.y4 = com.aspose.slides.internal.c5e.h0.n5(var2);
      this.e2 = com.aspose.slides.internal.c5e.h0.n5(var2);
      this.t9 = com.aspose.slides.internal.c5e.h0.n5(var2);
   }

   public int l6() {
      return this.t2;
   }

   public int k5() {
      return this.s7;
   }

   public int u3() {
      return this.x8;
   }

   public int a6() {
      return this.n3;
   }

   public int u9() {
      return this.y4;
   }

   public int h0() {
      return this.e2;
   }

   public int c8() {
      return this.t9;
   }
}
