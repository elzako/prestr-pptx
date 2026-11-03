package com.aspose.slides.internal.p5k;

import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.Xml.f4;

public class z1 {
   private t4 n5 = new t4(-1, "root", d1.n5);
   private t4 l6 = this.n5;
   private int k5;

   public z1(int var1) {
      this.k5 = var1;
   }

   public final void n5(int var1, String var2, String var3) {
      if (var1 >= 0) {
         if (com.aspose.slides.internal.n2d.t4.l6(var2)) {
            if (com.aspose.slides.internal.n2d.t4.l6(var3)) {
               t4 var4 = new t4(var1, var2, var3);
               if (var4.n5() > this.l6.n5()) {
                  this.l6.n5(var4);
               } else if (var4.n5() >= this.l6.n5()) {
                  this.l6.l6().n5(var4);
               } else {
                  while (this.l6.n5() >= var4.n5()) {
                     this.l6 = this.l6.l6();
                  }

                  this.l6.n5(var4);
               }

               this.l6 = var4;
            }
         }
      }
   }

   public final void n5(com.aspose.slides.internal.b8.n5 var1) {
      var1.l6("outlines");
      var1.k5("expandedOutlineLevels", f4.n5(this.k5));
      this.n5.n5(var1);
      var1.k5();
   }
}
