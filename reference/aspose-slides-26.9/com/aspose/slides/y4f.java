package com.aspose.slides;

abstract class y4f extends a1v {
   protected com.aspose.slides.internal.x4g.s7 a6;
   private com.aspose.slides.internal.o9b.w1 h0 = new com.aspose.slides.internal.o9b.w1();
   private float c8;
   private boolean t2;
   private boolean s7;
   protected com.aspose.slides.internal.o9b.y1 u9 = new com.aspose.slides.internal.o9b.y1();

   protected y4f(j5m var1, boolean var2) {
      this(var1);
      this.a6 = var1.u3;
      if (var2) {
         IShapeFrame var3 = var1.l6;
         if (!com.aspose.slides.ms.System.n1.k5(var3.getRotation())) {
            this.c8 = -var3.getRotation();
         }

         this.t2 = var3.getFlipH() == 1;
         this.s7 = var3.getFlipV() == 1;
         if (this.t2 ^ this.s7) {
            this.c8 = -this.c8;
         }
      }
   }

   protected y4f(j5m var1) {
      super(var1);
      this.c8 = 0.0F;
      this.h0 = new com.aspose.slides.internal.o9b.w1(var1.l6.getCenterX(), var1.l6.getCenterY());
      ((ShapeFrame)var1.l6).n5().a6(this.u9);
   }

   public final com.aspose.slides.internal.o9b.w1 f2() {
      return this.h0;
   }

   public final float i1() {
      return this.c8;
   }

   public final boolean e5() {
      return this.t2;
   }

   public final boolean b3() {
      return this.s7;
   }

   public final com.aspose.slides.internal.o9b.y1 o0() {
      return this.u9;
   }

   public final void k5(com.aspose.slides.internal.o9b.y1 var1) {
      var1.a6(this.u9);
   }

   public final void z7() {
      if (this.u9.s7() == 0.0F) {
         this.u9.l6(1.0F);
      }

      if (this.u9.k5() == 0.0F) {
         this.u9.n5(1.0F);
      }
   }
}
