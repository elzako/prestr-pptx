package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

public class a8e extends b3 {
   private String n5;
   private b8n l6;
   private List<o8r> k5;
   private a9t u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("formatCode", "ptCount", "pt", "extLst");

   public a8e(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.c8();
      n5(var1, new a8e$1(this, var1));
   }

   public a8e() {
      this.c8();
   }

   private void c8() {
      this.k5 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5("c", var2, "formatCode", this.n5, false);
      }

      if (this.l6 != null) {
         this.l6.n5("c", var2, "ptCount");
      }

      List$Enumerator var4 = this.k5.iterator();

      try {
         while (var4.hasNext()) {
            o8r var5 = (o8r)var4.next();
            var5.n5("c", var2, "pt");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      if (this.u3 != null) {
         this.u3.n5("c", var2, "extLst");
      }

      var2.s7();
   }

   public final b8n n5() {
      if (this.l6 != null) {
         throw new Exception("Only one <ptCount> element can be added.");
      }

      this.l6 = new b8n();
      return this.l6;
   }

   public final o8r l6() {
      o8r var1 = new o8r();
      this.k5.addItem(var1);
      return var1;
   }

   public final String k5() {
      return this.n5;
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }

   public final b8n u3() {
      return this.l6;
   }

   public final o8r[] a6() {
      return this.k5.toArray(new o8r[0]);
   }

   public final x8 u9() {
      return this.u3;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 h0() {
      return a6;
   }

   // $VF: synthetic method
   static String n5(a8e var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(a8e var0) {
      return var0.n5;
   }

   // $VF: synthetic method
   static b8n n5(a8e var0, b8n var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static List l6(a8e var0) {
      return var0.k5;
   }

   // $VF: synthetic method
   static a9t n5(a8e var0, a9t var1) {
      return var0.u3 = var1;
   }
}
