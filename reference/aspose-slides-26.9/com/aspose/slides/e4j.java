package com.aspose.slides;

class e4j implements y9i {
   private final y9i n5;
   private final y9i l6;
   private final String k5;

   public e4j(y9i var1, y9i var2, String var3) {
      this.l6 = var2;
      this.n5 = var1;
      this.k5 = var3;
   }

   @Override
   public final x5r n5(t8 var1) {
      com.aspose.slides.internal.l7h.a5 var2 = new com.aspose.slides.internal.l7h.a5();
      if (this.n5 != null) {
         var2.n5(this.n5.n5(var1).u3(var1));
      }

      var2.n5(this.k5);
      if (this.l6 != null) {
         var2.n5(this.l6.n5(var1).u3(var1));
      }

      return new x5r(var2.toString());
   }

   @Override
   public String toString() {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5();
      if (this.n5 != null) {
         var1.n5(this.n5);
      }

      var1.n5(com.aspose.slides.ms.System.d1.n5(new String[]{"&\"", this.k5, "\"&"}));
      if (this.l6 != null) {
         var1.n5(this.l6);
      }

      return var1.toString();
   }

   @Override
   public final String n5(y9w var1) {
      return this.toString();
   }
}
