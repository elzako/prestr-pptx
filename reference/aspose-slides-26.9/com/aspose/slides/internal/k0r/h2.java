package com.aspose.slides.internal.k0r;

import com.aspose.slides.exceptions.Exception;

public class h2 extends r4 {
   private l1 n5 = null;
   private static final int[] l6 = new int[]{61442, Integer.MAX_VALUE};

   public h2() {
      this.w1().n5(1036);
   }

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      int var2 = (int)(var1.x8().getPosition() + this.w1().a6());
      l1 var3 = com.aspose.slides.internal.v6g.k5.n5(p5k.n5(var1), l1.class);
      if (var3 == null) {
         throw new Exception("First Escher record is not DgContainer.");
      }

      this.e2().addItem(var3);
      if (var1.x8().getPosition() < var2) {
         throw new Exception("Probably DrawingContainer contains more DgContainer records.");
      }
   }

   public final l1 l6() {
      if (this.n5 != null) {
         return this.n5;
      }

      this.n5 = (l1)this.k5(61442);
      return this.n5;
   }

   @Override
   protected int[] k5() {
      return l6;
   }
}
