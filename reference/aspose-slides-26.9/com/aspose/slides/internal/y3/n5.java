package com.aspose.slides.internal.y3;

import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.ms.System.q1;

public class n5 {
   private y2 n5;
   private y2 l6;
   private int k5;
   private int u3;
   private int a6;
   private int u9;
   private long h0;

   public n5() {
      this.n5 = y2.n5.n3();
      this.l6 = y2.n5.n3();
   }

   public final void n5(com.aspose.slides.internal.z0k.n5 var1) {
      var1.c4();
      long var2 = var1.c4();
      int var4 = var1.m3();
      int var5 = var1.m3();
      int var6 = var1.m3();
      int var7 = var1.m3();
      y2.n5(var4, var5, var6, var7).u3(this.n5);
      var4 = var1.m3();
      var5 = var1.m3();
      var6 = var1.m3();
      var7 = var1.m3();
      y2.n5(var4, var5, var6, var7).u3(this.l6);
      var1.c4();
      var1.c4();
      var1.c4();
      this.h0 = var1.c4();
      var1.r4();
      var1.r4();
      var1.c4();
      var1.c4();
      var1.c4();
      this.k5 = var1.m3();
      this.u3 = var1.m3();
      this.a6 = var1.m3();
      this.u9 = var1.m3();
      var1.x8().setPosition(var2 & 4294967295L);
   }

   public final y1 n5() {
      return new y1(
         this.n5(this.l6.s7(), this.k5, this.a6),
         this.n5(this.l6.x8(), this.u3, this.u9),
         this.n5(this.l6.t2(), this.k5, this.a6),
         this.n5(this.l6.l6(), this.u3, this.u9)
      );
   }

   private int n5(float var1, int var2, int var3) {
      return com.aspose.slides.internal.v6g.k5.u3(q1.u3(var1 * var2 / (var3 * 100.0F)), 14);
   }

   public final float l6() {
      return (float)(this.k5 / (this.a6 / 25.4));
   }

   public final float k5() {
      return (float)(this.u3 / (this.u9 / 25.4));
   }
}
