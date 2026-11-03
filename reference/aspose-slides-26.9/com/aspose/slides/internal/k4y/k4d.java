package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class k4d extends b3 {
   private int n5;
   private long l6;
   private List<g7> k5;
   private List<t6j> u3;
   private l8r a6;
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9(
      "meth", "id", "scrgbClr", "srgbClr", "hslClr", "sysClr", "schemeClr", "prstClr", "variation", "extLst"
   );

   public k4d(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.a6();
      k4d$1 var2 = new k4d$1(this);
      n5(var1, var2);
      n5(var1, new k4d$2(this, var1));
   }

   public k4d() {
      this.a6();
   }

   private void a6() {
      this.n5 = 0;
      this.l6 = 4294967295L;
      this.k5 = new List<>();
      this.u3 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5("cs", var3, "http://schemas.microsoft.com/office/drawing/2012/chartStyle");
      if (var2.n5("http://schemas.openxmlformats.org/drawingml/2006/main") == null) {
         var2.u3("xmlns", "a", null, "http://schemas.openxmlformats.org/drawingml/2006/main");
      }

      var2.l6("meth", r8.n5(this.n5));
      if ((this.l6 & 4294967295L) != 4294967295L) {
         var2.l6("id", com.aspose.slides.ms.System.Xml.f4.l6(this.l6));
      }

      List$Enumerator var4 = this.k5.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (u9.n5(var5.n5())) {
               case 2:
                  ((e4w)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 3:
                  ((e8p)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 4:
                  ((d0p)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 5:
                  ((s0i)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 6:
                  ((q4d)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 7:
                  ((x4a)var5.k5()).n5("a", var2, var5.n5());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      List$Enumerator var14 = this.u3.iterator();

      try {
         while (var14.hasNext()) {
            t6j var6 = (t6j)var14.next();
            var6.n5("cs", var2, "variation");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var14, IDisposable.class)) {
            var14.dispose();
         }
      }

      if (this.a6 != null) {
         this.a6.n5("cs", var2, "extLst");
      }

      var2.s7();
   }

   public final int n5() {
      return this.n5;
   }

   public final List<g7> l6() {
      return this.k5;
   }

   public final t6j[] k5() {
      return this.u3.toArray(new t6j[0]);
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return u9;
   }

   // $VF: synthetic method
   static int n5(k4d var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static long n5(k4d var0, long var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static List n5(k4d var0) {
      return var0.k5;
   }

   // $VF: synthetic method
   static List l6(k4d var0) {
      return var0.u3;
   }

   // $VF: synthetic method
   static l8r n5(k4d var0, l8r var1) {
      return var0.a6 = var1;
   }
}
