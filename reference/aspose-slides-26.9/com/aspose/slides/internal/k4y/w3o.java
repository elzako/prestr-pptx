package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class w3o extends b3 {
   private n8e n5;
   private c8q l6;
   private z5z k5;
   private d0e u3;
   private v7y a6;
   private v7y u9;
   private v7y h0;
   private w4c c8;
   private k6r t2;
   private c8q s7;
   private e3j x8;
   private c8q n3;
   private a9t y4;
   private static final com.aspose.slides.internal.v6g.u9 e2 = new com.aspose.slides.internal.v6g.u9(
      "title",
      "autoTitleDeleted",
      "pivotFmts",
      "view3D",
      "floor",
      "sideWall",
      "backWall",
      "plotArea",
      "legend",
      "plotVisOnly",
      "dispBlanksAs",
      "showDLblsOverMax",
      "extLst"
   );

   public w3o(com.aspose.slides.ms.System.Xml.c7 var1) {
      if (!var1.m1()) {
         String var2 = var1.n3();
         boolean var3 = false;

         while (var3 && !var1.j5() || var1.u9()) {
            if (var1.s7() == 15 && com.aspose.slides.ms.System.d1.a6(var1.n3(), var2)) {
               break;
            }

            var3 = false;
            if (var1.s7() == 1) {
               switch (e2.n5(var1.n3())) {
                  case 0:
                     this.n5 = new n8e(var1);
                     break;
                  case 1:
                     this.l6 = new c8q(var1);
                     break;
                  case 2:
                     this.k5 = new z5z(var1);
                     var3 = true;
                     break;
                  case 3:
                     this.u3 = new d0e(var1);
                     break;
                  case 4:
                     this.a6 = new v7y(var1);
                     break;
                  case 5:
                     this.u9 = new v7y(var1);
                     break;
                  case 6:
                     this.h0 = new v7y(var1);
                     break;
                  case 7:
                     this.c8 = new w4c(var1);
                     break;
                  case 8:
                     this.t2 = new k6r(var1);
                     break;
                  case 9:
                     this.s7 = new c8q(var1);
                     break;
                  case 10:
                     this.x8 = new e3j(var1);
                     break;
                  case 11:
                     this.n3 = new c8q(var1);
                     break;
                  case 12:
                     this.y4 = new a9t(var1);
                     break;
                  default:
                     var1.r4();
                     var3 = true;
               }
            }
         }
      }
   }

   public w3o() {
      this.c8 = new w4c();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("c", var2, "title");
      }

      if (this.l6 != null) {
         this.l6.n5("c", var2, "autoTitleDeleted");
      }

      if (this.k5 != null) {
         this.k5.n5("c", var2, "pivotFmts");
      }

      if (this.u3 != null) {
         this.u3.n5("c", var2, "view3D");
      }

      if (this.a6 != null) {
         this.a6.n5("c", var2, "floor");
      }

      if (this.u9 != null) {
         this.u9.n5("c", var2, "sideWall");
      }

      if (this.h0 != null) {
         this.h0.n5("c", var2, "backWall");
      }

      this.c8.n5("c", var2, "plotArea");
      if (this.t2 != null) {
         this.t2.n5("c", var2, "legend");
      }

      if (this.s7 != null) {
         this.s7.n5("c", var2, "plotVisOnly");
      }

      if (this.x8 != null) {
         this.x8.n5("c", var2, "dispBlanksAs");
      }

      if (this.n3 != null) {
         this.n3.n5("c", var2, "showDLblsOverMax");
      }

      if (this.y4 != null) {
         this.y4.n5("c", var2, "extLst");
      }

      var2.s7();
   }

   public final n8e n5() {
      if (this.n5 != null) {
         throw new Exception("Only one <title> element can be added.");
      }

      this.n5 = new n8e();
      return this.n5;
   }

   public final c8q l6() {
      if (this.l6 != null) {
         throw new Exception("Only one <autoTitleDeleted> element can be added.");
      }

      this.l6 = new c8q();
      return this.l6;
   }

   public final void n5(c9 var1) {
      this.k5 = (z5z)var1;
   }

   public final d0e k5() {
      if (this.u3 != null) {
         throw new Exception("Only one <view3D> element can be added.");
      }

      this.u3 = new d0e();
      return this.u3;
   }

   public final v7y u3() {
      if (this.a6 != null) {
         throw new Exception("Only one <floor> element can be added.");
      }

      this.a6 = new v7y();
      return this.a6;
   }

   public final v7y a6() {
      if (this.u9 != null) {
         throw new Exception("Only one <sideWall> element can be added.");
      }

      this.u9 = new v7y();
      return this.u9;
   }

   public final v7y u9() {
      if (this.h0 != null) {
         throw new Exception("Only one <backWall> element can be added.");
      }

      this.h0 = new v7y();
      return this.h0;
   }

   public final k6r h0() {
      if (this.t2 != null) {
         throw new Exception("Only one <legend> element can be added.");
      }

      this.t2 = new k6r();
      return this.t2;
   }

   public final c8q c8() {
      if (this.s7 != null) {
         throw new Exception("Only one <plotVisOnly> element can be added.");
      }

      this.s7 = new c8q();
      return this.s7;
   }

   public final e3j t2() {
      if (this.x8 != null) {
         throw new Exception("Only one <dispBlanksAs> element can be added.");
      }

      this.x8 = new e3j();
      return this.x8;
   }

   public final c8q s7() {
      if (this.n3 != null) {
         throw new Exception("Only one <showDLblsOverMax> element can be added.");
      }

      this.n3 = new c8q();
      return this.n3;
   }

   public final void n5(x8 var1) {
      this.y4 = (a9t)var1;
   }

   public final n8e x8() {
      return this.n5;
   }

   public final c8q n3() {
      return this.l6;
   }

   public final z5z y4() {
      return this.k5;
   }

   public final d0e e2() {
      return this.u3;
   }

   public final v7y t9() {
      return this.a6;
   }

   public final v7y z1() {
      return this.u9;
   }

   public final v7y t4() {
      return this.h0;
   }

   public final w4c q0() {
      return this.c8;
   }

   public final k6r z3() {
      return this.t2;
   }

   public final c8q m1() {
      return this.s7;
   }

   public final e3j k7() {
      return this.x8;
   }

   public final c8q m3() {
      return this.n3;
   }

   public final x8 z8() {
      return this.y4;
   }
}
