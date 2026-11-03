package com.aspose.slides.internal.i4;

public final class i9 extends j4 implements e9 {
   private String n5;

   @Override
   public Object C_() {
      return this.n5;
   }

   public static boolean u9(String var0) {
      return var0 == null ? false : "true".equals(var0) || var0.length() > 0;
   }

   @Override
   public boolean n5() {
      return u9(this.n5);
   }

   public static double h0(String var0) {
      double var1 = 0.0;
      if (var0 == null) {
         return Double.NaN;
      }

      double[] var3 = new double[]{0.0};
      boolean var4 = com.aspose.slides.ms.System.d2.n5(var0, 32, com.aspose.slides.internal.x7n.l6.k5(), var3);
      var1 = var3[0];
      return var4 ? var1 : Double.NaN;
   }

   @Override
   public double l6() {
      return h0(this.n5);
   }

   @Override
   public String d5() {
      return this.n5 == null ? "null" : com.aspose.slides.ms.System.d1.n5(new String[]{"'", this.toString(), "'"});
   }

   @Override
   public String toString() {
      return this.n5;
   }

   @Override
   public String u3() {
      return "String";
   }

   @Override
   public String c8() {
      return "string";
   }

   @Override
   public int hashCode() {
      return this.n5.hashCode();
   }

   public i9(String var1, j4 var2) {
      super(var2);
      this.n5 = var1;
   }
}
