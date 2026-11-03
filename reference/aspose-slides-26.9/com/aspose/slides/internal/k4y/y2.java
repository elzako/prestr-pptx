package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class y2 extends b3 {
   private c8q n5;
   private v6g l6;
   private c8q k5;
   private l6 u3;
   private d0 a6;
   private y8b u9;
   private h9q h0;
   private w3o c8;
   private b9y t2;
   private j3z s7;
   private q8o x8;
   private o1o n3;
   private p5x y4;
   private a9t e2;
   private static final com.aspose.slides.internal.v6g.u9 t9 = new com.aspose.slides.internal.v6g.u9(
      "date1904",
      "lang",
      "roundedCorners",
      "style",
      "clrMapOvr",
      "pivotSource",
      "protection",
      "chart",
      "spPr",
      "txPr",
      "externalData",
      "printSettings",
      "userShapes",
      "extLst"
   );

   public y2(com.aspose.slides.ms.System.Xml.c7 var1) {
      if (!var1.m1()) {
         String var2 = var1.n3();
         boolean var3 = false;

         while (var3 && !var1.j5() || var1.u9()) {
            if (var1.s7() == 15 && com.aspose.slides.ms.System.d1.a6(var1.n3(), var2)) {
               break;
            }

            var3 = false;
            if (var1.s7() == 1) {
               switch (t9.n5(var1.n3())) {
                  case 0:
                     this.n5 = new c8q(var1);
                     break;
                  case 1:
                     this.l6 = new v6g(var1);
                     break;
                  case 2:
                     this.k5 = new c8q(var1);
                     break;
                  case 3:
                     this.u3 = new l6(var1);
                     break;
                  case 4:
                     this.a6 = new d0(var1);
                     break;
                  case 5:
                     this.u9 = new y8b(var1);
                     var3 = true;
                     break;
                  case 6:
                     this.h0 = new h9q(var1);
                     var3 = true;
                     break;
                  case 7:
                     this.c8 = new w3o(var1);
                     break;
                  case 8:
                     this.t2 = new b9y(var1);
                     break;
                  case 9:
                     this.s7 = new j3z(var1);
                     break;
                  case 10:
                     this.x8 = new q8o(var1);
                     break;
                  case 11:
                     this.n3 = new o1o(var1);
                     var3 = true;
                     break;
                  case 12:
                     this.y4 = new p5x(var1);
                     break;
                  case 13:
                     this.e2 = new a9t(var1);
                     break;
                  default:
                     var1.r4();
                     var3 = true;
               }
            }
         }
      }
   }

   public y2() {
      this.c8 = new w3o();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5("c", var3, "http://schemas.openxmlformats.org/drawingml/2006/chart");
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

      if (this.n5 != null) {
         this.n5.n5("c", var2, "date1904");
      }

      if (this.l6 != null) {
         this.l6.n5("c", var2, "lang");
      }

      if (this.k5 != null) {
         this.k5.n5("c", var2, "roundedCorners");
      }

      if (this.u3 != null) {
         this.u3.n5("c", var2, "style");
      }

      if (this.a6 != null) {
         this.a6.n5("c", var2, "clrMapOvr");
      }

      if (this.u9 != null) {
         this.u9.n5("c", var2, "pivotSource");
      }

      if (this.h0 != null) {
         this.h0.n5("c", var2, "protection");
      }

      this.c8.n5("c", var2, "chart");
      if (this.t2 != null) {
         this.t2.n5("c", var2, "spPr");
      }

      if (this.s7 != null) {
         this.s7.n5("c", var2, "txPr");
      }

      if (this.x8 != null) {
         this.x8.n5("c", var2, "externalData");
      }

      if (this.n3 != null) {
         this.n3.n5("c", var2, "printSettings");
      }

      if (this.y4 != null) {
         this.y4.n5("c", var2, "userShapes");
      }

      if (this.e2 != null) {
         this.e2.n5("c", var2, "extLst");
      }

      var2.s7();
   }

   public final c8q n5() {
      if (this.n5 != null) {
         throw new Exception("Only one <date1904> element can be added.");
      }

      this.n5 = new c8q();
      return this.n5;
   }

   public final v6g l6() {
      if (this.l6 != null) {
         throw new Exception("Only one <lang> element can be added.");
      }

      this.l6 = new v6g();
      return this.l6;
   }

   public final c8q k5() {
      if (this.k5 != null) {
         throw new Exception("Only one <roundedCorners> element can be added.");
      }

      this.k5 = new c8q();
      return this.k5;
   }

   public final l6 u3() {
      if (this.u3 != null) {
         throw new Exception("Only one <style> element can be added.");
      }

      this.u3 = new l6();
      return this.u3;
   }

   public final d0 a6() {
      if (this.a6 != null) {
         throw new Exception("Only one <clrMapOvr> element can be added.");
      }

      this.a6 = new d0();
      return this.a6;
   }

   public final void n5(c9 var1) {
      this.u9 = (y8b)var1;
   }

   public final void l6(c9 var1) {
      this.h0 = (h9q)var1;
   }

   public final b9y u9() {
      if (this.t2 != null) {
         throw new Exception("Only one <spPr> element can be added.");
      }

      this.t2 = new b9y();
      return this.t2;
   }

   public final j3z h0() {
      if (this.s7 != null) {
         throw new Exception("Only one <txPr> element can be added.");
      }

      this.s7 = new j3z();
      return this.s7;
   }

   public final q8o c8() {
      if (this.x8 != null) {
         throw new Exception("Only one <externalData> element can be added.");
      }

      this.x8 = new q8o();
      return this.x8;
   }

   public final void n5(q8o var1) {
      this.x8 = var1;
   }

   public final void k5(c9 var1) {
      this.n3 = (o1o)var1;
   }

   public final p5x t2() {
      if (this.y4 != null) {
         throw new Exception("Only one <userShapes> element can be added.");
      }

      this.y4 = new p5x();
      return this.y4;
   }

   public final void n5(x8 var1) {
      this.e2 = (a9t)var1;
   }

   public final c8q s7() {
      return this.n5;
   }

   public final v6g x8() {
      return this.l6;
   }

   public final c8q n3() {
      return this.k5;
   }

   public final l6 y4() {
      return this.u3;
   }

   public final d0 e2() {
      return this.a6;
   }

   public final y8b t9() {
      return this.u9;
   }

   public final h9q z1() {
      return this.h0;
   }

   public final w3o t4() {
      return this.c8;
   }

   public final b9y q0() {
      return this.t2;
   }

   public final j3z z3() {
      return this.s7;
   }

   public final q8o m1() {
      return this.x8;
   }

   public final o1o k7() {
      return this.n3;
   }

   public final p5x m3() {
      return this.y4;
   }

   public final x8 z8() {
      return this.e2;
   }
}
