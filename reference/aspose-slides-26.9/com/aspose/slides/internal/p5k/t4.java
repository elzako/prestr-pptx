package com.aspose.slides.internal.p5k;

import com.aspose.slides.Collections.Generic.List;

public class t4 {
   private List<t4> n5;
   private int l6;
   private String k5;
   private String u3;
   private t4 a6;

   public t4(int var1, String var2, String var3) {
      this.l6 = var1;
      this.k5 = var2;
      this.u3 = var3;
      this.n5 = new List<>();
   }

   public final void n5(t4 var1) {
      var1.l6(this);
      this.n5.addItem(var1);
   }

   public final void n5(com.aspose.slides.internal.b8.n5 var1) {
      for (int var2 = 0; var2 < this.n5.size(); var2++) {
         t4 var3 = this.n5.get_Item(var2);
         var3.l6(var1);
      }
   }

   private void l6(com.aspose.slides.internal.b8.n5 var1) {
      var1.l6("outline");
      var1.k5("title", this.k5);
      var1.k5("url", this.u3);
      this.n5(var1);
      var1.k5();
   }

   public final int n5() {
      return this.l6;
   }

   public final t4 l6() {
      return this.a6;
   }

   public final void l6(t4 var1) {
      this.a6 = var1;
   }
}
