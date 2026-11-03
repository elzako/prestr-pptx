package com.aspose.slides.internal.b9;

public class b9 extends s9 {
   private long n5;

   public b9(s9 var1) {
      super(var1);
   }

   public final long n5() {
      return this.n5;
   }

   public final void n5(long var1) {
      this.n5 = var1;
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5(
         "{0}, MapMode: {1}",new Object[]{ super.toString(), com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.c5.s7.class, this.n5())
      });
   }

   protected final boolean n5(b9 var1) {
      return super.n5(var1) && this.n5 == var1.n5;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((b9)obj);
      }
   }

   @Override
   public int hashCode() {
      return super.hashCode() * 397 ^ (int)this.n5;
   }
}
