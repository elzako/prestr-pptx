package com.aspose.slides.internal.a4;

import com.aspose.slides.ms.System.d1;

public abstract class y2 extends m1 {
   private int n5;

   protected y2() {
   }

   protected y2(b3 var1) {
      super(var1);
   }

   public final boolean n3() {
      return this.u9(15);
   }

   public final void n5(boolean var1) {
      this.n5(15, var1);
   }

   public final int y4() {
      return this.n5;
   }

   public final void u3(int var1) {
      this.n5 = var1;
   }

   protected final boolean n5(y2 var1) {
      return super.n5(var1) && this.n5 == var1.n5;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((y2)obj);
      }
   }

   @Override
   public int hashCode() {
      return super.hashCode() * 397 ^ this.n5;
   }

   @Override
   public String toString() {
      return d1.n5("{0}, BrushId: {1}",new Object[]{ super.toString(), this.n5});
   }
}
