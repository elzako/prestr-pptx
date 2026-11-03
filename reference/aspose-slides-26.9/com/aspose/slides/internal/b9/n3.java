package com.aspose.slides.internal.b9;

public class n3 extends z3 {
   private byte[] n5;

   public n3(z3 var1) {
      super(var1);
      this.u3(var1.c8());
   }

   public final byte[] n5() {
      return this.n5;
   }

   public final void n5(byte[] var1) {
      this.n5 = var1;
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5("{0}, PrivateData: {1}", super.toString(), this.n5);
   }

   protected final boolean n5(n3 var1) {
      return super.n5(var1) && com.aspose.slides.internal.y6.c8.n5(this.n5, var1.n5);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((n3)obj);
      }
   }

   @Override
   public int hashCode() {
      return super.hashCode() * 397 ^ (this.n5 != null ? com.aspose.slides.ms.System.u3.n5((Object)(this.n5)).hashCode() : 0);
   }
}
