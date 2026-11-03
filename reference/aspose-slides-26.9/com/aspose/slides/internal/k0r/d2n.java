package com.aspose.slides.internal.k0r;

public class d2n extends s2b {
   public final com.aspose.slides.ms.System.o5<Short> n5() {
      return this.n5(8388608) ? new com.aspose.slides.ms.System.o5<>(this.z1) : new com.aspose.slides.ms.System.o5<>();
   }

   public final void n5(com.aspose.slides.ms.System.o5<Short> var1) {
      if (var1.l6()) {
         this.z1 = (Short)var1.n5();
      }

      this.n5(8388608, var1.l6());
   }

   public final byte l6() {
      if (this.n5(33554432)) {
         return (byte)(this.t4 ? 1 : 0);
      } else {
         return -1;
      }
   }

   public final void n5(byte var1) {
      this.t4 = var1 == 1;
      this.n5(33554432, var1 != -1);
   }

   public final g1p k5() {
      return this.n5(16777216) ? this.q0 : null;
   }

   public final void n5(g1p var1) {
      this.q0 = var1;
      this.n5(16777216, var1 != null);
   }

   @Override
   public String toString() {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5();
      var1.l6("TextPFException9");
      var1.n5(super.toString());
      return var1.toString();
   }
}
