package com.aspose.slides.internal.v9e;

import com.aspose.slides.exceptions.XsltException;
import com.aspose.slides.ms.System.Xml.k6;

public class d1 extends t4 implements com.aspose.slides.internal.k4s.l6 {
   public static Object n5 = new Object();
   protected k6 u3;
   protected String a6;
   protected String u9;
   protected int h0 = -1;
   protected int c8;
   protected int t2;
   private int s7;

   public final int l6() {
      return this.c8;
   }

   public final k6 k5() {
      return this.u3;
   }

   public final String u3() {
      return this.a6;
   }

   public final int a6() {
      return this.s7;
   }

   public final boolean u9() {
      return this.t2 == 0 || this.t2 == 1;
   }

   public d1(int var1) {
      this.t2 = var1;
   }

   @Override
   public void l6(z1 var1) {
      this.c8 = var1.l6();
      this.u9 = var1.u3().z3();
      this.u3(var1);
      this.n5(var1, this.u3, "name");
      if (var1.u9()) {
         this.n3(var1);
         var1.h0();
         if (this.h0 != -1 && this.l6 != null) {
            throw XsltException.create("The variable or parameter '{0}' cannot have both a 'select' attribute and non-empty content.", this.a6);
         }
      }

      if (this.l6 != null) {
         this.u9 = com.aspose.slides.ms.System.d1.n5(new Object[]{this.u9, '#', var1.x8()});
      } else {
         this.u9 = null;
      }

      this.s7 = var1.n5(this);
   }

   @Override
   public boolean k5(z1 var1) {
      String var2 = var1.u3().e2();
      String var3 = var1.u3().t4();
      if (com.aspose.slides.ms.System.Xml.v8.n5(var2, var1.n5().j4)) {
         this.a6 = var3;
         this.u3 = var1.s7(this.a6);
      } else {
         if (!com.aspose.slides.ms.System.Xml.v8.n5(var2, var1.n5().t3)) {
            return false;
         }

         this.h0 = var1.e2(var3);
      }

      return true;
   }

   @Override
   public void n5(p3 var1, l6 var2) {
      Object var3 = null;
      switch (var2.k5()) {
         case 0:
            if (this.u9()) {
               if (var2.u3(this.s7) != null) {
                  var2.s7();
                  break;
               }

               var2.n5(this.s7, n5);
            }

            if (this.t2 == 1) {
               var3 = var1.n5(this.u3);
            } else if (this.t2 == 3) {
               var3 = var1.l6(this.u3);
            }

            if (var3 != null) {
               var2.n5(this.s7, var3);
               var2.s7();
            } else if (this.h0 != -1) {
               var3 = var1.k5(var2, this.h0);
               var2.n5(this.s7, var3);
               var2.s7();
            } else if (this.l6 == null) {
               var3 = com.aspose.slides.ms.System.d1.n5;
               var2.n5(this.s7, var3);
               var2.s7();
            } else {
               v4 var4 = new v4(this.u9);
               var1.n5(var4);
               var1.n5(var2);
               var2.n5(1);
            }
            break;
         case 1:
            y0 var5 = var1.t9();
            var3 = ((v4)var5).n5();
            var2.n5(this.s7, var3);
            var2.s7();
            break;
         case 2:
            var2.n5(this.s7, var3);
            var2.s7();
            break;
         default:
            com.aspose.slides.internal.f8y.n5.n5("Invalid execution state inside VariableAction.Execute");
      }
   }

   @Override
   public final int n5() {
      return 5;
   }

   @Override
   public final Object n5(com.aspose.slides.internal.k4s.h0 var1) {
      return ((y8)var1).n5(this);
   }
}
