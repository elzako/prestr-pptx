package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;

public class y8m extends b3 {
   private List<u1> n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("pt");

   public y8m(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.a6();
      n5(var1, new y8m$1(this, var1));
   }

   public y8m() {
      this.a6();
      this.n5.addItem(new u1());
      this.n5.addItem(new u1());
      this.n5.addItem(new u1());
   }

   private void a6() {
      this.n5 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      this.n5().n5("a", var2, "pt");
      this.l6().n5("a", var2, "pt");
      this.k5().n5("a", var2, "pt");
      var2.s7();
   }

   public final u1 n5() {
      return this.n5.get_Item(0);
   }

   public final u1 l6() {
      return this.n5.get_Item(1);
   }

   public final u1 k5() {
      return this.n5.get_Item(2);
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return l6;
   }

   // $VF: synthetic method
   static List n5(y8m var0) {
      return var0.n5;
   }
}
