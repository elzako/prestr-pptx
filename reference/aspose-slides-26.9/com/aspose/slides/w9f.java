package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.Xml.XmlDocument;

class w9f extends com.aspose.slides.ms.System.Xml.m8 {
   private static final String[] n5 = new String[]{"tl", "t", "tr", "l", "ctr", "r", "bl", "b", "br"};
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("tl", "t", "tr", "l", "ctr", "r", "bl", "b", "br");

   public w9f(String var1, String var2, String var3, XmlDocument var4) {
      super(var1, var2, var3, var4);
   }

   static s5c u9() {
      return new w9f$n5();
   }

   public final m2c h0() {
      return com.aspose.slides.internal.v6g.k5.n5(super.getOwnerDocument(), m2c.class);
   }

   public final int n5(String var1, String var2, int var3) {
      return this.u9(var1, var2) ? com.aspose.slides.ms.System.Xml.f4.e2(this.u3(var1, var2)) : var3;
   }

   public final w9f[] n5(String var1, String var2) {
      List var3 = new List();

      for (Object recoveredElement$var5$994 : this) {
         com.aspose.slides.ms.System.Xml.l0 var5 = (com.aspose.slides.ms.System.Xml.l0)recoveredElement$var5$994;
         w9f var6 = com.aspose.slides.internal.v6g.k5.n5(var5, w9f.class);
         if (var6 != null && com.aspose.slides.ms.System.d1.a6(var6.getLocalName(), var1) && com.aspose.slides.ms.System.d1.a6(var6.getNamespaceURI(), var2)) {
            var3.addItem(var6);
         }
      }

      return (w9f[])var3.toArray(new w9f[0]);
   }

   public final w9f l6(String var1, String var2) {
      for (Object recoveredElement$var4$1445 : this) {
         com.aspose.slides.ms.System.Xml.l0 var4 = (com.aspose.slides.ms.System.Xml.l0)recoveredElement$var4$1445;
         w9f var5 = com.aspose.slides.internal.v6g.k5.n5(var4, w9f.class);
         if (var5 != null && com.aspose.slides.ms.System.d1.a6(var5.getLocalName(), var1) && com.aspose.slides.ms.System.d1.a6(var5.getNamespaceURI(), var2)) {
            return var5;
         }
      }

      return null;
   }

   final int n5(com.aspose.slides.internal.n8e.e2 var1, String var2, String var3, int var4) {
      return !this.u9(var2, var3) ? var4 : var1.n5(this.u3(var2, var3));
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public m2c getOwnerDocument() {
      return this.h0();
   }

}
