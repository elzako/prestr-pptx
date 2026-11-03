package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;

public class o6t extends b3 {
   private List<u1> n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("pt");

   public o6t(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u3();
      n5(var1, new o6t$1(this, var1));
   }

   public o6t() {
      this.u3();
      this.n5.addItem(new u1());
      this.n5.addItem(new u1());
   }

   private void u3() {
      this.n5 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      this.n5().n5("a", var2, "pt");
      this.l6().n5("a", var2, "pt");
      var2.s7();
   }

   public final u1 n5() {
      return this.n5.get_Item(0);
   }

   public final u1 l6() {
      return this.n5.get_Item(1);
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return l6;
   }

   // $VF: synthetic method
   static List n5(o6t var0) {
      return var0.n5;
   }
}
