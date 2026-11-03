package com.aspose.slides.internal.e1;

import com.aspose.slides.ms.System.d1;

public class s3 extends t9 {
   private String n5;
   private String l6;
   private com.aspose.slides.internal.o9b.f2 k5;
   private boolean u3;
   private int a6;
   private com.aspose.slides.internal.p1s.n5 u9;
   private com.aspose.slides.internal.p1s.l6 h0;
   private static final com.aspose.slides.internal.p1s.l6 c8 = com.aspose.slides.internal.e1x.x8.u3().n5("Times New Roman", 12.0F, 0);
   private boolean t2;
   private float s7;

   public s3(com.aspose.slides.internal.o9b.w1 var1, String var2, com.aspose.slides.internal.o9b.f2 var3, boolean var4) {
      super(new com.aspose.slides.internal.o9b.w1(var1.l6() - 1.75F, var1.k5()), var2);
      this.n5 = d1.n5;
      this.l6 = d1.n5;
      this.k5 = com.aspose.slides.internal.o9b.f2.n5.a6();
      this.a6 = 0;
      this.u9 = com.aspose.slides.internal.p1s.n5.c8;
      this.h0 = c8;
      this.t2 = false;
      this.s7 = 0.0F;
      this.k5 = new com.aspose.slides.internal.o9b.f2(var3.l6() + 3.5F, var3.k5());
      this.u3 = var4;
   }

   public s3() {
      this.n5 = d1.n5;
      this.l6 = d1.n5;
      this.k5 = com.aspose.slides.internal.o9b.f2.n5.a6();
      this.a6 = 0;
      this.u9 = com.aspose.slides.internal.p1s.n5.c8;
      this.h0 = c8;
      this.t2 = false;
      this.s7 = 0.0F;
   }

   public final boolean n5() {
      return this.u3;
   }

   public final int l6() {
      return this.a6;
   }

   public final String k5() {
      return this.n5;
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }

   public final String a6() {
      return this.u3 ? this.l6 : this.n5;
   }

   public final com.aspose.slides.internal.p1s.l6 s7() {
      return this.h0;
   }

   public final void n5(com.aspose.slides.internal.p1s.l6 var1) {
      this.h0 = var1;
   }

   public final com.aspose.slides.internal.o9b.f2 x8() {
      return this.k5;
   }

   public final void n5(com.aspose.slides.internal.o9b.f2 var1) {
      var1.l6(this.k5);
   }

   public final com.aspose.slides.internal.p1s.n5 n3() {
      return this.u9;
   }

   @Override
   public com.aspose.slides.internal.o9b.y1 u3() {
      return new com.aspose.slides.internal.o9b.y1(this.u9().u3(), this.x8().a6());
   }

   public final float y4() {
      return this.s7;
   }

   public final boolean e2() {
      return this.t2;
   }
}
