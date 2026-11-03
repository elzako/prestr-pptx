package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class n8o extends b3 {
   private String n5;
   private String l6;
   private List<z0x> k5;
   private List<i3p> u3;
   private List<s4z> a6;
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9(
      "xml:id", "brushRef", "brushProperty", "annotation", "annotationXML"
   );

   public n8o(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.h0();
      n8o$1 var2 = new n8o$1(this);
      n5(var1, var2);
      n5(var1, new n8o$2(this, var1));
   }

   public n8o() {
      this.h0();
   }

   private void h0() {
      this.k5 = new List<>();
      this.u3 = new List<>();
      this.a6 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("xml:id", this.n5);
      }

      if (this.l6 != null) {
         var2.l6("brushRef", this.l6);
      }

      List$Enumerator var4 = this.k5.iterator();

      try {
         while (var4.hasNext()) {
            z0x var5 = (z0x)var4.next();
            var5.n5("inkml", var2, "brushProperty");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      List$Enumerator var21 = this.u3.iterator();

      try {
         while (var21.hasNext()) {
            i3p var6 = (i3p)var21.next();
            var6.n5("inkml", var2, "annotation");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var21, IDisposable.class)) {
            var21.dispose();
         }
      }

      List$Enumerator var22 = this.a6.iterator();

      try {
         while (var22.hasNext()) {
            s4z var7 = (s4z)var22.next();
            var7.n5("inkml", var2, "annotationXML");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var22, IDisposable.class)) {
            var22.dispose();
         }
      }

      var2.s7();
   }

   public final void n5(z0x var1) {
      this.k5.addItem(var1);
   }

   public final void n5(i3p var1) {
      this.u3.addItem(var1);
   }

   public final void n5(s4z var1) {
      this.a6.addItem(var1);
   }

   public final String n5() {
      return this.n5;
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }

   public final String l6() {
      return this.l6;
   }

   public final void l6(String var1) {
      this.l6 = var1;
   }

   public final z0x[] k5() {
      return this.k5.toArray(new z0x[0]);
   }

   public final i3p[] u3() {
      return this.u3.toArray(new i3p[0]);
   }

   public final s4z[] a6() {
      return this.a6.toArray(new s4z[0]);
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u9() {
      return u9;
   }

   // $VF: synthetic method
   static String n5(n8o var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(n8o var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static List n5(n8o var0) {
      return var0.k5;
   }

   // $VF: synthetic method
   static List l6(n8o var0) {
      return var0.u3;
   }

   // $VF: synthetic method
   static List k5(n8o var0) {
      return var0.a6;
   }
}
