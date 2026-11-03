package com.aspose.slides.internal.k0r;

public class v7 extends e6r implements a4 {
   private com.aspose.slides.internal.o9b.y2 n5 = new com.aspose.slides.internal.o9b.y2(0, 0, 0, 0);

   public v7() {
      super(61455, (byte)0);
   }

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      int var2 = var1.m3();
      int var3 = var1.m3();
      int var4 = var1.m3();
      int var5 = var1.m3();
      this.n5 = new com.aspose.slides.internal.o9b.y2(
         com.aspose.slides.ms.System.q1.l6(var2, var4),
         com.aspose.slides.ms.System.q1.l6(var3, var5),
         com.aspose.slides.ms.System.q1.n5(var4 - var2),
         com.aspose.slides.ms.System.q1.n5(var5 - var3)
      );
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      var1.l6(this.n5.s7());
      var1.l6(this.n5.x8());
      var1.l6(this.n5.s7() + this.n5.t2());
      var1.l6(this.n5.x8() + this.n5.l6());
   }

   @Override
   public int n5() {
      return 16;
   }

   @Override
   public final int l6() {
      return this.n5.s7();
   }

   @Override
   public final int k5() {
      return this.n5.x8();
   }

   @Override
   public final int u3() {
      return this.n5.t2();
   }

   @Override
   public final int a6() {
      return this.n5.l6();
   }

   public final com.aspose.slides.internal.o9b.y2 u9() {
      return this.n5;
   }

   public final void n5(com.aspose.slides.internal.o9b.y2 var1) {
      this.n5 = new com.aspose.slides.internal.o9b.y2(var1.a6().k5(), var1.h0().u3());
   }
}
