package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

public class u3k extends b3 {
   private String n5;
   private y0k l6;
   private u7v k5;
   private r8u u3;
   private List<g6v> a6;
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9("Id", "SignedInfo", "SignatureValue", "KeyInfo", "Object");

   public u3k(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.c8();
      u3k$1 var2 = new u3k$1(this);
      n5(var1, var2);
      n5(var1, new u3k$2(this, var1));
   }

   public u3k() {
      this.c8();
      this.l6 = new y0k();
      this.k5 = new u7v();
   }

   private void c8() {
      this.a6 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5("", var3, "http://www.w3.org/2000/09/xmldsig#");
      if (var2.n5("http://schemas.openxmlformats.org/package/2006/digital-signature") == null) {
         var2.u3("xmlns", "mdssi", null, "http://schemas.openxmlformats.org/package/2006/digital-signature");
      }

      if (var2.n5("http://uri.etsi.org/01903/v1.3.2#") == null) {
         var2.u3("xmlns", "xd", null, "http://uri.etsi.org/01903/v1.3.2#");
      }

      if (this.n5 != null) {
         var2.l6("Id", this.n5);
      }

      this.l6.n5("", var2, "SignedInfo");
      this.k5.n5("", var2, "SignatureValue");
      if (this.u3 != null) {
         this.u3.n5("", var2, "KeyInfo");
      }

      List$Enumerator var4 = this.a6.iterator();

      try {
         while (var4.hasNext()) {
            g6v var5 = (g6v)var4.next();
            var5.n5("", var2, "Object");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   public final r8u n5() {
      if (this.u3 != null) {
         throw new Exception("Only one <keyInfo> element can be added.");
      }

      this.u3 = new r8u();
      return this.u3;
   }

   public final g6v l6() {
      g6v var1 = new g6v();
      this.a6.addItem(var1);
      return var1;
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }

   public final y0k k5() {
      return this.l6;
   }

   public final u7v u3() {
      return this.k5;
   }

   public final r8u a6() {
      return this.u3;
   }

   public final g6v[] u9() {
      return this.a6.toArray(new g6v[0]);
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 h0() {
      return u9;
   }

   // $VF: synthetic method
   static String n5(u3k var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static y0k n5(u3k var0, y0k var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static u7v n5(u3k var0, u7v var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static r8u n5(u3k var0, r8u var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static List n5(u3k var0) {
      return var0.a6;
   }
}
