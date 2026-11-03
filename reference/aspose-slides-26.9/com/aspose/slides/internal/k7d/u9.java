package com.aspose.slides.internal.k7d;

import com.aspose.slides.internal.b5j.n3;
import com.aspose.slides.internal.o9b.f2;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.ms.System.d1;

public final class u9 extends com.aspose.slides.internal.d0e.a6 implements com.aspose.slides.internal.d0e.n5 {
   private static final com.aspose.slides.internal.v6g.u9 c8 = new com.aspose.slides.internal.v6g.u9(
      "feBlend",
      "feColorMatrix",
      "feComponentTransfer",
      "feComposite",
      "feConvolveMatrix",
      "feDiffuseLighting",
      "feDisplacementMap",
      "feFlood",
      "feGaussianBlur",
      "feImage",
      "feMerge",
      "feMergeNode",
      "feMorphology",
      "feOffset",
      "feSpecularLighting",
      "feTile",
      "feTurbulence",
      "feDistantLight",
      "fePointLight",
      "feSpotLight"
   );

   public u9() {
      this.u9 = "filter";
   }

   public final int a0() {
      return com.aspose.slides.internal.a3s.n5.n5(this.l6.k5("filterUnits", "objectBoundingBox"));
   }

   public final com.aspose.slides.internal.b3z.a6 d2() {
      return com.aspose.slides.internal.b3z.a6.n5(this.l6.u3("x"), com.aspose.slides.internal.b3z.a6.l6(-10.0F));
   }

   public final com.aspose.slides.internal.b3z.a6 d5() {
      return com.aspose.slides.internal.b3z.a6.n5(this.l6.u3("y"), com.aspose.slides.internal.b3z.a6.l6(-10.0F));
   }

   public final com.aspose.slides.internal.b3z.a6 s3() {
      return com.aspose.slides.internal.b3z.a6.n5(this.l6.u3("width"), com.aspose.slides.internal.b3z.a6.l6(120.0F));
   }

   public final com.aspose.slides.internal.b3z.a6 p8() {
      return com.aspose.slides.internal.b3z.a6.n5(this.l6.u3("height"), com.aspose.slides.internal.b3z.a6.l6(120.0F));
   }

   @Override
   public final y1 n5(n3 var1, f2 var2) {
      f2 var3 = var2.a6();
      if (var3.n5()) {
         return y1.n5;
      }

      float var4 = var1.n5(this.d2(), "x", this, var3.a6());
      float var5 = var1.n5(this.d5(), "y", this, var3.a6());
      float var6 = var1.n5(this.s3(), "width", this, var3.a6());
      float var7 = var1.n5(this.p8(), "height", this, var3.a6());
      return new y1(var4, var5, var6, var7);
   }

   public static boolean s7(String var0) {
      if (d1.n5(var0)) {
         return false;
      }

      switch (c8.n5(var0)) {
         case 0:
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
         case 6:
         case 7:
         case 8:
         case 9:
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
         case 16:
         case 17:
         case 18:
         case 19:
            return true;
         default:
            return false;
      }
   }
}
