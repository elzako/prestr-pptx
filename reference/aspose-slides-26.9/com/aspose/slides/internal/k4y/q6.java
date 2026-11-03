package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class q6 extends b3 {
   private String n5;
   private String l6;
   private List<v2z> k5;
   private List<l3m> u3;
   private z4p a6;
   private h6l u9;
   private List<p3b> h0;
   private l8r c8;
   private static final com.aspose.slides.internal.v6g.u9 t2 = new com.aspose.slides.internal.v6g.u9(
      "uniqueId", "minVer", "title", "desc", "catLst", "scene3d", "styleLbl", "extLst"
   );

   public q6(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u9();
      q6$1 var2 = new q6$1(this);
      n5(var1, var2);
      n5(var1, new q6$2(this, var1));
   }

   public q6() {
      this.u9();
   }

   private void u9() {
      this.n5 = "";
      this.l6 = "http://schemas.openxmlformats.org/drawingml/2006/diagram";
      this.k5 = new List<>();
      this.u3 = new List<>();
      this.h0 = new List<>();
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
            v2z var5 = (v2z)var4.next();
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
            l3m var6 = (l3m)var21.next();
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

      if (this.u9 != null) {
         this.u9.n5("dgm", var2, "scene3d");
      }

      List$Enumerator var22 = this.h0.iterator();

      try {
         while (var22.hasNext()) {
            p3b var7 = (p3b)var22.next();
            var7.n5("dgm", var2, "styleLbl");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var22, IDisposable.class)) {
            var22.dispose();
         }
      }

      if (this.c8 != null) {
         this.c8.n5("dgm", var2, "extLst");
      }

      var2.s7();
   }

   public final String n5() {
      return this.n5;
   }

   public final z4p l6() {
      return this.a6;
   }

   public final h6l k5() {
      return this.u9;
   }

   public final p3b[] u3() {
      return this.h0.toArray(new p3b[0]);
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 a6() {
      return t2;
   }

   // $VF: synthetic method
   static String n5(q6 var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(q6 var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static List n5(q6 var0) {
      return var0.k5;
   }

   // $VF: synthetic method
   static List l6(q6 var0) {
      return var0.u3;
   }

   // $VF: synthetic method
   static z4p n5(q6 var0, z4p var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static h6l n5(q6 var0, h6l var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static List k5(q6 var0) {
      return var0.h0;
   }

   // $VF: synthetic method
   static l8r n5(q6 var0, l8r var1) {
      return var0.c8 = var1;
   }
}
