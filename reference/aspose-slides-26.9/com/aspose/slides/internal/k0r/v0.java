package com.aspose.slides.internal.k0r;

import com.aspose.slides.exceptions.Exception;

public class v0 extends r4 {
   private y7 n5 = null;
   private static final int[] l6 = new int[]{61440, Integer.MAX_VALUE};

   public v0() {
      this.w1().n5((byte)15);
      this.w1().n5((short)0);
      this.w1().n5(1035);
   }

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      int var2 = com.aspose.slides.ms.System.z3.h0(var1.x8().getPosition() + this.w1().a6());
      y7 var3 = com.aspose.slides.internal.v6g.k5.n5(p5k.n5(var1), y7.class);
      this.e2().addItem(var3);
      if (var3 == null) {
         throw new Exception("First Escher record is not DggContainer.");
      }

      if (var1.x8().getPosition() < var2) {
         throw new Exception("Probably DrawingGroupContainer contains more DggContainer records.");
      }
   }

   public final y7 l6() {
      if (this.n5 != null) {
         return this.n5;
      }

      this.n5 = (y7)this.k5(61440);
      if (this.n5 == null && this.n3()) {
         this.n5 = new y7();
         this.n5.l6(true);
         this.e2().addItem(this.n5);
      }

      return this.n5;
   }

   @Override
   protected int[] k5() {
      return l6;
   }
}
