package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class h9p extends b3 {
   private String l6;
   private String k5;
   private int u3;
   private int a6;
   private int u9;
   private List<t4i> h0;
   public static final int n5 = v5w.n5("simple");
   private static final com.aspose.slides.internal.v6g.u9 c8 = new com.aspose.slides.internal.v6g.u9(
      "draw:mime-type", "xlink:href", "xlink:type", "xlink:show", "xlink:actuate", "param"
   );

   public h9p(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u9();
      h9p$1 var2 = new h9p$1(this);
      n5(var1, var2);
      n5(var1, new h9p$2(this, var1));
   }

   public h9p() {
      this.u9();
   }

   private void u9() {
      this.u3 = n5;
      this.a6 = 0;
      this.u9 = 0;
      this.h0 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.l6 != null) {
         var2.l6("draw:mime-type", this.l6);
      }

      var2.l6("xlink:href", this.k5);
      if (this.u3 != n5) {
         var2.l6("xlink:type", v5w.n5(this.u3));
      }

      if (this.a6 != 0) {
         var2.l6("xlink:show", h8e.n5(this.a6));
      }

      if (this.u9 != 0) {
         var2.l6("xlink:actuate", r5n.n5(this.u9));
      }

      List$Enumerator var4 = this.h0.iterator();

      try {
         while (var4.hasNext()) {
            t4i var5 = (t4i)var4.next();
            var5.n5("draw", var2, "param");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   public final t4i n5() {
      t4i var1 = new t4i();
      this.h0.addItem(var1);
      return var1;
   }

   public final void n5(String var1) {
      this.l6 = var1;
   }

   public final String l6() {
      return this.k5;
   }

   public final void l6(String var1) {
      this.k5 = var1;
   }

   public final void n5(int var1) {
      this.u3 = var1;
   }

   public final int k5() {
      return this.a6;
   }

   public final void l6(int var1) {
      this.a6 = var1;
   }

   public final void k5(int var1) {
      this.u9 = var1;
   }

   public final t4i[] u3() {
      return this.h0.toArray(new t4i[0]);
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 a6() {
      return c8;
   }

   // $VF: synthetic method
   static String n5(h9p var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String l6(h9p var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static int n5(h9p var0, int var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static int l6(h9p var0, int var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static int k5(h9p var0, int var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static List n5(h9p var0) {
      return var0.h0;
   }
}
