package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;

class m3z {
   private final Dictionary<String, String> n5;
   private final InkActions l6;
   private final List<u2l> k5;
   private String u3;
   private String a6;
   private int u9;

   m3z(InkActions var1) {
      this.l6 = var1;
      this.k5 = new List<>();
      this.n5 = new Dictionary<>();
   }

   final Dictionary<String, String> n5() {
      return this.n5;
   }

   final List<u2l> l6() {
      return this.k5;
   }

   final String k5() {
      return this.u3;
   }

   final void n5(String var1) {
      this.u3 = var1;
   }

   final String u3() {
      return this.a6;
   }

   final void l6(String var1) {
      this.a6 = var1;
   }

   final InkActions a6() {
      return this.l6;
   }

   final int u9() {
      return this.u9;
   }

   final void n5(int var1) {
      this.u9 = var1;
   }
}
