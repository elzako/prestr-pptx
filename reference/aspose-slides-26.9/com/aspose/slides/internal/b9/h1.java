package com.aspose.slides.internal.b9;

public class h1 extends s2 {
   private int n5;

   public h1(s9 var1) {
      super(var1);
   }

   public final int n5() {
      return this.n5;
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5(
         "{0}, Rop2Mode: {1}",new Object[]{ super.toString(), com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.o4.n5.class, this.n5())
      });
   }

   protected final boolean n5(h1 var1) {
      return super.n5(var1) && this.n5 == var1.n5;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((h1)obj);
      }
   }

   @Override
   public int hashCode() {
      return super.hashCode() * 397 ^ this.n5 & 65535;
   }
}
