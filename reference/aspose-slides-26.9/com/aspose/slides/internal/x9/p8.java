package com.aspose.slides.internal.x9;

import com.aspose.slides.internal.p3.o5;
import com.aspose.slides.internal.p3.t1;

public class p8 extends l6 {
   public p8(com.aspose.slides.internal.v4.d2 var1) {
      super(var1);
   }

   @Override
   public com.aspose.slides.internal.d2.c8 l6(t1 var1) {
      this.n3 = this.d2();
      return this.n3;
   }

   private com.aspose.slides.internal.d2.c8 d2() {
      o5 var1 = this.z8().n5(this.t2.f0());
      com.aspose.slides.internal.d2.t9 var2 = null;
      int var3 = this.y1();
      if (var1 != null) {
         String var4 = var1.u9();
         var2 = new com.aspose.slides.internal.d2.t9();
         int var5 = this.n5(var4);
         var2.u3(var3);
         var2.n5(var4, 0, var3);
         var2.l6(var5);
         this.x8 = true;
      } else {
         var2 = new com.aspose.slides.internal.d2.z1(this.t2.f0(), this.s7);
         String var7 = "MMM";
         int var8 = this.n5(var7);
         var2.u3(var3);
         var2.l6(var8);
         this.x8 = false;
      }

      this.n5(var2);
      return var2;
   }
}
