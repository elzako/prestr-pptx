package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

public class u0y extends b3 {
   private String n5;
   private byte l6;
   private f0w k5;
   private List<b2k> u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9(
      "text:style-name", "text:continue-numbering", "list-header", "list-item"
   );

   public u0y(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.h0();
      u0y$1 var2 = new u0y$1(this);
      n5(var1, var2);
      n5(var1, new u0y$2(this, var1));
   }

   public u0y() {
      this.h0();
   }

   private void h0() {
      this.l6 = -1;
      this.u3 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("text:style-name", this.n5);
      }

      if (this.l6 != -1) {
         var2.l6("text:continue-numbering", this.l6 == 1 ? "true" : "false");
      }

      if (this.k5 != null) {
         this.k5.n5("text", var2, "list-header");
      }

      List$Enumerator var4 = this.u3.iterator();

      try {
         while (var4.hasNext()) {
            b2k var5 = (b2k)var4.next();
            var5.n5("text", var2, "list-item");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   public final f0w n5() {
      if (this.k5 != null) {
         throw new Exception("Only one <list_header> element can be added.");
      }

      this.k5 = new f0w();
      return this.k5;
   }

   public final b2k l6() {
      b2k var1 = new b2k();
      this.u3.addItem(var1);
      return var1;
   }

   public final String k5() {
      return this.n5;
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }

   public final f0w u3() {
      return this.k5;
   }

   public final b2k[] a6() {
      return this.u3.toArray(new b2k[0]);
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u9() {
      return a6;
   }

   // $VF: synthetic method
   static String n5(u0y var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static byte n5(u0y var0, byte var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static f0w n5(u0y var0, f0w var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static List n5(u0y var0) {
      return var0.u3;
   }
}
