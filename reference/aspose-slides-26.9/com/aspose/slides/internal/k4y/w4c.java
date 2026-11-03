package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

public class w4c extends b3 {
   private v2o n5;
   private List<g7> l6;
   private List<g7> k5;
   private e5q u3;
   private b9y a6;
   private a9t u9;
   private static final com.aspose.slides.internal.v6g.u9 h0 = new com.aspose.slides.internal.v6g.u9(
      "layout",
      "areaChart",
      "area3DChart",
      "lineChart",
      "line3DChart",
      "stockChart",
      "radarChart",
      "scatterChart",
      "pieChart",
      "pie3DChart",
      "doughnutChart",
      "barChart",
      "bar3DChart",
      "ofPieChart",
      "surfaceChart",
      "surface3DChart",
      "bubbleChart",
      "valAx",
      "catAx",
      "dateAx",
      "serAx",
      "dTable",
      "spPr",
      "extLst"
   );

   public w4c(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.x8();
      n5(var1, new w4c$1(this, var1));
   }

   public w4c() {
      this.x8();
   }

   private void x8() {
      this.l6 = new List<>();
      this.k5 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("c", var2, "layout");
      }

      List$Enumerator var4 = this.l6.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (h0.n5(var5.n5())) {
               case 1:
                  ((d9r)var5.k5()).n5("c", var2, var5.n5());
                  break;
               case 2:
                  ((l1f)var5.k5()).n5("c", var2, var5.n5());
                  break;
               case 3:
                  ((x1j)var5.k5()).n5("c", var2, var5.n5());
                  break;
               case 4:
                  ((d1z)var5.k5()).n5("c", var2, var5.n5());
                  break;
               case 5:
                  ((l9o)var5.k5()).n5("c", var2, var5.n5());
                  break;
               case 6:
                  ((p5g)var5.k5()).n5("c", var2, var5.n5());
                  break;
               case 7:
                  ((t2h)var5.k5()).n5("c", var2, var5.n5());
                  break;
               case 8:
                  ((q9r)var5.k5()).n5("c", var2, var5.n5());
                  break;
               case 9:
                  ((q6f)var5.k5()).n5("c", var2, var5.n5());
                  break;
               case 10:
                  ((i2i)var5.k5()).n5("c", var2, var5.n5());
                  break;
               case 11:
                  ((c9v)var5.k5()).n5("c", var2, var5.n5());
                  break;
               case 12:
                  ((u3r)var5.k5()).n5("c", var2, var5.n5());
                  break;
               case 13:
                  ((v9l)var5.k5()).n5("c", var2, var5.n5());
                  break;
               case 14:
                  ((o8x)var5.k5()).n5("c", var2, var5.n5());
                  break;
               case 15:
                  ((o3n)var5.k5()).n5("c", var2, var5.n5());
                  break;
               case 16:
                  ((w1g)var5.k5()).n5("c", var2, var5.n5());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      List$Enumerator var14 = this.k5.iterator();

      try {
         while (var14.hasNext()) {
            g7 var6 = (g7)var14.next();
            switch (h0.n5(var6.n5())) {
               case 17:
                  ((f5n)var6.k5()).n5("c", var2, var6.n5());
                  break;
               case 18:
                  ((a0q)var6.k5()).n5("c", var2, var6.n5());
                  break;
               case 19:
                  ((c5e)var6.k5()).n5("c", var2, var6.n5());
                  break;
               case 20:
                  ((q2c)var6.k5()).n5("c", var2, var6.n5());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var14, IDisposable.class)) {
            var14.dispose();
         }
      }

      if (this.u3 != null) {
         this.u3.n5("c", var2, "dTable");
      }

      if (this.a6 != null) {
         this.a6.n5("c", var2, "spPr");
      }

      if (this.u9 != null) {
         this.u9.n5("c", var2, "extLst");
      }

      var2.s7();
   }

   public final v2o n5() {
      if (this.n5 != null) {
         throw new Exception("Only one <layout> element can be added.");
      }

      this.n5 = new v2o();
      return this.n5;
   }

   public final e5q l6() {
      if (this.u3 != null) {
         throw new Exception("Only one <dTable> element can be added.");
      }

      this.u3 = new e5q();
      return this.u3;
   }

   public final b9y k5() {
      if (this.a6 != null) {
         throw new Exception("Only one <spPr> element can be added.");
      }

      this.a6 = new b9y();
      return this.a6;
   }

   public final void n5(x8 var1) {
      this.u9 = (a9t)var1;
   }

   public final g7 n5(String var1) {
      g7 var2;
      switch (h0.n5(var1)) {
         case 17:
            var2 = new g7("valAx", new f5n());
            break;
         case 18:
            var2 = new g7("catAx", new a0q());
            break;
         case 19:
            var2 = new g7("dateAx", new c5e());
            break;
         case 20:
            var2 = new g7("serAx", new q2c());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      this.k5.addItem(var2);
      return var2;
   }

   public final g7 l6(String var1) {
      g7 var2;
      switch (h0.n5(var1)) {
         case 1:
            var2 = new g7("areaChart", new d9r());
            break;
         case 2:
            var2 = new g7("area3DChart", new l1f());
            break;
         case 3:
            var2 = new g7("lineChart", new x1j());
            break;
         case 4:
            var2 = new g7("line3DChart", new d1z());
            break;
         case 5:
            var2 = new g7("stockChart", new l9o());
            break;
         case 6:
            var2 = new g7("radarChart", new p5g());
            break;
         case 7:
            var2 = new g7("scatterChart", new t2h());
            break;
         case 8:
            var2 = new g7("pieChart", new q9r());
            break;
         case 9:
            var2 = new g7("pie3DChart", new q6f());
            break;
         case 10:
            var2 = new g7("doughnutChart", new i2i());
            break;
         case 11:
            var2 = new g7("barChart", new c9v());
            break;
         case 12:
            var2 = new g7("bar3DChart", new u3r());
            break;
         case 13:
            var2 = new g7("ofPieChart", new v9l());
            break;
         case 14:
            var2 = new g7("surfaceChart", new o8x());
            break;
         case 15:
            var2 = new g7("surface3DChart", new o3n());
            break;
         case 16:
            var2 = new g7("bubbleChart", new w1g());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      this.l6.addItem(var2);
      return var2;
   }

   public final v2o u3() {
      return this.n5;
   }

   public final List<g7> a6() {
      return this.l6;
   }

   public final List<g7> u9() {
      return this.k5;
   }

   public final e5q h0() {
      return this.u3;
   }

   public final b9y c8() {
      return this.a6;
   }

   public final x8 t2() {
      return this.u9;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 s7() {
      return h0;
   }

   // $VF: synthetic method
   static v2o n5(w4c var0, v2o var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static List n5(w4c var0) {
      return var0.l6;
   }

   // $VF: synthetic method
   static List l6(w4c var0) {
      return var0.k5;
   }

   // $VF: synthetic method
   static e5q n5(w4c var0, e5q var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static b9y n5(w4c var0, b9y var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static a9t n5(w4c var0, a9t var1) {
      return var0.u9 = var1;
   }
}
