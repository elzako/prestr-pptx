package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class v3 extends b3 {
   private String n5;
   private String l6;
   private String k5;
   private List<k6j> u3;
   private List<a5c> a6;
   private t5j u9;
   private c8j h0;
   private c8j c8;
   private c8j t2;
   private y5g s7;
   private l8r x8;
   private static final com.aspose.slides.internal.v6g.u9 n3 = new com.aspose.slides.internal.v6g.u9(
      "uniqueId", "minVer", "defStyle", "title", "desc", "catLst", "sampData", "styleData", "clrData", "layoutNode", "extLst"
   );

   public v3(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.a6();
      v3$1 var2 = new v3$1(this);
      n5(var1, var2);
      n5(var1, new v3$2(this, var1));
   }

   public v3() {
      this.a6();
      this.s7 = new y5g();
   }

   private void a6() {
      this.n5 = "";
      this.l6 = "http://schemas.openxmlformats.org/drawingml/2006/diagram";
      this.k5 = "";
      this.u3 = new List<>();
      this.a6 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5("dgm", var3, "http://schemas.openxmlformats.org/drawingml/2006/diagram");
      if (var2.n5("http://schemas.openxmlformats.org/drawingml/2006/main") == null) {
         var2.u3("xmlns", "a", null, "http://schemas.openxmlformats.org/drawingml/2006/main");
      }

      if (var2.n5("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
         var2.u3("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
      }

      if (var2.n5("http://schemas.openxmlformats.org/officeDocument/2006/math") == null) {
         var2.u3("xmlns", "m", null, "http://schemas.openxmlformats.org/officeDocument/2006/math");
      }

      if (var2.n5("http://schemas.openxmlformats.org/wordprocessingml/2006/main") == null) {
         var2.u3("xmlns", "w", null, "http://schemas.openxmlformats.org/wordprocessingml/2006/main");
      }

      if (var2.n5("http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing") == null) {
         var2.u3("xmlns", "wp", null, "http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing");
      }

      if (var2.n5("http://schemas.microsoft.com/office/drawing/2010/main") == null) {
         var2.u3("xmlns", "a14", null, "http://schemas.microsoft.com/office/drawing/2010/main");
      }

      if (!"".equals(this.n5)) {
         var2.l6("uniqueId", this.n5);
      }

      if (!"http://schemas.openxmlformats.org/drawingml/2006/diagram".equals(this.l6)) {
         var2.l6("minVer", this.l6);
      }

      if (!"".equals(this.k5)) {
         var2.l6("defStyle", this.k5);
      }

      List$Enumerator var4 = this.u3.iterator();

      try {
         while (var4.hasNext()) {
            k6j var5 = (k6j)var4.next();
            var5.n5("dgm", var2, "title");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      List$Enumerator var14 = this.a6.iterator();

      try {
         while (var14.hasNext()) {
            a5c var6 = (a5c)var14.next();
            var6.n5("dgm", var2, "desc");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var14, IDisposable.class)) {
            var14.dispose();
         }
      }

      if (this.u9 != null) {
         this.u9.n5("dgm", var2, "catLst");
      }

      if (this.h0 != null) {
         this.h0.n5("dgm", var2, "sampData");
      }

      if (this.c8 != null) {
         this.c8.n5("dgm", var2, "styleData");
      }

      if (this.t2 != null) {
         this.t2.n5("dgm", var2, "clrData");
      }

      this.s7.n5("dgm", var2, "layoutNode");
      if (this.x8 != null) {
         this.x8.n5("dgm", var2, "extLst");
      }

      var2.s7();
   }

   public final String n5() {
      return this.n5;
   }

   public final t5j l6() {
      return this.u9;
   }

   public final y5g k5() {
      return this.s7;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return n3;
   }

   // $VF: synthetic method
   static String n5(v3 var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(v3 var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String k5(v3 var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static List n5(v3 var0) {
      return var0.u3;
   }

   // $VF: synthetic method
   static List l6(v3 var0) {
      return var0.a6;
   }

   // $VF: synthetic method
   static t5j n5(v3 var0, t5j var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static c8j n5(v3 var0, c8j var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static c8j l6(v3 var0, c8j var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static c8j k5(v3 var0, c8j var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static y5g n5(v3 var0, y5g var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static l8r n5(v3 var0, l8r var1) {
      return var0.x8 = var1;
   }
}
