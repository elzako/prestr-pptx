package com.aspose.slides.internal.a4;

public class s0 extends j4 {
   private com.aspose.slides.internal.o9b.y2[] n5;

   public s0(b3 var1) {
      super(var1);
   }

   public final boolean k5() {
      return (this.G_() & 128) > 0;
   }

   public final short u3() {
      return (short)(this.G_() & 32767);
   }

   public final com.aspose.slides.internal.o9b.y2[] c8() {
      return this.n5;
   }

   public final void n5(com.aspose.slides.internal.o9b.y2[] var1) {
      this.n5 = var1;
   }

   protected final boolean n5(s0 var1) {
      return super.n5(var1) && com.aspose.slides.internal.y6.c8.n5(this.c8(), var1.c8());
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((s0)obj);
      }
   }

   @Override
   public int hashCode() {
      return super.hashCode() * 397 ^ (this.c8() != null ? com.aspose.slides.ms.System.u3.n5((Object)(this.c8())).hashCode() : 0);
   }
}
