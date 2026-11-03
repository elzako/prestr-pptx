package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class b4h extends b3 {
   private String n5;
   private String l6;
   private String k5;
   private List<u5h> u3;
   private List<g7> a6;
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9(
      "xml:id", "type", "startTime", "property", "actionData", "actionDataGroup"
   );

   public b4h(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.c8();
      b4h$1 var2 = new b4h$1(this);
      n5(var1, var2);
      n5(var1, new b4h$2(this, var1));
   }

   public b4h() {
      this.c8();
   }

   private void c8() {
      this.u3 = new List<>();
      this.a6 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("xml:id", this.n5);
      }

      com.aspose.slides.internal.f8y.n5.n5(this.l6 != null, "Required property \"Type\" is uninitialized.");
      var2.l6("type", this.l6);
      com.aspose.slides.internal.f8y.n5.n5(this.k5 != null, "Required property \"StartTime\" is uninitialized.");
      var2.l6("startTime", this.k5);
      List$Enumerator var4 = this.u3.iterator();

      try {
         while (var4.hasNext()) {
            u5h var5 = (u5h)var4.next();
            var5.n5("iact", var2, "property");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      List$Enumerator var14 = this.a6.iterator();

      try {
         while (var14.hasNext()) {
            g7 var6 = (g7)var14.next();
            switch (u9.n5(var6.n5())) {
               case 4:
                  ((r6r)var6.k5()).n5("iact", var2, var6.n5());
                  break;
               case 5:
                  ((i5q)var6.k5()).n5("iact", var2, var6.n5());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var14, IDisposable.class)) {
            var14.dispose();
         }
      }

      var2.s7();
   }

   public final u5h n5() {
      u5h var1 = new u5h();
      this.u3.addItem(var1);
      return var1;
   }

   public final void n5(g7 var1) {
      this.a6.addItem(var1);
   }

   public final String l6() {
      return this.n5;
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }

   public final String k5() {
      return this.l6;
   }

   public final void l6(String var1) {
      this.l6 = var1;
   }

   public final String u3() {
      return this.k5;
   }

   public final void k5(String var1) {
      this.k5 = var1;
   }

   public final u5h[] a6() {
      return this.u3.toArray(new u5h[0]);
   }

   public final List<g7> u9() {
      return this.a6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 h0() {
      return u9;
   }

   // $VF: synthetic method
   static String n5(b4h var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(b4h var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String k5(b4h var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static List n5(b4h var0) {
      return var0.u3;
   }

   // $VF: synthetic method
   static List l6(b4h var0) {
      return var0.a6;
   }
}
