package com.aspose.slides.internal.p5k;

public class a6 extends d2 {
   public a6(l6 var1) {
      super(var1);
   }

   public final void n5(com.aspose.slides.internal.w0.l6 var1) {
      this.u9().n5(1);
      switch (var1.n5()) {
         case 0:
            this.n5((com.aspose.slides.internal.w0.n3)var1);
            break;
         case 1:
            this.n5((com.aspose.slides.internal.w0.a6)var1);
            break;
         case 2:
            this.n5((com.aspose.slides.internal.w0.y4)var1);
            break;
         case 3:
            this.n5((com.aspose.slides.internal.w0.h0)var1);
            break;
         case 4:
         default:
            this.n5(new com.aspose.slides.internal.w0.n3(com.aspose.slides.internal.p1s.n5.b2));
      }
   }

   public final void l6(com.aspose.slides.internal.w0.l6 var1) {
      switch (var1.n5()) {
         case 0:
            this.n5((com.aspose.slides.internal.w0.n3)var1);
            break;
         case 1:
            this.n5((com.aspose.slides.internal.w0.a6)var1);
            break;
         case 2:
            this.n5((com.aspose.slides.internal.w0.y4)var1);
            break;
         case 3:
            this.n5((com.aspose.slides.internal.w0.h0)var1);
            break;
         case 4:
         default:
            this.n5(new com.aspose.slides.internal.w0.n3(com.aspose.slides.internal.p1s.n5.b2));
      }
   }

   private void n5(com.aspose.slides.internal.w0.n3 var1) {
      this.u9().n5(0);
      this.u9().l6(var1.l6());
   }

   private void n5(com.aspose.slides.internal.w0.h0 var1) {
      char var2 = '耀';
      this.u9().n5(16);
      com.aspose.slides.internal.w0.c8 var3 = var1.n3() != null ? var1.n3().k5() : new com.aspose.slides.internal.w0.c8();
      var3.l6(var1.a6().x8() + var1.a6().s7() / 2.0F, var1.a6().n3() + var1.a6().k5() / 2.0F, 0);
      var3.n5(var1.a6().s7() / 32768.0F, var1.a6().k5() / 32768.0F, 0);
      this.u9().n5(var3);
      t2 var4 = new t2(this.h0());
      var4.n5(var1);
   }

   private void n5(com.aspose.slides.internal.w0.y4 var1) {
      this.n5(var1.l6(), var1.n3(), var1.y4());
   }

   private void n5(com.aspose.slides.internal.w0.a6 var1) {
      byte[] var2 = com.aspose.slides.internal.s5.u9.n5(var1);
      this.n5(var2, null, 0);
   }

   private void n5(byte[] var1, com.aspose.slides.internal.w0.c8 var2, int var3) {
      if (var2 == null) {
         var2 = new com.aspose.slides.internal.w0.c8();
      }

      short var4 = this.h0().l6(var1);
      this.u9().n5((byte)(var3 == 4 ? 65 : 64) & 255);
      this.u9().l6(var4);
      this.u9().n5(var2);
   }
}
