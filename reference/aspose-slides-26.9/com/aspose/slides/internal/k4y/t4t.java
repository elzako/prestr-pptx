package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class t4t extends b3 {
   private String n5;
   private String l6;
   private b9y k5;
   private k1e u3;
   private i8f a6;
   private q1v u9;
   private l8r h0;
   private g7 c8;
   private c0e t2;
   private List<g7> s7;
   private static final com.aspose.slides.internal.v6g.u9 x8 = new com.aspose.slides.internal.v6g.u9(
      "r:embed",
      "r:link",
      "spPr",
      "camera",
      "trans",
      "raster",
      "extLst",
      "objViewport",
      "winViewport",
      "ambientLight",
      "ptLight",
      "spotLight",
      "dirLight",
      "unkLight"
   );

   public t4t(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u9();
      t4t$1 var2 = new t4t$1(this);
      n5(var1, var2);
      n5(var1, new t4t$2(this, var1));
   }

   public t4t() {
      this.u9();
      this.k5 = new b9y();
      this.u3 = new k1e();
      this.a6 = new i8f();
   }

   private void u9() {
      this.n5 = "";
      this.l6 = "";
      this.s7 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5("am3d", var3, "http://schemas.microsoft.com/office/drawing/2017/model3d");
      if (var2.n5("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
         var2.u3("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
      }

      if (var2.n5("http://schemas.openxmlformats.org/drawingml/2006/main") == null) {
         var2.u3("xmlns", "a", null, "http://schemas.openxmlformats.org/drawingml/2006/main");
      }

      if (!"".equals(this.n5)) {
         if (var2.n5("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
            var2.u3("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
         }

         var2.l6("r:embed", this.n5);
      }

      if (!"".equals(this.l6)) {
         if (var2.n5("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
            var2.u3("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
         }

         var2.l6("r:link", this.l6);
      }

      this.k5.n5("am3d", var2, "spPr");
      this.u3.n5("am3d", var2, "camera");
      this.a6.n5("am3d", var2, "trans");
      if (this.u9 != null) {
         this.u9.n5("am3d", var2, "raster");
      }

      if (this.h0 != null) {
         this.h0.n5("am3d", var2, "extLst");
      }

      if (this.c8 != null) {
         switch (x8.n5(this.c8.n5())) {
            case 7:
               ((l8k)this.c8.k5()).n5("am3d", var2, this.c8.n5());
               break;
            case 8:
               ((y0v)this.c8.k5()).n5("am3d", var2, this.c8.n5());
         }
      }

      if (this.t2 != null) {
         this.t2.n5("am3d", var2, "ambientLight");
      }

      List$Enumerator var4 = this.s7.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (x8.n5(var5.n5())) {
               case 10:
                  ((o6d)var5.k5()).n5("am3d", var2, var5.n5());
                  break;
               case 11:
                  ((j8h)var5.k5()).n5("am3d", var2, var5.n5());
                  break;
               case 12:
                  ((y9i)var5.k5()).n5("am3d", var2, var5.n5());
                  break;
               case 13:
                  ((d4x)var5.k5()).n5("am3d", var2, var5.n5());
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
      return this.n5;
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }

   public final b9y l6() {
      return this.k5;
   }

   public final q1v k5() {
      return this.u9;
   }

   public final g7 u3() {
      return this.c8;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 a6() {
      return x8;
   }

   // $VF: synthetic method
   static String n5(t4t var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(t4t var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static b9y n5(t4t var0, b9y var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static k1e n5(t4t var0, k1e var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static i8f n5(t4t var0, i8f var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static q1v n5(t4t var0, q1v var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static l8r n5(t4t var0, l8r var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static g7 n5(t4t var0, g7 var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static c0e n5(t4t var0, c0e var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static List n5(t4t var0) {
      return var0.s7;
   }
}
