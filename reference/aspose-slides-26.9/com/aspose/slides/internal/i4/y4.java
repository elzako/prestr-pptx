package com.aspose.slides.internal.i4;

public final class y4 extends j4 implements e9 {
   private boolean n5;

   @Override
   public Object C_() {
      return this.n5;
   }

   @Override
   public String c8() {
      return "boolean";
   }

   @Override
   public String u3() {
      return "Boolean";
   }

   @Override
   public boolean n5() {
      return this.n5;
   }

   @Override
   public String toString() {
      return this.n5 ? "true" : "false";
   }

   public static double n5(boolean var0) {
      return var0 ? 1.0 : 0.0;
   }

   @Override
   public double l6() {
      return n5(this.n5);
   }

   public y4(boolean var1, j4 var2) {
      super(var2);
      this.n5 = var1;
   }
}
