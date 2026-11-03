package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class v7y extends b3 {
   private b8n n5;
   private b9y l6;
   private n1b k5;
   private a9t u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("thickness", "spPr", "pictureOptions", "extLst");

   public v7y(com.aspose.slides.ms.System.Xml.c7 var1) {
      if (!var1.m1()) {
         String var2 = var1.n3();
         boolean var3 = false;

         while (var3 && !var1.j5() || var1.u9()) {
            if (var1.s7() == 15 && com.aspose.slides.ms.System.d1.a6(var1.n3(), var2)) {
               break;
            }

            var3 = false;
            if (var1.s7() == 1) {
               switch (a6.n5(var1.n3())) {
                  case 0:
                     this.n5 = new b8n(var1);
                     break;
                  case 1:
                     this.l6 = new b9y(var1);
                     break;
                  case 2:
                     this.k5 = new n1b(var1);
                     var3 = true;
                     break;
                  case 3:
                     this.u3 = new a9t(var1);
                     break;
                  default:
                     var1.r4();
                     var3 = true;
               }
            }
         }
      }
   }

   public v7y() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("c", var2, "thickness");
      }

      if (this.l6 != null) {
         this.l6.n5("c", var2, "spPr");
      }

      if (this.k5 != null) {
         this.k5.n5("c", var2, "pictureOptions");
      }

      if (this.u3 != null) {
         this.u3.n5("c", var2, "extLst");
      }

      var2.s7();
   }

   public final b8n n5() {
      if (this.n5 != null) {
         throw new Exception("Only one <thickness> element can be added.");
      }

      this.n5 = new b8n();
      return this.n5;
   }

   public final b9y l6() {
      if (this.l6 != null) {
         throw new Exception("Only one <spPr> element can be added.");
      }

      this.l6 = new b9y();
      return this.l6;
   }

   public final d3 k5() {
      if (this.k5 != null) {
         throw new Exception("Only one <pictureOptions> element can be added.");
      }

      this.k5 = new n1b();
      return this.k5;
   }

   public final void n5(d3 var1) {
      this.k5 = (n1b)var1;
   }

   public final void n5(x8 var1) {
      this.u3 = (a9t)var1;
   }

   public final b8n u3() {
      return this.n5;
   }

   public final b9y a6() {
      return this.l6;
   }

   public final n1b u9() {
      return this.k5;
   }

   public final x8 h0() {
      return this.u3;
   }
}
