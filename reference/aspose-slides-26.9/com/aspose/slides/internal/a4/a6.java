package com.aspose.slides.internal.a4;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

public class a6 extends b3 {
   private byte[] n5;

   public a6() {
      this.l6((short)16387);
   }

   public a6(b3 var1) {
      super(var1);
   }

   public final byte[] n5() {
      return this.n5;
   }

   public final void n5(byte[] var1) {
      this.n5 = var1;
   }

   @Override
   public short G_() {
      return super.G_();
   }

   @Override
   public void n5(short var1) {
      if (var1 != 0) {
         throw new ArgumentOutOfRangeException("value");
      }

      super.n5(var1);
   }

   protected final boolean n5(a6 var1) {
      return com.aspose.slides.internal.y6.c8.n5(this.n5(), var1.n5());
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((a6)obj);
      }
   }

   @Override
   public int hashCode() {
      return this.n5() != null ? com.aspose.slides.ms.System.u3.n5((Object)(this.n5())).hashCode() : 0;
   }

   @Override
   public int u9() {
      return this.n5().length;
   }
}
