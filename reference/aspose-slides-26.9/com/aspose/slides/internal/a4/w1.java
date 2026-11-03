package com.aspose.slides.internal.a4;

import com.aspose.slides.ms.System.d1;

public class w1 extends y2 {
   public w1() {
      this.l6((short)16404);
   }

   public w1(b3 var1) {
      super(var1);
   }

   public final byte k5() {
      return this.m3();
   }

   public final void n5(byte var1) {
      this.u3(var1);
   }

   @Override
   public String toString() {
      return d1.n5("{0}", new Object[]{super.toString()});
   }

   protected final boolean n5(w1 var1) {
      return this.y4() == var1.y4();
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((w1)obj);
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
