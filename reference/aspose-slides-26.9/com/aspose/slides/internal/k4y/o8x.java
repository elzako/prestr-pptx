package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

public class o8x extends k7 implements u6, w2 {
   private c8q n5;
   private List<l6o> l6;
   private c5i k5;
   private List<y4x> u3;
   private a9t a6;
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9("wireframe", "ser", "bandFmts", "axId", "extLst");

   public o8x(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.o0();
      if (!var1.m1()) {
         String var2 = var1.n3();
         boolean var3 = false;

         while (var3 && !var1.j5() || var1.u9()) {
            if (var1.s7() == 15 && com.aspose.slides.ms.System.d1.a6(var1.n3(), var2)) {
               break;
            }

            var3 = false;
            if (var1.s7() == 1) {
               switch (u9.n5(var1.n3())) {
                  case 0:
                     this.n5 = new c8q(var1);
                     break;
                  case 1:
                     l6o var4 = new l6o(var1);
                     this.l6.addItem(var4);
                     break;
                  case 2:
                     this.k5 = new c5i(var1);
                     var3 = true;
                     break;
                  case 3:
                     y4x var5 = new y4x(var1);
                     this.u3.addItem(var5);
                     break;
                  case 4:
                     this.a6 = new a9t(var1);
                     break;
                  default:
                     var1.r4();
                     var3 = true;
               }
            }
         }
      }
   }

   public o8x() {
      this.o0();
   }

   private void o0() {
      this.l6 = new List<>();
      this.u3 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("c", var2, "wireframe");
      }

      List$Enumerator var4 = this.l6.iterator();

      try {
         while (var4.hasNext()) {
            l6o var5 = (l6o)var4.next();
            var5.n5("c", var2, "ser");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      if (this.k5 != null) {
         this.k5.n5("c", var2, "bandFmts");
      }

      List$Enumerator var14 = this.u3.iterator();

      try {
         while (var14.hasNext()) {
            y4x var6 = (y4x)var14.next();
            var6.n5("c", var2, "axId");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var14, IDisposable.class)) {
            var14.dispose();
         }
      }

      if (this.a6 != null) {
         this.a6.n5("c", var2, "extLst");
      }

      var2.s7();
   }

   @Override
   public c8q az_() {
      if (this.n5 != null) {
         throw new Exception("Only one <wireframe> element can be added.");
      }

      this.n5 = new c8q();
      return this.n5;
   }

   @Override
   public m3 k5() {
      l6o var1 = new l6o();
      this.l6.addItem(var1);
      return var1;
   }

   @Override
   public final void n5(c9 var1) {
      this.k5 = (c5i)var1;
   }

   @Override
   public final y4x a6() {
      y4x var1 = new y4x();
      this.u3.addItem(var1);
      return var1;
   }

   @Override
   public void n5(x8 var1) {
      this.a6 = (a9t)var1;
   }

   @Override
   public c8q ay_() {
      return this.n5;
   }

   @Override
   public m3[] l6() {
      return this.l6.toArray(new l6o[0]);
   }

   @Override
   public c5i s3() {
      return this.k5;
   }

   @Override
   public y4x[] aD_() {
      return this.u3.toArray(new y4x[0]);
   }

   @Override
   public x8 c8() {
      return this.a6;
   }
}
