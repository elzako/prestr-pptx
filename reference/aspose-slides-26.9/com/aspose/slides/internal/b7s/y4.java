package com.aspose.slides.internal.b7s;

public class y4 implements com.aspose.slides.internal.b8u.q0 {
   private com.aspose.slides.internal.r1x.d2 n5;
   private com.aspose.slides.internal.l3e.l6 l6;
   private int k5;
   private com.aspose.slides.internal.o9b.j5 u3 = new com.aspose.slides.internal.o9b.j5();
   private com.aspose.slides.internal.r1x.m1 a6;

   public y4(com.aspose.slides.internal.l3e.n5 var1, com.aspose.slides.internal.r1x.d2 var2) {
      this.n5(var1, var2);
   }

   public y4(com.aspose.slides.internal.l3e.u3 var1, com.aspose.slides.internal.r1x.d2 var2) {
      this.n5(var1, var2);
   }

   public y4(com.aspose.slides.internal.l3e.u9 var1, com.aspose.slides.internal.r1x.d2 var2) {
      this.n5(var1, var2);
   }

   public final void n5(com.aspose.slides.internal.o9b.j5 var1) {
      this.u3 = var1.k5();
   }

   public final com.aspose.slides.internal.r1x.m1 n5() {
      return this.a6;
   }

   public final void n5(com.aspose.slides.internal.r1x.m1 var1) {
      this.a6 = var1;
   }

   @Override
   public final boolean a0() {
      int var1 = this.l6.t2();
      return var1 != 5;
   }

   public final int l6() {
      return this.k5;
   }

   public final t9 k5() {
      return this.l6.c8();
   }

   @Override
   public void l6(com.aspose.slides.internal.o9b.y2 var1, com.aspose.slides.internal.b8u.x8 var2) {
      l6 var3 = new l6(var2);
      com.aspose.slides.internal.r1x.z6 var4 = new com.aspose.slides.internal.r1x.z6();
      var4.n5(com.aspose.slides.internal.r1x.v4.u3());
      var4.k5(var1.t2() * 3);
      this.n5(var1.n3(), var4, var3);
   }

   @Override
   public void n5(com.aspose.slides.internal.o9b.y2 var1, com.aspose.slides.internal.r1x.z6 var2, com.aspose.slides.internal.b8u.t9 var3) {
      com.aspose.slides.internal.r1x.m1 var4 = this.n5();
      if (this.k5 == 2) {
         z3 var5 = new z3((com.aspose.slides.internal.l3e.u3)this.l6, var3, var2, var4, this.n5);
         com.aspose.slides.internal.r1x.o0.n5(var1.n3(), var5);
      } else if (this.k5 == 3) {
         s3 var6 = new s3((com.aspose.slides.internal.l3e.u9)this.l6, var3, var2, var4, this.n5);
         com.aspose.slides.internal.r1x.o0.n5(var1.n3(), var6);
      } else {
         a5 var7 = new a5((com.aspose.slides.internal.l3e.n5)this.l6, var3, var2, var4, this.n5);
         var7.n5(var1.n3());
      }
   }

   private void n5(com.aspose.slides.internal.l3e.l6 var1, com.aspose.slides.internal.r1x.d2 var2) {
      this.l6 = var1;
      this.n5 = var2;
      if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.l3e.u3.class)) {
         this.k5 = 2;
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.l3e.u9.class)) {
         this.k5 = 3;
      } else {
         this.k5 = 0;
      }
   }
}
