package com.aspose.slides.internal.y4u;

public abstract class r1 extends s7 {
   protected int[] z8;

   @Override
   protected void n5() {
      this.z8 = new int[2048];

      for (int var1 = 0; var1 <= 255; var1++) {
         this.z8[var1 + 0] = n5(0.299) * var1;
         this.z8[var1 + 256] = n5(0.587) * var1;
         this.z8[var1 + 512] = n5(0.114) * var1 + 32768;
         this.z8[var1 + 768] = -n5(0.16874) * var1;
         this.z8[var1 + 1024] = -n5(0.33126) * var1;
         this.z8[var1 + 1280] = n5(0.5) * var1 + 8388608 + 32768 - 1;
         this.z8[var1 + 1536] = -n5(0.41869) * var1;
         this.z8[var1 + 1792] = -n5(0.08131) * var1;
      }
   }

   private static int n5(double var0) {
      return com.aspose.slides.internal.v6g.k5.u3(var0 * 65536.0 + 0.5, 14);
   }
}
