package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;

public class g3o extends b3 {
   private long n5;
   private long l6;
   private boolean k5;
   private List<x8c> u3;
   private v6p a6;
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9("minLength", "maxLength", "showValue", "cfvo", "color");

   public g3o(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u3();
      g3o$1 var2 = new g3o$1(this);
      n5(var1, var2);
      n5(var1, new g3o$2(this, var1));
   }

   public g3o() {
      this.u3();
      this.u3.addItem(new x8c());
      this.u3.addItem(new x8c());
      this.a6 = new v6p();
   }

   private void u3() {
      this.n5 = 10L;
      this.l6 = 90L;
      this.k5 = true;
      this.u3 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if ((this.n5 & 4294967295L) != 10L) {
         var2.l6("minLength", com.aspose.slides.ms.System.Xml.f4.l6(this.n5));
      }

      if ((this.l6 & 4294967295L) != 90L) {
         var2.l6("maxLength", com.aspose.slides.ms.System.Xml.f4.l6(this.l6));
      }

      if (!this.k5) {
         var2.l6("showValue", this.k5 ? "1" : "0");
      }

      this.n5().n5("ssml", var2, "cfvo");
      this.l6().n5("ssml", var2, "cfvo");
      this.a6.n5("ssml", var2, "color");
      var2.s7();
   }

   public final x8c n5() {
      return this.u3.get_Item(0);
   }

   public final x8c l6() {
      return this.u3.get_Item(1);
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return u9;
   }

   // $VF: synthetic method
   static long n5(g3o var0, long var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static long l6(g3o var0, long var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static boolean n5(g3o var0, boolean var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static List n5(g3o var0) {
      return var0.u3;
   }

   // $VF: synthetic method
   static v6p n5(g3o var0, v6p var1) {
      return var0.a6 = var1;
   }
}
