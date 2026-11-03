package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class y1 extends b3 {
   private String n5;
   private String l6;
   private List<y4p> k5;
   private List<l6x> u3;
   private q5b a6;
   private List<b8s> u9;
   private l8r h0;
   private static final com.aspose.slides.internal.v6g.u9 c8 = new com.aspose.slides.internal.v6g.u9(
      "uniqueId", "minVer", "title", "desc", "catLst", "styleLbl", "extLst"
   );

   public y1(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.a6();
      y1$1 var2 = new y1$1(this);
      n5(var1, var2);
      n5(var1, new y1$2(this, var1));
   }

   public y1() {
      this.a6();
   }

   private void a6() {
      this.n5 = "";
      this.l6 = "http://schemas.openxmlformats.org/drawingml/2006/diagram";
      this.k5 = new List<>();
      this.u3 = new List<>();
      this.u9 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5("dgm", var3, "http://schemas.openxmlformats.org/drawingml/2006/diagram");
      if (var2.n5("http://schemas.openxmlformats.org/drawingml/2006/main") == null) {
         var2.u3("xmlns", "a", null, "http://schemas.openxmlformats.org/drawingml/2006/main");
      }

      if (!"".equals(this.n5)) {
         var2.l6("uniqueId", this.n5);
      }

      if (!"http://schemas.openxmlformats.org/drawingml/2006/diagram".equals(this.l6)) {
         var2.l6("minVer", this.l6);
      }

      List$Enumerator var4 = this.k5.iterator();

      try {
         while (var4.hasNext()) {
            y4p var5 = (y4p)var4.next();
            var5.n5("dgm", var2, "title");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      List$Enumerator var21 = this.u3.iterator();

      try {
         while (var21.hasNext()) {
            l6x var6 = (l6x)var21.next();
            var6.n5("dgm", var2, "desc");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var21, IDisposable.class)) {
            var21.dispose();
         }
      }

      if (this.a6 != null) {
         this.a6.n5("dgm", var2, "catLst");
      }

      List$Enumerator var22 = this.u9.iterator();

      try {
         while (var22.hasNext()) {
            b8s var7 = (b8s)var22.next();
            var7.n5("dgm", var2, "styleLbl");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var22, IDisposable.class)) {
            var22.dispose();
         }
      }

      if (this.h0 != null) {
         this.h0.n5("dgm", var2, "extLst");
      }

      var2.s7();
   }

   public final String n5() {
      return this.n5;
   }

   public final q5b l6() {
      return this.a6;
   }

   public final b8s[] k5() {
      return this.u9.toArray(new b8s[0]);
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return c8;
   }

   // $VF: synthetic method
   static String n5(y1 var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(y1 var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static List n5(y1 var0) {
      return var0.k5;
   }

   // $VF: synthetic method
   static List l6(y1 var0) {
      return var0.u3;
   }

   // $VF: synthetic method
   static q5b n5(y1 var0, q5b var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static List k5(y1 var0) {
      return var0.u9;
   }

   // $VF: synthetic method
   static l8r n5(y1 var0, l8r var1) {
      return var0.h0 = var1;
   }
}
