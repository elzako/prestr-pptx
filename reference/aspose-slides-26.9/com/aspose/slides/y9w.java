package com.aspose.slides;

class y9w implements a1h {
   private String n5;
   private final q8x l6;
   private final e8b k5;

   @Override
   public final String n5() {
      return this.n5;
   }

   public final q8x l6() {
      return this.l6;
   }

   public final e8b k5() {
      return this.k5;
   }

   @Override
   public final boolean u3() {
      return this.l6().u3() && this.k5().u3();
   }

   public y9w(q8x var1, e8b var2) {
      this.l6 = var1;
      this.k5 = var2;
   }

   public y9w(q8x var1, e8b var2, String var3) {
      this(var1, var2);
      this.n5 = var3;
   }

   public y9w(int var1, int var2) {
      this.l6 = new q8x(var1, true);
      this.k5 = new e8b(var2, true);
   }

   public y9w(int var1, int var2, String var3) {
      this(var1, var2);
      this.n5 = var3;
   }

   @Override
   public final a1h n5(y9w var1) {
      q8x var2 = (q8x)this.l6().n5(var1);
      e8b var3 = (e8b)this.k5().n5(var1);
      return new y9w(var2, var3, this.n5());
   }

   @Override
   public final y9w l6(y9w var1) {
      if (this.l6().l6() == var1.l6().l6() && this.k5().l6() == var1.k5().l6() && com.aspose.slides.ms.System.d1.a6(this.n5(), var1.n5())) {
         throw new CellCircularReferenceException("", var1.n5() + var1.l6() + var1.k5());
      } else {
         return new y9w(this.l6().l6(), this.k5().l6(), this.n5());
      }
   }

   @Override
   public final boolean k5(y9w var1) {
      return this.u3(var1);
   }

   public final boolean u3(y9w var1) {
      return this.l6().n5(var1.l6()) && this.k5().n5(var1.k5());
   }

   @Override
   public final String a6(y9w var1) {
      String var2;
      if (this.k5().u3()) {
         var2 = com.aspose.slides.ms.System.d1.n5(new String[]{"$", com.aspose.slides.n5.n5(this.k5().l6())});
      } else {
         int var3 = this.k5().l6() + var1.k5().l6();
         var2 = com.aspose.slides.n5.n5(var3);
      }

      String var4;
      if (this.l6().u3()) {
         var4 = com.aspose.slides.ms.System.d1.n5(new String[]{"$", com.aspose.slides.ms.System.a3.l6(this.l6().l6())});
      } else {
         int var5 = this.l6().l6() + var1.l6().l6();
         var4 = com.aspose.slides.ms.System.a3.l6(var5);
      }

      if (!com.aspose.slides.ms.System.d1.a6(this.n5(), var1.n5())) {
         String var6 = com.aspose.slides.ms.System.d1.n5(new String[]{"'", this.n5(), "'!"});
         return com.aspose.slides.ms.System.d1.n5(new String[]{var6, var2, var4});
      } else {
         return com.aspose.slides.ms.System.d1.n5(new String[]{var2, var4});
      }
   }

   @Override
   public final c6u n5(w5c var1) {
      return var1.n5(this);
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5(new String[]{this.l6().toString(), this.k5().toString()});
   }
}
