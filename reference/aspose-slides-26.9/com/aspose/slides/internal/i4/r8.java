package com.aspose.slides.internal.i4;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;

public class r8 implements o5 {
   private o5 n5 = new a0();
   private y2 l6;

   @Override
   public final y2 n5(String var1, y2 var2) {
      this.n5.n5(var1, var2);
      return this.l6 = var2;
   }

   @Override
   public final void n5(String var1) {
      this.n5.n5(var1);
      if (this.l6 != null && com.aspose.slides.ms.System.d1.a6(this.l6.n5(), var1)) {
         this.l6 = null;
      }
   }

   @Override
   public final y2 l6(String var1) {
      if (this.l6 != null && com.aspose.slides.ms.System.d1.a6(this.l6.n5(), var1)) {
         return this.l6;
      }

      y2 var2 = this.n5.l6(var1);
      if (var2 != null) {
         this.l6 = var2;
      }

      return var2;
   }

   @Override
   public final boolean n5(String var1, y2[] var2) {
      if (this.l6 != null && com.aspose.slides.ms.System.d1.a6(this.l6.n5(), var1)) {
         var2[0] = this.l6;
         return true;
      }

      boolean var3 = this.n5.n5(var1, var2);
      if (var3) {
         this.l6 = var2[0];
      }

      return var3;
   }

   @Override
   public final IGenericEnumerable<y2> n5() {
      return this.n5.n5();
   }

   @Override
   public final IGenericEnumerator<KeyValuePair<String, y2>> iterator() {
      return this.n5.iterator();
   }
}
