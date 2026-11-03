package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;

class c0h {
   private final Dictionary<String, l3a[]> n5 = new Dictionary<>();

   public c0h(n9p[] var1) {
      for (n9p var5 : var1) {
         for (String var9 : var5.n5()) {
            this.n5.set_Item(var9, var5.l6());
         }
      }
   }

   public Dictionary<String, l3a[]> n5() {
      return this.n5;
   }
}
