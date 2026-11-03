package com.aspose.slides;

class q8x implements a1h {
   private final boolean n5;
   private String l6;
   private final int k5;

   @Override
   public final String n5() {
      return this.l6;
   }

   public final int l6() {
      return this.k5;
   }

   @Override
   public final boolean u3() {
      return this.n5;
   }

   public q8x(int var1, boolean var2) {
      this.k5 = var1;
      this.n5 = var2;
   }

   public q8x(int var1, boolean var2, String var3) {
      this(var1, var2);
      this.l6 = var3;
   }

   @Override
   public final a1h n5(y9w var1) {
      int var2 = this.u3() ? this.l6() : var1.l6().l6() + this.l6();
      if (var2 <= 0) {
         throw new CellInvalidFormulaException("Calculated row number of an absolute reference has invalid value.");
      } else {
         return new q8x(var2, true, this.n5());
      }
   }

   @Override
   public final y9w l6(y9w var1) {
      if (this.l6() == var1.l6().l6()) {
         throw new CellCircularReferenceException("", var1.toString());
      } else {
         return new y9w(this.l6(), var1.k5().l6(), this.n5());
      }
   }

   @Override
   public final boolean k5(y9w var1) {
      return this.l6() == var1.l6().l6();
   }

   public final boolean n5(q8x var1) {
      return com.aspose.slides.ms.System.d1.a6(this.n5(), var1.n5()) && this.l6() == var1.l6() && this.u3() == var1.u3();
   }

   @Override
   public final String a6(y9w var1) {
      if (this.u3()) {
         return com.aspose.slides.ms.System.d1.n5(new String[]{"$", com.aspose.slides.ms.System.a3.l6(this.l6()), ":$", com.aspose.slides.ms.System.a3.l6(this.l6())});
      }

      int var2 = this.l6() + var1.l6().l6();
      return com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.a3.l6(var2), ":", com.aspose.slides.ms.System.a3.l6(var2)});
   }

   @Override
   public final c6u n5(w5c var1) {
      return var1.n5(this);
   }

   @Override
   public String toString() {
      String var1 = "R";
      if (this.u3()) {
         var1 = com.aspose.slides.ms.System.d1.l6(var1, this.l6());
      } else if (this.l6() != 0) {
         var1 = com.aspose.slides.ms.System.d1.n5(var1, com.aspose.slides.ms.System.d1.n5(new String[]{"[", com.aspose.slides.ms.System.a3.l6(this.l6()), "]"}));
      }

      return var1;
   }
}
