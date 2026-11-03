package com.aspose.slides.internal.g9;

import com.aspose.slides.ms.System.q1;

public class t9 extends a6 {
   private com.aspose.slides.internal.v2.n5 n5;
   private com.aspose.slides.internal.v2.k5 l6;
   private u3 k5;

   public static String n5() {
      return "Lab";
   }

   @Override
   public u3 k5() {
      if (this.k5 == null) {
         this.k5 = new u3(new float[]{0.0F, q1.n5(0.0F, this.l6().n5()), q1.n5(0.0F, this.u9().n5())}, this);
      }

      return this.k5;
   }

   public t9() {
      this.n5 = new com.aspose.slides.internal.v2.n5();
      this.l6 = new com.aspose.slides.internal.v2.k5();
      this.n5.n5(com.aspose.slides.internal.v2.c8.x6);
      this.n5.n5(this.l6);
   }

   public t9(com.aspose.slides.internal.v2.n5 var1) {
      this.n5 = var1;
      this.l6 = (com.aspose.slides.internal.v2.k5)this.n5.l6(1);
   }

   private com.aspose.slides.internal.v2.n5 h0() {
      com.aspose.slides.internal.v2.n5 var1 = new com.aspose.slides.internal.v2.n5();
      var1.n5(new com.aspose.slides.internal.v2.a6(-100.0F));
      var1.n5(new com.aspose.slides.internal.v2.a6(100.0F));
      var1.n5(new com.aspose.slides.internal.v2.a6(-100.0F));
      var1.n5(new com.aspose.slides.internal.v2.a6(100.0F));
      return var1;
   }

   public final com.aspose.slides.internal.e6.l6 l6() {
      com.aspose.slides.internal.v2.n5 var1 = this.l6.c8(com.aspose.slides.internal.v2.c8.p4l);
      if (var1 == null) {
         var1 = this.h0();
      }

      return new com.aspose.slides.internal.e6.l6(var1, 0);
   }

   public final com.aspose.slides.internal.e6.l6 u9() {
      com.aspose.slides.internal.v2.n5 var1 = this.l6.c8(com.aspose.slides.internal.v2.c8.p4l);
      if (var1 == null) {
         var1 = this.h0();
      }

      return new com.aspose.slides.internal.e6.l6(var1, 1);
   }

   @Override
   public String u3() {
      return n5();
   }

   @Override
   public int a6() {
      return 3;
   }

   @Override
   public float[] n5(float[] var1) {
      return var1;
   }
}
