package com.aspose.slides.internal.i0;

public final class t2 extends c8 {
   private n5[] n5;

   public final n5[] k5() {
      return this.n5;
   }

   public final void n5(n5[] var1) {
      this.n5 = var1;
   }

   @Override
   public String toString() {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5();

      for (n5 var5 : this.n5) {
         var1.n5(com.aspose.slides.ms.System.d1.n5(new String[]{var5.toString(), ", "}));
      }

      return com.aspose.slides.ms.System.d1.n5("{0}, BlendColors: [{1}]",new Object[]{ super.toString(), var1});
   }

   private boolean n5(t2 var1) {
      return super.n5(var1) && com.aspose.slides.internal.y6.c8.n5(this.n5, var1.n5);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else {
         return com.aspose.slides.ms.System.j8.l6(this, obj) ? true : com.aspose.slides.internal.v6g.k5.l6(obj, t2.class) && this.n5((t2)obj);
      }
   }

   @Override
   public int hashCode() {
      return super.hashCode() * 397 ^ (this.n5 != null ? com.aspose.slides.ms.System.u3.n5((Object)(this.n5)).hashCode() : 0);
   }

   @Override
   public int u9() {
      return (int)(super.u9() + (4L * (this.l6() & 4294967295L) & 4294967295L) & 4294967295L);
   }
}
