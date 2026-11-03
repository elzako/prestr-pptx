package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;

class z4q {
   private String n5;
   private String l6;
   private List<KeyValuePair<String, String>> k5;

   final String n5() {
      return this.n5;
   }

   final void n5(String var1) {
      this.n5 = var1;
   }

   final String l6() {
      return this.l6;
   }

   final void l6(String var1) {
      this.l6 = var1;
   }

   final List<KeyValuePair<String, String>> k5() {
      return this.k5;
   }

   final void n5(List<KeyValuePair<String, String>> var1) {
      this.k5 = var1;
   }

   z4q(String var1, String var2, IGenericEnumerable<KeyValuePair<String, String>> var3) {
      this.n5(var1);
      this.l6(var2);
      this.n5(new List<>(var3));
   }

   z4q(String var1, String var2, int var3) {
      this.n5(var1);
      this.l6(var2);
      this.n5(new List<>(var3));
   }

   z4q(String var1, String var2) {
      this(var1, var2, 0);
   }

   final void n5(String var1, String var2) {
      this.k5().addItem(new KeyValuePair<>(var1, var2));
   }
}
