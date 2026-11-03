package com.aspose.slides.internal.p0s;

import com.aspose.slides.internal.s7k.e2;
import com.aspose.slides.internal.s7k.t2;
import com.aspose.slides.internal.y5s.x8;
import com.aspose.slides.internal.z0k.t4;
import java.awt.color.ColorSpace;

public class n5 extends ColorSpace {
   private t2 n5 = new com.aspose.slides.internal.s7k.n5();
   private t2 l6;

   public n5(t4 var1, t4 var2) {
      super(9, 4);

      try {
         this.n5.n5(var1);
      } catch (e2 var7) {
         this.n5.n5(x8.n5().n5());
      }

      try {
         this.n5.n5(var2);
      } catch (e2 var6) {
         this.n5.n5(x8.l6().n5());
      }

      this.l6 = new com.aspose.slides.internal.s7k.n5();

      try {
         this.l6.n5(var2);
      } catch (e2 var5) {
         this.l6.n5(x8.l6().n5());
      }

      try {
         this.l6.n5(var1);
      } catch (e2 var4) {
         this.l6.n5(x8.n5().n5());
      }
   }

   @Override
   public float[] toRGB(float[] cmyk) {
      float[] var2 = new float[3];
      this.n5.n5(cmyk, var2);
      return var2;
   }

   @Override
   public float[] fromRGB(float[] rgb) {
      float[] var2 = new float[4];
      this.l6.n5(rgb, var2);
      return var2;
   }

   @Override
   public float[] toCIEXYZ(float[] colorvalue) {
      return ColorSpace.getInstance(1000).toCIEXYZ(this.toRGB(colorvalue));
   }

   @Override
   public float[] fromCIEXYZ(float[] colorvalue) {
      return ColorSpace.getInstance(1000).fromCIEXYZ(colorvalue);
   }
}
