package com.aspose.slides.internal.k0r;

public class s5r extends v4m {
   private com.aspose.slides.ms.System.o5<Integer> n5 = new com.aspose.slides.ms.System.o5<>();

   public s5r() {
      this.n5(1);
   }

   public s5r(int var1) {
      this.n5(1);
      this.n5(new byte[4]);
      this.k5()[0] = (byte)var1;
      this.k5()[1] = (byte)((var1 & 4294967295L) >> 8 & 4294967295L & 255L & 4294967295L);
      this.k5()[2] = (byte)((var1 & 4294967295L) >> 16 & 4294967295L & 255L & 4294967295L);
      this.k5()[3] = (byte)((var1 & 4294967295L) >> 24 & 4294967295L & 255L & 4294967295L);
   }

   public final int a6() {
      if (!this.n5.l6()) {
         this.u3();
      }

      return this.n5.n5();
   }

   @Override
   protected void u3() {
      this.n5 = new com.aspose.slides.ms.System.o5<>(com.aspose.slides.internal.n8e.y2.l6(this.k5()));
   }
}
