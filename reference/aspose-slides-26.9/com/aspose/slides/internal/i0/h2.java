package com.aspose.slides.internal.i0;

public final class h2 extends y8 {
   private a7 n5;
   private c8[] l6;

   public final a7 n5() {
      return this.n5;
   }

   public final void n5(a7 var1) {
      this.n5 = var1;
   }

   public final c8[] l6() {
      return this.l6;
   }

   public final void n5(c8[] var1) {
      this.l6 = var1;
   }

   private boolean n5(h2 var1) {
      return com.aspose.slides.ms.System.j8.n5(this.n5, var1.n5) && com.aspose.slides.internal.y6.c8.n5(this.l6, var1.l6);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else {
         return com.aspose.slides.ms.System.j8.l6(this, obj) ? true : com.aspose.slides.internal.v6g.k5.l6(obj, h2.class) && this.n5((h2)obj);
      }
   }

   @Override
   public int hashCode() {
      return (this.n5 != null ? this.n5.hashCode() : 0) * 397 ^ (this.l6 != null ? com.aspose.slides.ms.System.u3.n5((Object)(this.l6)).hashCode() : 0);
   }

   @Override
   public int u9() {
      int var1 = 0;
      if (this.n5 != null) {
         var1 += this.n5.u9();
      }

      if (this.l6 != null) {
         for (c8 var5 : this.l6()) {
            if (var5 != null) {
               var1 += var5.u9();
            }
         }
      }

      return var1;
   }

   @Override
   public String toString() {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5();

      for (c8 var5 : this.l6()) {
         var1.n5(com.aspose.slides.ms.System.d1.n5(new String[]{var5.toString(), ", "}));
      }

      return com.aspose.slides.ms.System.d1.n5("TransformMatrix: {0}, BlendPattern: {1}",new Object[]{ this.n5, var1});
   }
}
