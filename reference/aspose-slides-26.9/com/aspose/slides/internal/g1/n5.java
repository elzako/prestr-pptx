package com.aspose.slides.internal.g1;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.o9b.y2;

public class n5 {
   private y2 n5 = new y2();
   private boolean l6 = false;

   public n5() {
   }

   public n5(y2 var1) {
      var1.u3(this.n5);
      this.l6 = true;
   }

   public n5(int var1, int var2, int var3, int var4) {
      this(new y2(var1, var2, var3, var4));
   }

   public final y2 n5() {
      return this.n5;
   }

   public final void n5(y2 var1) {
      if (this.l6()) {
         var1.u3(this.n5);
      } else {
         throw new ArgumentException("Use constructor");
      }
   }

   public final boolean l6() {
      return this.l6;
   }

   public static n5 k5() {
      return new n5();
   }

   public static n5 n5(int var0, int var1, int var2, int var3) {
      return new n5(y2.n5(var0, var1, var2, var3).n3());
   }
}
