package com.aspose.slides.internal.v4;

import com.aspose.slides.internal.h2.f0;

public abstract class t4 extends com.aspose.slides.internal.e5.z1 implements com.aspose.slides.internal.h2.d5 {
   private com.aspose.slides.internal.h2.c8 c8;
   private com.aspose.slides.internal.h2.t2 t2;
   private com.aspose.slides.internal.h2.y4 s7;
   private com.aspose.slides.internal.h2.s7 x8;
   private com.aspose.slides.internal.o9b.c8 n3 = new com.aspose.slides.internal.o9b.c8();
   private com.aspose.slides.internal.h2.f2 y4;
   private com.aspose.slides.internal.h2.f2 e2;
   private f0 t9;

   protected t4(com.aspose.slides.internal.e5.t2 var1) {
      super(var1);
   }

   @Override
   public void n5(com.aspose.slides.internal.e5.w1 var1) {
      super.n5(var1);
      this.c8 = com.aspose.slides.internal.h2.c8.n5(var1);
      this.t2 = var1.u3();
      this.s7 = var1.c8();
      this.x8 = var1.x8();
      var1.u3(72).n5(this.q_()).n5(this.n3);
      this.y4 = var1.u3(132).y4();
      this.e2 = var1.u3(133).y4();
      this.t9 = var1.u3(144).z1();
   }

   @Override
   public final com.aspose.slides.internal.h2.c8 i1() {
      return this.c8;
   }

   public final com.aspose.slides.internal.h2.y4 y0() {
      return this.s7;
   }

   public final com.aspose.slides.internal.h2.t2 j9() {
      return this.t2;
   }

   public final com.aspose.slides.internal.h2.s7 z6() {
      return this.x8;
   }

   public final com.aspose.slides.internal.o9b.c8 e9() {
      return this.n3;
   }

   public final f0 o5() {
      return this.t9;
   }

   @Override
   public boolean n5(int var1) {
      return false;
   }
}
