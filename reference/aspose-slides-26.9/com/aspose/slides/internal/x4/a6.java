package com.aspose.slides.internal.x4;

public class a6 implements l6 {
   private int n5;
   private int l6 = 0;
   private com.aspose.slides.internal.p1s.n5 k5 = com.aspose.slides.internal.p1s.n5.b4;
   private com.aspose.slides.internal.p1s.n5 u3 = com.aspose.slides.internal.p1s.n5.b2;
   private int a6 = 0;
   private com.aspose.slides.internal.w0.l6 u9;
   private byte[] h0;
   private int c8;

   public final void n5(z1 var1) {
      this.l6 = var1.k7();
      this.k5 = var1.u9();
      this.a6 = var1.k7();
   }

   public final void l6(z1 var1) {
      this.l6 = 240;
      this.c8 = 0;
      this.h0 = var1.c8((int)var1.x8().getLength());
   }

   public final void k5(z1 var1) {
      this.l6 = 240;
      this.c8 = 0;
      int var2 = (int)(var1.x8().getLength() - var1.x8().getPosition());
      this.h0 = com.aspose.slides.internal.k4d.a6.n5(var1, var2);
   }

   public final void n5(t9 var1) {
      this.n5 = var1.m3();
      this.l6 = (int)var1.c4();
      this.k5 = var1.a6();
      this.a6 = var1.m3();
   }

   public final void l6(t9 var1) {
      int var2 = (int)var1.x8().getPosition() - 8;
      this.n5 = var1.m3();
      this.l6 = 240;
      this.c8 = 0;
      var1.m3();
      int var3 = var1.m3();
      int var4 = var1.m3();
      var1.m3();
      int var5 = var1.m3();
      var1.x8().setPosition(var2 + var3);
      this.h0 = com.aspose.slides.internal.k4d.a6.n5(var1, var4, var5);
   }

   public final com.aspose.slides.internal.w0.l6 n5(com.aspose.slides.internal.w0.c8 var1) {
      switch (this.l6) {
         case 0:
            this.u9 = new com.aspose.slides.internal.w0.n3(this.k5);
            break;
         case 1:
            return null;
         case 2:
            this.u9 = new com.aspose.slides.internal.w0.a6(this.a6, this.k5, this.u3);
         case 3:
         case 4:
         case 5:
         case 6:
         case 7:
         case 8:
         case 9:
         default:
            break;
         case 240:
            com.aspose.slides.internal.w0.y4 var2 = new com.aspose.slides.internal.w0.y4(this.h0, this.c8);
            var2.n5(var1);
            this.u9 = var2;
      }

      return this.u9;
   }

   @Override
   public final int n5() {
      return 1;
   }

   @Override
   public final int l6() {
      return this.n5;
   }

   @Override
   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final int k5() {
      return this.l6;
   }

   public final void l6(int var1) {
      this.l6 = var1;
   }

   public final void n5(com.aspose.slides.internal.p1s.n5 var1) {
      this.k5 = var1;
   }

   public final void l6(com.aspose.slides.internal.p1s.n5 var1) {
      this.u3 = var1;
   }
}
