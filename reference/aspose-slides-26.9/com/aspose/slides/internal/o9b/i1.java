package com.aspose.slides.internal.o9b;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.ms.System.d1;
import java.awt.Paint;

public final class i1 extends u3 {
   boolean l6 = true;
   private final c8 k5 = new c8();

   @Override
   public Paint n5() {
      return this.k5.n5();
   }

   @Override
   public int getTransparency() {
      return this.a6() ? 1 : this.n5().getTransparency();
   }

   public i1(c8 var1) {
      var1.n5(this.k5);
   }

   public c8 h0() {
      return this.k5;
   }

   public void n5(c8 var1) {
      if (this.l6) {
         var1.n5(this.k5);
      } else {
         throw new ArgumentException("This SolidBrush object can't be modified.");
      }
   }

   @Override
   public Object deepClone() {
      if (this.a6()) {
         throw new ArgumentException("Parameter is invalid.");
      }

      c8 var1 = this.k5.o8();
      var1.k5 = d1.n5("{0:x}", new Object[]{var1.h0()});
      return new i1(var1);
   }

   public i1 c8() {
      if (this.a6()) {
         throw new ArgumentException("Parameter is invalid.");
      } else {
         return new i1(this.k5.o8());
      }
   }

   @Override
   protected void n5(boolean var1) {
      if (!this.l6 && var1) {
         throw new ArgumentException("This SolidBrush object can't be modified.");
      }

      this.u9();
   }
}
