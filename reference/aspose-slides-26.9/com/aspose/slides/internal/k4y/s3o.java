package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class s3o extends b3 {
   private String l6;
   private String k5;
   private int u3;
   private int a6;
   private int u9;
   private String h0;
   private List<g7> c8;
   public static final int n5 = v5w.n5("simple");
   private static final com.aspose.slides.internal.v6g.u9 t2 = new com.aspose.slides.internal.v6g.u9(
      "draw:filter-name", "xlink:href", "xlink:type", "xlink:show", "xlink:actuate", "binary-data", "p", "list"
   );

   public s3o(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u3();
      s3o$1 var2 = new s3o$1(this);
      n5(var1, var2);
      n5(var1, new s3o$2(this, var1));
   }

   public s3o() {
      this.u3();
   }

   private void u3() {
      this.u3 = n5;
      this.a6 = 0;
      this.u9 = 0;
      this.c8 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.l6 != null) {
         var2.l6("draw:filter-name", this.l6);
      }

      if (this.k5 != null) {
         var2.l6("xlink:href", this.k5);
      }

      if (this.u3 != n5) {
         var2.l6("xlink:type", v5w.n5(this.u3));
      }

      if (this.a6 != 0) {
         var2.l6("xlink:show", h8e.n5(this.a6));
      }

      if (this.u9 != 0) {
         var2.l6("xlink:actuate", r5n.n5(this.u9));
      }

      if (this.h0 != null) {
         this.n5("office", var2, "binary-data", this.h0, false);
      }

      List$Enumerator var4 = this.c8.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (t2.n5(var5.n5())) {
               case 6:
                  ((u1x)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 7:
                  ((u0y)var5.k5()).n5("text", var2, var5.n5());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   public final String n5() {
      return this.k5;
   }

   public final void n5(String var1) {
      this.k5 = var1;
   }

   public final void n5(int var1) {
      this.a6 = var1;
   }

   public final void l6(int var1) {
      this.u9 = var1;
   }

   public final String l6() {
      return this.h0;
   }

   public final void l6(String var1) {
      this.h0 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return t2;
   }

   // $VF: synthetic method
   static String n5(s3o var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String l6(s3o var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static int n5(s3o var0, int var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static int l6(s3o var0, int var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static int k5(s3o var0, int var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static String k5(s3o var0, String var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static String n5(s3o var0) {
      return var0.h0;
   }

   // $VF: synthetic method
   static List l6(s3o var0) {
      return var0.c8;
   }
}
