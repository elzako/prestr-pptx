package com.aspose.slides.internal.k1;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

public class z1 extends com.aspose.slides.internal.y6.u3 {
   private int n5;
   private z3 l6;
   private c8 k5;

   public final int n5() {
      return this.n5;
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final z3 l6() {
      return this.l6;
   }

   public final void n5(z3 var1) {
      this.l6 = var1;
   }

   public final c8 k5() {
      return this.k5;
   }

   public final void n5(c8 var1) {
      this.k5 = var1;
   }

   public final com.aspose.slides.internal.o9b.m3 u3() {
      if ((this.n5() & 65535) == 5) {
         return null;
      }

      com.aspose.slides.internal.o9b.m3 var1 = new com.aspose.slides.internal.o9b.m3(this.k5().u9().o8());
      var1.u3(2);
      if ((this.n5() & 65535) == 8) {
         com.aspose.slides.internal.f8y.n5.k5("Implement support for PS_ALTERNATE");
      }

      switch (this.n5() & 65535 & 15 & 65535) {
         case 0:
         case 6:
            var1.k5(0);
            break;
         case 1:
            var1.k5(1);
            break;
         case 2:
            var1.k5(2);
            break;
         case 3:
            var1.k5(3);
            break;
         case 4:
            var1.k5(4);
            break;
         case 5:
         default:
            throw new ArgumentOutOfRangeException();
      }

      switch (this.n5() & 65535 & 3840 & 65535) {
         case 0:
            var1.a6(2);
            break;
         case 256:
            var1.a6(1);
            break;
         case 512:
            var1.a6(0);
      }

      switch (this.n5() & 65535 & 61440 & 65535) {
         case 0:
            var1.u9(2);
            break;
         case 4096:
            var1.u9(1);
            break;
         case 8192:
            var1.u9(0);
      }

      var1.k5(this.l6().n5() == 0 ? 1.0F : this.l6().n5());
      return var1;
   }
}
