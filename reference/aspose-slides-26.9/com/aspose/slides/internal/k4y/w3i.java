package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class w3i extends b3 {
   private String l6;
   private String k5;
   private String u3;
   private boolean a6;
   private String u9;
   private int h0;
   private int c8;
   private int t2;
   private List<t4i> s7;
   public static final int n5 = v5w.n5("simple");
   private static final com.aspose.slides.internal.v6g.u9 x8 = new com.aspose.slides.internal.v6g.u9(
      "draw:code", "draw:object", "draw:archive", "draw:may-script", "xlink:href", "xlink:type", "xlink:show", "xlink:actuate", "param"
   );

   public w3i(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      w3i$1 var2 = new w3i$1(this);
      n5(var1, var2);
      n5(var1, new w3i$2(this, var1));
   }

   public w3i() {
      this.l6();
   }

   private void l6() {
      this.a6 = false;
      this.h0 = n5;
      this.c8 = 0;
      this.t2 = 0;
      this.s7 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.l6 != null) {
         var2.l6("draw:code", this.l6);
      }

      if (this.k5 != null) {
         var2.l6("draw:object", this.k5);
      }

      if (this.u3 != null) {
         var2.l6("draw:archive", this.u3);
      }

      if (this.a6) {
         var2.l6("draw:may-script", this.a6 ? "true" : "false");
      }

      if (this.u9 != null) {
         var2.l6("xlink:href", this.u9);
      }

      if (this.h0 != n5) {
         var2.l6("xlink:type", v5w.n5(this.h0));
      }

      if (this.c8 != 0) {
         var2.l6("xlink:show", h8e.n5(this.c8));
      }

      if (this.t2 != 0) {
         var2.l6("xlink:actuate", r5n.n5(this.t2));
      }

      List$Enumerator var4 = this.s7.iterator();

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

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return x8;
   }

   // $VF: synthetic method
   static String n5(w3i var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String l6(w3i var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String k5(w3i var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static boolean n5(w3i var0, boolean var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String u3(w3i var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static int n5(w3i var0, int var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static int l6(w3i var0, int var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static int k5(w3i var0, int var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static List n5(w3i var0) {
      return var0.s7;
   }
}
