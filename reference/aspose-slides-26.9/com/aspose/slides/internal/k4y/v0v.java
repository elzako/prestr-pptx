package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class v0v extends b3 {
   private b8n n5;
   private c8q l6;
   private x7u k5;
   private c8q u3;
   private b8n a6;
   private b9y u9;
   private n1b h0;
   private a9t c8;
   private static final com.aspose.slides.internal.v6g.u9 t2 = new com.aspose.slides.internal.v6g.u9(
      "idx", "invertIfNegative", "marker", "bubble3D", "explosion", "spPr", "pictureOptions", "extLst"
   );

   public v0v(com.aspose.slides.ms.System.Xml.c7 var1) {
      if (!var1.m1()) {
         String var2 = var1.n3();
         boolean var3 = false;

         while (var3 && !var1.j5() || var1.u9()) {
            if (var1.s7() == 15 && com.aspose.slides.ms.System.d1.a6(var1.n3(), var2)) {
               break;
            }

            var3 = false;
            if (var1.s7() == 1) {
               switch (t2.n5(var1.n3())) {
                  case 0:
                     this.n5 = new b8n(var1);
                     break;
                  case 1:
                     this.l6 = new c8q(var1);
                     break;
                  case 2:
                     this.k5 = new x7u(var1);
                     break;
                  case 3:
                     this.u3 = new c8q(var1);
                     break;
                  case 4:
                     this.a6 = new b8n(var1);
                     break;
                  case 5:
                     this.u9 = new b9y(var1);
                     break;
                  case 6:
                     this.h0 = new n1b(var1);
                     var3 = true;
                     break;
                  case 7:
                     this.c8 = new a9t(var1);
                     break;
                  default:
                     var1.r4();
                     var3 = true;
               }
            }
         }
      }
   }

   public v0v() {
      this.n5 = new b8n();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      this.n5.n5("c", var2, "idx");
      if (this.l6 != null) {
         this.l6.n5("c", var2, "invertIfNegative");
      }

      if (this.k5 != null) {
         this.k5.n5("c", var2, "marker");
      }

      if (this.u3 != null) {
         this.u3.n5("c", var2, "bubble3D");
      }

      if (this.a6 != null) {
         this.a6.n5("c", var2, "explosion");
      }

      if (this.u9 != null) {
         this.u9.n5("c", var2, "spPr");
      }

      if (this.h0 != null) {
         this.h0.n5("c", var2, "pictureOptions");
      }

      if (this.c8 != null) {
         this.c8.n5("c", var2, "extLst");
      }

      var2.s7();
   }

   public final c8q n5() {
      if (this.l6 != null) {
         throw new Exception("Only one <invertIfNegative> element can be added.");
      }

      this.l6 = new c8q();
      return this.l6;
   }

   public final x7u l6() {
      if (this.k5 != null) {
         throw new Exception("Only one <marker> element can be added.");
      }

      this.k5 = new x7u();
      return this.k5;
   }

   public final c8q k5() {
      if (this.u3 != null) {
         throw new Exception("Only one <bubble3D> element can be added.");
      }

      this.u3 = new c8q();
      return this.u3;
   }

   public final b8n u3() {
      if (this.a6 != null) {
         throw new Exception("Only one <explosion> element can be added.");
      }

      this.a6 = new b8n();
      return this.a6;
   }

   public final b9y a6() {
      if (this.u9 != null) {
         throw new Exception("Only one <spPr> element can be added.");
      }

      this.u9 = new b9y();
      return this.u9;
   }

   public final void n5(d3 var1) {
      this.h0 = (n1b)var1;
   }

   public final void n5(x8 var1) {
      this.c8 = (a9t)var1;
   }

   public final b8n u9() {
      return this.n5;
   }

   public final c8q h0() {
      return this.l6;
   }

   public final x7u c8() {
      return this.k5;
   }

   public final c8q t2() {
      return this.u3;
   }

   public final b8n s7() {
      return this.a6;
   }

   public final b9y x8() {
      return this.u9;
   }

   public final n1b n3() {
      return this.h0;
   }

   public final x8 y4() {
      return this.c8;
   }
}
