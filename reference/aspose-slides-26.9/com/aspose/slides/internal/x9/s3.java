package com.aspose.slides.internal.x9;

import com.aspose.slides.internal.p3.o5;
import com.aspose.slides.internal.p3.t1;

public class s3 extends l6 {
   public s3(com.aspose.slides.internal.v4.d5 var1) {
      super(var1);
      this.t2 = var1;
   }

   @Override
   public com.aspose.slides.internal.d2.c8 l6(t1 var1) {
      this.n3 = this.u3(this.u3);
      return this.n3;
   }

   private com.aspose.slides.internal.d2.c8 u3(com.aspose.slides.internal.p3.y2 var1) {
      com.aspose.slides.internal.d2.t9 var2 = null;
      int var3 = this.y1();
      if (!this.z8().u3(this.t2.f0())) {
         var2 = new com.aspose.slides.internal.d2.z1(this.t2.f0(), this.s7, false);
         this.z8().n5(this.t2.f0(), (com.aspose.slides.internal.a0.m1)var2);
         String var4 = "MMM";
         int var5 = this.n5(var4);
         var2.u3(var3);
         var2.l6(var5);
         this.x8 = false;
      } else {
         o5 var8 = this.z8().l6(this.t2.f0());
         String var9 = var8.u9();
         var2 = new com.aspose.slides.internal.d2.t9();
         int var6 = this.n5(var9);
         var2.u3(var3);
         var2.n5(var9, 0, var3);
         var2.l6(var6);
         this.x8 = true;
      }

      this.n5(var2);
      return var2;
   }
}
