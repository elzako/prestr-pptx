package com.aspose.slides.ms.System.Xml;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.Collections.Generic.List;

public class b5 extends i0 {
   private List<l0> n5;
   private com.aspose.slides.internal.x6s.h0 l6;
   private boolean k5;
   private static final Object[] u3 = new Object[0];

   public b5(com.aspose.slides.internal.x6s.h0 var1) {
      this.l6 = var1;
      this.n5 = new List<>();
      this.k5 = false;
   }

   @Override
   public int n5() {
      if (!this.k5) {
         this.l6(Integer.MAX_VALUE);
      }

      return this.n5.size();
   }

   private l0 n5(com.aspose.slides.internal.x6s.a6 var1) {
      h2 var2 = (h2)var1;
      return var2.m3();
   }

   public final int l6(int var1) {
      int var2 = this.n5.size();

      while (!this.k5 && var2 <= var1) {
         if (!this.l6.l6()) {
            this.k5 = true;
            break;
         }

         l0 var3 = this.n5(this.l6.k5());
         if (var3 != null) {
            this.n5.addItem(var3);
            var2++;
         }
      }

      return var2;
   }

   @Override
   public l0 n5(int var1) {
      if (this.n5.size() <= var1) {
         this.l6(var1);
      }

      return var1 >= 0 && this.n5.size() > var1 ? this.n5.get_Item(var1) : null;
   }

   @Override
   public IEnumerator iterator() {
      return new b4(this);
   }
}
