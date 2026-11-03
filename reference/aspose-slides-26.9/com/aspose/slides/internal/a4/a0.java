package com.aspose.slides.internal.a4;

public class a0 extends y2 {
   public a0() {
      this.l6((short)16403);
   }

   public a0(b3 var1) {
      super(var1);
   }

   public final byte k5() {
      return this.m3();
   }

   protected final boolean n5(a0 var1) {
      return this.y4() == var1.y4();
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((a0)obj);
      }
   }

   @Override
   public int hashCode() {
      return this.y4();
   }

   @Override
   public int u9() {
      return 4;
   }
}
