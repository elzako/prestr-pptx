package com.aspose.slides.internal.u3t;

import com.aspose.slides.internal.b5j.n3;
import com.aspose.slides.internal.d0e.a6;
import com.aspose.slides.internal.o9b.f2;
import com.aspose.slides.internal.o9b.y1;

public final class l6 extends a6 implements com.aspose.slides.internal.d0e.n5 {
   public final int a0() {
      return com.aspose.slides.internal.a3s.n5.n5(this.l6.k5("maskUnits", "objectBoundingBox"));
   }

   public final int d2() {
      return com.aspose.slides.internal.a3s.n5.n5(this.l6.k5("maskContentUnits", "userSpaceOnUse"));
   }

   public final com.aspose.slides.internal.b3z.a6 d5() {
      return com.aspose.slides.internal.b3z.a6.n5(this.l6.u3("x"), com.aspose.slides.internal.b3z.a6.l6(-10.0F));
   }

   public final com.aspose.slides.internal.b3z.a6 s3() {
      return com.aspose.slides.internal.b3z.a6.n5(this.l6.u3("y"), com.aspose.slides.internal.b3z.a6.l6(-10.0F));
   }

   public final com.aspose.slides.internal.b3z.a6 p8() {
      return com.aspose.slides.internal.b3z.a6.n5(this.l6.u3("width"), com.aspose.slides.internal.b3z.a6.l6(120.0F));
   }

   public final com.aspose.slides.internal.b3z.a6 f2() {
      return com.aspose.slides.internal.b3z.a6.n5(this.l6.u3("height"), com.aspose.slides.internal.b3z.a6.l6(120.0F));
   }

   public l6() {
      this.u9 = "mask";
   }

   @Override
   public final y1 n5(n3 var1, f2 var2) {
      f2 var3 = var2.a6();
      if (var3.n5()) {
         return y1.n5;
      }

      float var4 = var1.n5(this.d5(), "x", this, var3.a6());
      float var5 = var1.n5(this.s3(), "y", this, var3.a6());
      float var6 = var1.n5(this.p8(), "width", this, var3.a6());
      float var7 = var1.n5(this.f2(), "height", this, var3.a6());
      return new y1(var4, var5, var6, var7);
   }
}
