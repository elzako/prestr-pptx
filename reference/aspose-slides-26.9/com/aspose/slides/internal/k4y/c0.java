package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class c0 extends b3 {
   private f6 n5;
   private d0 l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("clrScheme", "clrMap");

   public c0(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new c0$1(this, var1));
   }

   public c0() {
      this.n5 = new f6();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      this.n5.n5("a", var2, "clrScheme");
      if (this.l6 != null) {
         this.l6.n5("a", var2, "clrMap");
      }

      var2.s7();
   }

   public final d0 n5() {
      if (this.l6 != null) {
         throw new Exception("Only one <clrMap> element can be added.");
      }

      this.l6 = new d0();
      return this.l6;
   }

   public final f6 l6() {
      return this.n5;
   }

   public final d0 k5() {
      return this.l6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return k5;
   }

   // $VF: synthetic method
   static f6 n5(c0 var0, f6 var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static d0 n5(c0 var0, d0 var1) {
      return var0.l6 = var1;
   }
}
